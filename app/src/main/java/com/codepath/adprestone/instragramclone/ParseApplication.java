package com.codepath.adprestone.instragramclone;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("PpaIGAUAhvx8iYQwxZ3yVf2n8MSp1v4kJgTOMOAS")
                .clientKey("t9UrT13Sc3ti02aTqAqx3BJtzCpPswmKouXU9XLl")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
