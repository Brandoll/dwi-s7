package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Produtos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "Cantidad", nullable = false, unique = true)
    private String Cantidad;

    public Productos() {}

    public Productos(String nombre, String Cantidad) {
        this.nombre = nombre;
        this.Cantidad = Cantidad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String setCantidad() {return Cantidad;}

    public void setCantidad(String Cantidad) {this.Cantidad = Cantidad;}



}
