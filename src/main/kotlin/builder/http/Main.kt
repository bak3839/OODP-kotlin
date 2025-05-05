package builder.http

fun main() {
    val getRequest = HttpRequest.Builder("GET", "https://www.oodp.com")
        .addHeader("Authorization", "Bearer Token")
        .addParam("query", "builder-pattern")
        .build()

    val postRequest = HttpRequest.Builder("POST", "https://www.oodp.com")
        .addHeader("Authorization", "Bearer Token")
        .setBody("{ \"name\": \"John Smith\", \"age\": 28 }")
        .build()

    println(getRequest)
    println(postRequest)
}