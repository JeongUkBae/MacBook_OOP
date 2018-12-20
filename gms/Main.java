package gms;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		StudentBean studentBean = null;
		StudentService studentService = new StudentService();
		while(true) {
			switch(JOptionPane.showInputDialog("[학생기록부] 0.종료\n"
					+ "1.학생등록 2.회원정보 \n"
					+ "3.비밀번호변경 4.수강등록 5.성정표보기")) {
				case "0" : 
					JOptionPane.showMessageDialog(null,"종료합니다.");
					return;
				case "1" :
					String name = JOptionPane.showInputDialog("이름을 입력하세요.");
					String ssn = JOptionPane.showInputDialog("주민번호를 입력하세요.");
					String pass = JOptionPane.showInputDialog("비밀번호를 입력하세요.");
					studentBean = new StudentBean();
					studentBean.setnName(name);
					studentBean.setSsn(ssn);
					studentBean.setPass(pass);
					String hanbun = studentService.hanbun();
					studentBean.setHanbun(hanbun);
					JOptionPane.showMessageDialog(null,String.format("등록되었습니다.\n"
													+ "학번 : %s",hanbun));
					
					break;
			
			}//switch
		}//while
		
	}//area
}//field
