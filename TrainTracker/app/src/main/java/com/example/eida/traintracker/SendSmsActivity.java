package com.example.eida.traintracker;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SendSmsActivity extends AppCompatActivity {

    TextView nametext,codetext;
    Button sendsms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_sms);
        nametext = findViewById(R.id.finalTrainname);
        codetext = findViewById(R.id.finalTraincode);
        sendsms = findViewById(R.id.btnsend);

        Intent intent = getIntent();

        String massage1 = intent.getStringExtra("name");
        String massage2 = intent.getStringExtra("code");
        nametext.setText(massage1);
        codetext.setText(massage2);

        sendsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                int checkPermission = ContextCompat.checkSelfPermission(
                        SendSmsActivity.this, Manifest.permission.SEND_SMS);
                if (checkPermission == PackageManager.PERMISSION_GRANTED){

                    mymassage();
                }else{
                    ActivityCompat.requestPermissions(SendSmsActivity.this,
                            new String[]{Manifest.permission.SEND_SMS},0);
                }

            }


        });
    }

    private void mymassage() {

        try{
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage("16318", null, codetext.getText().toString(), null, null);
            Toast.makeText(SendSmsActivity.this, "SMS Sent Successfully", Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(SendSmsActivity.this, "SMS Failed to Send, Please try again", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode){
            case 0 :
                if (grantResults.length>=0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    mymassage();
                }else{
                    Toast.makeText(SendSmsActivity.this,"You don't have the permission",Toast.LENGTH_LONG).show();
                }
        }
    }

}
