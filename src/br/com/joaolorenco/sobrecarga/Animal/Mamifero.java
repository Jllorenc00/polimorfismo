package br.com.joaolorenco.sobrecarga.Animal;

public class Mamifero extends Animal {

    protected float peso;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de Mamifero");

    }

}
