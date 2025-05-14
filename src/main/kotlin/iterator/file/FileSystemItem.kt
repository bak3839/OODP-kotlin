package iterator.file

interface FileSystemItem {
    fun getFileName(): String
}

class File(
    val name: String,
): FileSystemItem {
    override fun getFileName(): String = name
}

class Directory(
    val name: String,
): FileSystemItem {
    private val contents = mutableListOf<FileSystemItem>()

    fun add(item: FileSystemItem) {
        contents.add(item)
    }

    fun getContents(): List<FileSystemItem> = contents

    override fun getFileName(): String = name
}