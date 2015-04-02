package com.mygame;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.ToggleButton;

public class MygameActivity extends Activity {
    /** Called when the activity is first created. */
	  ToggleButton x,y,z,w;
	  
	  
	  public static  int pg=0;
	 public static int a=0,b=0,c=0,d=0;
	 @Override
	 public void onBackPressed() {
	 }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        x=(ToggleButton)findViewById(R.id.button1);
        y=(ToggleButton)findViewById(R.id.button2);
        z=(ToggleButton)findViewById(R.id.button3);
        w=(ToggleButton)findViewById(R.id.button4);
     
        x.setOnClickListener(new OnClickListener() {
		
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			pg++;
			
			Intent in=new Intent(MygameActivity.this,mysecond.class);
			startActivity(in);
			
			
		}
	});
        
   y.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				a=1;
				z.setChecked(false);
                w.setChecked(false);
    		b=0;c=0;	

			}
		  });
   z.setOnClickListener(new OnClickListener() {
		
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			b=1;
			y.setChecked(false);
            w.setChecked(false);
			a=0;c=0;
			
		}
	  });
   
   w.setOnClickListener(new OnClickListener() {
		
	
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			c=1;
			y.setChecked(false);
	        z.setChecked(false);
			a=0;b=0;

		}
	  });
    
    
    }
}