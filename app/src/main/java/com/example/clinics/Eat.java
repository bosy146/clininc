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

public class Eat extends AppCompatActivity {
    ListView eatListView;
    ImageView eatImageView;
    TextView eatTextView;
    int[] images = {R.drawable.health, R.drawable.thinness, R.drawable.diet, R.drawable.eatkids};
    String[] Name ={"التغذية الصحية:تعرف التغذية الصحية على أنّها تناول الغذاء المتكامل الذي يحتوي على كافة العناصر الغذائية حيث تلعب التغذية الصحية دوراً كبيراً ومهماً في الحفاظ على صحة الجسم البدنية والعقلية والنفسيّة من خلال اتباع نظام غذائي صحي متكامل",
    "النحافه:هي سبب من اسباب سوء التغذيه والعادات المكتسبة من الصغر مثلا عدم التعود على مأكولات صحية وكرهها، حيث يسبب الى فقدان الشهية. ديدان طفيلية تسبب في سوء الهضم وسوء الامتصاص للعناصر المهمة لذلك يجب استشاره الطبيب للاهتمام بالنظام الغذائي لمعالجه النحافه",
    "الرچيم:المقصود به تنظيم الغذاء وهو حصول الجسم على جميع العناصر الغذائية بصورة متوازنة تتناسب مع حالة الشخص الصحية بحيث لا يزيد عنصر على حساب عنصر آخر وبمقدار ما يتناسب ذلك مع عمر المريض ولذلك يتم اختيار نظام غذائي صحيح عن طريق استشاره الطبيب",
    "أهمية التغذية للأطفال:تناول الأطعمة الصحية أمر مهم، خاصةً للأطفال، لأنهم لا يزالوا في مرحلة النمو. فأجسام الاطفال تحتاج إلى التغذية حتى تنمو العظام و العضلات بشكل صحي و قوي. و إذا كنت لا تحصل على جميع الفيتامينات و المعادن التي تحتاجها في الوقت الذي تنمو فيه، فإنك لن تنمو بالشكل الصحيح و القوي المُفترَض أن تكون عليه"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat);
        Intent intent=getIntent();
        eatListView = findViewById(R.id.eatlistview);
        CustomerAdaptor customerAdaptor=new CustomerAdaptor();
        eatListView.setAdapter(customerAdaptor);
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
            View view=getLayoutInflater().inflate(R.layout.eatlayout,null);
            ImageView eatImageView=(ImageView) view.findViewById(R.id.imageView);
            TextView eatTextView=(TextView) view.findViewById(R.id.textView);
            eatImageView.setImageResource(images[position]);
            eatTextView.setText(Name[position]);
            return view;
        }
    }

    public void click(View view) {
        Intent in = new Intent( Eat.this, Click.class);
        startActivity(in);
    }
}
