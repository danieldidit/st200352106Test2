package com.example.st200352106test2;

import java.util.Locale;

public class Pokemon {

    private String name;
    private String gender;
    private int hp;
    private int attack;
    private int defense;
    private int pokemonNumber;

    public Pokemon(String name, String gender, int hp, int attack, int defense, int pokemonNumber)
    {
        setName(name);
        setGender(gender);
        setHp(hp);
        setAttack(attack);
        setDefense(defense);
        setPokemonNumber(pokemonNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        // Trims white space from name variable
        name = name.trim();

        // Ensures the name is 4 or more characters long
        if(name.matches("[A-Z][a-z][a-z][a-z][A-Za-z]*"))
            this.name = name;
        else
            throw new IllegalArgumentException("Name must include at least 4 characters");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {

        // Trims white space and makes all letters lowercase
        gender = gender.trim().toLowerCase();

        // Ensures gender is either male, female, both or unknown
        if(gender.equals("male") || gender.equals("female") || gender.equals("both") || gender.equals("unknown"))
            this.gender = gender;
        else
            throw new IllegalArgumentException("Gender must be male, female, both, or unknown");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {

        // Ensures Hp is between 0 and 80 inclusive
        if (hp >= 0 && hp <= 80)
            this.hp = hp;
        else
            throw new IllegalArgumentException("Hp must be between 0 and 80 inclusive");
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {

        // Ensures attack is between 30 and 90 inclusive
        if (attack >= 30 && attack <= 90)
            this.attack = attack;
        else
            throw new IllegalArgumentException("Attack must be between 30 and 90 inclusive");
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {

        // Ensures defense is between 30 and 83 inclusive
        if (defense >= 30 && defense <= 83)
            this.defense = defense;
        else
            throw new IllegalArgumentException("Defense must be between 30 and 83 inclusive");
    }

    public int getPokemonNumber() {
        return pokemonNumber;
    }

    public void setPokemonNumber(int pokemonNumber) {
        this.pokemonNumber = pokemonNumber;
    }
}
