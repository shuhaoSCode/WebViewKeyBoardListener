package com.shuhao.webviewkeyboardlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shuhao.wbkeyboardlistener.KeyBoardListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KeyBoardListener.getInstance().init(this);
    }
}
