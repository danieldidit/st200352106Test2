package com.example.st200352106test2;

import java.util.ArrayList;

public class Pokedex {

    private String ownersName;
    private ArrayList<Pokemon> pokemon;

    public Pokedex (String ownersName)
    {
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
        if(ownersName.matches("[A-Z][a-z][a-z][A-Za-z]*"))
            this.ownersName = ownersName;
        else
            throw new IllegalArgumentException(" Owners name must beat least 3 characters in length");
    }

    /**
     *Adds a new pokemon to the pokemon array list
     * @param newPokemon adds a new Pokemon object to the Pokemon Array List
     */
    public void addPokemon(Pokemon newPokemon)
    {
        pokemon.add(newPokemon);
    }

    /**
     *
     * @return the number of Pokemon in the Pokemon Index
     */
    public int getNumOfPokemon()
    {
        return pokemon.size();
    }

    /**
     * This method returns an arraylist of pokemon that have the gender matching the argument
     * @param gender is the argument that will be used to compare to the array
     * @return an array list of Pokemon that contain the same gender as the argument
     */
    public ArrayList<Pokemon> getPokemonWithGender(String gender)
    {
        ArrayList<Pokemon> array = new ArrayList<>();
        for (Pokemon pokemon : pokemon)
            if (pokemon.getGender().equals(gender))
                array.add(pokemon);

        return array;

    }

    /**
     * Test class
     * @param args
     */
    public static void main(String[] args) {
        Pokedex user = new Pokedex("Daniel ");
        Pokemon pokemon1 = new Pokemon("Dracozolt", "unknown",60,60,60,880);
        Pokemon pokemon2 = new Pokemon("Copperajah", "both",80,80,50,879);
        Pokemon pokemon3 = new Pokemon("Morpeko", "both",50,50,30,878);
        Pokemon pokemon4 = new Pokemon("Morpeko", "both",40,60,40,877);
        Pokemon pokemon5 = new Pokemon("Indeedee", "male",40,40,40,876);
        Pokemon pokemon6 = new Pokemon("Eiscue", "both",50,50,70,875);
        Pokemon pokemon7 = new Pokemon("Bulbasaur", "both",30,30,30,001);
        Pokemon pokemon8 = new Pokemon("Ivysaur", "both",40,40,40,002);
        Pokemon pokemon9 = new Pokemon("Venusaur", "both",50,50,50,003);
        Pokemon pokemon10 = new Pokemon("Charmander", "both",30,40,30,004);

        user.addPokemon(pokemon5);


        System.out.println(user.getPokemonWithGender("male"));
    }

}
