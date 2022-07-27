package com.iu.em;

import java.util.ArrayList;

public class EmView {
	
	public void view (ArrayList<EmDTO> ar) {
		
		System.out.println("DEPARTMENT_ID\tEMPLOYEE_ID\tFIRST_NAME\tHIRE_DATE\tSALARY");
		System.out.println("=====================================================================================");
		for(EmDTO emDTO : ar) { //향상된 for문. ar배열에 있는 것을 하나씩 꺼내어 emDTO만큼 반복
			System.out.print(emDTO.getDEPARTMENT_ID()+"\t"+"\t"); //ar배열의 getCOMMISSION_PCT값이 하나 출력 
			System.out.print(emDTO.getEMPLOYEE_ID()+"\t"+"\t");
			System.out.print(emDTO.getFIRST_NAME()+"\t"+"\t");
			System.out.print(emDTO.getHIRE_DATE()+"\t"+"\t");
			System.out.println(emDTO.getSALARY()+"\t"+"\t");
			
		}
		System.out.println("=====================================================================================");
	}

}
