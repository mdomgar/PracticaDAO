package org.example.entidades;

import java.util.List;

public class Cuadrilla {
    private int id;
    private String nombre;
    private int supervisor_id;
    private List<Integer> idOlivares;
    private List<Integer> idTrabajadores;

    public Cuadrilla(int id, String nombre, int supervisor_id, List<Integer> idOlivares, List<Integer> idTrabajadores) {
        this.id = id;
        this.nombre = nombre;
        this.supervisor_id = supervisor_id;
        this.idOlivares = idOlivares;
        this.idTrabajadores = idTrabajadores;
    }

    public Cuadrilla(int id, String nombre, int supervisor_id) {
        this.id = id;
        this.nombre = nombre;
        this.supervisor_id = supervisor_id;
    }

    public Cuadrilla(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Cuadrilla(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSupervisor_id() {
        return supervisor_id;
    }

    public void setSupervisor_id(int supervisor_id) {
        this.supervisor_id = supervisor_id;
    }

    public List<Integer> getIdOlivares() {
        return idOlivares;
    }

    public void setIdOlivares(List<Integer> idOlivares) {
        this.idOlivares = idOlivares;
    }

    public List<Integer> getIdTrabajadores() {
        return idTrabajadores;
    }

    public void setIdTrabajadores(List<Integer> idTrabajadores) {
        this.idTrabajadores = idTrabajadores;
    }

    @Override
    public String toString() {
        return "Cuadrilla{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", supervisor_id=" + supervisor_id +
                ", idOlivares=" + idOlivares +
                ", idTrabajadores=" + idTrabajadores +
                '}';
    }
}
