package proxy.image

// 실제 클래스와 프록시 클래스를 만들 인터페이스
interface Image {
    fun display() // 실제로 이미지를 로드 하기 위해 실제 클래스의 역할
    fun getFileName(): String // 이미지 로드가 필요없는 프록시 클래스의 역할
}

class RealImage(
    private val fileName: String
) : Image {
    init {
        loadFromDisk()
    }

    private fun loadFromDisk() {
        println("Loading $fileName")
    }

    override fun display() {
        println("Displaying $fileName")
    }

    override fun getFileName(): String = fileName
}

class ProxyImage(
    private val fileName: String
) : Image {
    // 실제 클래스를 필드로 보유 -> 실제 클래스가 해야 할 일을 호출하기 위함
    private var realImage: RealImage? = null

    override fun display() {
        if(realImage == null) {
            realImage = RealImage(fileName)
        }

        realImage?.display()
    }

    override fun getFileName(): String = fileName

    fun getFileExtension(): String {
        fileName.substringAfterLast('.')
        val lastIndex = fileName.lastIndexOf('.')
        if(lastIndex == -1) {
            return ""
        }
        return fileName.substring(lastIndex + 1)
    }
}