
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;

public class Tenente {
    private String nome;
    private int numero;
    private int TempoServico;
    private Capitao imediato;
    private ArrayList<Sargento> subordinados;

    public Tenente(String nome, int numero, int TempoServico) {
        this.nome = nome;
        this.numero = numero;
        this.TempoServico = 3;
        this.subordinados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public Capitao getImediato() {
        return imediato;
    }

    public int getTempoServico() {
        return TempoServico;
    }

    public List<Sargento> getSubordinados() {
        return Collections.unmodifiableList(subordinados);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // TODO fazer remoção de subordinado na troca do imediato
    public void addSubordinado(Sargento sargento) {
        sargento.setImediato(this);
        if (!this.subordinados.contains(sargento)) {
            subordinados.add(sargento);
        }
    }

    public void setImediato(Capitao imediato) {
        if (!(Objects.equals(this.imediato, imediato))) {
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
        Tenente tenente = (Tenente) o;
        return numero == tenente.numero && Objects.equals(nome, tenente.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero, TempoServico);
    }
}