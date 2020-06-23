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
        models.add ( new Model ( R.drawable.hear, "الشعر", "مشاكل الشعر المختلفه الشّعر أحد معايير الجمال لدى المرأة على مرّ التّاريخ، ومَحطّ اهتمامها الدّائم،وعلى الرّغم من اختلاف نوعيّة الشّعر بين امرأة وأخرى من حَيْث النّسيج والكثافة،إلا أنّه توجد مشاكل شائعة تواجه الشّعر.استشاره الطبيب هي حلول لهذه المشاكل وكيفيّة التخلص مِنْها مثل الشعر الجاف و الشعر الدهني و تساقط الشعر وايضا القشره. تدليك فروة الراس يمكنه ان يزيد من تدفق الدم الى الراس. مما يعنى تهيئه بيئه افضل لنمو الشعر" ) );
        models.add ( new Model ( R.drawable.nile, "الاظافر", "الأظافر هي التي تحمي نسيج أصابع اليد والقدم،وفي الغالب فإن صحة الأظافر تعكس الحالة الصحية للشخص،لكن هناك الكثير من الأمراض والمشاكل التي تصيب الأظافر لكن لمعالجة هذه الأمراض والمشاكل يجب أن نتعرف على أسبابها،فكثير من أمراض الأظافر ناجمة عن التغيرات في حياة الشخص.تناولى الاطعمه الصحيه الغنيه بالاحماض الامينيه و الكالسيوم و الحديد و البوتاسيوم مثل:اللوز مما يساهم فى تقويه الاظافر و ايضا شرب كميه كافيه من الماء" ) );
        models.add ( new Model ( R.drawable.natul, "منتجات طبيعيه للمراه", "اللجوء إلى الطبيعة هو أفضل ما يمكنكِ تقديمه لجمالك وبشرتك.فقد وهبتنا الطبيعة العديد من المكونات الفعّالة التي يمكنها علاج كافة المشكلات الجلدية التي تواجه البشرة،الجسم أوالشعر.كما تعمل كذلك على مكافحة كافة آثار التلوث التي نواجهها يومياً.تحتوي المستحضرات التقليدية للعناية بالبشرة أوالشعر على نسبة هائلة من العناصر الكيماوية،بينما لا تحتوي المستحضرات العضوية على الكيماويات الضارة والتي تتسبب في تهيج الجلد" ) );
        models.add ( new Model ( R.drawable.makeup, "مستحضرات التجميل", "لم يعد المكياج وسيلة لإبراز الجمال الخارجي للمرأة فقط،بل بات يحمل أهمية كبيرة لناحية تعزيز ثقتها بنفسها وإثبات شخصيتها وحضورها، إذ عندما تشعر بأنها جميلة في الشكل، فتلقائياً سينعكس هذا الأمر إيجاباً عليها ويجعلها قوية ويمنحها قدراً كبيراً من الثقة بالنفس.فهو يعزّز تأثيرها في نظر الآخرين ويجعلها أكثر تفاؤلاً ويمنحها نظرة إيجابية الى الحياة، لا سيما عندما تسمع كلمات الإطراء والثناء من قبل المحيطين بها." ) );
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
                    viewPager.setBackgroundColor ( (Integer) argbEvaluator.evaluate ( positionOffset, colors[position], colors[position + 1] )
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
