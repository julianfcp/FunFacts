package com.juliancortes.funfacts;

import java.util.Random;

/**
 * Created by Julian on 3/24/15.
 */
public class Factbook {
    // Variable Miembro de la clase Factbook
    public String[] mFacts = {"Cenaide ya tiene whatsapp",
            "Congo tiene las orejas sucias",
            "La Moka Duerme mucho los fines de Semana",
            "Quiero vacaciones!!!!",
            "La Moka no lava la licuadora cuando la usa"};

    public String getFact(){
        String fact;
        //usar fact random
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length); // Genera un numero randome entre 0 y 4

        fact = mFacts[randomNumber];

        return fact;
    }

}
