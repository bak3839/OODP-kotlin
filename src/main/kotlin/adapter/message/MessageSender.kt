package adapter.message

interface ModerMessageSender {
    fun sendMessage(message: String, recipient: String)
}

interface OldMessageSender {
    fun send(messageData: Array<String>): Int
}