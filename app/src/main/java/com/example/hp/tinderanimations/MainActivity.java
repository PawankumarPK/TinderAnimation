package com.example.hp.tinderanimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wenchao.cardstack.CardStack;

public class MainActivity extends AppCompatActivity implements CardStack.CardEventListener {

    private CardStack card_Stack;
    private CardAdapter card_Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImages();

        card_Stack = (CardStack)findViewById(R.id.card_stack);
        card_Stack.setContentResource(R.layout.card_layouts);
        card_Stack.setStackMargin(20);
        card_Stack.setAdapter(card_Adapter);

        card_Stack.setListener(this);


    }

    private void initImages() {

        card_Adapter  = new CardAdapter(getApplicationContext(),0);
        card_Adapter.add(R.drawable.profile1);
        card_Adapter.add(R.drawable.profile2);
        card_Adapter.add(R.drawable.profile3);
        card_Adapter.add(R.drawable.profile4);


    }

    @Override
    public boolean swipeEnd(int i, float v) {
        return (v>300)?true:false;
    }

    @Override
    public boolean swipeStart(int i, float v) {
        return false;
    }

    @Override
    public boolean swipeContinue(int i, float v, float v1) {
        return false;
    }

    @Override
    public void discarded(int i, int i1) {

    }

    @Override
    public void topCardTapped() {

    }
}
