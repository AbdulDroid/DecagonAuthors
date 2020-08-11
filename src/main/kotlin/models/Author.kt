package models

data class Author (
    val id: Int,
    val username: String,
    val about: String,
    val submitted: String,
    val updated_at: String,
    val created_at: Long,
    val submission_count: Int,
    val comment_count: Int
)
