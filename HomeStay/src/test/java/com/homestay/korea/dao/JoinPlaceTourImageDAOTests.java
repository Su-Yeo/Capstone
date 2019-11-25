package com.homestay.korea.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.homestay.korea.DAO.IJoinPlaceTourImageDAO;
import com.homestay.korea.DAO.IPlaceDAO;
import com.homestay.korea.DAO.ITourImageDAO;
import com.homestay.korea.DTO.JoinPlaceTourImageDTO;
import com.homestay.korea.DTO.PlaceDTO;
import com.homestay.korea.DTO.TourImageDTO;
import com.homestay.korea.config.RootConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
public class JoinPlaceTourImageDAOTests {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IJoinPlaceTourImageDAO joinPlaceTourImageDAO;
	
	//test 마무리
	@Test
	public void testReadimage() {
		List<JoinPlaceTourImageDTO> itmes = joinPlaceTourImageDAO.readWithThemeStartEndOrderByParm("문화시설", 0, 40, "count");
		
	
			for (JoinPlaceTourImageDTO item : itmes) {
				logger.info(item.toString());
			}
			
	
			

	}
	
//	@Test
//	public void testReadimage2() {
//		List<JoinPlaceTourImageDTO> itmes = joinPlaceTourImageDAO.readWithThemeStartEndOrderByParm("문화시설", 0, 20, "count");
//		
//	
//			for (JoinPlaceTourImageDTO item : itmes) {
//				logger.info(item.toString());
//			}
//			
//	
//			
//
//	}

}













