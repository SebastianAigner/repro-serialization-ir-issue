import kotlinx.browser.document
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
sealed class Message {
    @Serializable
    class Rectangle(val x: Double, val y: Double): Message()
}

fun main() {
    val myObj = """{"type":"Message.Rectangle","x":90.0,"y":30.0}"""
    console.log(Json.decodeFromString<Message>(myObj))
}