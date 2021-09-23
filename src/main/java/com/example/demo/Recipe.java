package com.example.demo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private int time;
    private String primaryTag;
    private String imageSrc;
    private int serves;
    private boolean favorite;
    @ElementCollection(targetClass=String.class)
    private List<String> tags;
    @ElementCollection(targetClass=String.class)
    private List<String> ingredients;
    @ElementCollection(targetClass=String.class)
    private List<String> instructions;
    @ElementCollection(targetClass=String.class)
    private List<String> notes;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }

    public String getPrimaryTag() {
        return primaryTag;
    }
    public void setPrimaryTag(String primaryTag) {
        this.primaryTag = primaryTag;
    }

    public String getImageSrc() {
        return imageSrc;
    }
    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public int getServes() {
        return serves;
    }
    public void setServes(int serves) {
        this.serves = serves;
    }

    public boolean isFavorite() {
        return favorite;
    }
    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getInstructions() {
        return instructions;
    }
    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }

    public List<String> getNotes() {
        return notes;
    }
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public Recipe() {};

    public Recipe(Integer id, String title, int time, String primaryTag, String imageSrc, int serves, boolean favorite, List<String> tags, List<String> ingredients, List<String> instructions, List<String> notes) {
        this.id = id;
        this.title = title;
        this.time = time;
        this.primaryTag = primaryTag;
        this.imageSrc = imageSrc;
        this.serves = serves;
        this.favorite = favorite;
        this.tags = tags;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.notes = notes;
    }
}
