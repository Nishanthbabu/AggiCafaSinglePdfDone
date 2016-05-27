package com.example.skilledanswers_d1.hospital;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import com.example.skilledanswers_d1.hospital.Models.CountModle;
import com.example.skilledanswers_d1.hospital.Models.Q1Model;
import com.example.skilledanswers_d1.hospital.Models.Q2Model;
import com.example.skilledanswers_d1.hospital.Models.Q3Model;
import com.example.skilledanswers_d1.hospital.Models.Q4Model;
import com.example.skilledanswers_d1.hospital.Models.Q5Model;
import com.example.skilledanswers_d1.hospital.Models.Q6Model;
import com.example.skilledanswers_d1.hospital.Models.Q7Model;

public class MainActivity extends AppCompatActivity {
    private Button button=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        if(!DBLite.doesDatabaseExist(this,"FeedBack.db"))
        {

            new android.support.v7.app.AlertDialog.Builder(this)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Warning.. plzzz read this.... or for assistance " +
                   "call the developer..  " +
                   "+91-9741987196")
                    .setMessage("Hi.. u are opening the app for first time... this time a new database will be " +
                            "created.. in ur device.. and a new file path named.. " +
                            " PEOPLE TREE ALL PDF and PEOPLE TREE FEEDBACK STATSTICS " +
                            "will be created... . " +
                            "so if u have already installed this app and got some feedback's... " +
                            "please do save those feedback's which are already generated in the folder..." +
                            "and delete those folder's..." +
                            "                                                          thank u")
                    .setPositiveButton("Got it..", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ///// singleton code which execute only once... !
                            DBLite dbLite = new DBLite(getApplicationContext());
                            dbLite.addCountDAtabase(new CountModle(0));
                            dbLite.addToQ1Database(new Q1Model(0, 0, 0, 0, 0));
                            dbLite.addToQ2Database(new Q2Model(0, 0, 0, 0, 0));
                            dbLite.addToQ3Database(new Q3Model(0, 0, 0, 0, 0));
                            dbLite.addToQ4Database(new Q4Model(0, 0, 0, 0, 0));
                            dbLite.addToQ5Database(new Q5Model(0, 0, 0, 0, 0));
                            dbLite.addToQ6Database(new Q6Model(0, 0, 0, 0, 0));
                            dbLite.addToQ7Database(new Q7Model(0, 0, 0, 0, 0, 0));
                            Toast.makeText(MainActivity.this, "NEW DATABASE CREATED... ", Toast.LENGTH_LONG).show();
                        }

                    })
                    .setNegativeButton("close app", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setCancelable(false)
                    .show();

        }
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.milkshake);

        button=(Button)findViewById(R.id.startgivingFeedbackButtonID);
        button.setAnimation(myAnim);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(myAnim);
                Intent intent=new Intent(MainActivity.this,Feedback.class);
                MainActivity.this.startActivity(intent);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
