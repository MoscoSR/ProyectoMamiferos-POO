package org.smosquera.proyectomamifero.abstractclass;

 abstract class Mamifero {
    public Mamifero(String habitat, float altura) {
        this.habitat = habitat;
        this.altura = altura;
    }

    public Mamifero (String habitat, float altura, float largo, float peso) {
        this(habitat, altura);
        this.largo = largo;
        this.peso = peso;
    }

    public Mamifero (String habitat, float altura, float largo, float peso, String nombreCientifico) {
        this(habitat, altura, largo, peso);
        this.nombreCientifico = nombreCientifico;
    }

     public String getHabitat() {
         return habitat;
     }

     public float getAltura() {
         return altura;
     }

     public float getLargo() {
         return largo;
     }

     public float getPeso() {
         return peso;
     }

     public String getNombreCientifico() {
         return nombreCientifico;
     }

     abstract  public String comer();
     abstract  public String dormir();
     abstract  public String correr();
     abstract public String comunicarse();

     protected String habitat;
    protected float altura;
    protected  float largo;
    protected  float peso;
    protected String nombreCientifico;
}
