package com.wisomdcv.apirestwisom.service;

import com.wisomdcv.apirestwisom.model.entity.Usuario;

public interface IUsuario {

    //Datos Cliente
    Usuario save(Usuario usuario);
    //FindByID
    Usuario findById(Integer id);

    void delete (Usuario usuario);
}
