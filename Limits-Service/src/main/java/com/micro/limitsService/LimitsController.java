package com.micro.limitsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.bean.Limits;
import com.micro.config.Cofiguration;

@RestController
public class LimitsController {
	
	@Autowired
	private Cofiguration config;
	
	@GetMapping("/limits")
	public Limits retrivalLimits() {
		
		return new Limits(config.getMinimum(), config.getMaximum());
		
		//return new Limits(1,1000);
	}

}
