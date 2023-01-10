package ch15.example4;

public class Member {
	// field
	public String name;
	public int age;

	// constructor
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age; // String의 hashCode는 동일한 문자열이면같은 해쉬코드를 가지도록 오버라이딩 되어있음.
	} // 이름과 나이가 같다면 name.hashCode() + 나이를 더한 같은 해쉬코드가 출력됨.

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return (member.name.equals(this.name)) && (member.age == age); 
		} else {
			return false;
		}
		
	
	
	}
}
