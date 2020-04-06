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

public class Bloodvessels extends AppCompatActivity {
    ListView boListView;
    ImageView boImageView;
    TextView boTextView;

    int[] images = {R.drawable.heart, R.drawable.leg, R.drawable.hand, R.drawable.baby,R.drawable.al,R.drawable.alt};
    String[] Name={ " مشاكل القلب:تحدث عندما تكون هنالك عملية تصلب (تراكم طبقة خليط من الكالسيوم والدهون) في داخل الأوعية الدموية التاجية،أو عندما يحدث انقباض في هذه الأوعية الدموية، فمن المحتمل حدوث تضيّق في جوفها، الأمر الذي يعيق إيصال الدم إلى عضل القلب",
     " التهاب الأوعية الدموية التحسسي:العلامة الرئيسية لهذه الحالة هى بقع حمراء على جلدك،وعادة على ساقيك السفلية،ويمكن أن يسببها عدوى أو رد فعل سلبي على الدواء",
    " التهاب الأوعية الدموية المجهرية:هذا الشكل من التهاب الأوعية الدموية يؤثر على الأوعية الدموية الصغيرة،وعادة ما تكون فى الكلى والرئتين أو الأعصاب،وقد تتطور لألم فى البطن وطفح جلدي،حمى،آلام فى العضلات وفقدان الوزن،وإذا تأثرت الرئتان سيكون هناك سعال الدم",
  " مرض بهجت:هذا المرض يسبب التهاب الشرايين والأوردة، وتشمل الأعراض تقرحات الفم والعضلات التناسلية، والتهاب العين، والآفات الجلدية مثل حب الشباب",
    " التهاب الشرايين العقدى:هذا الشكل من التهاب الأوعية الدموية عادة ما يؤثر على الكلى،والجهاز الهضمي،والأعصاب والجلد،وتشمل الأعراض طفحا جلديا،وفقدان الوزن،وآلاما فى العضلات والمفاصل،وآلاما فى البطن بعد تناول الطعام،وارتفاع ضغط الدم،وآلاما فى العضلات وضعف،ومشاكل فى الكلى",
   " مرض كاواساكي:هذه الحالة غالبا ما تؤثر على الأطفال الذين تقل أعمارهم عن 5 سنوات، وتشمل الأعراض الحمى والطفح الجلدى واحمرار العينين، ويسمى أيضا متلازمة العقدة الليمفاوية المخاطي الجلدي",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloodvessels);
        Intent intent=getIntent();
        boListView = findViewById(R.id.bolistview);
        CustomerAdaptor customerAdaptor=new CustomerAdaptor();
        boListView.setAdapter(customerAdaptor);
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
            View view=getLayoutInflater().inflate(R.layout.bloodvessselslayout,null);
            ImageView boImageView=(ImageView) view.findViewById(R.id.imageView);
            TextView boTextView=(TextView) view.findViewById(R.id.textView);
            boImageView.setImageResource(images[position]);
            boTextView.setText(Name[position]);
            return view;
        }
    }

    public void click(View view) {
        Intent in = new Intent( Bloodvessels.this, Click.class);
        startActivity(in);
    }
}
