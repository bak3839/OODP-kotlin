package mediator.airport

class Flight(
    private val mediator: AirportMediator,
    private val flightNumber: String
) {
    fun land() {
        if(mediator.isRunwayAvailable()) {
            println("Flight $flightNumber is landing.")
            mediator.setRunwayAvailability(false)
        } else {
            println("Flight $flightNumber is waiting to land.")
        }
    }
}