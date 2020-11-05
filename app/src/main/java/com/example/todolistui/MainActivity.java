package com.example.todolistui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titlex , subtitlex , titleitemone , subtitleitemone ,
            titleitemtwo , subtitleitemtwo , titleitemthree , subtitleitemthree,
            titlexx, subtitlexx;

    Button btncls, btnplus;

    LinearLayout itemonex , itemtwox, itemthreex;

    ImageView icTask;

    Animation bts , stb ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bts = AnimationUtils.loadAnimation(this,R.anim.bts);
        stb = AnimationUtils.loadAnimation(this,R.anim.stb);


        titlex = findViewById(R.id.titlex);
        subtitlex = findViewById(R.id.subtitlex);
        titleitemone = findViewById(R.id.titleitemone);
        subtitleitemone = findViewById(R.id.subtitleitemone);
        titleitemtwo = findViewById(R.id.titleitemtwo);
        subtitleitemtwo = findViewById(R.id.subtitleitemtwo);
        titleitemthree = findViewById(R.id.titleitemthree);
        subtitleitemthree = findViewById(R.id.subtitleitemthree);
        titlexx = findViewById(R.id.titlexx);
        subtitlexx = findViewById(R.id.subtitlexx);

        btncls = findViewById(R.id.btncls);
        btnplus = findViewById(R.id.btnplus);

        itemonex = findViewById(R.id.itemonex);
        itemtwox = findViewById(R.id.itemtwox);
        itemthreex = findViewById(R.id.itemthreex);

        icTask = findViewById(R.id.icontask);

        icTask.startAnimation(stb);


        //setting linear layout animate

        itemonex.setAlpha(0);
        itemonex.setTranslationY(400);

        itemtwox.setAlpha(0);
        itemtwox.setTranslationY(400);

        itemthreex.setAlpha(0);
        itemthreex.setTranslationY(400);


        //setting btn animate

        btncls.setAlpha(0);
        btncls.setTranslationY(400);

        //setting textview animate

        titlex.setAlpha(0);
        titlex.setTranslationY(100);

        subtitlex.setAlpha(0);
        subtitlex.setTranslationY(100);


        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btncls.animate().alpha(1).translationY(0).setDuration(600).setStartDelay(1000).start();
                btnplus.animate().alpha(0).translationY(400).setDuration(600).start();

                titlex.animate().alpha(1).translationY(0).setDuration(600).setStartDelay(300).start();
                subtitlex.animate().alpha(1).translationY(0).setDuration(600).setStartDelay(300).start();

                itemonex.animate().alpha(1).translationY(0).setDuration(600).setStartDelay(500).start();
                itemtwox.animate().alpha(1).translationY(0).setDuration(600).setStartDelay(700).start();
                itemthreex.animate().alpha(1).translationY(0).setDuration(600).setStartDelay(900).start();

                titlexx.animate().alpha(0).translationY(400).setDuration(600).start();
                subtitlexx.animate().alpha(0).translationY(400).setDuration(600).start();

                icTask.startAnimation(bts);
                icTask.setVisibility(View.GONE);

            }
        });

        btncls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                icTask.setVisibility(View.VISIBLE);
                icTask.startAnimation(bts);

                btnplus.animate().alpha(1).translationY(0).setDuration(600).setStartDelay(1000).start();
                btncls.animate().alpha(0).translationY(400).setDuration(200).start();

                titlex.animate().alpha(0).translationY(400).setDuration(600).setStartDelay(400).start();
                subtitlex.animate().alpha(0).translationY(400).setDuration(600).setStartDelay(400).start();

                titlexx.animate().alpha(1).translationY(0).setDuration(600).start();
                subtitlexx.animate().alpha(1).translationY(0).setDuration(600).start();

                itemonex.animate().alpha(0).translationY(400).setDuration(400).start();
                itemtwox.animate().alpha(0).translationY(400).setDuration(400).start();
                itemthreex.animate().alpha(0).translationY(400).setDuration(400).start();

            }
        });

        Typeface mlight = Typeface.createFromAsset(getAssets(),"fonts/MLight.ttf");
        Typeface mreg = Typeface.createFromAsset(getAssets(),"fonts/MRegular.ttf");

        titlex.setTypeface(mreg);
        subtitlex.setTypeface(mlight);




    }
}

