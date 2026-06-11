pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK21'
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking source code from GitHub'
                checkout scm
            }
        }

        stage('Clean Project') {
            steps {
                echo 'Cleaning Maven project'
                sh 'mvn clean'
            }
        }

        stage('Run Automation Tests') {
            steps {
                echo 'Executing ParaBank Automation Test Suite'
                sh 'mvn test'
            }
        }

        stage('Archive Reports') {
            steps {
                echo 'Archiving Extent Reports and Screenshots'
                archiveArtifacts artifacts: 'reports/*.html, screenshots/*.png', allowEmptyArchive: true
            }
        }
    }

    post {
        always {
            echo 'ParaBank Capstone Automation Pipeline Completed'
        }

        success {
            echo 'Build Success: All tests passed successfully'
        }

        failure {
            echo 'Build Failed: Check console output and reports'
        }
    }
}