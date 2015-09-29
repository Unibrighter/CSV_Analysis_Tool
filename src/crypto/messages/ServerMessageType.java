package crypto.messages;

public enum ServerMessageType {
	SERVER_BUSY, SERVER_HELLO, SERVER_DHEX, SERVER_DHEX_DONE,
	TEXT, SERVER_NEXT_LENGTH_REQUEST, SERVER_NEXT_LENGTH, 
	SERVER_NEXT_LENGTH_RECV, SERVER_COMM_END, SERVER_SPEC,
	SERVER_TEXT, SERVER_TEXT_RECV, SERVER_TEXT_DONE, 
	SERVER_FINISH, NONE
}