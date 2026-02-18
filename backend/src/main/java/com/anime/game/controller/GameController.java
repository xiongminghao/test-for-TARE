package com.anime.game.controller;

import com.anime.game.model.AnimeCharacter;
import com.anime.game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class GameController {
    
    @Autowired
    private GameService gameService;
    
    @GetMapping("/start")
    public ResponseEntity<AnimeCharacter> startGame() {
        AnimeCharacter target = gameService.getRandomCharacter();
        AnimeCharacter hint = new AnimeCharacter();
        hint.setId(target.getId());
        hint.setGender(target.getGender());
        hint.setHairColor("???");
        hint.setEyeColor("???");
        hint.setHairLength("???");
        hint.setAge("???");
        hint.setAnime("???");
        hint.setRole("???");
        hint.setPersonality("???");
        return ResponseEntity.ok(hint);
    }
    
    @PostMapping("/guess")
    public ResponseEntity<Map<String, Object>> guess(@RequestBody Map<String, Long> request) {
        Long characterId = request.get("characterId");
        Map<String, Object> result = gameService.guessCharacter(characterId);
        return ResponseEntity.ok(result);
    }
    
    @GetMapping("/characters")
    public ResponseEntity<List<AnimeCharacter>> getAllCharacters() {
        return ResponseEntity.ok(gameService.getAllCharacters());
    }
    
    @GetMapping("/characters/search")
    public ResponseEntity<List<AnimeCharacter>> searchCharacters(@RequestParam(required = false) String keyword) {
        return ResponseEntity.ok(gameService.searchCharacters(keyword));
    }
}