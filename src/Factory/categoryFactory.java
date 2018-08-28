/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;
import Categoria.categoria;
import Categoria.familiar;
import Categoria.Standar;
import Categoria.sport;
/**
 *
 * @author Alejo
 */
public class categoryFactory implements CarFactory{
    @Override
    public categoria crearCategoria(String categoryType){
        if(categoryType == null){
            return null;
        }
        if(categoryType.equalsIgnoreCase("Familiar")){
            return new familiar();
        }
        if(categoryType.equalsIgnoreCase("Sport")){
            return new sport();
        }
        if(categoryType.equalsIgnoreCase("Standar")){
            return new Standar();
        }
        return null;
    }
}