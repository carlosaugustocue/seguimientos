package com.estudio.ifStatement;
import java.util.Random;

public class IfStatement {
    boolean isBluetoothAvailable = false;
    Random random = new Random();

    public boolean checkBluetoothAvailable() {

        isBluetoothAvailable = random.nextBoolean();

        if (isBluetoothAvailable){
            return true;
        }else {
            return false;
        }
    }
}
