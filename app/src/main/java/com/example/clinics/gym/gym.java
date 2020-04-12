package com.example.clinics.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.clinics.R;

public class gym extends AppCompatActivity {
    ListView gListView;
    ImageView gImageView;
    TextView gTextView;
    int[] images = {R.drawable.bodyfilt, R.drawable.self, R.drawable.zumba, R.drawable.sauna,R.drawable.massage,R.drawable.harmony,R.drawable.face,R.drawable.makeproducts};
    String[] Name = {"علاجات الجسم  يعمل رفع الجسم علي تحسين شكل ونبرة الانسجة الاساسة التي تدعم الجلد والدهون تتم ازالة الجلد المترهل والدهون الزائدة ويمكن للاجراءات ان تحسن سطح الجلد غير المنتظم",
            "الدفاع عن النفس هي مجموعة من الوعي والحزم ومهارات المواجهه اللفظية واستراتيجيات السلامة والتقنيات البدنية التي تمكن اي شخص من منع الهجمات العنيفة والهروب منها ومقاومتها والبقاء علي قيد الحياه بنجاح.توفر دورة الدفاع عن النفس الجيدة والوعي النفسي والمهارات اللفظية وليس فقط التدريب البدني" ,
            "رقص الزومبا:هو برنامج للياقة البدنية تم انشاؤه من قبل الراقص الكولومبي ومصمم الرقص البرتو بيتو بيريز خلال التسعينات",
            "الساونا:هي غرفة حيث يهدف الناس للاسترخاء في حرارة جافة قد يوفر فوائد لصحة القلب والاوعية الدموية التي تلك المستمدة من ممارسة الرياضة يمكن ان يكون شرب الكحول قبل الساونا او اثناؤها امر خطير يجعل اي شخص يعاني من مشكلة في القلب والاوعية الدموية او الحوامل ان يطلب المشورة الطبية قبل استخدام الساونا",
    "المساج: يستخدم العلاج بالتدليك للمساعدة في ادارة الحالة الصحية او تعزيز العافية انه ينطوي علي معالجة الانسجة الرخوه في الجسم تتم ممارسة التدليك في معظم الثقافات الشرقية والغربية علي مدار تاريخ البشرية وكان احد اقدم الادوات التي استخدمها الناس لمحاولة تخفيف الالم",
    "الانسجام: هو العملية التي يتم من خلالها تحليل تكوين الاصوات الفردية او تراكب الاصوات عن طريق السمع عاده هذا يعني حدوث ترددات او نغمات او ملاحظات او الحبال في وقت واحد",
    "علاجات الجسم والوجه:العلاج النفسي الجسدي هو واحد من افضل الطرق لمساعدة المرضي الذين يعانون من الصدمات النفسية علي التأقلم والعيش حياه طبيعية العلاج الجسدي هو علاج شامل يدرس العلاقة بين العقل والجسم ",
    "مستحضرات التجميل: هي منتجات تستخدم لتعزيز او تغيير مظهر الوجه او العطر او نسيج الجسم تم تصميم العديد من مستحضرات التجميل لاستخدامها علي الوجه والجسم ويشمل هذا التعريف الواسع اي ماده مخصصه للاستخدام كمكون لمنتج تجميلي"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym);
        Intent intent=getIntent();
        gListView = findViewById(R.id.glistview);
        CustomerAdaptor customerAdaptor=new CustomerAdaptor();
        gListView.setAdapter(customerAdaptor);
        //String result=intent.getStringExtra("name");
        //Toast.makeText(gym.this,result,Toast.LENGTH_LONG).show();
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
            View view=getLayoutInflater().inflate(R.layout.gymlayout,null);
            ImageView gImageView=(ImageView) view.findViewById(R.id.imageView);
            TextView gTextView=(TextView) view.findViewById(R.id.textView);
            gImageView.setImageResource(images[position]);
            gTextView.setText(Name[position]);
            return view;
        }
    }



    public void bookat(View view) {
        Intent in = new Intent ( this, gymb.class );
        startActivity ( in );
    }
}
