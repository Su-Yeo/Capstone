package com.homestay.korea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homestay.korea.DAO.IPlaceDAO;
import com.homestay.korea.DTO.PlaceDTO;

@Service
public class PlaceReadServiceImpl implements IPlaceReadService {
	
	@Autowired
	private IPlaceDAO palceDAO;

	@Override
	public PlaceDTO getPlace(String contentid) {
		// TODO Auto-generated method stub
		PlaceDTO palce = palceDAO.readWithContentid(contentid);
		return palce;
	}

	@Override
	public List<PlaceDTO> getPlaceByThemeLocationOrderByCount(String theme, String location, int limit) {
		// TODO Auto-generated method stub
		
		List<PlaceDTO> resultList = palceDAO.readWithThemeLocationOrderByCount(theme, location, limit);
		return resultList;
	}




	
	
	
	
}




















