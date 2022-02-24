package com.example.st200352106test2;

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
        this.gender = gender;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getPokemonNumber() {
        return pokemonNumber;
    }

    public void setPokemonNumber(int pokemonNumber) {
        this.pokemonNumber = pokemonNumber;
    }
}
