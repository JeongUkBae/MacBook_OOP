package bank1;

import java.util.Random;

/**
 * 계좌클래스
 * [속성] 
 * 상수 :  BANK_NAME 
 * 맴버변수 : 
 * 	1. accountNum 계좌번호 
 * 	2. money 잔액
 * 	3. today 해당일
 * [기능]
 *  1. generatorAccountNum() 계좌번호 생성(랜덤)
 *  2. today() 해당일 생성
 *  3. withdraw() 출금하기
 *  4. deposit() 입금하기
 *  5. accNuminfo() 계좌정보
 * */
public class Account {
	String accountNum, today;
	int money;
	Account(int money) {
		this.money = money;
		this.accountNum = this.generatorAccountNum();
	}
	public String generatorAccountNum() {
		String accuontNum = "";
		Random random = new Random();
		for(int i=0;i<14; i++) {
			if(i==3) {
				accuontNum += random.nextInt(10)+"-";
			} else if(i==5) {
				accuontNum += random.nextInt(10)+"-";
			} else {
				accuontNum += random.nextInt(10);
			}
		}
		return accuontNum;
	}
	
}//field
