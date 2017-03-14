package hello

interface MessageRenderer {
    fun render()
    var messageProvider: MessageProvider
}
