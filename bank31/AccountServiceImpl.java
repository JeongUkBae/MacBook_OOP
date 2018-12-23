package bank31;

import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Date;

public class AccountServiceImpl implements AccountService {

	@Override
	public AccountBean generatorAccountNum() {
		String accountNum1= "";
		AccountBean accountBean = new AccountBean();
		Random random = new Random();
		for(int i=0; i<10; i++) {
			if(i==2) {
				accountNum1 += random.nextInt(10)+"-";
			}
			accountNum1 += random.nextInt(10);
		}
		accountBean.setAccountNum(accountNum1);
		return accountBean;
	}

	public AccountBean inMoney(int money) {
		AccountBean accountBean = new AccountBean();
		accountBean.setMoney(money);
		return accountBean;
	}
	
	@Override
	public AccountBean today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd "
				+ "HH:mm:ss");
		AccountBean accountBean = new AccountBean();
		accountBean.setToday(sdf.format(date));
		return accountBean;
	}

	@Override
	public String withdraw(int money) {

		return null;
	}

	@Override
	public String deposit() {

		return null;
	}

	public String toString(String id,String name, String accountNum,
			int money) {
		MemberBean memberBean = new MemberBean();
		AccountBean accountBean =  new AccountBean();

		return String.format("ID : %s\n"
				+ "이름 : %s\n"
				+ "계좌번호 : %s\n"
				+ "잔액 : %s\n"
				+ "생성일 : %s\n",memberBean.getId(),memberBean.getName()
				,accountBean.getAccountNum(),accountBean.getMoney());
	}


}
