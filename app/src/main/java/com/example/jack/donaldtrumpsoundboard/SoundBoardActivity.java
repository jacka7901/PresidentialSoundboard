package com.example.jack.donaldtrumpsoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
// FIX: if multiple buttons are pressed make the first one stop

public class SoundBoardActivity extends AppCompatActivity {

    private Button button1;
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private MediaPlayer mp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_board);


        button1 = (Button) findViewById(R.id.button1);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);


//what is the differnce between view. and button1.?



        View.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(SoundBoardActivity.this, R.raw.fatuglyface);

                mp.start();

            }
        };

        button1.setOnClickListener(Listener);




        View.OnClickListener Listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               stopPlaying();
                mp = MediaPlayer.create(SoundBoardActivity.this, R.raw.worstpresident);

                mp.start();





            }
        };

        button.setOnClickListener(Listener1);




        View.OnClickListener Listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               stopPlaying();
                 mp = MediaPlayer.create(SoundBoardActivity.this, R.raw.hatedterrorists);

                mp.start();

            }
        };

        button2.setOnClickListener(Listener2);




        View.OnClickListener Listener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               stopPlaying();
                 mp = MediaPlayer.create(SoundBoardActivity.this, R.raw.itsacatastrophe);
                mp.start();


            }
        };

        button3.setOnClickListener(Listener3);



        View.OnClickListener Listener4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               stopPlaying();
                mp = MediaPlayer.create(SoundBoardActivity.this, R.raw.truckdriver);

                mp.start();




            }
        };

        button4.setOnClickListener(Listener4);



        View.OnClickListener Listener5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               stopPlaying();
                mp = MediaPlayer.create(SoundBoardActivity.this, R.raw.verypessimistic);

                mp.start();


            }
        };

        button5.setOnClickListener(Listener5);


            }
    private void stopPlaying() {
        if (mp != null) {
            mp.reset();
            mp.release();
            mp = null;


        }


    }



    @Override
    protected void onStop() {
        super.onStop();
        mp.pause();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mp.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mp.pause();
    }
}
