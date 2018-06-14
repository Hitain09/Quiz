package com.example.hitainsmac.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkques41,checkques42,checkques43,checkques44;
    CheckBox checkques81,checkques82,checkques83,checkques84;
    RadioButton radioques2,radioques6,radioques1,radioques73;
    EditText editques3 , editques5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkques41 = (CheckBox) findViewById(R.id.checkques41_box);
        checkques42 = (CheckBox) findViewById(R.id.checkques42_box);
        checkques43 = (CheckBox) findViewById(R.id.checkques43_box);
        checkques44 = (CheckBox) findViewById(R.id.checkques44_box);

        checkques81 = (CheckBox) findViewById(R.id.checkques81_box);
        checkques82 = (CheckBox) findViewById(R.id.checkques82_box);
        checkques83 = (CheckBox) findViewById(R.id.checkques83_box);
        checkques84 = (CheckBox) findViewById(R.id.checkques84_box);

        radioques2 = (RadioButton) findViewById(R.id.radioques2);
        radioques6 = (RadioButton) findViewById(R.id.radioQues62_view);
        radioques1 = (RadioButton) findViewById(R.id.radQues1);
        radioques73 = (RadioButton) findViewById(R.id.radioques73_view);

        editques3 = (EditText) findViewById(R.id.editques3_view);
        editques5 = (EditText) findViewById(R.id.editques5);
    }
    public void submitButton(View view)
    {
        int count=0;
        if(radioques2.isChecked())
        {
            count++;
        }
        if(radioques6.isChecked())
        {
            count++;
        }
        if(radioques1.isChecked())
        {
            count++;
        }
        if(radioques73.isChecked())
        {
            count++;
        }
        if(checkques41.isChecked() && checkques42.isChecked() && checkques43.isChecked() && checkques44.isChecked())
        {
            count++;
        }
        if(checkques81.isChecked() && checkques82.isChecked() && !checkques83.isChecked() && !checkques84.isChecked())
        {
            count++;
        }
        String editquesAns3 ="Narender Modi";
        if(editques3.getText().toString().equalsIgnoreCase(editquesAns3))
        {
            count++;

        }
        String editquesAns5="Singapore";
        if(editques5.getText().toString().equalsIgnoreCase(editquesAns5))
        {
            count++;
        }
        if(count==8)
        {
            Toast.makeText(this,"All Answers Are Correct",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"All Answers Are Not Correct",Toast.LENGTH_SHORT).show();
        }
        TextView msg = (TextView) findViewById(R.id.result_text_view);
        msg.setText("Total Correct Answers:  "+ count);
    }
}
