package com.example.nintendo_ds_game_database.service;

import com.example.nintendo_ds_game_database.model.NintendoDSGame;
import com.example.nintendo_ds_game_database.repository.NintendoDSGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NintendoDSGameService {

    private final NintendoDSGameRepository gameRepository;

    @Autowired
    public NintendoDSGameService(NintendoDSGameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<NintendoDSGame> getAllGames() {
        return gameRepository.findAll();
    }

    public List<NintendoDSGame> searchGamesByTitle(String title) {
        return gameRepository.findByTitleContainingIgnoreCase(title);
    }

    public NintendoDSGame findGameById(Long id) {
        return gameRepository.findById(id);
    }

}
