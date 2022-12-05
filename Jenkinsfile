pipeline{
    environment{
        //variables are set as secret text credentials to maintain security and parameterization
        ENCRYPT_SECRET_KEY = credentials('ENCRYPT_SECRET_KEY')
        JWT_SECRET_KEY = credentials('JWT_SECRET_KEY')
        DB_USERNAME = credentials('DB_USERNAME')
        DB_PASSWORD = credentials('DB_PASSWORD')
        DB_HOST = credentials('DB_HOST')
        DB_PORT = credentials('DB_PORT')
        DB_NAME = credentials('DB_NAME')
        APP_PORT = 80
        IMAGE_NAME = "cc-account-microservice" //uses same name as ecr repo
        IMAGE_TAG = "0.1." + "${env.BUILD_ID}"
        AWS_REGION = "us-west-2"
        AWS_ACCOUNT_ID = "412032026508"
        REPOSITORY_URI = "${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_REGION}.amazonaws.com/${IMAGE_NAME}"
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
        stage("Test"){
            steps{
                sh "mvn clean test"  
            }
        }
        // stage('SonarQube Analysis') {
        //     steps{
        //         withSonarQubeEnv('aline-sonarqube-server') {
        //             sh "mvn clean verify sonar:sonar -Dsonar.projectKey=account-sonarqube-project"
        //         }
        //     }
        // }
        // stage('Quality Gate'){
        //     steps{
        //         waitForQualityGate abortPipeline: true
        //     }
        // }
        stage('Clean Images'){
			steps{
				sh 'docker rmi -f $(docker images --filter reference="cc-account*" -q)'
				sh 'docker rmi -f $(docker images -q -f dangling=true)'
			}
		}

        stage("Build"){
            steps{
                script{
                    image = docker.build("${IMAGE_NAME}:${IMAGE_TAG}", "--build-arg APP_PORT=${APP_PORT} --build-arg ENCRYPT_SECRET_KEY=${ENCRYPT_SECRET_KEY} --build-arg JWT_SECRET_KEY=${JWT_SECRET_KEY} --build-arg DB_USERNAME=${DB_USERNAME} --build-arg DB_PASSWORD=${DB_PASSWORD} --build-arg DB_HOST=${DB_HOST} --build-arg DB_PORT=${DB_PORT} --build-arg DB_NAME=${DB_NAME} .")
                }
            }
        }
        stage("Logging into AWS ECR") {
            steps {
                script {
                    sh "aws ecr get-login-password --region ${AWS_REGION} | docker login --username AWS --password-stdin ${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_REGION}.amazonaws.com"
                }
            }
        }

        stage("Pushing to ECR") {
            steps{
                script {
                    sh "docker tag ${IMAGE_NAME}:${IMAGE_TAG} ${REPOSITORY_URI}:${IMAGE_TAG}"
                    sh "docker push ${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_REGION}.amazonaws.com/${IMAGE_NAME}:${IMAGE_TAG}"
                    sh "docker push ${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_REGION}.amazonaws.com/${IMAGE_NAME}:latest"
                }
            }
        }
    }
}