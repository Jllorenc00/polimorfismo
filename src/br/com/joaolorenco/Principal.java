
package br.com.joaolorenco;


public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setPeso(35.5f);
        m.setCorPelo("Amarelo");
        m.alimentar();
        m.locomover();
        m.emitirsom();
        
        r.setPeso(40f);
        r.setCorEscama("Verde");
        r.alimentar();
        r.locomover();
        r.emitirsom();
        
        p.setPeso(1.5f);
        p.setCorEscama("Azul");
        p.alimentar();
        p.locomover();
        p.emitirsom();
        
        a.setPeso(0.600f);
        a.setCorPena("Branco");
        a.alimentar();
        a.locomover();
        a.emitirsom();
        
        Cachorro c = new Cachorro();
        Canguru k = new Canguru();
        
        c.emitirSom();
        c.locomover();
        k.emitirsom();
        c.locomover();
        
    }
    
}
