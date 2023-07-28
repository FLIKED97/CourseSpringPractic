package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private Music name;
    @Value("${musicPlayer.volume}")
    private Music volume;

    public Music getName() {
        return name;
    }

    public Music getVolume() {
        return volume;
    }
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("musicBean") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic()  {

       return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }

}
