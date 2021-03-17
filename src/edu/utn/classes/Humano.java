package edu.utn.classes;

import edu.utn.interfaces.IBeber;
import edu.utn.interfaces.IOrinar;

public abstract class Humano {
    private String nombre;
    private Integer edad;
    private Integer precio;
    private IBeber iBeber;
    private IOrinar iOrinar;

    public Humano() {
    }

    public Humano(String nombre, Integer edad, Integer precio, IBeber iBeber, IOrinar iOrinar) {
        this.nombre = nombre;
        this.edad = edad;
        this.precio = precio;
        this.iBeber = iBeber;
        this.iOrinar = iOrinar;
    }

    public void beber(){
        iBeber.beber();
    }

    public void orinar(){
        iOrinar.orinar();
    }
}
