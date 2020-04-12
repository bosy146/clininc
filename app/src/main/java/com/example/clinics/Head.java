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

public class Head extends AppCompatActivity {
    ListView heListView;
    ImageView heImageView;
    TextView heTextView;

    int[] images = {R.drawable.depression, R.drawable.anxiety, R.drawable.alzheimer, R.drawable.lost,R.drawable.loss};
    String[] Name={"الاكتئاب (Depression):ليس ضعفا أو شيئا سهل التخلص منه،ويعرف بأنه الاضطراب الاكتئابي الحاد(Severe depression disorder)،أو الاكتئاب السريري(Clinical depression)هو مرض يصيب النفس",
    "القلق:من الطبيعي أن يشعر الإنسان بالقلق أو بالفزع، من حين إلى اخر أما إذا كان الإحساس بالقلق يتكرر في أحيان متقاربة دون أي سبب حقيقي،إلى درجة إنه يعيق مجرى الحياة اليومي الطبيعي فالمرجح أن هذا الإنسان",
    "الزهايمر:السبب الأكثر شيوعا للخرف. يؤذي المهارات العقلية والاجتماعية مما يؤدي إلى إعاقة الأداء اليومي في الحياة العادية. مرض الزهايمر",
    "فقد انتظام الحركة:إن أكثر العلامات إشارة للخلل أو الإصابة بالمخيخ (Cerebellum)، هي الاضطراب بتناسق الحركة الواعية (بكامل الوعي)، والمسماة حالة الرنح (فقد الانتظام Ataxia). يمكن أن يساعد تصحيح المشكلة",
    "فقدان الشهية العصبي( Anorexia Nervosa):هو واحد من أنواع الاضطرابات في الأكل.الأشخاص الذين يعانون من فقد الشهية العصابي يعانون من خوف دائم من زيادة الوزن"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head);
        Intent intent=getIntent();
        heListView = findViewById(R.id.helistview);
        CustomerAdaptor customerAdaptor=new CustomerAdaptor();
        heListView.setAdapter(customerAdaptor);
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
            View view=getLayoutInflater().inflate(R.layout.headlayout,null);
            ImageView heImageView=(ImageView) view.findViewById(R.id.imageView);
            TextView heTextView=(TextView) view.findViewById(R.id.textView);
            heImageView.setImageResource(images[position]);
            heTextView.setText(Name[position]);
            return view;
        }
    }

    public void click(View view) {
        Intent in = new Intent( Head.this, Click.class);
        startActivity(in);
    }
}
