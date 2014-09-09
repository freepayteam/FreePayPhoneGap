package com.freepay.barcode;

//import android.support.v7.app.ActionBarActivity;
/*import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;*/

import org.apache.cordova.DroidGap;
import android.os.Bundle;
 
public class MainActivity extends DroidGap {
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         super.loadUrl("file:///android_asset/www/index.html");
    }
}
