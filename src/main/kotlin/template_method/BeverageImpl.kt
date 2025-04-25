package template_method

class Tea: Beverage() {
    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiments() {
        println("Adding lemon")
    }
}

class Coffee: Beverage() {
    override fun brew() {
        println("Dripping coffee through filter")
    }

    override fun addCondiments() {
        println("Adding sugar and milk")
    }
}