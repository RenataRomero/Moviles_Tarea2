package com.iteso.tarea2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {

    Button btnM;
    Button btnAddCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayToastMsg(View v) {

        Toast toast = Toast.makeText(this, R.string.likeToast , Toast.LENGTH_SHORT);
        toast.show();

    }

    public void displaySnackBar(View v){

        btnAddCart = (Button)findViewById(R.id.btnAddCart);

       // Snackbar.make(this, getResources().getString(R.string.AddedCartTxt), Snackbar.LENGTH_LONG)
         //       .setAction("Undo", new View.OnClickListener() {
           //         @Override
             //       public void onClick(View view) {
               //         btnAddCart.setText(R.string.AddCartTxt);
                 //   }
                //}).show();
    }

    public void stayFocused(View v){

        btnM = (Button) findViewById(R.id.btnM);

        if (btnM.isPressed())
        {
            btnM.setFocusable(true);
        }


    }


}
