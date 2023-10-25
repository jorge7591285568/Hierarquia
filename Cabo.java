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
      Cabo cabo = (Cabo) o;
      return numero == cabo.numero && Objects.equals(nome, cabo.nome);
  }

  @Override
  public int hashCode() {
      return Objects.hash(nome, numero, TempoServico);
  }
}
