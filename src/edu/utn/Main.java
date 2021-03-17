package edu.utn;

import edu.utn.classes.Espartano;
import edu.utn.classes.Vikingo;
import edu.utn.impl.BeberEspartanoImpl;
import edu.utn.impl.BeberVikingoImpl;
import edu.utn.impl.OrinarEspartanoImpl;
import edu.utn.impl.OrinarVikingoImpl;

public class Main {

    public static void main(String[] args) {

        BeberEspartanoImpl beberEsp = new BeberEspartanoImpl();
        OrinarEspartanoImpl orinarEsp = new OrinarEspartanoImpl();

        BeberVikingoImpl beberVikingo = new BeberVikingoImpl();
        OrinarVikingoImpl orinarVikingo = new OrinarVikingoImpl();

        Espartano espartano = new Espartano("Roger", 22, 100, beberEsp, orinarEsp, 2);
        Vikingo vikingo = new Vikingo("Björn", 30, 150, beberVikingo, orinarVikingo, 1);

        espartano.beber();
        espartano.orinar();

        vikingo.beber();
        vikingo.orinar();

    }
}
