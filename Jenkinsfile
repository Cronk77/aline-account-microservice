def image

pipeline{
    environment{
        //variables are set as secret text credentials to maintain security and parameterization
        //ensures logs also don't shows secret values
        APP_PORT = 80
        IMAGE_NAME = "cc-account-microservice" //acts as ecr repo name also
        IMAGE_TAG = "0.1." + "${env.BUILD_ID}"
        AWS_REGION = credentials('AWS_REGION')
        AWS_ACCOUNT_ID = credentials('AWS_ACCOUNT_ID')
        AWS_JENKINS_CRED = "cc-aws-cred"
        SONARQUBE_PROJECT = "cc-account-microservice-project"
    }
    agent any    
    tools{
        maven "M3"
        dockerTool "docker"
    }
    stages{

        stage('Checkout'){
            steps{
                checkout scm
            }
        }
        // stage("Test"){
        //     steps{
        //         sh "mvn clean test"  
        //     }
        // }
        // stage('SonarQube Analysis') {
        //     steps{
        //         withSonarQubeEnv('SQ') {
        //             sh "mvn clean verify sonar:sonar -Dsonar.projectKey=${SONARQUBE_PROJECT}"
        //         }
        //     }
        // }
        // stage('Quality Gate'){//assess using custom qality gate cc-qualityGate
        //     steps{
        //         waitForQualityGate abortPipeline: true
        //     }
        // }
        // stage('Remove old Image(s)'){//to ensure the agent doesnt run out of space by deleting image builds
		// 	steps{
        //         //ensures build doesn't fail if there isnt any previous images to delete
        //         catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
		// 		    sh 'docker rmi --force $(docker images -q -f dangling=true)'
        //         }
		// 	}
		// }
        stage("Build"){
            steps{
                script{
                    image = docker.build("${IMAGE_NAME}:${IMAGE_TAG}", "--build-arg APP_PORT=${APP_PORT} .")
                }
            }
        }
        stage("Push Image"){
            steps{
                script{
                    docker.withRegistry(
                        "https://${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_REGION}.amazonaws.com",
                        "ecr:${AWS_REGION}:${AWS_JENKINS_CRED}"){
                        image.push("${IMAGE_TAG}")
                        image.push('latest')
                    }
                }
            }
        }
        stage("Deploy"){
            steps{
                script{
                    withKubeConfig([credentialsId: 'cc-kubeconfig',
                    serverUrl: 'https://212BB41E5C1BB0D8D6E9FF54CC7D5626.gr7.us-west-2.eks.amazonaws.com']) {
                        sh 'aws ecr get-login-password --region us-west-2 | docker login --username AWS --password-stdin 412032026508.dkr.ecr.us-west-2.amazonaws.com'
                        sh 'kubectl apply -f  account-deployment-service.yaml'
                    }
                }
            }
        }
        // stage('Remove old Image(s)'){//to ensure the agent doesnt run out of space by deleting image builds
		// 	steps{
        //         //ensures build doesn't fail if there isnt any previous images to delete
        //         catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
		// 		    sh 'docker rmi --force $(docker images -q -f dangling=true)'
        //         }
		// 	}
		// }
    }
}