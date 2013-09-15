package org.healthnow.o360.repository;

import org.healthnow.o360.domain.product.Product;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ProductRepository extends GraphRepository<Product> {

}
