package ece.capstoneprojectpet;

import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import android.os.Handler;

/**
 * Created by Jonathan on 3/29/2016.
 */
public class Stats {

    int hunger;
    int happy;
    int intel;

    // default constructor
    public Stats() {
        // get int from text file
        hunger = 5;
        happy = 5;
        intel = 5;
    }

    // set constructor stats
    public Stats(int a, int b, int c) {
        hunger = a;
        happy = b;
        intel = c;
    }

    public void addHunger() {
        hunger++;
    }
    public void subHunger() {
        hunger--;
    }
    public void addHappy() {
        happy++;
    }
    public void subHappy() {
        happy--;
    }
    public void addIntel() {
        intel++;
    }
    public void subIntel() {
        intel--;
    }


    public int getHunger() {
        return hunger;
    }
    public int getHappy() {
        return happy;
    }
    public int getIntel() {
        return intel;
    }


}
