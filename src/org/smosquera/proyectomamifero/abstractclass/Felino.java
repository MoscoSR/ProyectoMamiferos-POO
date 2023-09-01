package org.smosquera.proyectomamifero.abstractclass;

abstract public class Felino extends Mamifero {
     public Felino( float tamanoGarras, int velocidad,  String habitat, float altura, float largo, float peso, String nombreCientifico) {
         super(habitat, altura, largo, peso, nombreCientifico);
         this.tamanoGarras = tamanoGarras;
         this.velocidad = velocidad;
     }

     public float getTamanoGarras() {
         return tamanoGarras;
     }

     public int getVelocidad() {
         return velocidad;
     }


     protected  float tamanoGarras;
     protected int velocidad;
 }
