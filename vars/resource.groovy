def call()
{
  def content = libraryResource "bash.sh"
  WriteFile file: "bash.sh", text: content
  sh './bash.sh'
}
