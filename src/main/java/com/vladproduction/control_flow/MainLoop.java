package com.vladproduction.control_flow;

import java.util.Scanner;

public class MainLoop {
    public static void main(String[] args) {
        //while loop
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat){
            System.out.println("Playing current song");
            System.out.println("In order to stop print 'yes'");
            String scannerInput = input.next();
            if("yes".equals(scannerInput)){
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
    }
}
