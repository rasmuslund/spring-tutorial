podTemplate(label: 'mypod') {
    node('mypod') {
        stage('Run shell') {
            sh 'pwd'
            sh './Ex_SimpleBootApp/mvnw package'
        }
    }
}

