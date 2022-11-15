pipeline{
    agent any
    tools{
        maven "Maven"
        sonarQube 'SonarqubeScanner'
    }
    stages{
        stage('Checkout'){
            steps{
                checkout scm
            }
            post{
                success{
                    echo 'Checkout Stage success'
                }
                failure{
                    echo 'Checkout Stage failed'
                }
            }
        }
        // Issue with Code base Failing 'mvn test' and then ignores all other steps
        stage("Test"){
            steps{
                sh "mvn clean test"
                
            }
            post{
                success{
                    echo 'Test Stage success'
                }
                failure{
                    echo 'Test Stage failed'
                }
            }
        }
         stage('SonarQube Analysis') {
            steps{
                withSonarQubeEnv('aline-sonarqube-server') {
                    sh "mvn clean sonar:sonar -Dsonar.projectKey=account-sonarqube-project"
                    //sh "mvn clean verify sonar:sonar   -Dsonar.projectKey=account-sonarqube-project   -Dsonar.host.url=http://172.19.154.182:9000   -Dsonar.login=sqa_b6086ca7d92d27e99ad225fb2c6a0da22cc868c5"
                }
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