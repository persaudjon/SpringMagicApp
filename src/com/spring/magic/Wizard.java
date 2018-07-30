package com.spring.magic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component("goodWizard")
public class Wizard implements Magician {

    private String name;
    private int expierenceLevel;
    private String[] GoodWizardSpells = {"Wengardium Leviosa","Expecto Patronous", "Bombardo"};
    private Wand wizardWand;

    @Autowired
    public Wizard(@Qualifier("elderWand") Wand goodWand){
    wizardWand=goodWand;
    }

    //return random spell from array of spells
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
        return wizardWand;
    }
}
