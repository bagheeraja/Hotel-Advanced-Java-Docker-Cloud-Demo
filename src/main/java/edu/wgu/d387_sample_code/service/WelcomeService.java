package edu.wgu.d387_sample_code.service;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeService implements Runnable {

    private final Locale locale;

    // Default Constructor
    public WelcomeService() {
        this.locale = Locale.getDefault();
    }

    // Constructor
    public WelcomeService(Locale locale) {
        this.locale = locale;
    }

    public String getWelcomeMessage() {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
        return bundle.getString("welcome.message");
    }

    public void run() {
        System.out.println("Running thread: " + getWelcomeMessage() + ", ThreadID: " + Thread.currentThread().getId());
    }

}
