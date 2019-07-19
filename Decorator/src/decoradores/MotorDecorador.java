/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoradores;

import enumm.Motor;

/**
 *
 * @author Estudiante
 */
public class MotorDecorador extends CarroDecorator{
    protected Motor motor;
    
    public MotorDecorador(Carro carrodecorado, Motor motor) {
        super(carrodecorado);
        this.motor = motor;
    }

    @Override
    public void marca() {
        carrodecorado.marca();
        System.out.println("Motor: "+motor);    
    }

    @Override
    public String descripcion() {
        return carrodecorado.descripcion()+ " Motor usado "+motor ;
    }
    
}
