package honr.creativeProj.codeofknighthood.viewManager;

import honr.creativeProj.codeofknighthood.R;
import honr.creativeProj.codeofknighthood.backend.TextParser;
import android.view.View;
import android.widget.TextView;

public class FragmentTextSetter{


    public static void setText(View view,String activityName){
    	String filename1, filename2,filename3;
		String output1, output2, output3;
		int id1, id2, id3;
		if(activityName=="Text1"){
			filename1="Text1_1"; filename2="Text1_2"; filename3="Text1_3";
			id1=R.id.text1_1; id2=R.id.text1_2; id3=R.id.text1_3;
		}
		else if (activityName=="Text2"){
			filename1="Text2_1"; filename2="Text2_2"; filename3="Text2_3";
			id1=R.id.text2_1; id2=R.id.text2_2; id3=R.id.text2_3;
		}
		else if(activityName=="Text3"){
			filename1="Text3_1"; filename2="Text3_2"; filename3="Text3_3";
			id1=R.id.text3_1; id2=R.id.text3_2; id3=R.id.text3_3;
		}
		else{
			filename1="Error"; filename2="Error"; filename3="Error";
			id1=R.id.text1_1; id2=R.id.text1_2; id3=R.id.text1_3;
		}
		output1=TextParser.parseFile(filename1);
		output2=TextParser.parseFile(filename2);
		output3=TextParser.parseFile(filename3);
		TextView text1=(TextView) view.findViewById(id1);
		TextView text2=(TextView) view.findViewById(id2);
		TextView text3=(TextView) view.findViewById(id3);
		text1.setText(output1);
		text2.setText(output2);
		text3.setText(output3);
	}
}