node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def mvn = tool 'Default Maven';
    withSonarQubeEnv() {
      sh "${mvn}/bin/mvn clean verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar -Dsonar.projectKey=Group-Onee_Repo_40df89f2-62cc-4356-a1b3-1dcd3389d0ef -Dsonar.projectName='Repo'"
    }
  }
}
