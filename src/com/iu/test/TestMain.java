package com.iu.test;

import com.iu.countries.CountriesDAO;
import com.iu.regions.RegionsDAO;
import com.iu.regions.RegionsDTO;
import com.iu.regions.RegionsView;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {
		
		RegionsDAO regionsDAO = new RegionsDAO();
		CountriesDAO countriesDAO = new CountriesDAO();
		RegionsDTO regionsDTO = new RegionsDTO();
		RegionsView regionsView =  new RegionsView();
		
		try {
			//countriesDAO.getList();
			//regionsDAO.getDetail(2);
			regionsDTO = regionsDAO.getDetail(2);
			regionsView.view(regionsDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
