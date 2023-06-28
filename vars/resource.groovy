def call()
{
  def content = libraryResource "bash.sh"
  WriterFile f = file: "bash.sh", text: content
  sh './bash.sh'
}
