package com.sobhanmp.network.httpclient

import com.sobhanmp.golazo.network.httpclient.NetworkModule
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.statement.request
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.headersOf
import io.ktor.utils.io.ByteReadChannel
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test


class HttpClientTest {

    var mockEngine: MockEngine? = null

    @Before
    fun before() {
        mockEngine = MockEngine { request ->
            respond(
                content = ByteReadChannel("""{"ip":"127.0.0.1"}"""),
                status = HttpStatusCode.OK,
                headers = headersOf(HttpHeaders.ContentType, "application/json")
            )
        }
    }

    @Test
    fun `fetch data return success`() {
        //given

        //when
        // val result : String? = null
        //then
        // assertEquals("Expected data", result)
    }

    @Test
    fun `auth header is set on http client`() {
        runBlocking {
            //given http client
            val httpClient = NetworkModule.createHttpClient(mockEngine!!)
            //when request a network call
            val header = httpClient.get("").request.headers.get(NetworkModule.AUTH_KEY)
            //then auth header is set
            assertEquals(header, NetworkModule.KEY)
        }
    }

    @Test
    fun `base url is set on http client`(){
        runBlocking {
            //given http client
            val httpClient = NetworkModule.createHttpClient(mockEngine!!)
            //when request a network call
            val url = httpClient.get("").request.url.toString()
            //then
            assertEquals(url, NetworkModule.BASE_URL)
        }
    }
}
