package com.example.dice3;

import android.app.Activity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	
	ImageView img_c, img_u;
	Button btn;
	TextView txt;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        img_c = (ImageView)findViewById(R.id.imageView1);
        img_u = (ImageView)findViewById(R.id.imageView2);
        btn = (Button)findViewById(R.id.button1);
        txt = (TextView)findViewById(R.id.textView3);
        
        btn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		int ran_c = (int)Math.round(Math.random() * 5);
		int ran_u = (int)Math.round(Math.random() * 5);
		
		img_c.setImageResource(R.drawable.dice21 + ran_c);
		img_u.setImageResource(R.drawable.dice21 + ran_u);
		
		if (ran_c > ran_u)
			txt.setText("컴퓨터가 이겼습니다.");
		else if(ran_u > ran_c)
			txt.setText("당신이 이겼습니다.");
		else
			txt.setText("비겼습니다");
	}
}
