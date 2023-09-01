package org.smosquera.proyectomamifero.abstractclass.genericclass;

import org.smosquera.proyectomamifero.abstractclass.Felino;

public class Tigre extends Felino {


    public Tigre( String especieTigre, float tamanoGarras, int velocidad, String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(tamanoGarras, velocidad, habitat, altura, largo, peso, nombreCientifico);
        this.especieTigre = especieTigre;
    }


    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre come con sus amigos";
    }

    @Override
    public String dormir() {
        return "La especie tigre " +  this.especieTigre + " duerme mas que un tigre normal";
    }

    @Override
    public String correr() {
        return "La especie tigre: " +  this.especieTigre  + " es mas rapida";
    }

    @Override
    public String comunicarse() {
        return "El tigre siempre se comunica con su manada";
    }

    private String especieTigre;
}
