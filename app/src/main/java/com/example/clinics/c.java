package com.example.clinics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.clinics.adapter.postAdapter;
import com.example.clinics.beauty.Beautywo;

import java.util.ArrayList;

public class c extends AppCompatActivity {
    private RecyclerView pRecyclerView;
    private postAdapter pAdapter;
    private RecyclerView.LayoutManager playoutManager;
    private ArrayList<postclass> plist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        CreattArrayList();
        pRecyclerView=findViewById(R.id.recyclerView);
        playoutManager=new LinearLayoutManager(this);
        pAdapter=new postAdapter(plist);
        pRecyclerView.setHasFixedSize(true);
        pRecyclerView.setLayoutManager(playoutManager);
        pRecyclerView.setAdapter(pAdapter);
        pAdapter.SetOnItemClickListener(new postAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                String list2 = plist.get ( position ).getpTextV1 ();
                //Intent intent = new Intent ( c.this, clinics.class );
              // intent.putExtra ( "name", list2 );
              // startActivity ( intent );
                switch (position) {
                    case 0:
                        startActivity ( new Intent ( c.this, dentes.class ) );
                        break;
                    case 1:
                        startActivity ( new Intent ( c.this, Lezer.class ) );
                        break;
                    case 2:
                        startActivity ( new Intent ( c.this, Eyes.class ) );
                        break;
                    case 3:
                        startActivity ( new Intent ( c.this, Beautywo.class ) );
                        break;
                    case 4:
                        startActivity ( new Intent ( c.this, Eat.class ) );
                        break;
                    case 5:
                        startActivity ( new Intent ( c.this, Beautycli.class ) );
                        break;
                    case 6:
                        startActivity ( new Intent ( c.this, Nose.class ) );
                        break;
                    case 7:
                        startActivity ( new Intent ( c.this, Head.class ) );
                        break;


                }

            }
        });



    }
    public void CreattArrayList(){
        plist=new ArrayList<>();

        plist.add(new postclass(R.drawable.dentic,"الاسنان","من اهم العيادات"));
        plist.add(new postclass(R.drawable.skin,"العنايه بالبشره","من اهم العيادات"));
        plist.add(new postclass(R.drawable.eyes,"الرمد","من اهم العيادات"));
        plist.add(new postclass(R.drawable.woman,"النساء","من اهم العيادات"));
        plist.add(new postclass(R.drawable.eat,"التغذيه","من اهم العيادات"));
        plist.add(new postclass(R.drawable.beautycli,"تجميل","من اهم العيادات"));
        plist.add(new postclass(R.drawable.nose,"انف و اذن","من اهم العيادات"));
        plist.add(new postclass(R.drawable.head," نفسيه و عصبيه","من اهم العيادات"));
    }

}
