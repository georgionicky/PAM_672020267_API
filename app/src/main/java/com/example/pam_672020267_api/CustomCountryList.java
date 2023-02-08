package com.example.pam_672020267_api;
import android.widget.BaseAdapter;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

public class CustomCountryList extends BaseAdapter {
    public static class ViewHolder
    {
        TextView kode;
        TextView negara;
    }

    private Activity context;
    ArrayList <Country> countries;


    public CustomCountryList(Activity context, ArrayList countries) {
        //   super(context, R.layout.row_item, countries);
        this.context = context;
        this.countries=countries;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        ViewHolder vh;
        if(convertView==null) {
            vh=new ViewHolder();
            row = inflater.inflate(R.layout.data, null, true);
            vh.kode = (TextView) row.findViewById(R.id.kode);
            vh.negara = (TextView) row.findViewById(R.id.negara);
            row.setTag(vh);
        }
        else {
            vh = (ViewHolder) convertView.getTag();
        }

        vh.negara.setText(countries.get(position).getCountryName());
        vh.kode.setText(countries.get(position).getCountryCode());

        return  row;
    }

    public long getItemId(int position) {
        return position;
    }

    public Object getItem(int position) {
        return position;
    }

    public int getCount() {
        if(countries.size()<=0)
            return 1;
        return countries.size();
    }
}