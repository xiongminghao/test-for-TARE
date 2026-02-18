package com.anime.game.model;

import jakarta.persistence.*;

@Entity
@Table(name = "anime_characters")
public class AnimeCharacter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String nameJp;
    private String anime;
    private String animeJp;
    private String gender;
    private String hairColor;
    private String eyeColor;
    private String hairLength;
    private String age;
    private String role;
    private String personality;
    private String specialTrait;
    private String weapon;
    private String occupation;
    private String imageUrl;
    
    public AnimeCharacter() {}
    
    public AnimeCharacter(String name, String nameJp, String anime, String animeJp, 
                          String gender, String hairColor, String eyeColor, 
                          String hairLength, String age, String role, 
                          String personality, String specialTrait, String weapon,
                          String occupation, String imageUrl) {
        this.name = name;
        this.nameJp = nameJp;
        this.anime = anime;
        this.animeJp = animeJp;
        this.gender = gender;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.hairLength = hairLength;
        this.age = age;
        this.role = role;
        this.personality = personality;
        this.specialTrait = specialTrait;
        this.weapon = weapon;
        this.occupation = occupation;
        this.imageUrl = imageUrl;
    }
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getNameJp() { return nameJp; }
    public void setNameJp(String nameJp) { this.nameJp = nameJp; }
    public String getAnime() { return anime; }
    public void setAnime(String anime) { this.anime = anime; }
    public String getAnimeJp() { return animeJp; }
    public void setAnimeJp(String animeJp) { this.animeJp = animeJp; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getHairColor() { return hairColor; }
    public void setHairColor(String hairColor) { this.hairColor = hairColor; }
    public String getEyeColor() { return eyeColor; }
    public void setEyeColor(String eyeColor) { this.eyeColor = eyeColor; }
    public String getHairLength() { return hairLength; }
    public void setHairLength(String hairLength) { this.hairLength = hairLength; }
    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getPersonality() { return personality; }
    public void setPersonality(String personality) { this.personality = personality; }
    public String getSpecialTrait() { return specialTrait; }
    public void setSpecialTrait(String specialTrait) { this.specialTrait = specialTrait; }
    public String getWeapon() { return weapon; }
    public void setWeapon(String weapon) { this.weapon = weapon; }
    public String getOccupation() { return occupation; }
    public void setOccupation(String occupation) { this.occupation = occupation; }
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}