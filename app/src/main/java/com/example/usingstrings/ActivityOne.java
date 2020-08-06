package com.example.usingstrings;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityOne extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);


        textView = findViewById(R.id.textview1);
        textView.setText(R.string.Msg1);

        textView = findViewById(R.id.textview2);
        textView.setText(R.string.Msg2);


        Log.i("Lifecycle", "onCreate() invoked");
    }

     public void onStart()
     {
         super.onStart();
         Log.i("Lifecycle","onStart() invoked");
     }

     public void onRestart()
     {
         super.onRestart();
         Log.i("Lifecycle","onRestart() invoked");
     }

     public  void onPause()
     {
         super.onPause();
         Log.i("Lifecycle", "onPause() invoked");
     }

     public void onStop()
     {
         super.onStop();
         Log.i("Lifecycle","onStop() invoked");
     }

     public void onDestroy()
     {
         super.onDestroy();
         Log.i("LifeCycle","onDestroy() invoked");
     }

     public void onResume()
     {
         super.onResume();
         Log.i("Lifecycle","onResume() invoked");
     }

}
