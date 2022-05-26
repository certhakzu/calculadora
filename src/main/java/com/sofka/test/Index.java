package com.sofka.test;

import com.sofka.domain.Calculadora;
import javax.swing.*;

/**
 * Clase Index, donde inicia la ejecución
 * @author Piter Velasquez & Álvaro Vega
 * @version 25/05/2022
 */
public class Index {

    /**
     * Método main, punto de inicio de la aplicación
     * @param args
     */
    public static void main(String[] args) {
        int option;

        Calculadora calculadora = new Calculadora();

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("MENÚ\n\n\n1 -> Sumar\n2 -> Restar\n3 -> Multiplicar\n4 -> Dividir\n5 -> Salir\n\nDigite Opción:"));

            if (option !=5){
                calculadora.setNumber1(Double.parseDouble(JOptionPane.showInputDialog("Digite Número Uno:")));
                calculadora.setNumber2(Double.parseDouble(JOptionPane.showInputDialog("Digite Número Dos:")));
                switch (option) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "El Resultado de la SUMA es: " + calculadora.add(calculadora.getNumber1(), calculadora.getNumber2()));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "El Resultado de la RESTA es: " + calculadora.subtract(calculadora.getNumber1(), calculadora.getNumber2()));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "El Resultado de la MULTIPLICACIÓN es: " + calculadora.multiply(calculadora.getNumber1(), calculadora.getNumber2()));
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "El Resultado de la DIVISIÓN es: " + calculadora.split(calculadora.getNumber1(), calculadora.getNumber2()));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción Inválida");
                }
            }else{
                JOptionPane.showMessageDialog(null, "ADIOS. HASTA PRONTO! XD!");
            }
        } while (option != 5);
    }
}