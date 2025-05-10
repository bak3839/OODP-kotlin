package chain_of_responsibility.handler

abstract class Handler {
    // 해당 인스턴스의 뒤로 연결될 다른 핸들러 인스턴스를 기리킴
    protected var next: Handler? = null

    fun chainNext(next: Handler) {
        this.next = next
    }

    // 자신의 작업을 수행 후
    // 연결된 핸들러가 있다면 그 핸들러의 handle 호출
    fun handle(number: Int) {
        process(number)
        next?.handle(number)
    }

    // 각 핸들러가 주어진 작업에 대해 나름대로의 작업을 수행
    protected abstract fun process(number: Int)
}

class PositiveHandler : Handler() {
    override fun process(number: Int) {
        if(number > 0) {
            println("$number is a positive number")
        }
    }
}

class EvenHandler : Handler() {
    override fun process(number: Int) {
        if(number % 2 == 0) {
            println("$number is an even number")
        }
    }
}

class DivisibleBy3Handler : Handler() {
    override fun process(number: Int) {
        if(number % 3 == 0) {
            println("$number is divisible by 3")
        }
    }
}