package honr.creativeProj.CodeOfKnighthood.activities;


import honr.creativeProj.codeofknighthood.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Text1Activity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setFullScreen();
		setContentView(R.layout.text1_activity);
		
		
		//Button button = (Button) findViewById(R.id.startButton);
		//button.setOnClickListener(startClick);
		
	}

	private void setFullScreen() {
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.text1_activity);
	}
	
	View.OnClickListener startClick = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			
			//MainActivity.this.startActivity(question1);
		}
	};
	
	
}
