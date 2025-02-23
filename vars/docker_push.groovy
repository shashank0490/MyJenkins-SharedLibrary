def call(String ProjectName, String ImageTag, String DockerhubUser){
  withCredentials([usernamePassword(credentialsId: '956b203e-6f26-41b9-83d0-46ca18b24f12', passwordVariable: 'dockerhubUser', usernameVariable: 'dockerhubPass')]) {
    sh "docker login -u ${dockerhubUser} -p ${dockerhubPass}"
  }
  sh "docker push ${DockerhubUser}/${ProjectName}:${ImageTag}"
}