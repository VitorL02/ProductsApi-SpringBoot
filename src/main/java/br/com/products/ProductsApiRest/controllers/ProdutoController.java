package br.com.products.ProductsApiRest.controllers;

import br.com.products.ProductsApiRest.models.Produto;
import br.com.products.ProductsApiRest.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/products-api")
@Api(value ="API REST Produtos")
@CrossOrigin(origins = "*")
public class ProdutoController {

    @Autowired
    ProdutoRepository productRepository;

    @GetMapping("/produtos")
    @ApiOperation(value="Esse metodo Lista todos os produtos, retornando um lista")
    public List<Produto> listProduct(){
        return productRepository.findAll();
    }
    @GetMapping("/produto/{id}")
    @ApiOperation(value="Esse metodo Lista somente um produto determinado pelo id")
    public Produto listProductById(@PathVariable(value = "id") long id){
        return productRepository.findById(id);
    }

    @PostMapping("/produto")
    @ApiOperation(value="Esse metodo insere um produto")
    public Produto saveProduct(@RequestBody Produto produto){
        return  productRepository.save(produto);
    }

    @DeleteMapping("/produto")
    @ApiOperation(value="Esse metodo deleta um produto")
    public void deletProduct(@RequestBody Produto produto){
          productRepository.delete(produto);
    }

    @DeleteMapping("/produto/{id}")
    @ApiOperation(value="Esse metodo deleta um produto determinado pelo seu Id")
    public void deleteProductById(@PathVariable(value = "id") long id){
          productRepository.deleteById(id);
    }

    @PutMapping("/produto")
    @ApiOperation(value="Esse metodo atualiza um produto")
    public Produto editProduct(@RequestBody Produto produto){
        return productRepository.save(produto);
    }




}
