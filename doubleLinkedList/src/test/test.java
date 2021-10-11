package test;

public class test extends Persona{

    public String classe;

    public test( String nome, String cognome, String classe) {
        super(nome, cognome);
        this.classe = classe;

    }

    public String toString() {
        return this.nome+this.cognome+this.classe+super.test+super.getNome();
    }
}


class Persona {
    protected String nome;
    protected String cognome;
    protected String test = "8888888888888";

    public Persona(String nome , String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Persona() {
        this.nome = "";
        this.cognome = "";
    }

    public getNome
}