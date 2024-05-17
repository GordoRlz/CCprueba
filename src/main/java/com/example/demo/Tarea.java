package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity // Esta anotación indica que esta clase es una entidad gestionada por JPA
public class Tarea {
    @Id // Esta anotación indica que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática del ID
    private Long id;
    private String titulo;
    private String descripcion;
    private String creadoPor;
    private String estado;
    private Date fecha;

    // Constructor por defecto
    public Tarea() {
    }

    // Constructor con todos los campos
    public Tarea(Long id, String titulo, String descripcion, String creadoPor, String estado, Date fecha) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creadoPor = creadoPor;
        this.estado = estado;
        this.fecha = fecha;
    }

    // Getters y setters (métodos de acceso)

    // Método toString para imprimir los detalles de la tarea
    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", creadoPor='" + creadoPor + '\'' +
                ", estado='" + estado + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
