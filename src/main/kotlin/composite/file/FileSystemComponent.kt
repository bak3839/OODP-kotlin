package composite.file

interface FileSystemComponent {
    fun printName()
    fun getSize(): Int
    fun getName(): String
}

class File(
    private val name: String,
    private val size: Int,
): FileSystemComponent {
    override fun printName() {
        println("File: $name")
    }

    override fun getSize(): Int = size

    override fun getName(): String = name
}

class Directory(
    private val name: String,
): FileSystemComponent {
    // 다른 컴포넌트를 담을 수 있는 복합체이기 때문에 리스트 보유
    private val components = mutableListOf<FileSystemComponent>()

    fun add(component: FileSystemComponent) {
        components.add(component)
    }

    fun remove(component: FileSystemComponent) {
        components.remove(component)
    }

    fun remove(name: String) {
        components.removeIf {
            it.getName() == name
        }
    }

    override fun printName() {
        println("Directory: $name")
        components.forEach(FileSystemComponent::printName)
    }

    override fun getSize(): Int = components.sumOf { it.getSize() }

    override fun getName(): String = name
}