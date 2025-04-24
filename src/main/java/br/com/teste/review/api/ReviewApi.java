package br.com.teste.review.api;


import br.com.teste.review.entity.Review;
import br.com.teste.review.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReviewApi {

  private final ReviewRepository reviewRepository;

  @Autowired
  public ReviewApi(ReviewRepository reviewRepository) {
    this.reviewRepository = reviewRepository;
  }

  @GetMapping("/admin/reviews")
  public List<Review> listarReviews(){
    return reviewRepository.findAll();
  }

  @PostMapping("cliente/review")
  public Review criarReview(@RequestBody Review review){
     return reviewRepository.save(review);
  }
}
