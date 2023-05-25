pipeline {
    agent any

    tools {
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                sh "mvn clean compile"
            }
        }
        stage('Tests') {
            steps {
                sh "mvn test"
            }
        }
    }
}
