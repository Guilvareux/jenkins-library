def notify(token, user, title, message, priority, sound) {
  sh """
      curl -s --fail \\
        -X POST \\
        -F "token=${token}" \\
        -F "user=${user}" \\
        -F "message=${message}" \\
        -F "title=${title}" \\
        -F "priority=${priority}" \\
        -F "sound=${sound}" \\
        https://api.pushover.net/1/messages.json
  """
}
