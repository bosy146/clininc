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

public class Bones extends AppCompatActivity {
    ListView boListView;
    ImageView boImageView;
    TextView boTextView;

    int[] images = {R.drawable.smile, R.drawable.tkwem, R.drawable.zara, R.drawable.hshw};
    String[] Name={"",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bones);
        Intent intent=getIntent();
        boListView = findViewById(R.id.bolistview);
        CustomerAdaptor customerAdaptor=new CustomerAdaptor();
        boListView.setAdapter(customerAdaptor);
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
            View view=getLayoutInflater().inflate(R.layout.boneslayout,null);
            ImageView boImageView=(ImageView) view.findViewById(R.id.imageView);
            TextView boTextView=(TextView) view.findViewById(R.id.textView);
            boImageView.setImageResource(images[position]);
            boTextView.setText(Name[position]);
            return view;
        }
    }

    public void click(View view) {
        Intent in = new Intent( Bones.this, Click.class);
        startActivity(in);
    }
}
