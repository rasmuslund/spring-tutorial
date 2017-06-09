podTemplate(label: 'mypod') {
    node('mypod') {
        stage('Run shell') {
            sh 'pwd'
            sh 'cd spring-tutorial && ./Ex_SimpleBootApp/mvnw package'
        }
    }
}

