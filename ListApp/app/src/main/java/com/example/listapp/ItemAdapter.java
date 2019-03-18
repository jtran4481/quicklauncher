package com.example.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater nInflator;
    String[] items;
    String[] prices;
    String[] description;

    public ItemAdapter(Context c, String[] i, String[] p, String[] d) {
        items = i;
        prices = p;
        description = d;
        nInflator = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View v = nInflator.inflate(R.layout.my_listview_detail, null);
        TextView nameTextview = (TextView) v.findViewById(R.id.mainTextView);
        TextView descriptionTextview = (TextView) v.findViewById(R.id.descriptionTextView);
        TextView priceTextView = (TextView) v.findViewById(R.id.priceTextView);

        String name = items[i];
        String desc = description[i];
        String cost = prices[i];

        nameTextview.setText(name);
        descriptionTextview.setText(desc);
        priceTextView.setText(cost);
        return v;
    }
}
