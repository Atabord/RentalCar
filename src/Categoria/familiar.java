/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria;

/**
 *
 * @author Alejo
 */
public class familiar implements categoria{
    @Override
    public void category(){
        System.out.println("Categoria: Familiar");
    }
    @Override
    public void valorHora(){
        System.out.println("Valor: 160.000 la hora");
    }
    @Override
    public void seguro(){
        System.out.println("Seguro: todo riesgo");
    }
}
