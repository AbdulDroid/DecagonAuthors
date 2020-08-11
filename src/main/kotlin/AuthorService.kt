import models.AuthorsResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface AuthorService {

    @GET("article_users/search")
    suspend fun getUsers(@Query("page") page: Int): AuthorsResponse

    companion object{
        private val BASE_URL = "https://jsonmock.hackerrank.com/api/"
        operator fun invoke(): AuthorService = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .client(OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build())
            .build()
            .create(AuthorService::class.java)
    }
}