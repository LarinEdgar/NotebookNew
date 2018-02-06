package com.example.ssfan.notebook.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ssfan.notebook.R;

public class ActivityContacts extends AppCompatActivity implements View.OnClickListener {

    Button btnAddContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        btnAddContact = findViewById(R.id.btnAddContact);
        btnAddContact.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAddContact:
                Intent intent = new Intent(this, ActivityNewContact.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    //TODO В случае успешной реализации Листа контактов - реализовать отображение листа в этом Активити

}
