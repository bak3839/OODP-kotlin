package builder.pizza

// Pizza 클래스의 생성자를 private 설정
// -> 외부에서 객체를 생성하지 못함
class Pizza private constructor(
    private var dough: String?,
    private var sauce: String?,
    private var topping: String?
) {
    override fun toString(): String {
        return "Pizza with $dough dough, $sauce sauce, and $topping topping."
    }

    class PizzaBuilder {
        private var dough: String? = null
        private var sauce: String? = null
        private var topping: String? = null

        // 필드 값을 변경하는 메소드
        // this.apply -> PizzaBuilder 자신을 반환
        fun dough(dough: String) = apply { this.dough = dough }
        fun sauce(sauce: String) = apply { this.sauce = sauce }
        fun topping(topping: String) = apply { this.topping = topping }

        // 오직 내부 클래스인 빌더에서만 Pizza 클래스를 생성
        fun build(): Pizza {
            return Pizza(
                dough = dough,
                sauce = sauce,
                topping = topping
            )
        }
    }
}