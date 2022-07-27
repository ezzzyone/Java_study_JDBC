package com.iu.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnector;

public class RegionsDAO {

   //1. Regions 의 모든 데이터 가져오기
   public void getList() throws Exception {
      //1. DB 연결 DBConnertor에 이미 연결하는 메서드 만듬
      Connection con = DBConnector.getConnection();
      
      //2. Query 문 작성
      String sql ="SELECT * FROM REGIONS";//자바에선 ;를 생략해도 된다.
      
      //3. Query 문 미리 전송
      PreparedStatement st = con.prepareStatement(sql);//쿼리문을 미리 보내면 데이터베이스에서 준비중

      //4.
      
      //5. 최종 전송 후 결과를 처리 (데이터를 받아서 출력을 하든 뭘 하든 한다)
      ResultSet rs = st.executeQuery();
      
      // rs.next();한줄 읽어서 내려오는 방식 토큰과 비슷한 형식 그래서 next의 타입이 boolean이다
      while(rs.next()) {
         int id = rs.getInt("Region_id");//스트링타입의 컬럼라벨은 컬럼명쓰기
         String name = rs.getString("Region_name");
         System.out.println(id);
         System.out.println(name);
      }
      
   }
   
}