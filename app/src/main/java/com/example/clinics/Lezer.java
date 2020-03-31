package com.example.clinics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Lezer extends AppCompatActivity {
    ListView lListView;
    ImageView lImageView;
    TextView lTextView;
    int[] images ={R.drawable.lezer};
    String[] Name ={"hhhhhh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lezer);
        Intent intent=getIntent();
        lListView = findViewById(R.id.llistview);
        CustomerAdaptor customerAdaptor=new CustomerAdaptor();
        lListView.setAdapter(customerAdaptor);
    }
    class CustomerAdaptor extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=getLayoutInflater().inflate(R.layout.lezerlayout,null);
            ImageView lImageView=(ImageView) view.findViewById(R.id.imageView);
            TextView lTextView=(TextView) view.findViewById(R.id.textView);
            lImageView.setImageResource(images[position]);
            lTextView.setText(Name[position]);
            return view;
        }
    }

    public void click(View view) {
        Intent in = new Intent( Lezer.this, Click.class);
        startActivity(in);
    }
}
