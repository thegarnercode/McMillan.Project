//  Messenger:class
public class Messenger {
    Hashtable<String>

    -messages: HashTable<String, Message>
    +_message(String): void
    +_addMessage(String, Message)
    Message:class
        -messageType: String
        -messageContent: String
        +Message(String, String)
        -setMessageType(String): void
        +getMessageType(): String
        -setMessageContent(String): void
        +getMessageContent(): String
        +toString(): String
}
