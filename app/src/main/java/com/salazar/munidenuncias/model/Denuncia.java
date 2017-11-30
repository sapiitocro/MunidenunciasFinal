package com.salazar.munidenuncias.model;


public class Denuncia {

    private Integer idd;
    private String titulo;
    private String usuario;
    private String descripcion;

    private String foto;
    private String ubicacion;

    public Integer getIdd() {
        return idd;
    }

    public void setIdd(Integer idd) {
        this.idd = idd;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Denuncia{" +
                "idd=" + idd +
                ", titulo='" + titulo + '\'' +
                ", usuario='" + usuario + '\'' +
                ", descripcion='" + descripcion + '\'' +

                ", foto='" + foto + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
