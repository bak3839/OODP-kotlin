package visitor.filesystem

interface FileSystem {
    fun accept(visitor: Visitor)
}

class File(
    private val name: String,
    private val size: Long,
): FileSystem {
    fun getName(): String = name

    fun getSize(): Long = size

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}

class Directory(
    private val name: String,
    private val elements: MutableList<FileSystem> = mutableListOf()
): FileSystem {
    fun getName(): String = name

    fun getElements(): MutableList<FileSystem> = elements

    fun addElement(element: FileSystem) {
        elements.add(element)
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}
