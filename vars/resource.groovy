def call()
{
  def content = libraryResource "bash.sh"
  writeFile file: "prog.sh", text: content
  sh 'ls -l ./prog.sh'
  sh 'chmod u+x ./prog.sh'
  sh "./bash.sh"
}

