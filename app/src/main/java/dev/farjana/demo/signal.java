package dev.farjana.demo;

import android.app.Application;

import com.onesignal.OneSignal;

public class signal extends Application {

    private static final String ONESIGNAL_APP_ID = "e92c66f4-71b5-4e8d-9b38-b28eb43d560a";

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}
