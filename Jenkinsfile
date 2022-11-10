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
            post{
                success{
                    echo 'Checkout Stage success'
                }
                failure{
                    echo 'Checkout Stage failed'
                }
            }
        }
        //stage("Test"){
        //    steps{
        //        sh "mvn clean test -X"
        //    }
        //    post{
        //        success{
        //            echo 'Test Stage success'
        //        }
        //        failure{
        //            echo 'Test Stage failed'
        //        }
        //    }
        //}
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