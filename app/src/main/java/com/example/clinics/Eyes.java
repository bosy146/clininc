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

public class Eyes extends AppCompatActivity {
    ListView eListView;
    ImageView eImageView;
    TextView eTextView;
    int[] images ={R.drawable.ksar,R.drawable.shbkya,R.drawable.sad,R.drawable.shoaera,R.drawable.color,R.drawable.althab};
    String[] Name ={" قصر النظر:هو مسبب شائع للرؤية المشوشة.يرى الأشخاص المصابون بقصر النظر الأشياء البعيدة بشكل مشوش وغير واضح أحيانا،يمكن الحـول (Strabismus)،أو تقليص العينين",
    " التهاب الشبكية الصباغي:أطلق اسم 'التهاب الشبكيةالصباغي'(retinitis pigmentosa)قبل أكثر منمئة عام على مرض ظهر كبقع لونية (صبغية) في قاعدة العين،شوهدت بواسطة التنظير العيني (ophthalmoscope)",
            " الساد:تكون في حالتها الطبيعية شفافة.الرؤية من خلال عدسة ضبابية تشبه محاولة النظر من خلال شباك بارد،أو مغطى بالضباب",
    " شعيرة العين:هو بثرة تخرج في أصل حدقة العين،أو دمل صغير يتكون في جفن العين.وتكون الشعيرة،بصورة عامة، مليئة بالقيح وكلما كانت أكثر انتفاخا وأكبر",
    " عمى الألوان:هو مصطلح يعني إصابة الإنسان بخلل يفقده القدرة على رؤية أحد الألوان الثلاث التالية:الأحمر،الأزرق أو الأخضر،أو اللون الناتج عن خلطها معا.الحالة التي لا يستطيع فيها",
    " التهاب العين:مرض عيون شائع جدًا، ناجم عن عدوى فيروسية،جرثومية أو من كائنات دقيقة أخرى.يتميز التهاب العين بأعراض حكة،احمرار،عين دامعة،الام وأعراض إضافية",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eyes);
        Intent intent=getIntent();
        eListView = findViewById(R.id.elistview);
        CustomerAdaptor customerAdaptor=new CustomerAdaptor();
        eListView.setAdapter(customerAdaptor);
    }
    class CustomerAdaptor extends BaseAdapter {

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
            View view=getLayoutInflater().inflate(R.layout.eyeslayout,null);
            ImageView eImageView=(ImageView) view.findViewById(R.id.imageView);
            TextView eTextView=(TextView) view.findViewById(R.id.textView);
            eImageView.setImageResource(images[position]);
            eTextView.setText(Name[position]);
            return view;
        }
    }

    public void click(View view) {
        Intent in = new Intent( Eyes.this, Click.class);
        startActivity(in);
    }
}
