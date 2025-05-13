package publisher_subscriber.market

// 발행자
class MarketingDepartment(
    private val emailService: EmailDeliveryService,
    private val eventType: String
) {
    fun launchCampaign(message: String) {
        println("Launching campaign: $message")
        emailService.sendEmails(eventType, message)
    }
}