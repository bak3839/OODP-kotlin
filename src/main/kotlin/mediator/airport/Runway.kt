package mediator.airport

class Runway(
    private val mediator: AirportMediator,
) {
    // 활주로는 해당 메소드를 통해 착륙 가능 여부를 참으로 변경
    fun clear() {
        println("Runway is clear.")
        mediator.setRunwayAvailability(true)
    }
}