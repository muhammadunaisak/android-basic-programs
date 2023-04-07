package com.example.add;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText t1,t2;
	TextView v1;
    Button b1;
    Float a,b,c;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText) findViewById(R.id.editText1);
        t2=(EditText) findViewById(R.id.editText2);
        v1=(TextView) findViewById(R.id.textView3);
        b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 a=Float.parseFloat(t1.getText().toString());
			        b=Float.parseFloat(t2.getText().toString());
			        c=a+b;
			        v1.setText(Float.toString(c));
			               	
			}
		});
       
    }
 
}
