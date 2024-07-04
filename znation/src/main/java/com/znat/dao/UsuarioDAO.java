package com.znat.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.znat.db.ConnectorDB;
import com.znat.model.Usuario;

public class UsuarioDAO {

    public List<Usuario> listar() {
        try {
            
            Statement st=ConnectorDB.getSt();
            ResultSet rs=st.executeQuery("Select * from usuarios");
            
            // recorro todas las peliculas
            // creo un objeto Pelicula x cada peli o fila
            List<Usuario> listUsu=new ArrayList<Usuario>();
            while (rs.next()) {
                // orm: mapeo relacional objeto, lo hacen framework hibernate, jpa
                Usuario usu=new Usuario(rs.getInt("id"), rs.getString("usu"), rs.getString("pass"));
                listUsu.add(usu);
            }         
            
            return listUsu;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
        
    }
    
}
