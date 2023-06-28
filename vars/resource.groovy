def call()
{
  def content = libraryResource "bash.sh"
  writeFile file: "bash.sh", text: content
  sh "./bash.sh"
}

