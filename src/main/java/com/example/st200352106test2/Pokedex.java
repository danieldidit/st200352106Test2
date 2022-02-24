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
        this.ownersName = ownersName;
    }
}
