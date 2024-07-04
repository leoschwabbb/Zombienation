package com.znat;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.znat.dao.UsuarioDAO;
import com.znat.model.Usuario;

@RestController
public class UsuarioController {
    
    @CrossOrigin(origins = "*")
    @GetMapping("/listarUsuarios")
    public List<Usuario> listarUsuarios() {
        UsuarioDAO usuarioDAO=new UsuarioDAO();
        return usuarioDAO.listar();
    }
}
