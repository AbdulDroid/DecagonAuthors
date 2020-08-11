import kotlinx.coroutines.*
import models.Author

fun main() {
        GlobalScope.launch {
            val result = getUsernameWithHighestCommentCount(3)
            println(result)
        }

}

suspend fun getUsernames(threshold: Int): List<String> =
    withContext(Dispatchers.IO) {
        getAuthors(threshold)
            .sortedByDescending {
                it.submission_count
            }.map { it.username }
    }

suspend fun getUsernameWithHighestCommentCount(threshold: Int): String =
    withContext(Dispatchers.IO) {
        getAuthors(threshold)
            .maxBy { it.comment_count }?.username ?: "No user"
    }

suspend fun getUsernamesSortedByRecordDate(threshold: Int): List<Author> =
    withContext(Dispatchers.IO) {
        getAuthors(threshold)
            .sortedByDescending { it.created_at }
    }

private suspend fun getAuthors(threshold: Int): List<Author> {
    val authorService = AuthorService()
    val authors = arrayListOf<Author>()
    var startPage = 1
    while (startPage <= threshold) {
        val results = authorService.getUsers(page = startPage++)
        authors.addAll(results.data)

        if (startPage > 0 && results.total == authors.size)
            break
    }
    return authors
}