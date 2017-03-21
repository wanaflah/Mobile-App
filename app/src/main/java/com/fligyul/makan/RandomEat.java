package com.fligyul.makan;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class RandomEat extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_random_eat);


        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryDark));

        }

        ImageButton Add1=(ImageButton)findViewById(R.id.Addbutton);
        ImageButton Menu1=(ImageButton)findViewById(R.id.MenuButton);

        Add1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent int3= new Intent(RandomEat.this,Add.class);
                startActivity(int3);
            }

        });


        Menu1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent int2= new Intent(RandomEat.this,Menu.class);
                startActivity(int2);
            }

        });
    }


}
