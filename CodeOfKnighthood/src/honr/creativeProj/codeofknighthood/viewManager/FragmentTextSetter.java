package honr.creativeProj.codeofknighthood.viewManager;

import honr.creativeProj.codeofknighthood.R;
import honr.creativeProj.codeofknighthood.activities.ViewPagerFragmentActivity;
import honr.creativeProj.codeofknighthood.backend.TextParser;
import android.widget.TextView;

public class FragmentTextSetter extends ViewPagerFragmentActivity{

	public void setText(){
		String filename1, filename2,filename3;
		String output1, output2, output3;
		filename1="Text1_1"; filename2="Text1_2"; filename3="Text1_3";
		output1=TextParser.parseFile(filename1);
		output2=TextParser.parseFile(filename2);
		output3=TextParser.parseFile(filename3);
		TextView text1_1=(TextView) findViewById(R.id.text1_1);
		TextView text1_2=(TextView) findViewById(R.id.text1_2);
		TextView text1_3=(TextView) findViewById(R.id.text1_3);
		text1_1.setText(output1);
		text1_2.setText(output2);
		text1_3.setText(output3);
	}
}
