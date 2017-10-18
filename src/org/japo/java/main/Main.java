/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author CicloM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Constantes y variables
        int cantidad_caramelos;
        
        int bolsas_completas;
        int caramelos_sueltos;
        
        double precio_bolsas;
        double precio_caramelos;
        
        double precio_previo;
        double iva;
        double precio_final;
        
        final int PRECIO_BOLSA = 5;
        final double PRECIO_CARAMELO = 0.07;
        
        //Instancia
        Scanner scn = new Scanner(System.in,"ISO-8859-1");
        
        //Formato
        System.out.println("CARAMELOS PARA BAUTIZOS");
        System.out.println("=======================");
        System.out.println("");
        
        //Salida
        try {
            System.out.printf("Cantidad de caramelos ...: ");
            cantidad_caramelos = scn.nextInt();
            scn.nextLine();
            
            System.out.println("");
            
            bolsas_completas = cantidad_caramelos / 100;
            System.out.printf("Bolsas completas ........: %d\n", bolsas_completas);
            
            caramelos_sueltos = cantidad_caramelos % 100;
            System.out.printf("Caramelos sueltos .......: %d\n", caramelos_sueltos);
           
            System.out.println("");
            
            precio_bolsas = bolsas_completas * PRECIO_BOLSA;
            System.out.printf(Locale.ENGLISH,"Importe bolsas ..........: %.2f€\n", precio_bolsas);
            
            precio_caramelos = caramelos_sueltos * PRECIO_CARAMELO;
            System.out.printf(Locale.ENGLISH,"Importe suelto ..........: %.2f€\n", precio_caramelos);
            
            System.out.println("");
            
            precio_previo = precio_bolsas + precio_caramelos;
            System.out.printf(Locale.ENGLISH,"Importe previo ..........: %.2f€\n", precio_previo);
            
            System.out.println("");
            
            iva = precio_previo * 0.21;
            System.out.printf(Locale.ENGLISH,"IVA .....................: %.2f€\n", iva);
            
            System.out.println("");
            
            precio_final = precio_previo + iva;
            System.out.printf(Locale.ENGLISH,"Importe PVP .............: %.2f€\n", precio_final);
            
            
        } catch (Exception e) {
            System.out.println("Entrada incorrecta");
        }
    
    }
    
}
