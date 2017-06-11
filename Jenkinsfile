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
//            def mvn_version = 'M3'
//            withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
                sh 'git --version'
                sh 'git clone https://github.com/rasmuslund/spring-tutorial.git'
                sh 'ls -al'

                sh 'cd spring-tutorial && ./mvnw clean package'
                //sh "mvn clean package"
//            }
        }
/*
        stage('build') {
            sh 'java -version'
            sh 'mvn --version'
        }
*/
    }
}

