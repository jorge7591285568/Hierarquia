
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

    public List<Conscrito> getSubordinados() {
        return Collections.unmodifiableList(subordinados);
    }

    public int getTempoServico() {
        return TempoServico;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTempoServico(int TempoServico) {
        this.TempoServico = TempoServico;
    }

    public void setSubordinados(ArrayList<Conscrito> subordinados) {
        this.subordinados = subordinados;
    }

    // TODO fazer remoção de subordinado na troca do imediato
    public void addSubordinado(Conscrito conscrito) {
        conscrito.setImediato(this);
        if (!this.subordinados.contains(conscrito)) {
            subordinados.add(conscrito);
        }
    }

    public void setImediato(Cabo imediato) {
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
        Soldado soldado = (Soldado) o;
        return numero == soldado.numero && Objects.equals(nome, soldado.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }
}
