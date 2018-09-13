package com.iteso.tarea2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayToastMsg(View v) {

        Toast toast = Toast.makeText(this, R.string.likeToast , Toast.LENGTH_SHORT);
        toast.show();

    }
}
