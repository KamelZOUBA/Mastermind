package com.nicolas.mastermind;

public abstract class Joueur {

    static String proposition;
    static int longueurProposition;
    String resultatPrecedent = "";

    //TODO ajouter ces méthodes abstraites qui seront implémentées dans les classes filles
    //Pour les type des paramètres et des retours j'ai mis Integer, mais tu mets ce que tu veux en fonction de ton code existant

    protected abstract Integer genererNombreMyster(Integer nombreDigit);

    protected abstract Integer faireProposition(Integer nombreDigit);

    //TODO pour ces deux méthodes dans la classe Humain, il faut que le joueur compare manuellement les nombres
    protected abstract String comparerNombresPlusOuMoins(Integer nombreMystemre, Integer proposition);

    protected abstract ResultatMastermind comparerNombresPlusmastermind(Integer nombreMystemre, Integer proposition);
    //TODO il faut créer la classe ResultatMastermind et mettre les deux champs: nombreBienPlace et nombrePresent
    //On est obligé de faire ainsi car le retour est plusieurs champs


    public Joueur() {

    }

    public void proposerNombre() { // Proposer un nombre

    }

}
