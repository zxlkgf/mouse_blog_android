package com.zxl.mouseblog.slideRootNvUtils.appCompatActivity;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.zxl.mouseblog.R;

public class MyAppCompatActivity extends AppCompatActivity {
    private static final String TAG = "MyAppCompatActivity";
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0,1,0,getString(R.string.mouse_info));
        menu.add(0,2,0,getString(R.string.mouse_help));
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case 1: {
                String info = getString(R.string.menu_info);
                showDialog(info);
                break;
            }
            case 2: {
                String help = getString(R.string.menu_help);
                showDialog(help);
                break;
            }
        }
        return true;
    }

    private void showDialog(String str) {
        new AlertDialog.Builder(this)
                .setMessage(str)
                .setPositiveButton(getString(R.string.OK),null)
                .show();
    }

    private void log(String str) {
        Log.d(TAG,str);
    }
}
