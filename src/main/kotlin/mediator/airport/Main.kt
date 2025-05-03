package mediator.airport

fun main() {
    val controlTower = AirportControlTower()

    val flight1 = Flight(controlTower, "KE123")
    val flight2 = Flight(controlTower, "OZ456")
    val runway = Runway(controlTower)

    flight1.land()
    flight2.land()
    runway.clear()
    flight2.land()
}