package ch6.example.check15;

public class MemberService {
	// field
	String id = "hong";
	String password = "12345";

	public boolean login(String id, String password) {
		if (id.equals(this.id) && password.equals(this.password)) {
			return true;
		}

		return false;
	}

	public void logout(String string) {
		System.out.println("로그아웃 되었습니다.");
	}

}
