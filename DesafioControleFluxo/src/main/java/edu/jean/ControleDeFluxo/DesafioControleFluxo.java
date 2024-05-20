/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.jean.ControleDeFluxo;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jean_
 */
public class DesafioControleFluxo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int iteracoes1, iteracoes2;
        iteracoes1 = leitor.nextInt();
        iteracoes2 = leitor.nextInt();
        Contador meuContador = new Contador(iteracoes1,iteracoes2);
        
        try {
            meuContador.contar();
        } catch (ParametrosInvalidosException ex) {
            System.out.println("Ordem dos parâmetros é invalida");
        }      
    }
}

