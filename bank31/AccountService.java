package bank31;

public interface AccountService {
	/**
	 * 계좌번호생성
	 * */
	public AccountBean generatorAccountNum( );
	/**
	 * 오늘날짜
	 * */
	public String today();
	/**
	 * 입금
	 * */
	public String withdraw();
	/**
	 * 출금
	 * */
	public String deposit();
	/**
	 * 계좌정보보기
	 * */
	public String toString();
	
}
