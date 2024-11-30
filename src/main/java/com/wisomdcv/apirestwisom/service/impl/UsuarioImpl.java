package com.wisomdcv.apirestwisom.service.impl;

import com.wisomdcv.apirestwisom.model.dao.UsuarioDao;
import com.wisomdcv.apirestwisom.model.entity.Usuario;
import com.wisomdcv.apirestwisom.service.IUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioImpl implements IUsuario {

    @Autowired
    private UsuarioDao usuarioDao;

    @Transactional
    @Override
    public Usuario save(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Transactional(readOnly = true)
    @Override
    public Usuario findById(Integer id) {
        return usuarioDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Usuario usuario) {
        usuarioDao.delete(usuario);
    }
}
