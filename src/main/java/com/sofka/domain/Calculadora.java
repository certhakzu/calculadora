package com.sofka.domain;

/**
 * Esta clase define una abstracción de una Calculadora
 * @autor: Piter Velasquez & Álvaro Vega
 * @version 25/05/2022
 */
public class Calculadora {
    private double number1;
    private double number2;

    /**
     * Constructor por defecto
     *
     */
    public Calculadora(){}

    /**
     * Constructor con parámetrdos para la CLase Calculadora
     * @param number1 primero operando
     * @param number2 segundo operando
     */
    public Calculadora(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    /**
     * Método para acceder al atributo number1
     * @return number1 primer operando
     */
    public double getNumber1() {
        return number1;
    }

    /**
     * Método para modificar number1
     * @param number1
     */
    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    /**
     * Método para acceder al atributo number2
     * @return number2 segundo operando
     */
    public double getNumber2() {
        return number2;
    }

    /**
     * Método para modificar number2
     * @param number2
     */
    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    /**
     * Método para sumar
     * @param number1 primer operando
     * @param number2 segundo operando
     * @return el Resultado de la SUMA
     */
    public double add(double number1, double number2){
        return number1 + number2;
    }

    /**
     * Método para restar
     * @param number1 primer operando
     * @param number2 segundo operando
     * @return el Resultado de la RESTA
     */
    public double subtract(double number1, double number2){
        return number1 - number2;
    }

    /**
     * Método para multiplicar
     * @param number1 primer operando
     * @param number2 segundo operando
     * @return el Resultado de la MULTIPLICACIÓN
     */
    public double multiply(double number1, double number2){
        return number1 * number2;
    }

    /**
     * Método para dividir
     * @param number1 prrimer operando
     * @param number2 segundo operando
     * @return el Resultado de la división
     */
    public double split(double number1, double number2){
        return number1 / number2;
    }
}