package com.example.contacts;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.tamir7.contacts.Contact;
import com.github.tamir7.contacts.Contacts;
import com.github.tamir7.contacts.Query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    ListView contactsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Contacts.initialize(this);

        contactsList = findViewById(R.id.contacts_list);
    }

    public void populateContactsA (View v) {
        contactsList.setVisibility(View.VISIBLE);
        String s = "ABCDEF";
        List<String> contactNames = new ArrayList<>();

        for (int i=0; i<s.length(); i++) {
            Query q = Contacts.getQuery();
            q.whereStartsWith(Contact.Field.DisplayName, s.charAt(i));
            List<Contact> contacts = q.find();
            for (int j=0; j<contacts.size(); j++) {
                contactNames.add(contacts.get(j).getDisplayName());
            }
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                contactNames );

        contactsList.setAdapter(arrayAdapter);
    }

    public void populateContactsG (View v) {
        contactsList.setVisibility(View.VISIBLE);
        String s = "GHIJKLM";
        List<String> contactNames = new ArrayList<>();

        for (int i=0; i<s.length(); i++) {
            Query q = Contacts.getQuery();
            q.whereStartsWith(Contact.Field.DisplayName, s.charAt(i));
            List<Contact> contacts = q.find();
            for (int j=0; j<contacts.size(); j++) {
                contactNames.add(contacts.get(j).getDisplayName());
            }
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                contactNames );

        contactsList.setAdapter(arrayAdapter);
    }

    public void populateContactsN (View v) {
        contactsList.setVisibility(View.VISIBLE);
        String s = "NOPQRST";
        List<String> contactNames = new ArrayList<>();

        for (int i=0; i<s.length(); i++) {
            Query q = Contacts.getQuery();
            q.whereStartsWith(Contact.Field.DisplayName, s.charAt(i));
            List<Contact> contacts = q.find();
            for (int j=0; j<contacts.size(); j++) {
                contactNames.add(contacts.get(j).getDisplayName());
            }
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                contactNames );

        contactsList.setAdapter(arrayAdapter);
    }

    public void populateContactsU (View v) {
        contactsList.setVisibility(View.VISIBLE);
        String s = "UVWXYZ";
        List<String> contactNames = new ArrayList<>();

        for (int i=0; i<s.length(); i++) {
            Query q = Contacts.getQuery();
            q.whereStartsWith(Contact.Field.DisplayName, s.charAt(i));
            List<Contact> contacts = q.find();
            for (int j=0; j<contacts.size(); j++) {
                contactNames.add(contacts.get(j).getDisplayName());
            }
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                contactNames );

        contactsList.setAdapter(arrayAdapter);
    }
}
