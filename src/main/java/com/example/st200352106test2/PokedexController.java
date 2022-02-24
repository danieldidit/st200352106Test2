package com.example.st200352106test2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class PokedexController implements Initializable {

    @FXML
    private Label attackLabel;

    @FXML
    private Label defenseLabel;

    @FXML
    private Label genderLabel;

    @FXML
    private Label hPLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private Label numberLabel;

    @FXML
    private Label numberOfPokemonLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

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

        user.addPokemon(pokemon1);
        user.addPokemon(pokemon2);
        user.addPokemon(pokemon3);
        user.addPokemon(pokemon4);
        user.addPokemon(pokemon5);
        user.addPokemon(pokemon6);
        user.addPokemon(pokemon7);
        user.addPokemon(pokemon8);
        user.addPokemon(pokemon9);
        user.addPokemon(pokemon10);

        nameLabel.setText(pokemon1.getName());
        numberLabel.setText(String.valueOf(pokemon1.getPokemonNumber()));
        genderLabel.setText(pokemon1.getGender());
        hPLabel.setText(String.valueOf(pokemon1.getHp()));
        attackLabel.setText(String.valueOf(pokemon1.getAttack()));
        defenseLabel.setText(String.valueOf(pokemon1.getDefense()));

        numberOfPokemonLabel.setText("Number Of Pokemon In Pokedex: " + user.getNumOfPokemon());
    }
    @FXML
    void viewNextPokemon()
    {

    }

}