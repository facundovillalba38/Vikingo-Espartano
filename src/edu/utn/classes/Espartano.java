package edu.utn.classes;

import edu.utn.interfaces.IBeber;
import edu.utn.interfaces.IOrinar;

public class Espartano extends Humano {
    private Integer toleranciaExtra;

    public Espartano(String nombre, Integer edad, Integer precio, IBeber iBeber, IOrinar iOrinar, Integer toleranciaExtra) {
        super(nombre, edad, precio, iBeber, iOrinar);
        this.toleranciaExtra = toleranciaExtra;
    }
}
