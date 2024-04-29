package com.ecomerce.service;
import com.ecomerce.model.Orden;
import com.ecomerce.model.Usuario;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;
import java.util.Optional;


public interface IOrdenService {
    List<Orden> findAll();
    Orden save (Orden orden);
    String generarNumeroOrden();

    List<Orden> findByUsuario(Usuario usuario);
    Optional<Orden> findById(Integer id);
}
