package bank;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		Account account = null;
		while(true) {
			switch(JOptionPane.showInputDialog("[안녕하세요.]"
					+ "\n 0.종료"
					+ "\n 1.회원가입"
					+ "\n 2.계좌생성"
					+ "\n 3.계좌확인")) {
			case "0" : 
				JOptionPane.showMessageDialog(null,"이용해주셔서 감사합니다.");
				return;
			case "1" :
				String id = JOptionPane.showInputDialog("ID 입력");
				String name = JOptionPane.showInputDialog("이름 입력");
				String ssn = JOptionPane.showInputDialog("주민번호 확인");
				String pass = JOptionPane.showInputDialog("비밀번호 입력");
				member = new Member(id, name, ssn, pass);
				String info = member.info();
				JOptionPane.showMessageDialog(null, info);
				break;
			case "2" :
				account = new Account(0);
				JOptionPane.showMessageDialog(null,"계좌가 설되었습니다.");
				break;
			
			
			}
		}
		
	}//area
}//field
