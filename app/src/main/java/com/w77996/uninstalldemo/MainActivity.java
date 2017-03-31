package com.w77996.uninstalldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("uninstall");
    }
    UnInstallJni unInstallJni =new UnInstallJni();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String packageDir = "/data/data/" + getPackageName();
        int sdkVersion = android.os.Build.VERSION.SDK_INT;
        //unInstallJni.unInstall(packageDir, sdkVersion);
        Log.d("dd",UnInstallJni.getString());
    }
}
