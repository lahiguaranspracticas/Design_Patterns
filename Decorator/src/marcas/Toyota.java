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
public class Toyota implements Carro{

    @Override
    public void marca() {
        System.out.println("Toyota");
    }

    @Override
    public String descripcion() {
        return "Auto de Toyota";
    }
    
}
