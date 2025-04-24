package br.com.teste.review.repository;

import br.com.teste.review.entity.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, String> { }