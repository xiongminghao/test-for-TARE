package com.anime.game.repository;

import com.anime.game.model.AnimeCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeCharacterRepository extends JpaRepository<AnimeCharacter, Long> {
    
    List<AnimeCharacter> findByGender(String gender);
    List<AnimeCharacter> findByHairColor(String hairColor);
    List<AnimeCharacter> findByEyeColor(String eyeColor);
    List<AnimeCharacter> findByAnime(String anime);
    
    @Query("SELECT a FROM AnimeCharacter a ORDER BY FUNCTION('RAND')")
    List<AnimeCharacter> findAllRandom();
    
    @Query(value = "SELECT * FROM anime_characters ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    AnimeCharacter findRandomCharacter();
}