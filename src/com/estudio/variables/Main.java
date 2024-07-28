package com.estudio.variables;

public class Main {
    public static void main(String[] args) {
        Variables vars = new Variables();

        System.out.println(vars);
        vars.setEdad((byte) 45);
        vars.setPrecio(1835.25f);
        vars.setEsVerdad(false);
        System.out.println(vars.getEdad());
        System.out.println(vars.toString());
    }
}
