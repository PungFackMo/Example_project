package service;

import java.util.List;

import dto.FortuneDto;

//프로그램 데이터와 연관 있는 클래스들
public interface FortuneService {
	
	
	void getFileFortunes();
	
	void putFileFortunes();
	
	List<FortuneDto> getFortuneDtos();
	
	void createFortune(String createStr);
	
	void updateFortune(int updateIndex, String updateStr);
	
	void deleteFortune(int deleteIndex);
	
	
}
