package kidinov.org.test;

import android.app.Application;

import timber.log.Timber;

/**
 * Qardio
 * Created by Andrey Kidinov on 06/03/2017
 * Copyright (c) 2017 Qardio, Inc. All rights reserved.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());
    }
}
