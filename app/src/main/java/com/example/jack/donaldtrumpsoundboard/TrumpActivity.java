package com.example.jack.donaldtrumpsoundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.Menu;
import android.widget.PopupMenu;

//???

public class TrumpActivity extends AppCompatActivity implements MediaPlayerCallback {


    @Override
    public void loadMedia(int mediaFileId) {

        stopPlaying();
        mp = MediaPlayer.create(TrumpActivity.this, mediaFileId);

        mp.start();

    }



    private Button button1;
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private MediaPlayer mp;
    private Menu menu;
    public MenuItem hillaryOp;




    //what is this doing?

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.hillaryclinton:
                Intent i = new Intent(this, HillaryActivity.class);
                startActivity(i);
               break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trump);


        button1 = (Button) findViewById(R.id.button1);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);



        button1.setOnClickListener(new MediaButtonOnClickListener(R.raw.fatuglyface, this));

        button.setOnClickListener(new MediaButtonOnClickListener(R.raw.worstpresident, this));


        button2.setOnClickListener(new MediaButtonOnClickListener(R.raw.smallloan, this));

        button3.setOnClickListener(new MediaButtonOnClickListener(R.raw.itsacatastrophe, this));

        button4.setOnClickListener(new MediaButtonOnClickListener(R.raw.truckdriver, this));

        button5.setOnClickListener(new MediaButtonOnClickListener(R.raw.verypessimistic, this));



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
        if (mp != null) {
        mp.pause();
    }}

    @Override
    protected void onPause() {
        super.onPause();
        if (mp != null) {
        mp.pause();
    }}

    @Override
    protected void onDestroy() {
            super.onDestroy();
        if (mp != null) {
        mp.pause();


    }}


}
