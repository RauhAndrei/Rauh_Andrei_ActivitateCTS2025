package ro.cts.main;

import ro.cts.clase.MotorAudio;

public class Main {
    public static void main(String[] args) {
        MotorAudio motorAudio = MotorAudio.getInstance(95, true, false);
        System.out.println(motorAudio);

        MotorAudio motorAudio2 = MotorAudio.getInstance(25, false, true);
        System.out.println(motorAudio);
        System.out.println(motorAudio2);

        motorAudio2.setVolume(1);


        System.out.println(motorAudio);
        System.out.println(motorAudio2);

    }
}