package com.spring.magic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component("darkWizard")
public class DarkWizard implements Magician {

    private String name;
    private int expierenceLevel;
    private String[] GoodWizardSpells = {"Crucio","Avada Kadabra", "Imperious Curse"};
    Wand darkWand;

    @Autowired
    public DarkWizard(@Qualifier("DarkLordsWand") Wand darkWand){
        this.darkWand = darkWand;
    }

    @Override
    public String getSpell() {
        Random rnd = new Random();
        int randNumb = rnd.nextInt(2);
        return  GoodWizardSpells[randNumb];
    }

    @Override
    public int expiericenceLevel() {
        return expierenceLevel;
    }

    @Override
    public Wand getWand() {
        return darkWand;
    }
}
