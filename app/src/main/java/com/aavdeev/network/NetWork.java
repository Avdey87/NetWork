package com.aavdeev.network;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class NetWork extends AppCompatActivity {
    EditText hostinput;
    TextView tvinfo;
    Button btnGetIP;
    ListView resultlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_work);

        setTitle("Узанть IP");

        hostinput = (EditText) findViewById(R.id.testhost);
        tvinfo = (TextView) findViewById(R.id.info);
        btnGetIP = (Button) findViewById(R.id.test);

        btnGetIP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvinfo.setText("Подождите...");
                new GetIPTask().execute();
            }
        });
    }

    private class GetIPTask extends AsyncTask {

        @Override
        protected Object doInBackground(Object[] objects) {
            return null;
        }
    }

}
