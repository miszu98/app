pipeline {
    agent any

    tools {
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                sh "mvn clean install"
            }
        }
        stage('Tests') {
            steps {
                sh "mvn test"
            }
        }
    }
}
