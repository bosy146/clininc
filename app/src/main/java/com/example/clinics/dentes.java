package com.example.clinics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class dentes extends AppCompatActivity {
    ListView dListView;
    ImageView dImageView;
    TextView dTextView;

    int[] images = {R.drawable.smile, R.drawable.tkwem, R.drawable.zara, R.drawable.hshw};
    String[] Name = {" ابتسامه هوليود:هي عبارة قشورVeneers رقيقة جداً يتم تصنيعها خصيصاً لكل فرد،من ثم وضعها على الجهة الأمامية من السن بهدف: تحسين شكله. زيادة بياضه بشكل دائم. وبالتالي تحسين الشكل العام للشخص.",
            " تقويم الاسنان:يُعتبر علاجاً فعّالاً للأسنان، حيث يعمل على تحسين المظهر من خلال تحسين الابتسامة، ويعمل أيضاً على تعديل ترتيب الأسنان المتقوّسة أو المعوجة، وتصحيح تزاحم الأسنان وجعلها على استقامة واحدة، كما ويساهم في تطابق الأسنان الأمامية والخلفية",
            "زراعه الاسنان:هي طريقةٌ شائعةٌ ومجديةٌ لتعويض الأسنان المفقودة، وتُصمَم بطريقةٍ تتلاءم مع الأسنان الأخرى الموجودة في الفم، وزرعات الأسنان عبارةٌ عن دعاماتٍ تثبت جراحياً في عظم الفك العلوي أو السفلي، وتعمل كمُرتكزٍ قويٍّ للسن الذي سيتم زرعه",
            " حشو الاسنان:ي عملية إجراء حشو الأسنان عادة بمواد صلبة في تجويف الأسنان يصبح بعدها كثر مقاومة لقوى المضغ.الأسباب التي نحتاج فيها إلى حشو الأسنان:التسوس،حساسيه الاسنان،كسر الأسنان وبدل حشوة سابقة"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dentes);
        Intent intent = getIntent();

        dListView = findViewById(R.id.dlistview);
        CustomerAdaptor customerAdaptor=new CustomerAdaptor();
        dListView.setAdapter(customerAdaptor);
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
                View view=getLayoutInflater().inflate(R.layout.denteslayout,null);
                ImageView dImageView=(ImageView) view.findViewById(R.id.imageView);
                TextView dTextView=(TextView) view.findViewById(R.id.textView);
                dImageView.setImageResource(images[position]);
                dTextView.setText(Name[position]);
                return view;
            }
        }



    public void click(View view) {
        Intent in = new Intent( dentes.this, Click.class);
        startActivity(in);
    }
}
