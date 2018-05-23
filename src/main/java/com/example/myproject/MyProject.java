package com.example.myproject;

import fr.litarvan.paladin.OnStart;
import fr.litarvan.paladin.OnStop;
import fr.litarvan.paladin.PaladinApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PaladinApp(name = "MyProject", version = MyProject.VERSION, author = "Me <me@me.me>")
public class MyProject
{
    private static final Logger log = LoggerFactory.getLogger("MyProject");
    public static final String VERSION = "1.0.0";

    @OnStart
    public void onStart()
    {
        log.info("Starting MyProject v{}...", VERSION);
    }

    @OnStop
    public void onStop()
    {
        log.info("Stopping !");
    }
}
