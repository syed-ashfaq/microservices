package com.capgemini.microserives.product.repository;

import com.capgemini.microserives.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
