package com.znat;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.znat.dao.PeliculaDAO;
import com.znat.model.Pelicula;

@RestController
public class PeliculaController {

    @CrossOrigin(origins = "*")
    @GetMapping("/listarPeliculas")
    public List<Pelicula> listarPeliculas() {
        PeliculaDAO peliculaDAO=new PeliculaDAO();
        return peliculaDAO.listar();
    }
    

    @CrossOrigin(origins = "*")
    @GetMapping("/buscarPelis/{titulo}")
    public List<Pelicula> buscarPelis(@PathVariable("titulo") String titulo) {
        PeliculaDAO peliculaDAO=new PeliculaDAO();
        return peliculaDAO.buscar(titulo);
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping("/addPelicula")
    public void addPelicula(@RequestBody String titulo,  String puntuacion, String portada) {
        Pelicula peli=new Pelicula(titulo, Double.valueOf(puntuacion), portada);

        PeliculaDAO peliculaDAO=new PeliculaDAO();
        peliculaDAO.add(peli);

    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/delPelicula/{id}")
    public void delPelicula(@PathVariable("id") Integer id) {
        Pelicula peli=new Pelicula(id);

        PeliculaDAO peliculaDAO=new PeliculaDAO();
        peliculaDAO.del(peli);

    }
}
