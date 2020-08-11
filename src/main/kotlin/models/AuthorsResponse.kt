package models

data class AuthorsResponse (
    val page: Int,
    val per_page: Int,
    val total: Int,
    val total_pages: Int,
    val data: List<Author>
)