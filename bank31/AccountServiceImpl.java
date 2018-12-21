package bank31;

import java.util.Random;

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

	@Override
	public String today() {
		
		return null;
	}

	@Override
	public String withdraw() {
		
		return null;
	}

	@Override
	public String deposit() {
		
		return null;
	}

}
