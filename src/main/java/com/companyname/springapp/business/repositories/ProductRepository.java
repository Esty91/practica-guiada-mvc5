package com.companyname.springapp.business.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.companyname.springapp.business.entities.Product;

@Repository //decorador añadido para que Spring pueda encontrar la clase (antes me daba el error UnsatisfiedDependencyException)
public interface ProductRepository extends CrudRepository<Product, Integer> {

}