package com.example.clinics;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clinics.adapter.wordadapter;
import com.example.clinics.beauty.beauty;
import com.example.clinics.gym.gym;


import java.util.ArrayList;

public class Home extends Fragment {
    private RecyclerView mRecyclerView;
    private wordadapter mAdapter;
    private LinearLayoutManager mlayoutManager;
    private ArrayList<wordclass> list;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate ( R.layout.activity_home, container, false );
        CreateArrayList ();
        mRecyclerView = view.findViewById ( R.id.recyclerView );
        mlayoutManager = new LinearLayoutManager ( getActivity () );
        mAdapter = new wordadapter ( list );
        mRecyclerView.setHasFixedSize ( true );
        mRecyclerView.setLayoutManager ( mlayoutManager );
        mRecyclerView.setAdapter ( mAdapter );
        mAdapter.SetOnItemClickListener ( new wordadapter.OnItemClickListener () {
            @Override
            public void onItemClick(int position) {
                String list1 = list.get ( position ).getmTextV1 ();
                switch (position) {
                    case 0:
                        startActivity ( new Intent ( getActivity (), gym.class ) );
                        break;

                    case 1:
                        startActivity ( new Intent ( getActivity (), beauty.class ) );
                        break;
                    case 2:
                        startActivity ( new Intent ( getActivity (), c.class ) );
                        break;
                    case 3:
                        startActivity ( new Intent ( getActivity (), x_ray.class ) );
                        break;
                    case 4:
                        startActivity ( new Intent ( getActivity (), products.class ) );
                        break;
                }
            }
        } );
        return view;
    }

    public void CreateArrayList() {
        list = new ArrayList<> ();
        list.add ( new wordclass ( R.drawable.gym, "منتجع صحى و صاله العاب رياضيه", "1" ) );
        list.add ( new wordclass ( R.drawable.beautycenter, "مركز تجميل", "2" ) );
        list.add ( new wordclass ( R.drawable.clinics, "العيادات", "3" ) );
        list.add ( new wordclass ( R.drawable.lab, "مركز اشاعات", "4" ) );
       // list.add ( new wordclass ( R.drawable.natul, "منتجات طبيعيه", "5" ) );
        // list.add ( new wordclass ( R.drawable.baby, "ساحه اطفال", "6" ) );
        //list.add ( new wordclass ( R.drawable.mug, "كافيتريا", "7" ) );
    }
}
