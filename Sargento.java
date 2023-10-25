
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Sargento {
    public static final String getimediato = null;
    private String nome;
    private int numero;
    private int tempoServico;
    private Tenente imediato;
    private ArrayList<Cabo> subordinados;

    public Sargento(String nome, int numero, int tempoServico) {
        this.nome = nome;
        this.numero = numero;
        this.tempoServico = 3;
        this.subordinados = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public Tenente getImediato() {
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

    public List<Cabo> getSubordinados() {
        return Collections.unmodifiableList(subordinados);
    }

    // TODO fazer remoção de subordinado na troca do imediato
    public void addSubordinado(Cabo cabo) {
        cabo.setImediato(this);
        if (!this.subordinados.contains(cabo)) {
            subordinados.add(cabo);
        }
    }

    public void setImediato(Tenente imediato) {
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
        Sargento sargento = (Sargento) o;
        return numero == sargento.numero && Objects.equals(nome, sargento.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero, tempoServico);
    }
}