package com.company;

/**
 * Created by Nife on 6/23/15.
 */
public class Clock {

    private int hour;
    private int minute;

    public Clock(){
        this(0,0);
    }

    public Clock(int h){
        this(h,0);
    }

    public Clock(int h, int m){
        setTime(h, m);
    }

    public void setTime(int h, int m){
        setHour(h);
        setMinute(m);
    }

    public void setHour(int h) {
        hour = (((0 < hour) && (hour <= 12)) ? h:0);
    }

    public void setMinute(int m) {
        minute = (((0 <= minute) && (minute <= 60)) ? m:0);
    }


    public int getHour() {
        return (hour);
    }

    public int getMinute() {
        return minute;
    }


    public void whatTimeIsIt() {
        if (hour == 0 || minute == 0){
            System.out.println("Fam, you enter Military time or something?");
        } else{
            System.out.println("The time is " + hour + ":" + minute);
        }
    }

}
