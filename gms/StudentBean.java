package gms;

public class StudentBean {
	final static String GMS_NAME = "비트학원";
	private String hanbun, name, ssn, pass;
	
	public void setHanbun(String hanbun) {
		this.hanbun = hanbun;
	}
	public String getHnbun() {
		return  hanbun;
	}
	public void setnName(String name) {
		this.name = name;
	}
	public String getName() {
		return  name;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return  ssn;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return  pass;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("");
	}
	
	
}
