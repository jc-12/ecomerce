package com.ecomerce.service;
import com.ecomerce.model.Orden;
import com.ecomerce.model.Usuario;

import java.util.List;


public interface IOrdenService {
    List<Orden> findAll();
    Orden save (Orden orden);
    String generarNumeroOrden();

    List<Orden> findByUsuario(Usuario usuario);
}
