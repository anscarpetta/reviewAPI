package br.com.teste.review.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import br.com.teste.review.entity.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, String> {

  Page<Review> findBySetor(String setor, Pageable pageable);

}