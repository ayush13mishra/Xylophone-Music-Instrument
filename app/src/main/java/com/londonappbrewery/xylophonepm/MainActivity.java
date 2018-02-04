package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;
    private SoundPool msoundpool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool

         msoundpool= new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        // TODO: Load and get the IDs to identify the sounds
        mCSoundId = msoundpool.load(getApplicationContext(), R.raw.note1_c, 1);
        mDSoundId = msoundpool.load(getApplicationContext(), R.raw.note2_d, 1);
        mESoundId = msoundpool.load(getApplicationContext(), R.raw.note3_e, 1);
        mFSoundId = msoundpool.load(getApplicationContext(), R.raw.note4_f, 1);
        mGSoundId = msoundpool.load(getApplicationContext(), R.raw.note5_g, 1);
        mASoundId = msoundpool.load(getApplicationContext(), R.raw.note6_a, 1);         //use soundpool feature for short duraton sounds
        mBSoundId = msoundpool.load(getApplicationContext(), R.raw.note7_b, 1);


    }


        // TODO: Add the play methods triggered by the buttons

    public void play1(View v) {
        msoundpool.play(mCSoundId,1.0f,1.0f,0,0,1.0f);
    }

    public void play2(View v) {
        msoundpool.play(mDSoundId,1.0f,1.0f,0,0,1.0f);

    }

    public void play3(View v) {
        msoundpool.play(mESoundId,1.0f,1.0f,0,0,1.0f);

    }

    public void play4(View v) {
        msoundpool.play(mFSoundId,1.0f,1.0f,0,0,1.0f);

    }

    public void play5(View v) {
        msoundpool.play(mGSoundId,1.0f,1.0f,0,0,1.0f);

    }

    public void play6(View v) {
        msoundpool.play(mASoundId,1.0f,1.0f,0,0,1.0f);

    }

    public void play7(View v) {
        msoundpool.play(mBSoundId,1.0f,1.0f,0,0,1.0f);

    }


}
