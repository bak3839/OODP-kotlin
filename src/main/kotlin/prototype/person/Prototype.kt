package prototype.person

// 보통 자바에서 제공하는 Clonable 인터페이스를 사용
// 기타 언어에서도 프로토타입 클로닝을 위한 방법들을 제공
interface Prototype {
    fun clone(): Prototype
}

class Person(
    private val name: String,
    private val age: Int,
    private var address: String,
) : Prototype{
    // 스스로를 인자로 넣어 인스턴스를 생성
    constructor(other: Person) : this(other.name, other.age, other.address)

    override fun clone(): Person = Person(this)

    fun setAddress(address: String) {
        this.address = address
    }

    fun displayInfo() {
        println("Name: $name, Age: $age, Address: $address")
    }
}