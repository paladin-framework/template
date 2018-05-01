package com.example.myproject;

import fr.litarvan.paladin.Paladin;
import fr.litarvan.paladin.PaladinBuilder;

public class Main
{
    public static void main(String[] args)
    {
        Paladin paladin = PaladinBuilder.create(MyProject.class)
                .setConfigFolder("config/")
                .setRoutesFile("/routes.groovy")
                .build();

        paladin.start();
    }
}
