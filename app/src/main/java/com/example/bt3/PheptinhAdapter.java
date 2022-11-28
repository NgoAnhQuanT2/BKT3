package com.example.bt3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class PheptinhAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<PhepTinh> pheptinhlist;

    public PheptinhAdapter(Context context, int layout, List<PhepTinh> pheptinhlist) {
        this.context = context;
        this.layout = layout;
        this.pheptinhlist = pheptinhlist;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        TextView txtten = (TextView) view.findViewById(R.id.textviewten);
        PhepTinh pheptinh = pheptinhlist.get(i);

        return view;
    }
}
