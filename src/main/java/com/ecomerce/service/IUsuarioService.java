package com.ecomerce.service;

import com.ecomerce.model.Usuario;

import java.util.Optional;

public interface IUsuarioService {
    Optional<Usuario> findById(Integer id);
}
