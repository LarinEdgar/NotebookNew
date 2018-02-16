package com.example.ssfan.notebook.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ssfan.notebook.R;
import com.example.ssfan.notebook.models.ContactContent;

import java.util.List;

public class PhoneBookAdapter extends BaseAdapter {

    private Context gContext;
    private List<ContactContent> contactContentList;

    public PhoneBookAdapter(Context context, List<ContactContent> list) {
        gContext = context;
        contactContentList = list;
    }

    @Override
    public int getCount() {
        return contactContentList.size();
    }

    @Override
    public Object getItem(int pos) {
        return contactContentList.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        ContactContent entry = contactContentList.get(pos);

        // inflating list view layout if null
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(gContext);
            convertView = inflater.inflate(R.layout.item_contact, null);
        }
        // set avatar
        ImageView ivAvatar = convertView.findViewById(R.id.imgAvatar);
        ivAvatar.setImageBitmap(entry.getAvatar());

        // set name
        TextView tvName = convertView.findViewById(R.id.inputName);
        tvName.setText(entry.getName());

        // set phone
        TextView tvPhone = convertView.findViewById(R.id.inputNumber);
        tvPhone.setText(entry.getPhoneNumber());

        // set email
        TextView tvEmail = convertView.findViewById(R.id.inputEmail);
        tvEmail.setText(entry.getEmail());

        return convertView;
    }

}
