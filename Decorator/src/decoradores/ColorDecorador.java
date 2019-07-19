/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoradores;

import enumm.Pintura;

/**
 *
 * @author Estudiante
 */
public class ColorDecorador extends CarroDecorator {
    protected Pintura color;

    public ColorDecorador(Carro carrodecorado,Pintura color) {
        super(carrodecorado);
        this.color = color;
    }

    @Override
    public void marca() {
        carrodecorado.marca();
        System.out.println("Color: "+color);
    }

    @Override
    public String descripcion() {
        return carrodecorado.descripcion()+ " Color usado "+color ;
    }
    
}
