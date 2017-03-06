package kidinov.org.test;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import timber.log.Timber;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Timber.d("onCreate - %s", this.hashCode());
    }

}