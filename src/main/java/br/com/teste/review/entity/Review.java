package br.com.teste.review.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {

  @Id
  private String id;

  private String sistemaId;
  private String setor;
  private Number nota;
  private String descricao;

  public Review(String sistemaId, String setor, Number nota, String descricao) {
    this.sistemaId = sistemaId;
    this.setor = setor;
    this.nota = nota;
    this.descricao = descricao;
  }

  public Review() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getSistemaId() {
    return sistemaId;
  }

  public void setSistemaId(String sistemaId) {
    this.sistemaId = sistemaId;
  }

  public String getSetor() {
    return setor;
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }

  public Number getNota() {
    return nota;
  }

  public void setNota(Number nota) {
    this.nota = nota;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}