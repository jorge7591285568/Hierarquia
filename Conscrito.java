

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Conscrito {
    private String nome;
    private int numero;
    private int tempoServico;
    private Soldado imediato;
   

    public Conscrito(String nome, int numero,int tempoServico) {
        this.nome = nome;
        this.numero = numero;
        this.tempoServico = 0;
        

    }

    public int getNumero() {
        return numero;
    }

    public Soldado getImediato() {
        return imediato;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void incrementarTempoServico() {
        tempoServico++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

   
   
    public void setImediato(Soldado imediato) {
        if (!(Objects.equals(this.imediato, imediato))) {
            if(this.imediato != null){
                this.imediato.removerSubordinado(this);
            }            
            this.imediato = imediato;
            this.imediato.addSubordinado(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Conscrito conscrito = (Conscrito) o;
        return numero == conscrito.numero && Objects.equals(nome, conscrito.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero, tempoServico);
    }
}