package com.example.tahas.contactsapplication;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Taken Button
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Object Created
        button =(Button)findViewById(R.id.button1);

        // Button Action Performed
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Intent Passed to read the contacts on the device
                Intent intent = new Intent(Intent.ACTION_DEFAULT, ContactsContract.Contacts.CONTENT_URI);
                startActivityForResult(intent,1);


            }
        });

    }
}
