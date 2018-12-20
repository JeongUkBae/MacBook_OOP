package gms;

import java.util.Random;

public class StudentService {
	public String hanbun() {
		String hanbun ="";
		Random random = new Random();
		for(int i=0; i<10; i++) {
			if(i==1) {
				hanbun += random.nextInt(10)+"-";
			} else {
				hanbun += random.nextInt(10);
			}
		}
		
		return hanbun;
	}

}
