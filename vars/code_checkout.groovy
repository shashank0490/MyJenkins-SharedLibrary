def call(String GitUrl, String GitBranch){
  checkout scmGit(branches: [[name: "*/${GitBranch}"]], extensions: [], userRemoteConfigs: [[url: "${GitUrl}"]])
}
