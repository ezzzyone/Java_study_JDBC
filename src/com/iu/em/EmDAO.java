package com.iu.em;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class EmDAO {

	public ArrayList<EmDTO> getList() throws Exception{
		ArrayList<EmDTO> ar = new ArrayList<>();
		//1.DB
		Connection con = DBConnector.getConnection();
		
		//2.sql문
		String sql = "SELECT * FROM EMPLOYEES";
		//3.미리전송
		PreparedStatement st = con.prepareStatement(sql);
		//4.최종전송 결과처리		
		ResultSet rs = st.executeQuery();
		
		while (rs.next()) {
			EmDTO emDTO = new EmDTO(); //dto 객체 선언
			//ResultSet에 받아 온 필드값을 dto의 setter에 세팅
			emDTO.setDEPARTMENT_ID(rs.getInt("DEPARTMENT_ID")); //set 넣을 때
			emDTO.setEMPLOYEE_ID(rs.getInt("EMPLOYEE_ID"));
			emDTO.setFIRST_NAME(rs.getString("FIRST_NAME"));
			emDTO.setHIRE_DATE(rs.getDate("HIRE_DATE"));
			emDTO.setSALARY(rs.getInt("SALARY"));
			ar.add(emDTO); //dto에 들어온 값을 배열 끝에 저장.
		}
		DBConnector.disConnect(rs, st, con);
		return ar; //총 배열을 ar로 리턴
	}
}
