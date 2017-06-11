#!/usr/bin/env groovy
podTemplate(label: 'mypod') {
    node('mypod') {

        stage('tool versions') {
            sh 'git --version'
            sh 'java -version'
            sh 'javac -version'
        }

        stage('checkout') {
            sh 'git clone https://github.com/rasmuslund/spring-tutorial.git'
        }

        stage('build & test') {
            sh 'cd spring-tutorial/Ex_SimpleBootApp && ./mvnw clean package -DskipTests'
        }
    }
}

