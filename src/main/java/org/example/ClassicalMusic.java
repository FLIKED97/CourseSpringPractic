package org.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component("musicBean")
public class ClassicalMusic implements Music {
    String[] mameMusic = new String[3];

    public ClassicalMusic() {
        mameMusic[0] = "Шакспір";
        mameMusic[1] = "Шакспір1";
        mameMusic[2] = "Шакспір2";
    }

    @Override
    public String getSong() {
        double a = Math.random()*3;
        return mameMusic[(int) a];
    }
//    @Override
//    public String getSong() {
//        return "Шакспір";
//    }
}
