package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.w3c.dom.views.AbstractView;

import com.test.dto.JourneyDto;
import com.test.model.Journey;



public class SearchJourneyController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView();
		JourneyDto accessor=new JourneyDto();
		Journey journey=null;
		journey=accessor.getJourneyHistory();
		//System.out.println(journey.getSource());
		request.setAttribute("journey", journey);
		mav.addObject("journey", journey);
		mav.setViewName("search-journey");
		return mav;
	}

}
