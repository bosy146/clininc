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

public class x_ray extends AppCompatActivity {
    ListView xListView;
    ImageView xImageView;
    TextView xTextView;

    int[] images = {R.drawable.doppler, R.drawable.echo, R.drawable.mammogram, R.drawable.ultra};
    String[] Name = {"دوبلر:من اهم الفحوصات الموجات الصوتية ولكن اتجاه الدم يضاف اليها قوي في تشخيص الجلاطات والقدم السكري والدوالي.يعتمد علي خبرة الطبيب المعالج ويمكن استخدامه لاداء الفحوصات التداخلية:مثل قسطرةالشرايين والاورام",
            "اشعة الايكو:هو موجات صوتية في القلب تتميز بمتوسط تكلفة لا يوجد به ضرر اشعاعي .احد عيوبها يعتمد علي خبره الفاحص ويمكن القيام به لجميع الاعمار ويمكنه اكتشاف العيوب الخلقية للاطفال حديثي الولادة",
            "تصوير الثدي بالاشعة:هذه الاشعة دقيقة للغاية وتكتششف ادق انواع الاورام و لا يوجد اثار جانبية وتلف الاشعاع سرطان الثدي فقط يمكن القيام به للذكور والاناث وليس النساء فقط",
            "الموجات فوق الصوتية:لم يسمع بها في الاذن البشرية يتميز هذا النوع من الفحص بتكلفة منخفضة للمريض مقارنة بأنواع الاشعاع الاخري و يتميز بعدم وجود اي ضرر اشعاعي للمريض و يتم اجراء العديد من الاختيارات عليه مثل:متابعة الغده والمعده والحوض ومتابعه الحمل و ضروري لتشخيص حالات الطواري مثل:النزيف الداخلي"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_ray);
        Intent intent=getIntent();
        xListView = findViewById(R.id.xlistview);
        CustomerAdaptor customerAdaptor=new CustomerAdaptor();
        xListView.setAdapter(customerAdaptor);
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
            View view=getLayoutInflater().inflate(R.layout.xraylayout,null);
            ImageView xImageView=(ImageView) view.findViewById(R.id.imageView);
            TextView xTextView=(TextView) view.findViewById(R.id.textView);
            xImageView.setImageResource(images[position]);
            xTextView.setText(Name[position]);
            return view;
        }
    }

    public void bookat(View view) {
        Intent in = new Intent ( this, x_rayb.class );
        startActivity ( in );
    }
}
