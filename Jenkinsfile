pipeline{
    agent any
    tools{
        maven "Maven"
    }
    stages{
        stage('Checkout'){
            steps{
                checkout scm
            }
        }
        // Issue with Code base Failing 'mvn test' and then ignores all other steps
        stage("Test"){
            steps{
                sh "mvn clean test"  
            }
        }
         stage('SonarQube Analysis') {
            steps{
                withSonarQubeEnv('aline-sonarqube-server') {
                    sh "mvn clean verify sonar:sonar -Dsonar.projectKey=account-sonarqube-project"
                }
            }
        }
        stage('Quality Gate'){
            steps{
                waitForQualityGate abortPipeline: true
            }
        }
        stage("Build"){
            steps{
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }
            post{
                success{
                    echo 'Build Stage success'
                }
                failure{
                    echo 'Build Stage failed'
                }
            }
        }
    }
}