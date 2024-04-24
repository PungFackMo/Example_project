package dto;

public class FortuneDto {
	private String fortuneStr;

	public String getFortuneStr() {
		return fortuneStr;
	}

	public void setFortuneStr(String fortuneStr) {
		this.fortuneStr = fortuneStr;
	}

	@Override
	public String toString() {
		return fortuneStr;
	}
}
