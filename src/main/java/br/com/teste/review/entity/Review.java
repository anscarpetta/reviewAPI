package br.com.teste.review.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "review")
public class Review {

  @Id
  private String idReview;
  private String setor;
  private Number nota;
  private String descricao;

  public Review(String setor, Number nota, String descricao) {
    this.setor = setor;
    this.nota = nota;
    this.descricao = descricao;
  }

  public Review() {
  }

  public String getIdReview() {
    return idReview;
  }

  public void setIdReview(String idReview) {
    this.idReview = idReview;
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
