pipeline {
    agent any 
    stages {
        stage('pull') { 
            steps {
                git credentialsId: 'github-cred', url: 'https://github.com/hirajendra2999/central.git'
            }
        }
        stage('Build') { 
            steps {
                sh 'echo "Build Successfull"'
            }
        }
        stage('Test') { 
            steps {
                sh 'echo "Test Successfull"'
            }
        }
        stage('Deploy') { 
            steps {
                sh 'echo "Deploy Successfull"'
            }
        }
    }    
}