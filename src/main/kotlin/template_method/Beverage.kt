package template_method

abstract class Beverage {

    final fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        addCondiments()
    }

    fun boilWater() {
        println("Boiling water")
    }

    fun pourInCup() {
        println("Pouring into cup")
    }

    abstract fun brew()
    abstract fun addCondiments()
}