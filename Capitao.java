import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;

public class Capitao {

    private String nome;
    private int numero;
    private int TempoServico;
    private ArrayList<Tenente> subordinados;
    private Object imediato;

    public Capitao(String nome, int numero, int TempoServico) {
        this.nome = nome;
        this.numero = numero;
        this.TempoServico = 3;
        this.subordinados = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }


    public String getNome() {
        return nome;
    }

    public List<Tenente> getSubordinados() {
        return Collections.unmodifiableList(subordinados);
    }

    public int getTempoServico() {
        return TempoServico;
    }
    public void setImediato(Tenente imediato, Object object) {
        if (!(Objects.equals(object, imediato))) {
          this.imediato = imediato;
          //((Object) this.imediato).addsubordinados(imediato);
        }
      }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTempoServico(int tempoServico) {
        TempoServico = tempoServico;
    }

    public void setSubordinados(ArrayList<Tenente> subordinados) {
        this.subordinados = subordinados;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
    Capitao capitao = (Capitao) o;
        return numero == capitao.numero && Objects.equals(nome, capitao.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero, TempoServico);
    }
}