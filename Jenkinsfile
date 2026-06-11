pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking source code from GitHub'
                checkout scm
            }
        }

        stage('Project Info') {
            steps {
                echo 'ParaBank Capstone Automation Framework'
                echo 'GitHub checkout completed successfully'
            }
        }

        stage('Build Verification') {
            steps {
                echo 'Maven project structure verified'
                sh 'ls -la'
                sh 'ls src/test/java'
            }
        }
    }

    post {
        always {
            echo 'ParaBank Capstone Jenkins Pipeline Completed'
        }

        success {
            echo 'Jenkins Integration Successful'
        }

        failure {
            echo 'Jenkins Pipeline Failed'
        }
    }
}