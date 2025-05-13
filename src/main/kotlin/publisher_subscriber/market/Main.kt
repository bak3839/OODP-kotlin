package publisher_subscriber.market

fun main() {
    val emailService = EmailDeliveryService()

    val marketing = MarketingDepartment(emailService, "ProductLaunch")

    val customer1 = IndividualCustomer("Customer 1")
    val customer2 = IndividualCustomer("Customer 2")

    emailService.subscribe("ProductLaunch", customer1)
    emailService.subscribe("ProductLaunch", customer2)

    marketing.launchCampaign("New Product")

    val customer3 = IndividualCustomer("Customer 3")
    emailService.subscribe("ProductLaunch", customer3)

    marketing.launchCampaign("Update")

    try {
        Thread.sleep(10000)
    } catch (ex: InterruptedException) {
        Thread.currentThread().interrupt()
    }

    emailService.shutdown()
}