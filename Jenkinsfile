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
            def mvn_version = 'M3'
            withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
                sh 'mvn clean package'
                //sh "mvn clean package"
            }
        }
/*
        stage('build') {
            sh 'java -version'
            sh 'mvn --version'
        }
*/
    }
}

