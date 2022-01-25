package ej1arrays_cristiang;

import java.util.Arrays;
import textoandnumeros.Utilidad;

public class Empresa {

    String[] parking;
                           
    public Empresa() {
        parking = new String[100];
    }

    /**
     * @param nplazas es el numero de plazas que va a tener el parking
     */
    public Empresa(int nplazas) {
        parking = new String[nplazas];
    }

    public void inicializar() {
        for (int pos = 0; pos < parking.length; pos++) {
            parking[pos] = "Libre";
        }

    }

    public void estado() {//Visualizo el estado del parking
        for (int pos = 0; pos < parking.length; pos++) {
            System.out.println("Plaza numero: " + (pos) + "·" + parking[pos]);
        }
    }

    public void entrada() {
        int pos = 0;
        boolean encontrado = false;
        while (!encontrado && pos < parking.length) 
        {//Mientra no lo encuentres y la pos sea menor que el tamaño

            if (parking[pos].equalsIgnoreCase("Libre")) 
            {
                encontrado = true;
            } 
            else 
            {
                pos++;//Si una plaza esta ocupada pasa a la siguiente
            }

        }
        //Aqui entra cuando ya esta todo el parking.Preguntas porque te has salido
        if (encontrado) 
        {
            parking[pos] = "Ocupado";//Si encontrado es verdadero esa posicion pasa a ser ocupada
            System.out.println("la plaza asignada es: " + (pos));

        } 
        else 
        {
            System.out.println("Parking completo");
        }

    }

    /* public void busqueda2() {

        int pos = parking "Libre");
        if (pos != -1) {
            parking[pos] = "Ocupado";
            System.out.println("la plaza asignada es: " + pos + 1);

        } else {
            System.out.println("Parking completo");
        }

    }*/
    public void salidad() {
        int plaza;
        plaza = Utilidad.pedirNumeroEntero("Numero de la plaza a dejar libre", 0, parking.length - 1);
        
        if (parking[plaza].equalsIgnoreCase("ocupado"))//Liberas la plaza 
        {
            parking[plaza] = "LIbre";
            System.out.println("la plaza ha quedado libre");
        } 
        else //Plaza ya libre
        {
            System.out.println("La plza ya estaba libre");
        }
    }
}