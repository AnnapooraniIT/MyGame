package com.mygame;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class third extends Activity {
	ToggleButton a,b,c,d,e,f,g,h,i;
	TextView txt;
	int a1=0,b1=0,c1=0,d1=0,e1=0,f1=0;
	public static int score=0;
	@Override
	public void onBackPressed() {
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.thirdx);
		 txt=(TextView)findViewById(R.id.textView2);
		 txt.setTextColor(Color.RED);
		 
		 a=(ToggleButton)findViewById(R.id.button1);
		 b=(ToggleButton)findViewById(R.id.button2);
		 c=(ToggleButton)findViewById(R.id.button3);
		 d=(ToggleButton)findViewById(R.id.button4);
		 e=(ToggleButton)findViewById(R.id.button5);
		 f=(ToggleButton)findViewById(R.id.button6);	
		 g=(ToggleButton)findViewById(R.id.button7);
		 h=(ToggleButton)findViewById(R.id.button8);
		 i=(ToggleButton)findViewById(R.id.button9);  
		
		 a.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				a1=1;
				b.setChecked(false);
                c.setChecked(false);
             
                b1=0;c1=0;
			}
		});
		 
		 b.setOnClickListener(new OnClickListener() {
				
		
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					b1=1;
					a.setChecked(false);
	                c.setChecked(false);
	                a1=0;c1=0;
				}
			});
	
		 c.setOnClickListener(new OnClickListener() {
				
			
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					c1=1;
					b.setChecked(false);
	                a.setChecked(false);
	                a1=0;b1=0;

				}
			});
		 d.setOnClickListener(new OnClickListener() {
				
			
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					d1=1;
					e1=0;f1=0;
	                e.setChecked(false);
	                f.setChecked(false);
				}
			});
		 e.setOnClickListener(new OnClickListener() {
				
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					e1=1;
					d1=0;f1=0;
	                d.setChecked(false);
	               
	                f.setChecked(false);
				}
			});
		 
		 f.setOnClickListener(new OnClickListener() {
				
			
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					f1=1;
					d.setChecked(false);
	                e.setChecked(false);
	                d1=0;e1=0;
				}
			});
		 g.setOnClickListener(new OnClickListener() {
				
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
				      
				     
				      
				     mysecond.player.release(); 
					MygameActivity.pg = MygameActivity.pg%3;
					 if(MygameActivity.pg==0)
					 {
						 if(c1==1 && f1==1)
						 {
							 Toast.makeText(getBaseContext(),"CORRECT !!",Toast.LENGTH_LONG ).show();
						   score++;
						   
						 }
						 else
							 Toast.makeText(getBaseContext(),"SORRY WRONG",Toast.LENGTH_SHORT ).show();
						   
					 }
					 
					 else if(MygameActivity.pg==1)
					 {
						 if(a1==1 && e1==1)
						 {
							 Toast.makeText(getBaseContext(),"CORRECT !!",Toast.LENGTH_LONG ).show();
						    score++;
						    
						 }
						 else
							 Toast.makeText(getBaseContext(),"SORRY WRONG",Toast.LENGTH_SHORT).show();
						 
					 }
					 
					 else if(MygameActivity.pg==2)
					 {
						 if(b1==1 && d1==1)
						 {
							 Toast.makeText(getBaseContext(),"CORRECT !!",Toast.LENGTH_LONG ).show();
						        score++;
						        
						 }
						 else
							 Toast.makeText(getBaseContext(),"SORRY WRONG",Toast.LENGTH_SHORT ).show();
						   
					 }
				txt.setText("SCORE : "+score);
				}
			});
	
	h.setOnClickListener(new OnClickListener() {
		

		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 
			   a1=0;b1=0;c1=0;d1=0;e1=0;f1=0;
			   Intent i= new Intent(third.this,mysecond.class);
				startActivity(i);
				MygameActivity.d=1;
			   
		}
	});
	
	i.setOnClickListener(new OnClickListener() {
		
	
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			   a1=0;b1=0;c1=0;d1=0;e1=0;f1=0;
			Intent i= new Intent(third.this,MygameActivity.class);
			startActivity(i);
		
		}
	});
	}
	

}
