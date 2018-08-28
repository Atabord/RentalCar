/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Alejo
 */
public class FactoryProducer {
    public static CarFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("Categoria")){
         return new categoryFactory();
         
      }      
      return null;
   }

}
