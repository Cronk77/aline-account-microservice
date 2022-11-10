pipeline{
    agent any
    //tools{
       // maven 'Maven'
    //}
    environment{
        PATH = "Files/Maven/apache-maven-3.8.6/bin/:$PATH"
    }
    stages{
        stage("Checkout"){
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
        stage("Build"){
            steps{
                sh 'mvn -Dmaven.test.failure.ignore=true clean package'
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