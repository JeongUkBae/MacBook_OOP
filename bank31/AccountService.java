package bank31;

public interface AccountService {
	/**
	 * 계좌번호생성
	 * */
	public AccountBean generatorAccountNum();
	/**
	 * 최초입금
	 * */
	public AccountBean inMoney(int money);
	/**
	 * 오늘날짜
	 * */
	public AccountBean today();
	/**
	 * 입금
	 * */
	public String withdraw(int money);
	/**
	 * 출금
	 * */
	public String deposit();
	/**
	 * 계좌정보보기
	 * */
	public String toString(String id,String name, String accountNum,
			int money);
	
}
