package bank1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		Account account = null;
		while(true) {
			switch(JOptionPane.showInputDialog("[국민은행] 환영합니다 고객님. \n"
					+ "0.시스템 종료\n"
					+ "1.회원가입 "
					+ "2.회원확인 "
					+ "3.신규개설\n"
					+ "4.입금 "
					+ "5.출금 6.입출금내역확인")) {
				case "0" :
					JOptionPane.showMessageDialog(null,"이용해주셔서 감사합니다.");
					return;
				case "1" :
					String id = JOptionPane.showInputDialog("ID를 입력하세요.");
					String name = JOptionPane.showInputDialog("이름을 입력하세요.");
					String ssn = JOptionPane.showInputDialog("주민번호를 입력하세요.");
					String pass = JOptionPane.showInputDialog("비밀번호를 입력하세요.");
					member = new Member(id, name, ssn, pass);
					JOptionPane.showMessageDialog(null,"가입되었습니다. 감사합니다.");
					break;
				case "2" : 
					String info = member.info();
					JOptionPane.showMessageDialog(null, info);
					break;
				case "3" :
					account = new Account(0);
					String gan = account.accountNum;
					JOptionPane.showMessageDialog(null,gan);
					break;
				case "4" :
					
					break;
			}
		}//while
		
	}//area
}//field
