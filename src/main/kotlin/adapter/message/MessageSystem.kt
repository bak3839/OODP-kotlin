package adapter.message

class OldMessageSystem: OldMessageSender {
    override fun send(messageData: Array<String>): Int {
        println("OldMessageSystem: Sending message: " +
                "${messageData[0]} to ${messageData[1]}")
        return 1
    }
}