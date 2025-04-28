package adapter.message

class MessageAdapter(
    private val oldSystem: OldMessageSender,
): ModerMessageSender {
    override fun sendMessage(message: String, recipient: String) {
        val messageData = arrayOf<String>(message, recipient)
        val result = oldSystem.send(messageData)
        if(result != 1) {
            println("Failed to send message")
        }
    }
}