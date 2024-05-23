package org.example;

public class Libros {
    String nombre;
    String autor;
    int NumeroPaginas;
    int AnioPublicacion;
    String color;
    int tamanio;
    boolean tieneIlustraciones;
    String genero;
    boolean tieneEdicionEspecial;
    String idioma;
    String editorial;
    double precio;

    public Libros() {
    }

    public Libros(String nombre, String autor, int numeroPaginas, int anioPublicacion, String color, int tamanio, boolean tieneIlustraciones, String genero, boolean tieneEdicionEspecial, String idioma, String editorial, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.NumeroPaginas = numeroPaginas;
        this.AnioPublicacion = anioPublicacion;
        this.color = color;
        this.tamanio = tamanio;
        this.tieneIlustraciones = tieneIlustraciones;
        this.genero = genero;
        this.tieneEdicionEspecial = tieneEdicionEspecial;
        this.idioma = idioma;
        this.editorial = editorial;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return this.NumeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.NumeroPaginas = numeroPaginas;
    }

    public int getAnioPublicacion() {
        return this.AnioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.AnioPublicacion = anioPublicacion;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public boolean getTieneIlustraciones() {
        return this.tieneIlustraciones;
    }

    public void setTieneIlustraciones(boolean tieneIlustraciones) {
        this.tieneIlustraciones = tieneIlustraciones;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return this.idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean getTieneEdicionEspecial() {
        return this.tieneEdicionEspecial;
    }

    public void setTieneEdicionEspecial(boolean tieneEdicionEspecial) {
        this.tieneEdicionEspecial = tieneEdicionEspecial;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
