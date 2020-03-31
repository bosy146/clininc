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

public class Nose extends AppCompatActivity {
    ListView nListView;
    ImageView nImageView;
    TextView nTextView;

    int[] images = {R.drawable.smile, R.drawable.tkwem, R.drawable.zara, R.drawable.hshw};
    String[] Name ={"",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nose);
        Intent intent=getIntent();

        nListView = findViewById(R.id.nlistview);
        CustomerAdaptor customerAdaptor=new CustomerAdaptor();
        nListView.setAdapter(customerAdaptor);
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
            View view=getLayoutInflater().inflate(R.layout.noselayout,null);
            ImageView nImageView=(ImageView) view.findViewById(R.id.imageView);
            TextView nTextView=(TextView) view.findViewById(R.id.textView);
            nImageView.setImageResource(images[position]);
            nTextView.setText(Name[position]);
            return view;
        }
    }

    public void click(View view) {
        Intent in = new Intent( Nose.this, Click.class);
        startActivity(in);
    }
}
