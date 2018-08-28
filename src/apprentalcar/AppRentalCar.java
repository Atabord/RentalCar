/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprentalcar;
import Categoria.categoria;
import java.util.Scanner;
import Factory.CarFactory;
import Factory.categoryFactory;
import Factory.FactoryProducer;
/**
 *
 * @author Alejo
 */
public class AppRentalCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----Bienvenido a RentalCar----");
        System.out.println("Por favor escoge una opción para continuar:");
        System.out.println("1. Categoría estandar");
        System.out.println("2. Categoría familiar");
        System.out.println("3. Categoría sport");
        String entradaTeclado;
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        entradaTeclado = entradaEscaner.nextLine ();
        CarFactory categoryFactory = FactoryProducer.getFactory("Categoria");
        System.out.print("Escogiste: "+ entradaTeclado+ " ");
        switch(entradaTeclado) {
            case "1":                
                categoria standar = categoryFactory.crearCategoria("Standar");
                standar.category();
                standar.seguro();
                standar.valorHora();
                 break;
            case "2":               
                categoria familiar = categoryFactory.crearCategoria("Familiar");
                familiar.category();
                familiar.seguro();
                familiar.valorHora();
                 break;
            case "3":
                categoria sport = categoryFactory.crearCategoria("Sport");
                sport.category();
                sport.seguro();
                sport.valorHora();
                 break;
            default:
                 System.out.println("error" );
                 break;
      }
        
    }
    
}
