package edu.utn.impl;

import edu.utn.interfaces.IOrinar;

public class OrinarEspartanoImpl implements IOrinar {
    @Override
    public void orinar() {
        System.out.println("Soy un Espartano y estoy orinando");
    }
}
