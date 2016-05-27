package com.example.skilledanswers_d1.hospital;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class GetFeedback extends AppCompatActivity {
    private RadioGroup radioGroup1=null;
    private RadioGroup radioGroup2=null;
    private RadioGroup radioGroup3=null;
    private RadioGroup radioGroup4=null;
    private RadioGroup radioGroup5=null;
    private RadioGroup radioGroup6=null;
    private RadioGroup radioGroup7=null;
    private EditText  editText=null;
    private Button submitbutton=null;
    private Button cancleButton=null;
    private boolean grp1clicked=false;
    private boolean grp2clicked=false;
    private boolean grp3clicked=false;
    private boolean grp4clicked=false;
    private boolean grp5clicked=false;
    private boolean grp6clicked=false;
    private boolean grp7clicked=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_get_feedback);
        radioGroup1=(RadioGroup)findViewById(R.id.radiogroup1);
        radioGroup2=(RadioGroup)findViewById(R.id.radiogroup2);
        radioGroup3=(RadioGroup)findViewById(R.id.radiogroup3);
        radioGroup4=(RadioGroup)findViewById(R.id.radiogroup4);
        radioGroup5=(RadioGroup)findViewById(R.id.radiogroup5);
        radioGroup6=(RadioGroup)findViewById(R.id.radiogroup6);
        radioGroup7=(RadioGroup)findViewById(R.id.radiogroup7);
        /////////
        editText=(EditText)findViewById(R.id.extracommentID);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.milkshake);
        submitbutton=(Button)findViewById(R.id.buttonsubmitFeedbackID);
        cancleButton=(Button)findViewById(R.id.button2);
        submitbutton.setAnimation(myAnim);
        cancleButton.setAnimation(myAnim);
        final Intent intent=new Intent();
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                grp1clicked=true;
                    switch ((checkedId))
                    {
                        case R.id.q1RadioalwaysID: intent.putExtra("Q1","always");
                            break;
                        case R.id.q1RadiousualyID: intent.putExtra("Q1","usualy");
                            break;
                        case R.id.q1RadiosometimesID: intent.putExtra("Q1","sometimes");
                            break;
                        case R.id.q1RadioneverID: intent.putExtra("Q1","never");
                    }
            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                grp2clicked=true;
                switch ((checkedId))
                {
                    case R.id.q2RadioalwaysID: intent.putExtra("Q2","always");
                        break;
                    case R.id.q2RadiousualyID: intent.putExtra("Q2","usualy");
                        break;
                    case R.id.q2RadiosometimesID: intent.putExtra("Q2","sometimes");
                        break;
                    case R.id.q2RadioneverID: intent.putExtra("Q2","never");
                }
            }
        });
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                grp3clicked=true;
                switch ((checkedId))
                {
                    case R.id.q3RadioalwaysID: intent.putExtra("Q3","always");
                        break;
                    case R.id.q3RadiousualyID: intent.putExtra("Q3","usualy");
                        break;
                    case R.id.q3RadiosometimesID: intent.putExtra("Q3","sometimes");
                        break;
                    case R.id.q3RadioneverID: intent.putExtra("Q3","never");
                }
            }
        });
        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                grp4clicked=true;
                switch ((checkedId))
                {
                    case R.id.q4RadioalwaysID: intent.putExtra("Q4","always");
                        break;
                    case R.id.q4RadiousualyID: intent.putExtra("Q4","usualy");
                        break;
                    case R.id.q4RadiosometimesID: intent.putExtra("Q4","sometimes");
                        break;
                    case R.id.q4RadioneverID: intent.putExtra("Q4","never");
                }
            }
        });
        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                grp5clicked=true;
                switch ((checkedId))
                {
                    case R.id.q5RadioalwaysID: intent.putExtra("Q5","always");
                        break;
                    case R.id.q5RadiousualyID: intent.putExtra("Q5","usualy");
                        break;
                    case R.id.q5RadiosometimesID: intent.putExtra("Q5","sometimes");
                        break;
                    case R.id.q5RadioneverID: intent.putExtra("Q5","never");
                }
            }
        });
        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                grp6clicked=true;
                switch ((checkedId))
                {
                    case R.id.q6RadioalwaysID: intent.putExtra("Q6","always");
                        break;
                    case R.id.q6RadiousualyID: intent.putExtra("Q6","usualy");
                        break;
                    case R.id.q6RadiosometimesID: intent.putExtra("Q6","sometimes");
                        break;
                    case R.id.q6RadioneverID: intent.putExtra("Q6","never");
                }
            }
        });
        radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                grp7clicked=true;
                switch (checkedId)
                {
                    case R.id.excellentID: intent.putExtra("Q7","Excellent");
                        break;
                    case R.id.verygoodID: intent.putExtra("Q7","Very Good");
                        break;
                    case R.id.goodID: intent.putExtra("Q7","Good");
                        break;
                    case R.id.averageID: intent.putExtra("Q7","Average");
                        break;
                    case R.id.poorID: intent.putExtra("Q7","Poor");
                }
            }
        });
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(myAnim);
                if (grp1clicked && grp2clicked && grp3clicked && grp4clicked && grp5clicked && grp6clicked && grp7clicked) {
                    if (!editText.getText().toString().equals("")) {
                        intent.putExtra("COMMENT", editText.getText().toString());
                    } else {
                        intent.putExtra("COMMENT", "NO COMMENT GIVEN.... .");
                    }
                    setResult(1, intent);
                    finish();
                } else {
                    Toast.makeText(GetFeedback.this, "Please answer all the questions", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cancleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(myAnim);
                new AlertDialog.Builder(GetFeedback.this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Alert..!")
                        .setMessage("Are you sure you want to cancle this feedback..?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finishAffinity();
                            }

                        })
                        .setNegativeButton("No", null)
                        .setCancelable(false)
                        .show();
            }
        });

    }

    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Alert..!")
                .setMessage("Are you sure you want to cancle this feedback..?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                    }

                })
                .setNegativeButton("No", null)
                .setCancelable(false)
                .show();


    }
}
