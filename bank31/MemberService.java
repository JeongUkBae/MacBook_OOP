package bank31;

public interface MemberService {
	/**
	 * 회원가입
	 * */
	public MemberBean join(String id,String name,String ssn,String pass);
	/**
	 * 로그인
	 * */
	public void login();
	/**
	 * 비번변경
	 * */
	public void update();
	/**
	 * 회원삭제
	 * */
	public void delete();
	
}
