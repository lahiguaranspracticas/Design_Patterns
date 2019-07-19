/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoradores;

/**
 *
 * @author Estudiante
 */
public abstract class CarroDecorator implements Carro {
    protected Carro carrodecorado;
    public CarroDecorator(Carro carrodecorado){
        super();
        this.carrodecorado = carrodecorado;
    }
}
