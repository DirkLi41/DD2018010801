package tw.com.pcschool.dd2018010801;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView actv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actv1 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        String[] str = {"aaa","aab","aac","bbc","bbb","bba","cca","ccc","ccb"};
        ArrayAdapter<String> aada1 = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                str
        );
        actv1.setThreshold(1);
        actv1.setAdapter(aada1);
    }
}
