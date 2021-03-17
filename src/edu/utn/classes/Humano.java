package edu.utn.classes;

import edu.utn.interfaces.IBeber;
import edu.utn.interfaces.IOrinar;

public abstract class Humano {
    private String nombre;
    private Integer edad;
    private Integer peso;
    private IBeber iBeber;
    private IOrinar iOrinar;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public Humano() {
    }

    public Humano(String nombre, Integer edad, Integer peso, IBeber iBeber, IOrinar iOrinar) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.iBeber = iBeber;
        this.iOrinar = iOrinar;
    }

    public void beber(){
        iBeber.beber();
    }

    public void orinar(){
        iOrinar.orinar();
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
}
