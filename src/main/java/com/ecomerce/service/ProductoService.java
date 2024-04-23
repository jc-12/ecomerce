package com.ecomerce.service;

import com.ecomerce.model.Producto;

import java.util.Optional;


public interface ProductoService {
    public Producto save(Producto producto);
    public Optional<Producto> get(Integer id);
    public  void update(Producto producto);
    public  void delete(Integer id);

}
