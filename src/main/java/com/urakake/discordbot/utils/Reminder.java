package com.urakake.discordbot.utils;

import java.util.Timer;
import java.util.TimerTask;

public class Reminder {
    Timer timer;
    public Reminder(int seconds){
        timer = new Timer();
        timer.schedule(new RemindTask(),seconds*1000);
    }
    class RemindTask extends TimerTask {
        public void run(){
            System.out.println("Wake up!");
            timer.cancel();
            new Reminder(15);
        }
    }
    public static void main(String args[]) {
        new Reminder(15);
        System.out.println("I'm Up.");
    }
}
