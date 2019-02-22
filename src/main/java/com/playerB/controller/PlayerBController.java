package com.playerB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.playerB.service.PlayerBService;

/**
 * All operations for playerB by this controller.
 * <p/>
 */
@RestController
@RequestMapping("game/playerB")
public class PlayerBController {	

	private PlayerBService playerBService;

	@Autowired
	public PlayerBController(final PlayerBService playerBService) {
		this.playerBService = playerBService;
	}

	@GetMapping
	public Integer processGame(@RequestParam("number") final String number){
		return playerBService.execute(number);
		
	}

	
}
