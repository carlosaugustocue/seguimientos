package com.estudio.switchStatement;

public class SwitchStatement {

    String colorModeSelected = "light";
    String resultado;

     public String colorSelected(){

         switch (colorModeSelected.toLowerCase()){
             case "dark":
                 resultado = "Modo Dark seleccionado";
                 break;
             case "light":
                 resultado = "Modo Light seleccionado";
                 break;
             default:
                 resultado = "Modo no reconocido";
                 break;
         }
         return resultado;
     }
}
