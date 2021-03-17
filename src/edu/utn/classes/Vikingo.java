package edu.utn.classes;

import edu.utn.interfaces.IBeber;
import edu.utn.interfaces.IOrinar;

public class Vikingo extends Humano {

    private Integer bebedorProfesional;

    public Vikingo(String nombre, Integer edad, Integer precio, IBeber iBeber, IOrinar iOrinar, Integer bebedorProfesional) {
        super(nombre, edad, precio, iBeber, iOrinar);
        this.bebedorProfesional = bebedorProfesional;
    }
}
