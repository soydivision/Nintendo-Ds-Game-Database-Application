package com.example.nintendo_ds_game_database.repository;

import com.example.nintendo_ds_game_database.model.NintendoDSGame;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NintendoDSGameRepository extends JpaRepository<NintendoDSGame, String> {
    List<NintendoDSGame> findByTitleContainingIgnoreCase(String title);

    NintendoDSGame findById(Long id);
}
