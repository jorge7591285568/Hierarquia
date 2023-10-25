import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Sargento {
    private String nome;
    private int numero;
    private int tempoServico;
    private Cabo imediato;

    public Sargento(String nome, int numero, int tempoServico) {
        this.nome = nome;
        this.numero = numero;
        this.tempoServico = 0;
    }

    public int getNumero() {
        return numero;
    }

    public Cabo getImediato() {
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

    // TODO fazer remoção de subordinado na troca do imediato
    public void setImediato(Tenente imediato) {
        if (!(Objects.equals(this.imediato, imediato))) {
            this.imediato = imediato;
            //this.imediato.addSubordinado(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Sargento sargento = (Sargento) o;
        return numero == sargento.numero && Objects.equals(nome, sargento.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero, tempoServico);
    }
}