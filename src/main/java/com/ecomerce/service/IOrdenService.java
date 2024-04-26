package com.ecomerce.service;
import com.ecomerce.model.Orden;

import java.util.List;


public interface IOrdenService {
    List<Orden> findAll();
    Orden save (Orden orden);
    String generarNumeroOrden();
}
