package br.com.products.ProductsApiRest.repository;

import br.com.products.ProductsApiRest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {

}
