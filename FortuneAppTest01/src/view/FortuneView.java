package view;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import dto.FortuneDto;

//메뉴판 담당
public class FortuneView {
	
	Scanner scanner=new Scanner(System.in);
	Random random=new Random();
	private int updateIndex=-1;
	
	//메뉴
	public int menu() {

		System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈　　　포츈 쿠키 메뉴　　　◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈　 　　　0. 종료　　 　　◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈　　　1. 포츈 쿠키 열기　　　◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈　　　2. 새로운 운세 추가하기　　　◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈　　　3. 운세 전체 보기　　　◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈　　　4. 운세 수정 하기　　　◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈　　　5. 운세 삭제 하기　　　◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
		
		int choice=-1;
		try{
			choice=scanner.nextInt();
			if(choice<0||5<choice) {
				throw new Exception();
			}
		}catch(Exception e){
			System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
			System.out.println("◈◈◈　잘못된 번호를 입력하였습니다.　◈◈◈");
			System.out.println("◈◈◈　메뉴에 기재된 번호를 입력해주세요.　◈◈◈");
			System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
		}
		scanner.nextLine();
		return choice;
	}
	
	
	//포츈 쿠키 앱 종료
	public void stopApp() {
		System.out.println("포츈 쿠키 앱을 종료합니다.");
	}
	
	//운세 하나 뽑기
	public void getFortune(List<FortuneDto> fortuneDtos) {
		System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈　운세를 하나 뽑았습니다.　◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
		int randomIndex=random.nextInt(fortuneDtos.size());
		System.out.println(fortuneDtos.get(randomIndex));
	}
	
	//새로운 운세 추가
	public String putFortune() {
		System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈　추가할 운세를 입력하세요.　◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
		String newFortuneStr=scanner.nextLine();
		System.out.println('"'+newFortuneStr+'"'+"(을)를 추가하시겠습니까?");
		System.out.println("네 또는 아니요를 입력해주세요.");
		String ansStr=scanner.nextLine();
		String answer="";
		if(ansStr.equals("네")) {
			answer=newFortuneStr;
			System.out.println("새로운 운세가 추가되었습니다.");
		}else if(ansStr.equals("아니요")) {
			answer=null;
			System.out.println("아니요를 입력하였습니다. 처음 메뉴로 돌아갑니다.");
		}else {
			answer=null;
			System.out.println("잘못된 문자를 입력하였습니다. 처음 메뉴로 돌아갑니다.");
		}
		return answer;
	}
	
	//운세 전체 보기
	public void getFortunes(List<FortuneDto> fortuneDtos) {
		System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈　운세를 전체 출력합니다.　◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
		for(int i=0;i<fortuneDtos.size();i++) {
			System.out.println(i+1+" "+fortuneDtos.get(i));
		}
	}
	
	//운세 수정하기 - index
	public int getUpdateIndex(List<FortuneDto> fortuneDtos) {
		for(int i=0;i<fortuneDtos.size();i++) {
			System.out.println(i+1+" "+fortuneDtos.get(i));
		}
		System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈　수정할 운세 번호를 입력하세요.　◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈　수정을 취소하려면 0을 입력하세요.　◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
		while(true) {
			try{
				updateIndex=scanner.nextInt();
				if(updateIndex<0) {
					throw new Exception();
				}
				break;
			}catch(Exception e) {
				scanner.nextLine();
				System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
				System.out.println("◈◈◈　운세 번호를 잘못입력하였습니다.　◈◈◈");
				System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
				System.out.println("◈◈◈　수정할 운세 번호를 입력하세요.　◈◈◈");
				System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
				System.out.println("◈◈◈　수정을 취소하려면 0을 입력하세요.　◈◈◈");
				System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
			}
		}
		scanner.nextLine();
		return updateIndex-1;
	}
	
	//운세 수정하기 - String
	public String getUpdateStr(List<FortuneDto> fortuneDtos) {
		String answer=null;
		if(updateIndex!=0) {
			System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
			System.out.println("◈◈◈　수정할 운세를 입력하세요.　◈◈◈");
			System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
			String updateStr=scanner.nextLine();
			System.out.println(updateIndex+"번 운세\n"
					+"'"+fortuneDtos.get(updateIndex-1)+"'"
					+"를 \n"+"'"+updateStr+"'"+"(으)로 수정하시겠습니까?");
			System.out.println("네 또는 아니요를 입력해주세요.");
			String ansStr=scanner.nextLine();
			if(ansStr.equals("네")) {
				answer=updateStr;
				System.out.println(updateIndex+"번 운세가 수정되었습니다.");
			}else if(ansStr.equals("아니요")) {
				System.out.println("아니요를 입력하였습니다. 처음 메뉴로 돌아갑니다.");
			}else {
				System.out.println("잘못된 문자를 입력하였습니다. 처음 메뉴로 돌아갑니다.");
			}
		}
		return answer;
	}
	
	//운세 삭제하기
	public int deleteFortune(List<FortuneDto> fortuneDtos) {
		for(int i=0;i<fortuneDtos.size();i++) {
			System.out.println(i+1+" "+fortuneDtos.get(i));
		}
		
		System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈　삭제할 운세 번호를 입력하세요.　◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("◈◈◈　삭제를 취소하려면 0을 입력하세요.　◈◈◈");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
		
		int deleteIndex;
		
		while(true) {
			try{
				deleteIndex=scanner.nextInt();
				if(deleteIndex<0||deleteIndex>fortuneDtos.size()) {
					throw new Exception();
				}
				break;
			}catch(Exception e) {
				scanner.nextLine();
				System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
				System.out.println("◈◈◈　운세 번호를 잘못입력하였습니다.　◈◈◈");
				System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
				System.out.println("◈◈◈　삭제할 운세 번호를 입력하세요.　◈◈◈");
				System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
				System.out.println("◈◈◈　삭제를 취소하려면 0을 입력하세요.　◈◈◈");
				System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
			}
		}
		int answer=-1;
		if(deleteIndex>0) {
			scanner.nextLine();
			System.out.println("정말 "+'"'+deleteIndex+'"'+"번 운세 "
					+ "'"+fortuneDtos.get(deleteIndex-1)+"'"+"를 삭제하시겠습니까?");
			System.out.println("네 또는 아니요를 입력해주세요.");
			String ansStr=scanner.nextLine();
			if(ansStr.equals("네")) {
				answer=deleteIndex-1;
				System.out.println(deleteIndex+"번 운세가 삭제되었습니다.");
			}else if(ansStr.equals("아니요")) {
				System.out.println("아니요를 입력하였습니다. 처음 메뉴로 돌아갑니다.");
			}else {
				System.out.println("잘못된 문자를 입력하였습니다. 처음 메뉴로 돌아갑니다.");
			}
		}
		return answer;
	}
}
