package com.spring.magic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        //Create Container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get bean
        Magician harry = context.getBean("goodWizard", Magician.class);

        //call methods
        System.out.println(harry.getSpell());

        //Constructor Injections via Annotations
        System.out.println("This Wizards wand is made of: " + harry.getWand().getAnimalFeather() + " and has a power level of " + harry.getWand().getPowerlvl());
    }
}
