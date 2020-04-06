package com.example.clinics.beauty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.clinics.adapter.Adapter;
import com.example.clinics.Model;
import com.example.clinics.R;

import java.util.ArrayList;
import java.util.List;

public class beauty extends AppCompatActivity {
    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_beauty );
        Intent intent = getIntent ();
        models = new ArrayList<> ();
        models.add ( new Model ( R.drawable.hear, "الشعر", "مشاكل الشعر المختلفه الشّعر أحد معايير الجمال لدى المرأة على مرّ التّاريخ، ومَحطّ اهتمامها الدّائم،وعلى الرّغم من اختلاف نوعيّة الشّعر بين امرأة وأخرى من حَيْث النّسيج والكثافة،إلا أنّه توجد مشاكل شائعة تواجه الشّعر.استشاره الطبيب هي حلول لهذه المشاكل وكيفيّة التخلص مِنْها مثل الشعر الجاف و الشعر الدهني و تساقط الشعر وايضا القشره" ) );
        models.add ( new Model ( R.drawable.nile, "الاظافر", "" ) );
        models.add ( new Model ( R.drawable.poster, "اهتمام المراه", "Brochure is are good" ) );
        models.add ( new Model ( R.drawable.namecard, "الميك اب", "Brochure is are good" ) );
        adapter = new Adapter ( models, this );
        viewPager = findViewById ( R.id.viewPager );
        viewPager.setAdapter ( adapter );
        viewPager.setPadding ( 130, 0, 130, 0 );
        Integer[] colors_temp = {getResources ().getColor ( R.color.pink1 ),
                getResources ().getColor ( R.color.pink2 ),
                getResources ().getColor ( R.color.red ),
                getResources ().getColor ( R.color.orange )

        };
        colors = colors_temp;
        viewPager.setOnPageChangeListener ( new ViewPager.OnPageChangeListener () {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position < (adapter.getCount () - 1) && position < (colors.length - 1)) {
                    viewPager.setBackgroundColor (
                            (Integer) argbEvaluator.evaluate
                                    ( positionOffset,
                                            colors[position],
                                            colors[position + 1]
                                    )
                    );
                } else {
                    viewPager.setBackgroundColor ( colors[colors.length - 1] );
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        } );
        // String result=intent.getStringExtra("name");
        //Toast.makeText(beauty.this,result,Toast.LENGTH_LONG).show();
    }

    public void bookat(View view) {
        Intent in = new Intent ( this, beautyb.class );
        startActivity ( in );
    }
}
