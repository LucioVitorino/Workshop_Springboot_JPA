package com.educandoweb.course.services;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll()
    {
        List<Product> products = productRepository.findAll();
        return (products);
    }

    public Product findById(Integer id)
    {
        Optional<Product> p = productRepository.findById(id);
        return(p.get());
    }
}
