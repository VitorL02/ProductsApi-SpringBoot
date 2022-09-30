package br.com.products.ProductsApiRest.controllers;

import br.com.products.ProductsApiRest.models.Produto;
import br.com.products.ProductsApiRest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/products-api")
public class ProdutoController {

    @Autowired
    ProdutoRepository productRepository;

    @GetMapping("/produtos")
    public List<Produto> listProduct(){
        return productRepository.findAll();
    }
    @GetMapping("/produto/{id}")
    public Produto listProductById(@PathVariable(value = "id") long id){
        return productRepository.findById(id);
    }

    @PostMapping("/produto")
    public Produto saveProduct(@RequestBody Produto produto){
        return  productRepository.save(produto);
    }



}
