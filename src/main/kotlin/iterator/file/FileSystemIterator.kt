package iterator.file

import java.util.*
import kotlin.NoSuchElementException

interface FileSystemIterator {
    fun hasNext(): Boolean
    fun next(): FileSystemItem
}

// 깊이 우선 탐색
class DepthFirstIterator(
    private val root: Directory,
    private val stack: Stack<FileSystemItem> = Stack()
) : FileSystemIterator {
    init {
        stack.push(root)
    }

    override fun hasNext(): Boolean = stack.isNotEmpty()

    override fun next(): FileSystemItem {
        if(!hasNext()) throw NoSuchElementException()

        val current = stack.pop()

        if(current is Directory) {
            val contents = current.getContents()
            contents.asReversed().forEach { stack.push(it) }
        }

        return current
    }
}

// 너비 우선 탐색
class BreadthFirstIterator(
    private val root: Directory,
    private val queue: Queue<FileSystemItem> = LinkedList()
) : FileSystemIterator {
    init {
        queue.offer(root)
    }

    override fun hasNext(): Boolean = queue.isNotEmpty()

    override fun next(): FileSystemItem {
        if(!hasNext()) throw NoSuchElementException()

        val current = queue.poll()
        if(current is Directory) {
            queue.addAll(current.getContents())
        }

        return current
    }
}