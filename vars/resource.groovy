def call()
{
  def content = libraryResource "bash.sh"
  WriteFile f = file: "bash.sh", text: content
  sh './bash.sh'
}
