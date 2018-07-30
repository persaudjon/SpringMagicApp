package com.spring.magic;

import org.springframework.stereotype.Component;

@Component("DarkLordsWand")
public class DarkLordsWand implements Wand {
    @Override
    public int getPowerlvl() {
        return 80;
    }

    @Override
    public String getAnimalFeather() {
        return "Yew, phoenix feather core";
    }
}
