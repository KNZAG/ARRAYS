/*En un parking de 100 plazas se quiere realizar un programa para gestionar el control de dichas plazas. 
Para ello cuando llega un nuevo automóvil se le asignará la primera plaza que se encuentre libre. 
En cambio, cuando sale del parking se le preguntará qué plaza es la que está quedando libre. 
También cuando lo desee el operador se visualizará el estado del parking */

package ej1arrays_cristiang;

import java.util.Scanner;
import textoandnumeros.Utilidad;

public class Ej1Arrays_CristianG {

    public static void main(String[] args) {
        Empresa miEmpresa;//, miEmpresa2;
        Scanner entrada = new Scanner(System.in);
        float nplazas;
        int opcion;
        nplazas = Utilidad.pedirNumeroReal("Dime el numero de plazas: ", 1f);//Mensaje: "Dime el numero de plazas: " Valor mas pequeño(limiteInferior): 0
        miEmpresa = new Empresa((int) nplazas);
        miEmpresa.inicializar();
        do {
            menu();
            opcion = (int) Utilidad.pedirNumeroReal("Opcion: ", 1, 4);
            if (opcion != 4) {
                switch (opcion) {
                    case 1:
                        miEmpresa.entrada();
                        break;
                    case 2:
                        miEmpresa.salidad();
                        break;
                    default:
                        miEmpresa.estado();
                        break;
                    
                }
            }
        } while (opcion != 4);

    }

    private static void menu() {
        System.out.println("MENU PRINCIPAL: ");
        System.out.println("1.Entrada");
        System.out.println("2.Salida");
        System.out.println("3.Estado");
        System.out.println("4.Fin");
        //System.out.println("Opcion: ");
    }
}
