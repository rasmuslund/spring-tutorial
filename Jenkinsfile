#!/usr/bin/env groovy
podTemplate(label: 'mypod') {
    node('mypod') {
        /*
        stage('Run shell') {
            sh 'pwd'
            sh 'cd spring-tutorial && ./Ex_SimpleBootApp/mvnw package'
        }
        */
        stage('build') {
            //sh 'mvn --version'
            sh 'java -version'
        }
    }
}

