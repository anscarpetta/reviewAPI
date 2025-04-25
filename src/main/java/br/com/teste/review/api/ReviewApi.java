package br.com.teste.review.api;


import br.com.teste.review.entity.Review;
import br.com.teste.review.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ReviewApi {

  private final ReviewRepository reviewRepository;

  @Autowired
  public ReviewApi(ReviewRepository reviewRepository) {
    this.reviewRepository = reviewRepository;
  }

  @GetMapping("/admin/reviews")
  public Map<String, Object> listarReviews(
          @RequestParam(required = false, name = "setor") String setor,
          Pageable pageable
  ) {
    
    Page<Review> page = !setor.isEmpty() ?reviewRepository.findBySetor(setor, pageable): reviewRepository.findAll(pageable);

    Map<String, Object> resposta = new HashMap<>();
    resposta.put("reviews", page.getContent());
    resposta.put("paginaAtual", page.getNumber());
    resposta.put("paginasTotais", page.getTotalPages());
    resposta.put("quantidadeTotal", page.getTotalElements());

    return resposta;
  }

  @GetMapping("/admin/review")
  public Review listarReview(@RequestParam String id){
    return reviewRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Review não encontrada com ID: " + id));
  }

  @PostMapping("cliente/review")
  public Review criarReview(@RequestBody Review review){
     return reviewRepository.save(review);
  }
}
