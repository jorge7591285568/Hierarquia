import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

import javax.imageio.plugins.tiff.TIFFTag;

import java.util.Collections;

public class Tenente {
    private String nome;
    private int numero;
    private int TempoServico;
    private Capitao imediato;
    private ArrayList<Tenente> subordinados;

    public Tenente(String nome, int numero, int TempoServico) {
        this.nome = nome;
        this.numero = numero;
        this.TempoServico = 3;
        this.subordinados = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public Capitao getImediato() {
        return imediato;
    }

    public String getNome() {
        return nome;
    }

    public List<Sargento> getSubordinados() {
        return Collections.unmodifiableList(subordinados);
    }

    public int getTempoServico() {
        return TempoServico;
    }

    public void setImediato(Sargento imediato) {
        if (!(Objects.equals(this.imediato, imediato))) {
          this.imediato = imediato;
          //this.imediato.addsubordinados(imediato);
        }
      }
       @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Tenente tenente = (Tenente) o;
        return numero == tenente.numero && Objects.equals(nome, tenente.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero,TempoServico);
    }
}