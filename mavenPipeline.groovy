def call(){
def build(){
echo 'building the Maven project'
sh 'mvn clean install'
}
def deploy(){
echo 'Deploying the artifact'
}
}

