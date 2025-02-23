def call(String SonarQubeAPI, String Projectname, String ProjectKey){
  withSonarQubeEnv(credentialsId: "${SonarQubeAPI}") {
    sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${Projectname} -Dsonar.projectKey=${ProjectKey} -X"
  }
}
