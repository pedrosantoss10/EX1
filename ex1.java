/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracao de variaveis
        int num1,num2,soma;
        //objeto para ler dados do teclado
        Scanner input = new Scanner (System.in);
             
                //mostrar a msg para o usuario informar 
                System.out.println("Informe o primeiro numero: ");
                //ler valor para num1
        num1 = input.nextInt();
        //mostrar a msg para usuario informar
        System.out.println("Informe o segundo numero: ");
        //ler valor num2
        num2 = input.nextInt();
        //realizar a soma
        soma = num1+num2;
        //mostar resultado
        System.out.println("Sua soma de:"+soma);
        System.out.println("Sua Soma de: " +num1+ " e " +num2+ " é " +soma );
        System.out.printf("A soma de %d + %d = %d.",num1,num2,soma);
       // contenacao de resultado 
        
        //concatenacao de resultado 
        
        
    }
    
    
}
