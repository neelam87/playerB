/**
 * 
 */
package com.playerB.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.playerB.controller.PlayerBController;

/**
 * @author neelam
 *
 */
@Service
public class PlayerBServiceImpl implements PlayerBService{
	private static final Logger LOGGER = LoggerFactory.getLogger(PlayerBController.class);
	
	@Override
	public Integer execute(String number) {
		int[] addNumber = {-1, 0, 1};
		Integer passNumber = 0;
		for(Integer addNum: addNumber){
			Integer numInt  = Integer.valueOf(number)+addNum;
			if(numInt%3==0){
				passNumber =  numInt/3;
				if(passNumber==1){
					LOGGER.info("PLAYER B WINS");
				}
			}
		}
		return passNumber;
	}



}
