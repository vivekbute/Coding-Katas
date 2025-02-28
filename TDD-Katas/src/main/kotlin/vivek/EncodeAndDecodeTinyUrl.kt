package org.example.vivek

class EncodeAndDecodeTinyUrl {
    private val baseUrl = "abcd"
    private var counter = 0
    private val encodedData: MutableMap<String, String> = mutableMapOf()
    fun encode(longUrl: String): String {
        val shortUrl = baseUrl + counter
        encodedData[shortUrl]= longUrl
        return shortUrl;
    }

    fun decode(shortUrl: String): String {
        return encodedData[shortUrl].toString();
    }
}