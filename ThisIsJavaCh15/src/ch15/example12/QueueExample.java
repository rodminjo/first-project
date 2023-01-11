package ch15.example12;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();

		messageQueue.offer(new Message("sendSMS", "Shin"));
		messageQueue.offer(new Message("sendMail", "Hong"));
		messageQueue.offer(new Message("sendKakaotalk", "Hong"));

		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.getCommand()) {
			case "sendMail":
				System.out.println(message.getTo() + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.getTo() + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.getTo() + "님에게 카톡을 보냅니다.");
				break;
			}
		}
	}

}
