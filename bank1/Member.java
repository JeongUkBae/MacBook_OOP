package bank1;

public class Member {
	final static String BANK_NAME = "국민은행";
	String id, name, ssn, pass;
	Member(String id, String name,String ssn,String pass ) {
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	
	public String info() {
		return String.format("[%s] 회원정보\n"
				+ "이름 : %s\n"
				+ "ID : %s\n"
				+ "주민번호 : %s\n"
				+ "비밀번호 : %s", BANK_NAME, name, id, ssn, pass);
	}
	
}
