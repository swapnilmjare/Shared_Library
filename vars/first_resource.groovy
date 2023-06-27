def call(name)
{
  sh "date"
  sh "ifconfig enp0s3"
  echo "${name}"
}
