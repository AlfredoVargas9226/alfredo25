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
public class Imc {
 //el siguyiente atributo es de tipo 
    //composicion agregacion
    Usuario u;
public String calcular(){
   float Imc=u.peso/(u.altura*u.altura);
    return "tu resultado es"+Imc;
    
}
}
