package visitor.filesystem

interface Visitor {
    fun visit(file: File)
    fun visit(directory: Directory)
}

class SizeCalculatorVisitor : Visitor {
    private var totalSize: Long = 0

    override fun visit(file: File) {
        totalSize += file.getSize()
    }

    override fun visit(directory: Directory) {
        for (element in directory.getElements()) {
            // File 방문자 방문 -> visit(file) 메소드 실행
            element.accept(this)
        }
    }

    fun getTotalSize(): Long = totalSize
}

class FileSearchVisitor(
    private val searchFileName: String
) : Visitor {
    private var foundFile: File = File("", 0)

    override fun visit(file: File) {
        if(file.getName() == searchFileName) {
            foundFile = file
        }
    }

    override fun visit(directory: Directory) {
        for(element in directory.getElements()) {
            element.accept(this)
        }
    }

    fun getFoundFile(): File = foundFile
}

