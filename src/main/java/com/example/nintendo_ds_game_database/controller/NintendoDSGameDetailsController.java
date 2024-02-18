package com.example.nintendo_ds_game_database.controller;

import com.example.nintendo_ds_game_database.model.NintendoDSGame;
import com.example.nintendo_ds_game_database.service.NintendoDSGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class NintendoDSGameDetailsController {

    private final NintendoDSGameService gameService;

    @Autowired
    public NintendoDSGameDetailsController(NintendoDSGameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/games/{id}")
    public String showGameDetails(@PathVariable Long id, Model model) {
        NintendoDSGame result = gameService.findGameById(id);
        if (result != null) {
            model.addAttribute("game", result);
            return "game_details";
        } else {
            return "error";
        }
    }
}
