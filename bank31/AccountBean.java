package bank31;

public class AccountBean {
	private String accountNum,today;
	private int money;
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public String getToday() {
		return today;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("계좌가 생성되었습니다."
				+ "\n계좌번호: %s "
				+ "\n생성일: %s"
				+ "\n입금액: %s",accountNum,today,money);
	}
}
