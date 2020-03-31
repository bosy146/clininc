package com.example.clinics.beauty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.clinics.Click;
import com.example.clinics.R;

public class Beautywo extends AppCompatActivity {
    ListView bListView;
    ImageView bImageView;
    TextView bTextView;
    int[] images = {R.drawable.babies, R.drawable.period, R.drawable.nzfa, R.drawable.lolab,R.drawable.tkyos};
    String[] Name ={"النساء و متابعه شهور الحمل هناك بوادر عديده للحمل منها الإحساس بالتعب و كثرة التبول و توقف الحيض و تشعر بعض الامهات بطعم معدني في حلوقها ويوجد بعض من النساء عندهم تاخر في الحمل يوجد لها اكثر من علاج",
    " تبدأ الدوره الشهريه للفتاه بمجرد دخولها فتره البلوغ نتيجه لإفراز هرمون الإستروجين والبروجيسترون ففي أثناء الدوره الشهريه يبدأ الرحم بتكوين جدار إسفنجي رقيق استعدادا لاستقبال بويضه ملقحه مشاكل الدوره عديده مثل تغير في الهرمونات و التوتر ",
    "النظافه الشخصيه يجب الانتظام ي متابعتها الحكه المهبليه قابله للشفاء و ليست بحاجه لعلاج مكثف وسوف يصف الطبيب المضادات لحيويه و الكريمات المضاده للفطريات لتجنب المشاكل الجلديه لذا يجب اتباع بعض النصائح لتجنب العدوي المهبليه و اتباع الاداب عند التبول و محاربه رائحه الفم الكريهه و تنظيف و تعقيم اماكن العمل المكتبيه و الحرص علي نظافه أدوات الماكياج و الاستحمام بشكل يومي",
    "اللولب وكافه المعلومات عنه:اللولب النحاسي(ParaGard)هو جهاز يتم وضعه داخل الرحم(IUD)لتنظيم الحمل على المدى الطويل (منع الحمل). وأحيانًا ما تتم الإشارة إليه على أنه خيار للولب رحمي غير هرموني. جهاز(ParaGard)هو إطار بلاستيكي على شكل حرف T يتم إدخاله داخل الرحم.يتسبب السلك النحاسي الملفوف حول الجهاز في رد فعل التهابي سام للحيوانات المنوية والبويضات لمنع الحمل. اللولب النحاسي(ParaGard)هو اللولب الرحمي النحاسي الوحيد في الولايات المتحدة. يمكن أن يمنع الحمل لمدة تصل إلى 10 أعوام بعد إدخاله",
    " تكيسات على المبايض و تجنبها تعد متلازمة تكيس المبيض إحدى المشكلات الشائعة التي تحدث بسبب فقدان التوازن بين الهرمونات في جسم المرأة،وقد تسبب هذه المتلازمة تغيرات غير مرغوب فيها في مظهر المرأة،إضافة لمشكلات في الدورة الشهرية،وإذا لم تتم معالجة هذه المتلازمة فقد تسبب لها الإصابة بأمراض خطيرة مثل أمراض القلب والسكري. ويعد الالتزام بنظام غذائي صحي والرياضة أحد العوامل التي قد تؤثر على هذه المتلازمة"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beautywo);
        Intent intent=getIntent();
        bListView = findViewById(R.id.blistview);
        CustomerAdaptor customerAdaptor=new CustomerAdaptor();
        bListView.setAdapter(customerAdaptor);
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
            View view=getLayoutInflater().inflate(R.layout.beautylayout,null);
            ImageView bImageView=(ImageView) view.findViewById(R.id.imageView);
            TextView bTextView=(TextView) view.findViewById(R.id.textView);
            bImageView.setImageResource(images[position]);
            bTextView.setText(Name[position]);
            return view;
        }
    }

    public void click(View view) {
        Intent in = new Intent( Beautywo.this, Click.class);
        startActivity(in);
    }
}
