package com.znat;

import java.util.List;

import com.znat.dao.PeliculaDAO;
import com.znat.model.Pelicula;

public class App {
    
    public static void main(String[] args) {
        PeliculaDAO peliculaDAO=new PeliculaDAO();
        List<Pelicula> listPeli=peliculaDAO.listar();
        
        for (Pelicula pelicula : listPeli) {
            System.out.println(pelicula.getTitulo());
        }
    }
}
