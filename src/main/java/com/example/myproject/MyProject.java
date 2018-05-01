package com.example.myproject;

import fr.litarvan.paladin.App;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyProject extends App
{
    private static final Logger log = LoggerFactory.getLogger("MyProject");
    public static final String VERSION = "1.0.0";

    @Override
    public void onStart()
    {
        log.info("Starting {} v{}...", getName(), getVersion());
    }

    @Override
    public void onStop()
    {
        log.info("Stopping !");
    }

    @Override
    public String getName()
    {
        return "MyProject";
    }

    @Override
    public String getVersion()
    {
        return VERSION;
    }
}
