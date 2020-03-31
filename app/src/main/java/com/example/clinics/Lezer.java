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

public class Lezer extends AppCompatActivity {
    ListView lListView;
    ImageView lImageView;
    TextView lTextView;
    int[] images ={R.drawable.lezer,R.drawable.nile,R.drawable.hear,R.drawable.dskin,R.drawable.care};
    String[] Name ={" ازاله الشعر بالليزر:تهدف لمعالجة نمو الشعر،ومن أجل منع عودته مجددا في مناطق الجسم التي لا يرغب الشخص بنمو الشعر فيها،أسباب تجميلية،أو بدافع علاج الشعر الزائد.يمنع العلاج الليزر نمو خلايا الميلانين " ,
    " الاهتمام بالاظافر:الأظافر هي التي تحمي نسيج أصابع اليد والقدم،وفي الغالب فإن صحة الأظافر تعكس الحالة الصحية للشخص،لكن هناك الكثير من الأمراض والمشاكل التي تصيب الأظافر لكن لمعالجة هذه الأمراض والمشاكل يجب أن نتعرف على أسبابها،فكثير من أمراض الأظافر ناجمة عن التغيرات في حياة الشخص ",
    " مشاكل الشعر المختلفه الشّعر أحد معايير الجمال لدى المرأة على مرّ التّاريخ، ومَحطّ اهتمامها الدّائم،وعلى الرّغم من اختلاف نوعيّة الشّعر بين امرأة وأخرى من حَيْث النّسيج والكثافة،إلا أنّه توجد مشاكل شائعة تواجه الشّعر.استشاره الطبيب هي حلول لهذه المشاكل وكيفيّة التخلص مِنْها مثل الشعر الجاف و الشعر الدهني و تساقط الشعر وايضا القشره ",
     " الحبوب الجلديه:تتكوَّن الحُبوب الجلدية عند إغلاق مسامات بُصيلات الشعر تحت الجلد، أو إغلاق الغُدد الدُهنية، مما يؤدي إلى انتفاخها وظهورها بعدة أشكال شاذة، ولون أحمر مُخالف للون للجلد. وتوجد هذه الحبوب في العادة في مناطق الوجه، والرقبة، والأكتاف، والصدر، والظهر. ويُعتبر عُمر المراهقة والشباب هو الأكثر عُرضة لظهور لحبوب الجلدية ",
    " الاهتمام بالبشره:لبشرة هي طبقة الجلد الخارجية التي تغطي الجسم بالكامل، ونضارة الجلد وحيويته هي العامل الاول الذي يظهر الجمال ويعطي الوجه والجسم المظهر الجذاب والجميل، فمهما اهتمينا بمستحضرات التجميل والعطور وتناسق الوان الملابس فلن يكون ذلك كافيا اذا كانت البشرة تعاني من البقع او اثار الحبوب، لذلك سيدتي يجب عليك ان تهتمي ببشرتك ونضارتها وحيويتها، لذلك استشاره الطبيب تساعدك في الحفاظ على البشرة وكيفيه العناية بها "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lezer);
        Intent intent=getIntent();
        lListView=findViewById(R.id.llistview);
        CustomerAdaptor customerAdaptor=new CustomerAdaptor();
        lListView.setAdapter(customerAdaptor);
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
            View view=getLayoutInflater().inflate(R.layout.lezerlayout,null);
            ImageView lImageView=(ImageView) view.findViewById(R.id.imageView);
            TextView lTextView=(TextView) view.findViewById(R.id.textView);
            lImageView.setImageResource(images[position]);
            lTextView.setText(Name[position]);
            return view;
        }
    }

    public void click(View view) {
        Intent in = new Intent( Lezer.this, Click.class);
        startActivity(in);
    }
}
