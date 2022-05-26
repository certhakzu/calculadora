package com.sofka.test;

import com.sofka.domain.Calculadora;

import javax.swing.*;

public class Index {



    public static void main(String[] args) {
        int option = 0;
        double number1;
        double number2;
        Calculadora calculadora = new Calculadora();

        do {
            do {
                try{
                    option = Integer.parseInt(JOptionPane.showInputDialog("MENÚ\n\n\n1 -> Sumar\n2 -> Restar\n3 -> Multiplicar\n4 -> Dividir\n5 -> Salir\n\nDigite Opción:"));
                    if (option < 1 || option > 5) {
                        JOptionPane.showMessageDialog(null, "Digite una Opción entre 1 y 5!!!\n\nINTENTE DE NUEVO!");
                    }
                }catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "OPCIÓN NO VÁLIDA!!!\n\n asegurece de digitar 1, 2, 3, 4 o 5");
                }

            } while (option < 1 || option > 5);

            if (option !=5){
                number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite Número Uno:"));
                number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite Número Dos:"));
                switch (option) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "El Resultado de la SUMA es: " + calculadora.add(number1, number2));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "El Resultado de la RESTA es: " + calculadora.subtract(number1, number2));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "El Resultado de la MULTIPLICACIÓN es: " + calculadora.multiply(number1, number2));
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "El Resultado de la DIVISIÓN es: " + calculadora.split(number1, number2));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción Inválida");
                }
            }else{
                JOptionPane.showMessageDialog(null, "ADIOS. HASTA PRONTO! XD!");
            }
        } while (option != 5 );
    }
}