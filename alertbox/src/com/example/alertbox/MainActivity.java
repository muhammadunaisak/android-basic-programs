package com.example.alertbox;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button1);
        btn.setOnClickListener(this);
    }
    

    @Override
   public void onClick(View arg0){
    	AlertDialog.Builder b1= new AlertDialog.Builder(MainActivity.this);
    	b1.setIcon(R.drawable.ic_launcher);
    	b1.setTitle("sample title box");
    	b1.setMessage("hello,go ahead");
    	b1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "You Clicked OK", 
						Toast.LENGTH_LONG).show(); 
				
			}
		});
    	b1.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "you clicked cancel", Toast.LENGTH_LONG).show();
			}
		});
    	 AlertDialog dl = b1.create(); 
    	 dl.show(); 
    	
    }
  
    
}
