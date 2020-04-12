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

public class Nose extends AppCompatActivity {
    ListView nListView;
    ImageView nImageView;
    TextView nTextView;

    int[] images = {R.drawable.middleear, R.drawable.alhalk, R.drawable.nose, R.drawable.lwaz,R.drawable.sinuses};
    String[] Name ={"التهاب الأذن الوسطى:يحدث التهاب الأذن الوسطى في معظم الأحيان بسبب عدوى بكتيرية أو فيروسية تؤثر في الأذن الوسطى مما يؤدي إلى تراكم السوائل خلف طبلة الأذن،ويعد هذا المرض من أكثر الأمراض شيوعًا بين الأطفال حيث يصابون به أكثر من البالغين",
    "التهاب الحلق:هو الشعور بألم،أو حرقة،أو جفاف في الحلق،يسبب صعوبة في البلع.ويُعد التهاب الحلق من أكثر الأمراض شيوعًا لدى الأطفال. ويزول التهاب الحلق غالبًا دون تدخل طبي،وفي بعض الحالات يجب إجراء اختبارات؛ لمعرفة ما إذا كان الطفل بحاجة إلى مضادات حيوية",
    "لحميه الانف:يعتبر لحمية الأنف على أنها عبارة عن إنتفاخ في الاغشية المخاطية التي تكون مبطنة للجيوب الأنفية،وفي أغلب الاحيان تظهر اللحمية في تجاويف الأنف الاثنين معاً،ولكن إذا ظهرت في جانب واحد من الأنف فهذا قد يكون نوع آخر من لحمية الأنف أو يكون مرض غير حميد لا سمح الله،لذا في هذه الحالة يجب مراجعة الطبيب فوراً،وتصيب اللحميه الاطفال والكبار",
    "التهاب اللوزتين:هو مرض من الأمراض الشائعة والمنتشرة بشكل كبير وخصوصا عند الأطفال.يحدث هذا الالتهاب بفعل بكتيريا تنتمي لمجموعة بكتيريا عقدية مقيحة.قد تحدث مضاعفات هامة نتيجة للإصابة بالتهاب اللوزتين القيحي وهي: مرض من الأمراض الشائعة والمنتشرة بشكل كبير وخصوصا عند الأطفال. يحدث هذا الالتهاب بفعل بكتيريا تنتمي لمجموعة بكتيريا عقدية مقيحة. قد تحدث مضاعفات هامة نتيجة للإصابة بالتهاب اللوزتين القيحي وهي:امتداد الالتهاب إلى المنطقة حول اللوزة وتشكيل مايدعى خراج حول اللوزة. الجفاف عند الطفل بسبب عدم قدرته على البلع أو ألم البلع. انسداد المجري التنفسي. قد تحدث اختلاطات تالية للإصابة بالجراثيم العقدية وهي الحمى الروماتيزمية والتهاب الكبد والكلية",
    "التهاب الجيوب الأنفية:هو حالة مرضية يصاب بها الشخص عندما تصبح الجيوب الأنفية متهيجة وملتهبة ومتورمة نتيجة نوع معين من الفيروسات أو البكتيريا. ومن الممكن أن يتحول التهاب الجيوب الأنفية من حالة عابرة إلى مرض مزمن مع الوقت إن لم يحصل المصاب على المتابعة والرعاية الصحية الضرورية"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nose);
        Intent intent=getIntent();

        nListView = findViewById(R.id.nlistview);
        CustomerAdaptor customerAdaptor=new CustomerAdaptor();
        nListView.setAdapter(customerAdaptor);
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
            View view=getLayoutInflater().inflate(R.layout.noselayout,null);
            ImageView nImageView=(ImageView) view.findViewById(R.id.imageView);
            TextView nTextView=(TextView) view.findViewById(R.id.textView);
            nImageView.setImageResource(images[position]);
            nTextView.setText(Name[position]);
            return view;
        }
    }

    public void click(View view) {
        Intent in = new Intent( Nose.this, Click.class);
        startActivity(in);
    }
}
