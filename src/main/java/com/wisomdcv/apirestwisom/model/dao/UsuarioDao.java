package com.wisomdcv.apirestwisom.model.dao;

import com.wisomdcv.apirestwisom.model.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario, Integer> {
}
