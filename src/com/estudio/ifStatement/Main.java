package com.estudio.ifStatement;

public class Main {
    public static void main(String[] args) {
        IfStatement ifStatement = new IfStatement();

       boolean checkBluetooth = ifStatement.checkBluetoothAvailable();
        System.out.println(checkBluetooth);
    }
}
