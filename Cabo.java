
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;

public class Cabo {

  private String nome;
  private int numero;
  private int TempoServico;
  private Sargento imediato;
  private ArrayList<Soldado> subordinados;

  public Cabo(String nome, int numero, int TempoServico) {
    this.nome = nome;
    this.numero = numero;
    this.TempoServico = 2;
    this.subordinados = new ArrayList<>();
  }

  public int getNumero() {
    return numero;
  }

  public Sargento getImediato() {
    return imediato;
  }

  public String getNome() {
    return nome;
  }

  public List<Soldado> getSubordinados() {
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

  // TODO fazer remoção de subordinado na troca do imediato
  public void addSubordinado(Soldado soldado) {
    soldado.setImediato(this);
    if (!this.subordinados.contains(soldado)) {
      subordinados.add(soldado);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Cabo cabo = (Cabo) o;
    return numero == cabo.numero && Objects.equals(nome, cabo.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, numero, TempoServico);
  }
}
