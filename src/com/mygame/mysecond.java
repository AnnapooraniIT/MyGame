package com.mygame;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;


public class mysecond extends Activity {
	

	public static MediaPlayer player;
    public static void SoundPlayer(Context ctx,int raw_id){
            player = MediaPlayer.create(ctx, raw_id);
            player.setLooping(false); // Set looping
            player.setVolume(100, 100);

            //player.release();
             player.start();
        }
	
	ImageView i1,i2,i3,i4,i5,i6;
	@Override
	public void onBackPressed() {
	}

		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.second);
		    mysecond.SoundPlayer(mysecond.this,R.raw.kk);
		 i1=(ImageView)findViewById(R.id.imageView6);
		 i2=(ImageView)findViewById(R.id.imageView5);
		 i3=(ImageView)findViewById(R.id.imageView2);
		 i4=(ImageView)findViewById(R.id.imageView1);
		 i5=(ImageView)findViewById(R.id.imageView3);
		 i6=(ImageView)findViewById(R.id.imageView4);
		 
		 MygameActivity.pg = MygameActivity.pg%3;
		 
		 if(MygameActivity.pg==0)
		 {
		 i1.setBackgroundResource(R.drawable.ece);
		 i2.setBackgroundResource(R.drawable.img1);
		 i3.setBackgroundResource(R.drawable.img4);
		 i4.setBackgroundResource(R.drawable.lib);
		 i5.setBackgroundResource(R.drawable.img5);
		 i6.setBackgroundResource(R.drawable.img4);
		 }
		 else if(MygameActivity.pg==1)
		 {
			 i1.setBackgroundResource(R.drawable.img5);
			 i2.setBackgroundResource(R.drawable.cfv);
			 i3.setBackgroundResource(R.drawable.img4);
			 i4.setBackgroundResource(R.drawable.tpv);
			 i5.setBackgroundResource(R.drawable.img5);
			 i6.setBackgroundResource(R.drawable.image2);
			 
		 }
		 else if(MygameActivity.pg==2)
		 {
			 i1.setBackgroundResource(R.drawable.lib);
			 i2.setBackgroundResource(R.drawable.image2);
			 i3.setBackgroundResource(R.drawable.img5);
			 i4.setBackgroundResource(R.drawable.image2);
			 i5.setBackgroundResource(R.drawable.cfv);
			 i6.setBackgroundResource(R.drawable.img4);
			 
		 }
		 Thread t=new Thread(){
	        	public void run()
	        	{
	        		try{
	        			if(MygameActivity.a==1)
	        			{
	        				sleep(2050);
	        			}
	        			else if(MygameActivity.b==1)
	        			{
	        				sleep(1750);
	        			}
	        			else if(MygameActivity.c==1)
	        			{
	        				sleep(1000);
	        			}
	        			else if(MygameActivity.d==1)
	        				sleep(2600);
	        			else
	        				sleep(2000);
	        			
	        		}
	        		catch(InterruptedException e)
	        		{
	        			e.printStackTrace();
	        			}
	        		finally
	        		{
	                       MygameActivity.a=0;
	                       MygameActivity.b=0;
	                       MygameActivity.c=0;
	                       MygameActivity.d=0;
	                   
	        		
	                       Intent i= new Intent(mysecond.this,third.class);    
	        		
	        			startActivity(i);
	        		
	        		
	        		}
	        	}
	        };
	        t.start();
		 
		 
		
	}

}
