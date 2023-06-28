def call()
{
  def content = libraryResource "bash.sh"
  writeFile file: "bash.sh", text: content
  sh 'ls -l ./bash.sh'
  sh "./bash.sh"
}

def call(Map config = [:]) { 
  def scriptcontents = libraryResource "com/planetpope/scripts/linux/${config.name}"    
  writeFile file: "${config.name}", text: scriptcontents 
  sh "chmod a+x ./${config.name}"
} 
