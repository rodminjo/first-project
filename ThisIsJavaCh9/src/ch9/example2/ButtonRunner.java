package ch9.example2;

public class ButtonRunner {

	public static void main(String[] args) {
		Button btn = new Button();

		btn.setOnClickListener(new CallListener());
		btn.touch();

		btn.setOnClickListener(new MessageListener());
		btn.touch();

	}

}
