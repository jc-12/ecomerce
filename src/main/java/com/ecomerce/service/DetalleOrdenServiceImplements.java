package com.ecomerce.service;

import com.ecomerce.model.DetalleOrden;
import com.ecomerce.repository.IDetalleOredenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleOrdenServiceImplements implements IDetalleOrdenService {
    @Autowired
    private IDetalleOredenRepository detalleOredenRepository;

    @Override
    public DetalleOrden save(DetalleOrden detalleOrden) {
        return detalleOredenRepository.save(detalleOrden);
    }
}
