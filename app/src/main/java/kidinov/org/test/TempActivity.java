package kidinov.org.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Qardio
 * Created by Andrey Kidinov on 06/03/2017
 * Copyright (c) 2017 Qardio, Inc. All rights reserved.
 */
public class TempActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

}
