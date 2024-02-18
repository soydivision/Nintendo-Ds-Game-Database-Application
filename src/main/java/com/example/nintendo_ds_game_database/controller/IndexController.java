package com.example.nintendo_ds_game_database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

//    // Simulated data for demonstration purposes
//    private List<Game> getAllGames() {
//        List<Game> allGames = new ArrayList<>();
//        // Populate allGames with actual data from your database or backend
//        // For demonstration, I'll just add some sample data
//        allGames.add(new Game(1, "Super Mario 64 DS", "Join Mario on his 3D adventure!", "mario.jpg"));
//        allGames.add(new Game(2, "The Legend of Zelda: Phantom Hourglass", "Embark on a journey to save Princess Zelda!", "zelda.jpg"));
//        // Add more games as needed
//        return allGames;
//    }
//
//    private List<Game> getFeaturedGames() {
//        List<Game> featuredGames = new ArrayList<>();
//        // Populate featuredGames with actual featured games from your database or backend
//        // For demonstration, I'll just add some sample data
//        featuredGames.add(new Game(1, "Pokémon Diamond", "Catch 'em all in the Sinnoh region!", "pokemon.jpg"));
//        featuredGames.add(new Game(2, "Mario Kart DS", "Race against your friends in this classic kart racer!", "mariokart.jpg"));
//        // Add more featured games as needed
//        return featuredGames;
//    }

    @GetMapping("/")
    public String indexPage(Model model) {
        // Add all games and featured games to the model
        //        model.addAttribute("allGames", getAllGames());
        //        model.addAttribute("featuredGames", getFeaturedGames());
        return "index";
    }
}
