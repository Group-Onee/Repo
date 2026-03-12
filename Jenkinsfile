pipeline {
    agent any

    stages {
        stage('SCM') {
            steps {
                git credentialsId: 'AaronGlobal', url: 'https://github.com/Group-Onee/Repo.git', branch: 'main'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                script {
                    // Get SonarScanner installation path
                    def scannerHome = tool name: 'SonarScanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
                    // Run SonarScanner
                    bat "${scannerHome}\\bin\\sonar-scanner.bat -Dsonar.projectKey=Group-Onee_Repo -Dsonar.projectName=Repo -Dsonar.sources=."
                }
            }
        }
    } // end of stages

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed. Check the logs above for errors.'
        }
    }
}
