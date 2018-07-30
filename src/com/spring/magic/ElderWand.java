package com.spring.magic;

import org.springframework.stereotype.Component;

@Component("elderWand")
public class ElderWand implements Wand {
    @Override
    public int getPowerlvl() {
        return 100;
    }

    @Override
    public String getAnimalFeather() {
        return "Thestral tail-hair core";
    }
}
