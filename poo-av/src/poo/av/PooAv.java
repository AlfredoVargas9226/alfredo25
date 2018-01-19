/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.av;

/**
 *
 * @author T-102
 */
public class PooAv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
        System.out.println("(hola mundo)");
        //tenemos que tener antes los objetos de las clases anteriuores
       
      Usuario x=new Usuario();
        x.altura=1.70f;
        x.peso=89f;
        Imc algo=new Imc();
        algo.u=x;
        //calculamos el imc atravez de su objeto 
        
        System.out.println(algo.calcular());
        
    }
    
}
