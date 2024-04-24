package controller;

import service.FortuneService;
import view.FortuneView;

//앱의 기능 담당
public class FortuneController {
	
	private FortuneView fView=new FortuneView();
	private FortuneService fService;
	
//	생성자를 통한 의존성 주입(DI)
	public FortuneController(FortuneService fService) {
		this.fView = new FortuneView();
		this.fService = fService;
	}

	public void runApp() {
		fService.getFileFortunes();
		int choice;
		//메뉴 보이기
		while(true) {
			choice=fView.menu();
			switch(choice) {
			case 0:
				//종료
				stopApp();
				return;
			case 1:
				//운세 하나 뽑기
				getFortune();
				break;
			case 2:
				//새로운 운세 추가
				putFortune();
				break;
			case 3:
				//운세 전체 보기
				getFortunes();
				break;
			case 4:
				//운세 수정 하기
				updateFortune();
				break;
			case 5:
				//운세 삭제 하기
				deleteFortune();
				break;
			}
		}
	}
	
	
	//앱 종료
	public void stopApp() {
		fView.stopApp();
		fService.putFileFortunes();
	}
	
	//운세 하나 뽑기
	public void getFortune() {
		fView.getFortune(fService.getFortuneDtos());
	}
	
	//운세 생성
	public void createFortune(String createStr) {
		fService.createFortune(createStr);
	}
	
	//새로운 운세 추가
	public void putFortune() {
		String newFortuneStr=fView.putFortune();
		fService.createFortune(newFortuneStr);
		fService.putFileFortunes();
	}
	
	//운세 전체 보기
	public void getFortunes() {
		fView.getFortunes(fService.getFortuneDtos());
	}
	
	//운세 수정 하기
	public void updateFortune() {
		int updateIndex=fView.getUpdateIndex(fService.getFortuneDtos());
		String updateStr=fView.getUpdateStr(fService.getFortuneDtos());
		fService.updateFortune(updateIndex, updateStr);
		fService.putFileFortunes();
	}
	
	//운세 삭제 하기
	public void deleteFortune() {
		int deleteIndex=fView.deleteFortune(fService.getFortuneDtos());
		fService.deleteFortune(deleteIndex);
		fService.putFileFortunes();
	}

}
