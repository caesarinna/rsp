package com.example.rsp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    TextView tvRes;
    ImageView ivMe, ivPhone;
    Button bRock, bScisssors, bPaper;
    int me, phone;
    int[] picID={R.drawable.rock, R.drawable.sc, R.drawable.paper};
    String[] res={"ROCK","SCISSORS", "PAPER"};
    String win;
    int yourScore = 0, phoneScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRes = (TextView)findViewById(R.id.tvRes);
        ivMe = (ImageView)findViewById(R.id.ivMe);
        ivPhone = (ImageView)findViewById(R.id.ivPhone);
        bPaper = (Button)findViewById(R.id.bPaper);
        bRock = (Button)findViewById(R.id.bRock);
        bScisssors = (Button)findViewById(R.id.bScissors);

    }
        public void goOut(View view) {
            finish();
        }

        public void play(View view) {
            if (view==bRock)
                me=0;
            if (view==bScisssors)
                me=1;
            if (view==bPaper)
                me=2;


            ivMe.setImageResource(picID[me]);
            setImg(ivMe);
            phone=(int)((3)*Math.random());
            ivPhone.setImageResource(picID[phone]);
            setImg(ivPhone);

            if (me==0 && phone==2) {
                win = "Phone wins!";
                phoneScore ++;
            }
            if (me==0 && phone==1) {
                win = "You win!";
                yourScore ++;
            }
            if (me==0 && phone==0) {
                win = "Nobody!";
            }
            if (me==1 && phone==1) {
                win = "Nobody!";
            }
            if (me==1 && phone==0) {
                win = "Phone wins!";
                phoneScore ++;
            }
            if (me==1 && phone==2) {
                win = "You win!";
                yourScore ++;
            }
            if (me==2 && phone==1) {
                win = "Phone wins!";
                phoneScore ++;
            }
            if (me==2 && phone==0) {
                win = "You win!";
                yourScore ++;
            }
            if (me==2 && phone==2) {
                win = "Nobody!";
            }
            tvRes.setText(res[me]+" VS "+res[phone]+"\n"+ win+"\n"+"Your score is:"+yourScore+"\n"+"Phone score is:" + phoneScore);

        }

        public void setImg(View v)
        {
            v.setVisibility(v.VISIBLE);
        }
    }
