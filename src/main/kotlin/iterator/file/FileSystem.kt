package iterator.file

class FileSystem(
    private val root: Directory,
) {
    fun depthFirstIterator(): FileSystemIterator
    = DepthFirstIterator(root)

    fun breadthFirstIterator(): FileSystemIterator
    = BreadthFirstIterator(root)
}