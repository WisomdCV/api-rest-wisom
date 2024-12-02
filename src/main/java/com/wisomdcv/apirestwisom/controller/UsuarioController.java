package com.wisomdcv.apirestwisom.controller;

import com.wisomdcv.apirestwisom.model.entity.Usuario;
import com.wisomdcv.apirestwisom.service.IUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

    @Autowired
    private IUsuario usuarioService;

    @PostMapping("usuario")
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @PutMapping("usuario")
    public Usuario update(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @DeleteMapping("usuario/{id}")
    public void delete(@PathVariable Integer id){
        Usuario usuarioDelete = usuarioService.findById(id);
        usuarioService.delete(usuarioDelete);
    }

    @GetMapping("usuario/{id}")
    public Usuario showById(@PathVariable Integer id){
        return usuarioService.findById(id);
    }
}
