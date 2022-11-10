/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadorapolacainversa;

import javax.swing.JOptionPane;

/**
 *
 * @author Erik
 */
public class CalculadoraPolacaInversa {

    public static void main(String[] args) {
        double numero,numero2,resultado;
        String Option;
        numero= Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero : ")); 
        numero2= Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero : ")); 
        Option=JOptionPane.showInputDialog(" Operacion a realizar:\n (+) Suma\n (-) Resta\n (*) Multipicacion\n (/) Divicion\n (^) Exponente\n (%) Modulo  ");
        switch(Option){
            case "+":
                resultado=numero+numero2;
                JOptionPane.showMessageDialog(null, resultado);
            break;
            case "-":
                resultado=numero-numero2;
                JOptionPane.showMessageDialog(null, resultado);
            break;
            case "*":
                resultado=numero*numero2;
                JOptionPane.showMessageDialog(null, resultado);
            break;
            case "/":
                if(numero2==0){
                    JOptionPane.showMessageDialog(null, "no es posible dividir entre 0");
                }else{
                    resultado=numero/numero2;
                    JOptionPane.showMessageDialog(null, resultado);    
                }
                
            break;
            case "^":
                
                resultado=Math.pow(numero, numero2);
                JOptionPane.showMessageDialog(null, "El numero : "+numero+" es la base\nEl numero : "+numero2+ " es el exponente \nEl resultado es: "+ resultado);
            break;
            case "%":
                resultado=numero%numero2;
                JOptionPane.showMessageDialog(null, resultado);
            break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion No valida");
            break;
        }
        
    }
}
