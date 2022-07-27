package com.iu.regions;

public class RegionsDTO {
	
	//멤버변수 접근지정자 : private
	//getter setter
	//기본 생성자 필수
	//멤버 변수명은 테이블의 컬럼명과 동일하게 선언
	
	//int의 레퍼런스 타입 = integer 선언. 왜? null있을수 있어서
	
	//멤버변수선언
	private Integer region_id;
	private String region_name;
	public Integer getRegion_id() {
		return region_id;
	}
	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	
	
	

}