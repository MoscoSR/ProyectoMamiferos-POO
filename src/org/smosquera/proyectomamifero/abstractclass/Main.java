package org.smosquera.proyectomamifero.abstractclass;

import org.smosquera.proyectomamifero.abstractclass.genericclass.*;

public class Main {
    public static void main(String[] args) {
        Mamifero [] mamiferos = new  Mamifero[6];

        /*Creacion de mamiferos con la clase abstracta generica*/

        /*Felinos*/
        Mamifero leon = new Leon(120f, 5, "SurAfrica", 1.47f, 1.48f, 85f,
                "Panthera Leo");

        Mamifero guepadro = new Guepardo(4.9f, 85,"Africa", 94, 140, 58,
                "Aciconyx Jubatus");

        Mamifero tigre = new Tigre("Tigre Blanco", 17, 85, "Africa", 1.78f,
                100, 90, "Panthera Tigris");

        /*Caninos*/
        Mamifero lobo = new Lobo(8,"Lobo gris", 40, "gris", "Artico",
                95,85,90, "lobusperrus");

        Mamifero perro = new Perro(85, 43, "Negro", "Casero", 60,
                85, 80, "Dogus");

        mamiferos[0] = leon;
        mamiferos[1]=guepadro;
        mamiferos[2] = tigre;
        mamiferos[4] = lobo;
        mamiferos[5] = perro;

        for (Mamifero animal : mamiferos) {
            System.out.println("===================" +  animal.getClass().getSimpleName() + "=========");
            System.out.println("Habitat: " +  animal.getHabitat());
            System.out.println("Altura: " + animal.getAltura());
            System.out.println("Largo: " +  animal.getLargo());
            System.out.println("Peso: " + animal.getPeso());
           /*Canino*/
            if (animal instanceof Canino) {
                System.out.println("Colmillos: " +  ((Canino) animal).getTamanoColmillos());
                System.out.println("Color: " +  ((Canino) animal).getColor());
            }

            if (animal instanceof  Lobo) {
                System.out.println("Especie lobo: " +  ((Lobo) animal).getEspecieLobo());
                System.out.println("Numero de camada: " +  ((Lobo) animal).getNumCamada());
            }

           if (animal instanceof Perro) {
               System.out.println("Potencia de mordida: " +  ((Perro) animal).getFuerzaMordida());
           }
           /*Felino*/

            if (animal instanceof Felino) {
                System.out.println("Tamaño de las garras: " + ((Felino) animal).getTamanoGarras());
                System.out.println("Velocidad: " +  ((Felino) animal).getVelocidad());
            }

            if (animal instanceof  Leon) {
                System.out.println("Numero de manada: " +  ((Leon) animal).getNumManada());
                System.out.println("Potencia rugido: " + ((Leon) animal).getPotenciaRugido() + "dsb");
            }

            if (animal instanceof Lobo) {
                System.out.println("Numero de camada: " + ((Lobo) animal).getNumCamada());
                System.out.println("Especie lobo: " +  ((Lobo) animal).getEspecieLobo());
            }

            if (animal instanceof  Tigre) {
                System.out.println("Especie tigre: " + ((Tigre) animal).getEspecieTigre());
            }

            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
        }
    }
}