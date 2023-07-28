package org.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class RockMusic implements Music {
    String[] mameMusic = new String[3];

    public RockMusic() {
        mameMusic[0] = "роооооок";
        mameMusic[1] = "роооооок1";
        mameMusic[2] = "роооооок2";
    }

    @Override
    public String getSong() {
        double a = Math.random()*3;
        return mameMusic[(int) a];
    }
}
