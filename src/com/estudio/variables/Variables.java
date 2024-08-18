package com.estudio.variables;

public class Variables {
    private byte edad = 25;
    private short salarioCorto = 32000;
    private int salario = 50000;
    private long numeroGrande = 123456789L;
    private float precio = 10.99f;
    private double valor = 12345.6789;
    private char letra = 'A';
    private boolean esVerdad = true;

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public short getSalarioCorto() {
        return salarioCorto;
    }

    public void setSalarioCorto(short salarioCorto) {
        this.salarioCorto = salarioCorto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public long getNumeroGrande() {
        return numeroGrande;
    }

    public void setNumeroGrande(long numeroGrande) {
        this.numeroGrande = numeroGrande;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public boolean isEsVerdad() {
        return esVerdad;
    }

    public void setEsVerdad(boolean esVerdad) {
        this.esVerdad = esVerdad;
    }

    @Override
    public String toString() {
        return "Variables{" +
                "edad=" + edad +
                ", salarioCorto=" + salarioCorto +
                ", salario=" + salario +
                ", numeroGrande=" + numeroGrande +
                ", precio=" + precio +
                ", valor=" + valor +
                ", letra=" + letra +
                ", esVerdad=" + esVerdad +
                '}';
    }
}
