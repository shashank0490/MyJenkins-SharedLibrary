def call(credentialsId) {
	withSonarQubeEnv(CredentialsId) {
	   sh 'mvn clean package sonar:sonar'
	}
}
