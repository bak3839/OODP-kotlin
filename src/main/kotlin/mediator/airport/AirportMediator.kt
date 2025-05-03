package mediator.airport

interface AirportMediator {
    fun isRunwayAvailable(): Boolean
    fun setRunwayAvailability(status: Boolean)
}

// 이 중재자는 중재 대상의 인스턴스들을 리스트 등으로 갖고 있지 않음
class AirportControlTower: AirportMediator {
    private var isRunwayAvailable: Boolean = true

    override fun isRunwayAvailable(): Boolean {
        return isRunwayAvailable
    }

    override fun setRunwayAvailability(status: Boolean) {
        isRunwayAvailable = status
    }
}