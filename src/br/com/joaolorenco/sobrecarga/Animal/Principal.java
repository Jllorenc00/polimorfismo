package br.com.joaolorenco.sobrecarga.Animal;

public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here

        Cachorro cachorro = new Cachorro();

        cachorro.setCorPelo("Amarelo");
        cachorro.reagir("Ola");
        cachorro.reagir(true);
        cachorro.reagir(10, 12f);
        cachorro.reagir(22, 0);
    }

}
