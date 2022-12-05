pipeline{
    environment{
        //variables are set as credentials to maintain security and parameterization
        ENCRYPT_SECRET_KEY = withCredentials('ENCRYPT_SECRET_KEY')
        JWT_SECRET_KEY = withCredentials('JWT_SECRET_KEY')
        DB_USERNAME = withCredentials('DB_USERNAME')
        DB_PASSWORD = withCredentials('DB_PASSWORD')
        DB_HOST = withCredentials('DB_HOST')
        DB_PORT = withCredentials('DB_PORT')
        DB_NAME = withCredentials('DB_NAME')
        // ENCRYPT_SECRET_KEY="12345678901234567890123456789012"
        // JWT_SECRET_KEY="12345678901234567890123456789012"
        // DB_USERNAME="admin"
        // DB_PASSWORD="password123"
        // DB_HOST="aline-db.clxfaquthjyh.us-east-1.rds.amazonaws.com"
        // DB_PORT="3306"
        // DB_NAME="aline"
        APP_PORT = 80
        IMAGE_TAG = "0.1." + "${env.BUILD_ID}"
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
        stage("Build"){
            steps{
                script{
                    image = docker.build("cc-account-microservice:${IMAGE_TAG}", "--build-arg APP_PORT=${APP_PORT} --build-arg ENCRYPT_SECRET_KEY=${ENCRYPT_SECRET_KEY} --build-arg JWT_SECRET_KEY=${JWT_SECRET_KEY} --build-arg DB_USERNAME=${DB_USERNAME} --build-arg DB_PASSWORD=${DB_PASSWORD} --build-arg DB_HOST=${DB_HOST} --build-arg DB_PORT=${DB_PORT} --build-arg DB_NAME=${DB_NAME} .")
                }
            }
        }
    }
}