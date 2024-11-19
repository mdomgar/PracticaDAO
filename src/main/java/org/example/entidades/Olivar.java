package org.example.entidades;

import java.util.List;

public class Olivar {
    private int id;
    private String ubicacion;
    private double hectareas;
    private double produccionAnual;
    private List<Integer> idCuadrillas;

    public Olivar(int id, String ubicacion, double hectareas, double produccionAnual, List<Integer> idCuadrillas) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.hectareas = hectareas;
        this.produccionAnual = produccionAnual;
        this.idCuadrillas = idCuadrillas;
    }

    public Olivar(String ubicacion, double hectareas, double produccionAnual) {
        this.ubicacion = ubicacion;
        this.hectareas = hectareas;
        this.produccionAnual = produccionAnual;
    }

    public Olivar(String ubicacion, double hectareas, double produccionAnual, List<Integer> idCuadrillas) {
        this.ubicacion = ubicacion;
        this.hectareas = hectareas;
        this.produccionAnual = produccionAnual;
        this.idCuadrillas = idCuadrillas;
    }

    public Olivar(int id, String ubicacion, double hectareas, double produccionAnual) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.hectareas = hectareas;
        this.produccionAnual = produccionAnual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getHectareas() {
        return hectareas;
    }

    public void setHectareas(double hectareas) {
        this.hectareas = hectareas;
    }

    public double getProduccionAnual() {
        return produccionAnual;
    }

    public void setProduccionAnual(double produccionAnual) {
        this.produccionAnual = produccionAnual;
    }

    public List<Integer> getIdCuadrillas() {
        return idCuadrillas;
    }

    public void setIdCuadrillas(List<Integer> idCuadrillas) {
        this.idCuadrillas = idCuadrillas;
    }

    @Override
    public String toString() {
        return "Olivar{" +
                "id=" + id +
                ", ubicacion='" + ubicacion + '\'' +
                ", hectareas=" + hectareas +
                ", produccionAnual=" + produccionAnual +
                ", idCuadrillas=" + idCuadrillas +
                '}';
    }
}
