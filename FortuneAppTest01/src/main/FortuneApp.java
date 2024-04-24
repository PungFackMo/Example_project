package main;

import controller.FortuneController;
import service.FortuneRepository;

//메인 앱
public class FortuneApp {
	public static void main(String[] args) {
		
		FortuneController fController=new FortuneController(new FortuneRepository());
		
		//앱 실행
		fController.runApp();
		
	}

}
