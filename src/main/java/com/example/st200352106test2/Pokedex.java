package com.example.st200352106test2;

import java.util.ArrayList;

public class Pokedex {

    private String ownersName;
    private ArrayList<Pokemon> pokemon;

    public Pokedex(String ownersName) {
        setOwnersName(ownersName);
        pokemon = new ArrayList<>();
    }

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {

        // Gets rid of leading and trailing white space
        ownersName = ownersName.trim();

        // Ensures the owners name is at least 3 characters in length
        if (ownersName.matches("[A-Z][a-z][a-z][A-Za-z]*"))
            this.ownersName = ownersName;
        else
            throw new IllegalArgumentException(" Owners name must beat least 3 characters in length");
    }

    /**
     * Adds a new pokemon to the pokemon array list
     *
     * @param newPokemon adds a new Pokemon object to the Pokemon Array List
     */
    public void addPokemon(Pokemon newPokemon) {
        pokemon.add(newPokemon);
    }

    /**
     * @return the number of Pokemon in the Pokemon Index
     */
    public int getNumOfPokemon() {
        return pokemon.size();
    }

    /**
     * This method returns an arraylist of pokemon that have the gender matching the argument
     *
     * @param gender is the argument that will be used to compare to the array
     * @return an array list of Pokemon that contain the same gender as the argument
     */
    public ArrayList<Pokemon> getPokemonWithGender(String gender) {
        ArrayList<Pokemon> array = new ArrayList<>();
        for (Pokemon pokemon : pokemon)
            if (pokemon.getGender().equals(gender))
                array.add(pokemon);

        return array;

    }

    /**
     * This method returns an array list of pokemon that have an attack equal to or greater than the minAttackValue
     *
     * @param minAttackValue is the argument that will be used to compare tot he array
     * @return an array list of Pokemon that contain the same min attack value as the argument
     */
    public ArrayList<Pokemon> getPokemonWithAttackValue(int minAttackValue) {
        ArrayList<Pokemon> array = new ArrayList<>();
        for (Pokemon pokemon : pokemon)
            if (pokemon.getAttack() >= minAttackValue)
                array.add(pokemon);

        return array;
    }

    public ArrayList<Pokemon> getPokemon() {
        return pokemon;
    }
}
