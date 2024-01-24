def call() {

   checkout scmGit(
	branches: [[name: stageParams.branch]], 
	userRemoteConfigs: [[url: stageParams.url]]
   )

}
