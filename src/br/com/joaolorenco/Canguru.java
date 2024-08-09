package br.com.joaolorenco;

public class Canguru extends Mamifero {

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

    public void usarBolsa() {
        System.out.println("Usar bolsa");
    }
}
