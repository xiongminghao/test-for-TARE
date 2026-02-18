package com.anime.game.service;

import com.anime.game.model.AnimeCharacter;
import com.anime.game.repository.AnimeCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class GameService {
    
    @Autowired
    private AnimeCharacterRepository characterRepository;
    
    private AnimeCharacter currentTarget;
    
    public AnimeCharacter getRandomCharacter() {
        currentTarget = characterRepository.findRandomCharacter();
        return currentTarget;
    }
    
    public Map<String, Object> guessCharacter(Long characterId) {
        Map<String, Object> result = new HashMap<>();
        
        if (currentTarget == null) {
            result.put("error", "请先开始游戏");
            return result;
        }
        
        Optional<AnimeCharacter> guessOpt = characterRepository.findById(characterId);
        if (guessOpt.isEmpty()) {
            result.put("error", "角色不存在");
            return result;
        }
        
        AnimeCharacter guess = guessOpt.get();
        
        result.put("guessName", guess.getName());
        result.put("isCorrect", guess.getId().equals(currentTarget.getId()));
        
        Map<String, Object> comparisons = new HashMap<>();
        comparisons.put("gender", compareField(guess.getGender(), currentTarget.getGender()));
        comparisons.put("hairColor", compareField(guess.getHairColor(), currentTarget.getHairColor()));
        comparisons.put("eyeColor", compareField(guess.getEyeColor(), currentTarget.getEyeColor()));
        comparisons.put("hairLength", compareField(guess.getHairLength(), currentTarget.getHairLength()));
        comparisons.put("age", compareAge(guess.getAge(), currentTarget.getAge()));
        comparisons.put("anime", compareField(guess.getAnime(), currentTarget.getAnime()));
        comparisons.put("role", compareField(guess.getRole(), currentTarget.getRole()));
        comparisons.put("personality", compareField(guess.getPersonality(), currentTarget.getPersonality()));
        
        result.put("comparisons", comparisons);
        
        if (guess.getId().equals(currentTarget.getId())) {
            result.put("targetName", currentTarget.getName());
            result.put("targetAnime", currentTarget.getAnime());
            result.put("targetImageUrl", currentTarget.getImageUrl());
        }
        
        return result;
    }
    
    private String compareField(String guess, String target) {
        if (guess == null || target == null) return "unknown";
        if (guess.equals(target)) return "correct";
        return "wrong";
    }
    
    private String compareAge(String guessAge, String targetAge) {
        if (guessAge == null || targetAge == null) return "unknown";
        if (guessAge.equals(targetAge)) return "correct";
        
        try {
            int gAge = Integer.parseInt(guessAge.replaceAll("[^0-9]", ""));
            int tAge = Integer.parseInt(targetAge.replaceAll("[^0-9]", ""));
            
            if (gAge < tAge) return "higher";
            if (gAge > tAge) return "lower";
        } catch (NumberFormatException e) {
            return "wrong";
        }
        
        return "wrong";
    }
    
    public List<AnimeCharacter> searchCharacters(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return characterRepository.findAll();
        }
        return characterRepository.findAll().stream()
                .filter(c -> c.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                            c.getNameJp() != null && c.getNameJp().contains(keyword) ||
                            c.getAnime().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }
    
    public List<AnimeCharacter> getAllCharacters() {
        return characterRepository.findAll();
    }
}