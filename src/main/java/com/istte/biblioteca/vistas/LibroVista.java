/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istte.biblioteca.vistas;


import com.istte.biblioteca.controlador.ILibroControlador;
import com.istte.biblioteca.controlador.impl.LibroControladorImpl;
import com.istte.biblioteca.modelo.entidad.Libro;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jaime
 */
@ManagedBean (name= "librocore")
@ViewScoped
public class LibroVista implements Serializable{
    
    private int idLibros;
    private String isbnLibro;
    private String categoriaLibro;
    private String tituloLibro;
    private String autorLibro;
    private String editorialLibro;
    private String temaLibro;
    private String cantidadLibro;
    private String perchaLibro;
    private String estadoLibro;
    private String responsableLibro;
    private ILibroControlador libroControlador;
    private Libro nuevoLibros;

    public LibroVista() {
    }

    public void insertarLibros(){
    nuevoLibros = new Libro();
    nuevoLibros.setIdLibro(idLibros);
    nuevoLibros.setIsbnLibro(isbnLibro);
    nuevoLibros.setCategoriaLibro(categoriaLibro);
    nuevoLibros.setTituloLibro(tituloLibro);
    nuevoLibros.setAutorLibro(autorLibro);
    nuevoLibros.setEditorialLibro(editorialLibro);
    nuevoLibros.setTemaLibro(temaLibro);
    nuevoLibros.setCantidadLibro(cantidadLibro);
    nuevoLibros.setPerchaLibro(perchaLibro);
    nuevoLibros.setEstadoLibro(estadoLibro);
    nuevoLibros.setResponsableLibro(responsableLibro);
      
   libroControlador = new LibroControladorImpl();
   libroControlador.createLibro(nuevoLibros);
  
    
    
    }
        
    public int getIdLibros() {
        return idLibros;
    }

    public void setIdLibros(int idLibros) {
        this.idLibros = idLibros;
    }

    public String getIsbnLibro() {
        return isbnLibro;
    }

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    public String getCategoriaLibro() {
        return categoriaLibro;
    }

    public void setCategoriaLibro(String categoriaLibro) {
        this.categoriaLibro = categoriaLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public String getEditorialLibro() {
        return editorialLibro;
    }

    public void setEditorialLibro(String editorialLibro) {
        this.editorialLibro = editorialLibro;
    }

    public String getTemaLibro() {
        return temaLibro;
    }

    public void setTemaLibro(String temaLibro) {
        this.temaLibro = temaLibro;
    }

    public String getCantidadLibro() {
        return cantidadLibro;
    }

    public void setCantidadLibro(String cantidadLibro) {
        this.cantidadLibro = cantidadLibro;
    }

    public String getPerchaLibro() {
        return perchaLibro;
    }

    public void setPerchaLibro(String perchaLibro) {
        this.perchaLibro = perchaLibro;
    }

    public String getEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(String estadoLibro) {
        this.estadoLibro = estadoLibro;
    }

    public String getResponsableLibro() {
        return responsableLibro;
    }

    public void setResponsableLibro(String responsableLibro) {
        this.responsableLibro = responsableLibro;
    }

    public ILibroControlador getLibroControlador() {
        return libroControlador;
    }

    public void setLibroControlador(ILibroControlador libroControlador) {
        this.libroControlador = libroControlador;
    }

    public Libro getNuevoLibros() {
        return nuevoLibros;
    }

    public void setNuevoLibros(Libro nuevoLibros) {
        this.nuevoLibros = nuevoLibros;
    }

   
    
    
}
