import lejos.nxt.LCD;
import lejos.robotics.localization.OdometryPoseProvider;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.nxt.*;
import lejos.robotics.navigation.Move;
import lejos.robotics.navigation.Pose;

import javax.microedition.lcdui.Graphics;
import java.io.*;


public class ce205Assignment1 {
    public static void main(String[] args) {
        DifferentialPilot pilot = new DifferentialPilot(3.4f, 17.98f, Motor.A, Motor.C, false);
        OdometryPoseProvider opp = new OdometryPoseProvider(pilot);
        Pose pose;
        double pX;
        double pY;
        double len = 100;
        double ratio;
        ratio = 50 / len;
        double dX;
        double dY;


        FileOutputStream out = null;
        File data = new File("assignment1_data.csv");
        try {
            out = new FileOutputStream(data);
        } catch (IOException e) {
            System.exit(1);
        }
        DataOutputStream dataOut = new DataOutputStream(out);


        for (int i = 0; i <= 3; i++) {
            pilot.setTravelSpeed(75);
            pilot.travel(len, true);
            int x = 0;
            while (pilot.isMoving()) {
                pose = opp.getPose();
                pX = pose.getX();
                pY = pose.getY();

                if (x == 30) {
                    try {
                        dataOut.writeChars(pX + "," + pY + "\n");
                    } catch (IOException e) {
                        System.exit(1);
                    }
                    x = 0;
                }
                x++;

                dX = (pX * ratio + 10);
                dY = (pY * ratio + 10);
                LCD.setPixel((int) dX, (int) dY, 1);
                /*
                LCD.drawString("x:", 0, 0);
                LCD.drawString("y:", 9, 0);
                LCD.drawInt((int) pX, 3, 3, 0);
                LCD.drawInt((int) pY, 3, 12, 0);
                */
            }
            if (i < 3) pilot.rotate(90);
        }
        pilot.stop();
        try {
            out.close();
        } catch (IOException e) {
            System.exit(1);
        }
        Button.waitForAnyPress();
    }
}
