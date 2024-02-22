package Ejercicios.fp.dam.examen.ejercicio1;

import java.util.Objects;

public class Automovil implements Comparable<Automovil>{
    private String marca;
    private String modelo;
    private String matricula;
    private int añoFabricacion;
    private String motor;
    private int potencia;

    public Automovil(String marca, String modelo, String matricula, int añoFabricacion, String motor, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.añoFabricacion = añoFabricacion;
        this.motor = motor;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public int compareTo(Automovil o) {
        if (Objects.equals(o.getMarca(), marca)){
            return o.getModelo().compareTo(modelo);
        }else if(Objects.equals(o.getModelo(), modelo)){
            return o.getMotor().compareTo(motor);
        }else {
            return o.getMarca().compareTo(marca);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automovil automovil = (Automovil) o;
        return matricula.equals(((Automovil) o).getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, matricula, añoFabricacion, motor, potencia);
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", añoFabricacion=" + añoFabricacion +
                ", motor='" + motor + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
