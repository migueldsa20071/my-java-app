package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ProductModel;

@RestController
public class ProductController {
    private List<ProductModel> products = new ArrayList<>();

    @PostMapping("/cadastrar")
    public String cadastrar(@RequestBody ProductModel product) {
        products.add(product);
        return "Produto cadastrado com sucesso!";
    }

    @GetMapping("/listando")
    public String listar() {
        return products.toString();
    }

    @DeleteMapping("/deletando")
    public String deletar(@RequestBody ProductModel product) {
        products.remove(product);
        return "Produto deletado com sucesso!";
    }
    
    @PutMapping("/atualizando")
    public String atualizar(@RequestBody ProductModel product) {
        products.add(product);
        return "Produto atualizado com sucesso!";
    }

}
