package com.fligyul.makan;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Homepage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_homepage);

        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryDark));

        }

        ImageButton Discover1=(ImageButton)findViewById(R.id.Discover);
        ImageButton Menu1=(ImageButton)findViewById(R.id.MenuButton);
        ImageButton Add1=(ImageButton)findViewById(R.id.Addbutton);
        ImageButton Coupon1=(ImageButton)findViewById(R.id.Coupon);
        ImageButton RandomEat1=(ImageButton)findViewById(R.id.RandomEat);
        ImageButton Map1=(ImageButton)findViewById(R.id.Map);

        Menu1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent int2= new Intent(Homepage.this,Menu.class);
                startActivity(int2);
            }

        });


        Discover1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent int1= new Intent(Homepage.this,Discover.class);
                startActivity(int1);
            }
        });

        Add1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent int3= new Intent(Homepage.this,Add.class);
                startActivity(int3);
            }

        });

        RandomEat1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent int4= new Intent(Homepage.this,RandomEat.class);
                startActivity(int4);
            }

        });

        Coupon1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent int5= new Intent(Homepage.this,Coupon.class);
                startActivity(int5);
            }

        });

        Map1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent int6= new Intent(Homepage.this,Map.class);
                startActivity(int6);
            }

        });










    }
}
