package br.com.joaolorenco;

public class Peixe extends Animal {

    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Substancias do mar");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de peixe");
    }

}
