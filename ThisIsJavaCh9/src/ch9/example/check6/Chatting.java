package ch9.example.check6;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				// nickName 은 중첩클래스 안 필드이기 때문에 final 특성을 가짐.
				while(true) {
					String inputData = "안녕하세요.";
					// String message = "["+nickName + "]"+inputData;
					// sendMessage(message);
				}
			}
		};
		chat.start();
		
	}

	class Chat {
		void start() {
		}

		void sendMessage(String message) {
		}
	}
}
