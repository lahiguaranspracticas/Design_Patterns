/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcas;

import decoradores.Carro;

/**
 *
 * @author Estudiante
 */
public class Bmw implements Carro{

    @Override
    public void marca() {
        System.out.println("BMW");
    }

    @Override
    public String descripcion() {
        return "Auto de BMW";
    }
    
}
