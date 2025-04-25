package singleton

class Theme private constructor() {
    var themeColor = "light"

    companion object {
        private var instance: Theme? = null

        fun getInstance(): Theme {
            return instance ?: Theme().also { instance = it }
        }
    }
}