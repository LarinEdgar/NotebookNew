package com.example.ssfan.notebook.ui;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.ssfan.notebook.R;
import com.example.ssfan.notebook.models.ContactContent;
import com.example.ssfan.notebook.ui.adapters.PhoneBookAdapter;

import java.util.ArrayList;
import java.util.List;

public class ActivityContacts extends AppCompatActivity implements View.OnClickListener {

    Button btnAddContact;
    private ListView testContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        btnAddContact = findViewById(R.id.btnAddContact);
        btnAddContact.setOnClickListener(this);

        testContacts = findViewById(R.id.listOfContactsInActivity);

        List<ContactContent> listContactContent = new ArrayList<ContactContent>();
        listContactContent.add(new ContactContent(
                BitmapFactory.decodeResource(getResources(), R.drawable.avatar_vasya),
                "Vasya Lomov", "093-555-33-22", "vasya.avatar_vasya.17187@gmail.com"));
        listContactContent.add(new ContactContent(
                BitmapFactory.decodeResource(getResources(), R.drawable.avatar_petya),
                "Petya Ivanov", "050-131-45-56", "avatar_petya.ivanov011@yandex.com"));
        listContactContent.add(new ContactContent(
                BitmapFactory.decodeResource(getResources(), R.drawable.avatar_petyh),
                "Petyh koko", "099-678-32-11", "nagibator99@yahoo.com"));
        PhoneBookAdapter adapter = new PhoneBookAdapter(this, listContactContent);
        testContacts.setAdapter(adapter);
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

}
