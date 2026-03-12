pipeline {
    agent any

    stages {
        stage('SCM') {
            steps {
                // Checkout code from Git
                git credentialsId: 'AaronGlobal', url: 'https://github.com/Group-Onee/Repo.git', branch: 'main'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                // Use the SonarQube environment configured in Jenkins
                withSonarQubeEnv('Sonar-Qube') {
                    // Run SonarScanner directly (no Maven required)
                    bat 'sonar-scanner -Dsonar.projectKey=Group-Onee_Repo -Dsonar.projectName=Repo -Dsonar.sources=.'
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed. Check the logs above for errors.'
        }
    }
}
