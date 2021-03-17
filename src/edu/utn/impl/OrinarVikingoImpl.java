package edu.utn.impl;

import edu.utn.interfaces.IOrinar;

public class OrinarVikingoImpl implements IOrinar {
    @Override
    public void orinar() {
        System.out.println("Soy un Vikingo y estoy orinando");
    }
}
