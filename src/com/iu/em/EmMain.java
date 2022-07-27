package com.iu.em;

import java.util.ArrayList;

public class EmMain {
	//쿼리문뽑아지는 순서
	//향상된 for문

	public static void main(String[] args) {

		EmDAO emDAO = new EmDAO();
		EmDTO emDTO = new EmDTO();
		EmView emView = new EmView();
		
		try {
		ArrayList<EmDTO> ar = emDAO.getList(); //총 배열을 ar 배열에 담음
		emView.view(ar);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
