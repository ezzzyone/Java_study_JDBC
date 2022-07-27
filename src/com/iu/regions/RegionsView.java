package com.iu.regions;
public class RegionsView {
	
	public void view (RegionsDTO regionsDTO) {
		System.out.println("Region_id\t Region_name");
		System.out.println("===============================");
		System.out.print(regionsDTO.getRegion_id()+"\t");
		System.out.println("\t"+regionsDTO.getRegion_name());
		System.out.println("===============================");
	}

}