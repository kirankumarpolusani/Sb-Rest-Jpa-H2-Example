pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/kirankumarpolusani/Sb-Rest-Jpa-H2-Example.git'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }
        stage('Docker Build') {
            steps {
                sh 'docker build -t kirankumarpolusani/Sb-Rest-Jpa-H2-Example:1.0-SNAPSHOT .'
            }
        }
        stage('Docker push') {
            steps {
                sh "docker login -u kirankumarpolusani -p 1D@ntKn@w"
                sh "docker push kirankumarpolusani/Sb-Rest-Jpa-H2-Example:1.0-SNAPSHOT"
            }
        }
        stage('Deploy to staging') {
            steps {
                sh "docker run -d --rm -p 8181:8181 --name springboot kirankumarpolusani/Sb-Rest-Jpa-H2-Example:1.0-SNAPSHOT"
            }
        }
    }
}