/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

/**
 *
 * @author gianc
 */
public interface Manejador {
    void setNext(ManejadorDinero manejador);
    boolean retirar(double monto);
    boolean depositar(int n, double denominacion);
}
