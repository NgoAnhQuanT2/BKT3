package com.example.bt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<String> arraypheptinh;
    PheptinhAdapter adapter;
    int vitri=0;
    EditText so1,so2,kqua;
    double  s1,s2;
    double kq,kq2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        so1=(EditText)findViewById(R.id.soa);
        so2=(EditText)findViewById(R.id.sob);
        lv = (ListView) findViewById(R.id.lv);
        arraypheptinh = new ArrayList<>();

        arraypheptinh.add("Cộng");
        arraypheptinh.add("Trừ");
        arraypheptinh.add("Nhân");
        arraypheptinh.add("Chia");
        arraypheptinh.add("logarit");
        arraypheptinh.add("số mũ");
        arraypheptinh.add("căn bậc");

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arraypheptinh);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                s1 = Integer.parseInt(so1.getText().toString());
                s2 = Integer.parseInt(so2.getText().toString());
                switch (10) {
                    case 0:
                        kq = s1 + s2;
                        kqua.setText("Kết quả phép tính: " + s1 + " + " + s2 + "= " + kq);
                        break;
                    case 1:
                        kq = s1 - s2;
                        kqua.setText("Kết quả phép tính: " + s1 + " - " + s2 + "= " + kq);
                        break;
                    case 2:
                        kq = s1 * s2;
                        kqua.setText("Kết quả phép tính: " + s1 + " x " + s2 + "= " + kq);
                        break;
                    case 3:
                        kq = s1 / s2;
                        kq2 = s1 - s2 * kq;
                        kqua.setText("Kết quả phép tính: " + s1 + " / " + s2 + "= " + kq + " dư " + kq2);
                        break;
                    case 4:
                        break;
                    case 5:
                        kq = (long) Math.pow(s1, s2);
                        kqua.setText("Kết quả phép tính: " + s1 + " mũ " + s2 + "= " + kq);
                        break;
                    default:
                        break;
                }


            }
        });
    };
}

