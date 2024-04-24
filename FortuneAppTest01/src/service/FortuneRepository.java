package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dto.FortuneDto;

//메모리에 운세들을 저장
public class FortuneRepository implements FortuneService{
	
	List<FortuneDto> fortuneDtos=new ArrayList<>();
	FortuneRepoBackup fRepoBackup=new FortuneRepoBackup();
	String filePath = "C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\FortuneAppTest01\\src\\service\\FortuneRepositoryFile.txt";
	File file=new File(filePath);
	
	@Override
	public void getFileFortunes() {
		while(true) {
			try {
				BufferedReader fBR=new BufferedReader(new FileReader(file));
				
				String line;
				while((line=fBR.readLine())!=null) {
					FortuneDto fDto=new FortuneDto();
					fDto.setFortuneStr(line);
					fortuneDtos.add(fDto);
				}
				fBR.close();
				break;
			} catch (FileNotFoundException e) {
				System.out.println("파일을 찾지 못했습니다");
				System.out.println("새로운 파일을 생성합니다.");
				
				fRepoBackup.newFile();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void putFileFortunes() {
		try {
			BufferedWriter fBW=new BufferedWriter(new FileWriter(file));
			
			for(int i=0;i<fortuneDtos.size();i++) {
				FortuneDto arr=fortuneDtos.get(i);
				String str=arr.toString();
				fBW.write(str);
				fBW.newLine();
			}
			fBW.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<FortuneDto> getFortuneDtos() {
		return fortuneDtos;
	}

	@Override
	public void createFortune(String createStr) {
		FortuneDto fDto=new FortuneDto();
		if(createStr!=null) {
			fDto.setFortuneStr(createStr);
			fortuneDtos.add(fDto);
		}
	}

	@Override
	public void updateFortune(int updateIndex, String updateStr) {
		FortuneDto fDto=new FortuneDto();
		if(updateStr!=null) {
			fDto.setFortuneStr(updateStr);
			fortuneDtos.set(updateIndex,fDto);
		}
	}

	@Override
	public void deleteFortune(int deleteIndex) {
		if(deleteIndex!=-1) {
			fortuneDtos.remove(deleteIndex);
		}
	}



}
