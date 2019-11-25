package com.homestay.korea.DAO;


import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.homestay.korea.DTO.PlaceDTO;

public interface IPlaceDAO {
	
	public PlaceDTO readWithContentid(String contentid);
	//
	public ArrayList<PlaceDTO> readWithThemeLocationOrderByCount(@Param("theme") String theme, @Param("location") String location, @Param("limit") int limit);
	
	public ArrayList<PlaceDTO> readWithThemeOrderByCount(@Param("theme") String theme, @Param("limit") int limit);
	
	
	//insert 문 count는 지정하더라고 기본 0으로 삽입
	public int insertWithDTO(PlaceDTO placeDTO);
	
	//contentid로 관광지 정보 delete
	public int deletePlaceData(String contentId);
}
