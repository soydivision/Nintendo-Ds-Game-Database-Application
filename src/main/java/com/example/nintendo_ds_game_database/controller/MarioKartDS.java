package com.example.nintendo_ds_game_database.controller;

import com.example.nintendo_ds_game_database.model.NintendoDSGame;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class MarioKartDS {

    @GetMapping("/MarioKartDS")
    public String showGameDetails(Model model) {
        NintendoDSGame game = new NintendoDSGame("Super Mario 64 DS", "Nintendo", "Nintendo", new Date("November 21, 2004"),true,false,false,false);
        model.addAttribute("game", game);
        return "game_details";
    }
}
