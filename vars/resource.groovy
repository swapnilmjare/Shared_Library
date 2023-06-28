def call()
{
  def content = libraryResource "bash.sh"
  writeFile file: "prog.sh", text: content
  sh 'ls -l ./bash.sh'
  sh 'chmod u+x ./bash.sh'
  sh "./bash.sh"
}

