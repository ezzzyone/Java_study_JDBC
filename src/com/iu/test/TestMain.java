package com.iu.test;

import com.iu.countries.CountriesDAO;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {
		
		CountriesDAO countriesDAO = new CountriesDAO();
		try {
			countriesDAO.getList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
