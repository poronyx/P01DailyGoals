package sg.edu.rp.c347.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDone = (Button) findViewById(R.id.button);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                EditText reflection = (EditText) findViewById(R.id.editText);
                RadioGroup radG1 = (RadioGroup) findViewById(R.id.radioGroup1);
                RadioGroup radG2 = (RadioGroup) findViewById(R.id.radioGroup2);
                RadioGroup radG3 = (RadioGroup) findViewById(R.id.radioGroup3);

                TextView tv1 = (TextView) findViewById(R.id.textView1);
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                TextView tv3 = (TextView) findViewById(R.id.textView3);


                String choice1 = "";
                String choice2 = "";
                String choice3 = "";

                if (radG1.getCheckedRadioButtonId() == 0){
                    choice1 = "Yes";
                }else{
                    choice1 = "No";
                }
                if (radG2.getCheckedRadioButtonId() == 0){
                    choice2 = "Yes";
                }else{
                    choice2 = "No";
                }
                if (radG3.getCheckedRadioButtonId() == 0){
                    choice3 = "Yes";
                }else{
                    choice3 = "No";
                }



                String[] info = {reflection.getText().toString(), choice1, choice2, choice3};

                Intent i = new Intent(MainActivity.this, Summary.class);

                i.putExtra("info", info);

                startActivity(i);
            }
        });
    }
}
