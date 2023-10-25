import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;

public class Soldado {
    private String nome;
    private int numero;
    private int TempoServico;
    private Cabo imediato;
    private ArrayList<Conscrito> subordinados;

    public Soldado(String nome, int numero, int TempoServico) {
        this.nome = nome;
        this.numero = numero;
        this.TempoServico = 1;
        this.subordinados = new ArrayList<>();
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
        return TempoServico;
    }

    public List<Conscrito> getSubordinados() {
        return Collections.unmodifiableList(subordinados);
    }

    public void setImediato(Cabo imediato) {
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
        Soldado soldado = (Soldado) o;
        return numero == soldado.numero && Objects.equals(nome, soldado.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }
}
