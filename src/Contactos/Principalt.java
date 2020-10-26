/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contactos;

import java.util.Scanner;

/**
 *
 * @author CES
 */
public class Principalt {
    public static void main(String[] args) {
        Contacto[] listadoContactos = new Contacto [50];
        Scanner lector = new Scanner (System.in);
        int opcion = 0;
        int posicion = 0; 
        do{
        do {
            System.out.println("1.- Crear Contacto");
            System.out.println("2.- Imprimir lista Contactos");
            System.out.println("3.- Salir");
            System.out.println("Indique la opción elegida");
            opcion = lector.nextInt();
            lector.nextLine();
        } while (opcion<1 || opcion >3);
        switch(opcion){
            case 1: {   
                if (posicion<50) {
                    System.out.println("Indique nombre ");
                    String nombre = lector.nextLine();
                    System.out.println("Indique telefono ");
                    String telefono = lector.nextLine();
                    System.out.println("Indique el correo ");
                    String correo = lector.nextLine();
                    Contacto contacto = new Contacto(nombre, telefono, correo);
                    listadoContactos[posicion]=contacto;
                    posicion++;
                    //Esto hace que cada vez se cambie la posición del contacto,
                    //primer viaje será 0, luego 1...
                    
                
                }else{
                    System.out.println("La lista está llena, pase por caja");
                }
                break;
            }
                case 2: {
                    if (posicion>0) {
                        for (int i = 0; i < posicion; i++) {
                            System.out.println(listadoContactos[i].toString());
                            
                            
                        }
                    }else{
                        System.out.println("No hay contactos en la lista");
                        
                    }
                    break;
            } 
                
            
            }
        
        
        }while(opcion>0 && opcion<3);
        
        
        
        
        
        
    }
    
}
