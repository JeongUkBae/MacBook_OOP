package bank;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Account {
	final static String BANK_NAME = "국민은행";
	String accountNum, today;
	int money;
	
	Account(int money) {
		this.accountNum = this.generatorAccountNum();
		this.today = this.today();
		this.money = money;
		
	}
	
	public String generatorAccountNum() {
		String accountNum = "";
		Random random = new Random();
		for(int i=0; i<8; i++) {
			if(i==3) {
				accountNum += random.nextInt(10)+"-";
			}else {
				accountNum += random.nextInt(10);
			}
		}
		
		return accountNum;
	}
	
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return today;
	}
	
}
