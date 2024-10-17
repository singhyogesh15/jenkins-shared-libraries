def call(String ProjectName, String dockerHubUser, String ImageTag){
  sh "docker build -t ${dockerHubUser}${ProjectName}:${ImageTag} ."
}
