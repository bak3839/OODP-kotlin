package builder.http

class HttpRequest private constructor(
    private var method: String?,
    private var url: String?,
    private var body: String?,
    private var headers: MutableMap<String, String>?,
    private var params: MutableMap<String, String>?
) {
    override fun toString(): String {
        return "HttpRequest [method: $method, url: $url, body: $body, headers: $headers, params: $params]"
    }

    class Builder(
        private var method: String,
        private var url: String
    ) {
        private var body: String? = null
        private var headers: MutableMap<String, String> = mutableMapOf()
        private var params: MutableMap<String, String> = mutableMapOf()

        fun setBody(body: String) = apply { this.body = body }
        fun addParam(key: String, value: String) = apply { params[key] = value }
        fun addHeader(key: String, value: String) = apply { headers[key] = value }

        fun build(): HttpRequest = HttpRequest(
            method = method,
            url = url,
            body = body,
            headers = headers,
            params = params
        )
    }
}