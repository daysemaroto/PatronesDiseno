/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

public class ManejadorDinero implements Manejador
{
    protected int monto;
    public ManejadorDinero next;
    protected double denominacion;

    public ManejadorDinero(int monto, double denominacion){
        this.monto = monto; // Total de billetes
        this.denominacion = denominacion; // Valor de cada billete
    }

    public int getMonto(){ return monto; }
    public double getDenominacion(){ return denominacion; }
    public void setMonto(int monto){ this.monto = monto; }
    
    public boolean retirar(double monto){
        // Implementar
        return false;
    }
    public boolean depositar(int monto, double denominacion){
         if(this.denominacion== denominacion)
        {
            this.monto = this.monto + monto;
	    return true;
        }
        else
        {
            if (this.next == null)
                return false;
            return (this.next.depositar(monto, denominacion));
        }
    }
    

    public void setNext(ManejadorDinero manejador) {
        this.next=manejador;
    }

}