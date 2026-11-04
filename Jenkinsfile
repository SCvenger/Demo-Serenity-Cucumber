pipeline {
    agent any
    
    tools {
        jdk 'JDK 25'
        maven 'Maven 3.10.0'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/SCvenger/Demo-Serenity-Cucumber.git'
            }
        }
        stage('Build & Test') {
            steps {
                catchError(buildResult: 'UNSTABLE', stageResult: 'FAILURE') {
                    bat 'mvn clean verify'
                }
            }
        }
    }

    post {
        always {
            publishHTML([
                reportDir: 'target/site/serenity',
                reportFiles: 'index.html',
                reportName: 'Serenity Report',
                keepAll: true,
                alwaysLinkToLastBuild: true,
                allowMissing: true
            ])
        }
    }
}   
