package com.estudio.variables;

public class Main {
    public static void main(String[] args) {
        Variables vars = new Variables();
        Nombres nombres = new Nombres();

        System.out.println(vars);
        vars.setEdad((byte) 45);
        vars.setSalarioCorto((short) 5000);
        vars.setSalario(1500);
        vars.setNumeroGrande(465683215L);
        vars.setPrecio(1835.25f);
        vars.setPrecio(46545.454f);
        vars.setValor(546878785454.87955);
        vars.setLetra('L');
        vars.setEsVerdad(false);

        System.out.println(vars);

        nombres.mensajes();
    }
}
