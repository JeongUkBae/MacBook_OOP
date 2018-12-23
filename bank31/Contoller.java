package bank31;

import javax.swing.JOptionPane;

public class Contoller {
	public static void main(String[] args) {
		MemberBean memberBean = null;
		MemberService memberService = new MemberServiceImpl();
		AccountBean accountBean = null;
		AccountService accountService = new AccountServiceImpl();
		
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴] 0.종료\n"
					+ "1.회원가입 2.회원확인 3.계좌생성 4.계좌확인")) {
			case "0" : JOptionPane.showMessageDialog(null,"종료합니다.");
				return;
				
			case "1" :
				memberBean = memberService.join(JOptionPane.showInputDialog("ID입력"),
						JOptionPane.showInputDialog("이름입력"),
						JOptionPane.showInputDialog("주민번호 입력"),
						JOptionPane.showInputDialog("비밀번호 입력"));
				break;
			case "2" :
				JOptionPane.showMessageDialog(null,memberBean.toString());
				break;
			case "3" :
			//	accountBean = accountService.withdraw(Integer.parseInt(inMoney));
				accountBean = accountService.inMoney(
						Integer.parseInt(JOptionPane.showInputDialog("금액을 입력하세요.")));
				JOptionPane.showMessageDialog(null,String.format(
						accountBean.toString()));
				break;
			case "4" :
				JOptionPane.showMessageDialog(null,accountService.toString());
				break;
			}
		}//while
	}//area
}//field
