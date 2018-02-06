package com.example.ssfan.notebook.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.ssfan.notebook.R;
import com.example.ssfan.notebook.models.Contact;

import java.util.ArrayList;

public class ActivityNewContact extends AppCompatActivity {

    private EditText enteredName;
    private EditText enteredPhoneNumber;
    private EditText enteredEmail;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_contact);

        // Инициализация ID EditText кодого вводимого поля
        enteredName = findViewById(R.id.inputName);
        enteredPhoneNumber = findViewById(R.id.inputNumber);
        enteredEmail = findViewById(R.id.inputEmail);
    }

    // Приведение всех полей в String
    String name = enteredName.getText().toString();
    String phoneNumber = enteredPhoneNumber.getText().toString();
    String email = enteredEmail.getText().toString();

    // Внесение полей в Класс Контакт
    Contact contact = new Contact(name, phoneNumber, email);

    //TODO Реализовать Лист контактов и Кнопку "Сохранить контакт" + Понять, где должен инициализироватся Лист и как его правильно вызывать
    ArrayList listOfContacts = new ArrayList();

    // Приблизительная реализация Кнопки "Сохранить контакт"
    public void saveContact(View view) {
        listOfContacts.add(contact);
    }
}
