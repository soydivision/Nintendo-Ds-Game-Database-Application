package com.example.nintendo_ds_game_database.controller;

import com.example.nintendo_ds_game_database.model.NintendoDSGame;
import com.example.nintendo_ds_game_database.service.NintendoDSGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class NintendoDSGameSearchController {

    private final NintendoDSGameService gameService;

    @Autowired
    public NintendoDSGameSearchController(NintendoDSGameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/")
    public String index(@RequestParam(required = false) String search, Model model) {
        List<NintendoDSGame> games;
        if (search != null && !search.isEmpty()) {
            games = gameService.searchGamesByTitle(search);
        } else {
            games = gameService.getAllGames();
        }
        model.addAttribute("games", games);
        return "index";
    }
}
