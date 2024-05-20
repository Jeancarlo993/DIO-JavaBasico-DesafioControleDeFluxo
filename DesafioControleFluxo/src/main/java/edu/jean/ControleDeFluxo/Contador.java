/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jean.ControleDeFluxo;

/**
 *
 * @author jean_
 */
public class Contador {
    int iteracao1, iteracao2;
    
    Contador(int interacao1, int interacao2){

            this.iteracao1 = interacao1;
            this.iteracao2 = interacao2;
    }

    public void contar()throws ParametrosInvalidosException{
        if(iteracao1>iteracao2){
            throw new ParametrosInvalidosException();
        } 
        else{
            for(int i =0; i< (iteracao2-iteracao1); i++){
                System.out.println("Imprimindo o numero "+ i);        
            }
        }
    }
}
