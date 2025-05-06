package decorator.coffee

// 첨가물을 더하는 데코레이터
// 데코레이터의 인스턴스는 Coffee 자료형을 가짐
open class CoffeeDecorator(
    // 커피의 인스턴스 안에 또 다른 커피가 들어있는 셈
    // 데코레이터의 생성자를 사용해서 이 필드에 넣을 또 다른 커피를 받아옴
    private val decoratedCoffee: Coffee,
) : Coffee {
    override fun getDescription(): String = decoratedCoffee.getDescription()
    override fun getCost(): Double = decoratedCoffee.getCost()
}

// 커피 인터페이스를 적용한 데코레이터로부터 상속
// 그렇기 때문에 이들의 인스턴스 역시 커피의 인스턴스
class MilkDecorator(
    // 생성자 매개변수로 받은 커피 인스턴스는
    // CoffeeDecorator 클래스의 decoratedCoffee 필드 값으로 저장
    private val coffee: Coffee,
): CoffeeDecorator(coffee) {
    override fun getDescription(): String = super.getDescription() + ", Milk"

    override fun getCost(): Double = super.getCost() + 1.5
}

class SugarDecorator(
    private val coffee: Coffee,
): CoffeeDecorator(coffee) {
    override fun getDescription(): String = super.getDescription() + ", Sugar"

    override fun getCost(): Double = super.getCost() + 0.5
}