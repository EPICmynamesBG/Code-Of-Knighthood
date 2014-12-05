package honr.creativeProj.codeofknighthood.activities;

import honr.creativeProj.codeofknighthood.R;
import honr.creativeProj.codeofknighthood.backend.TextParser;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

 
public class Text1Activity extends Fragment {
    
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }
        setText();
        return (ScrollView)inflater.inflate(R.layout.text1_activity, container, false);
    }
    
    private void setText(){
		String filename1, filename2,filename3;
		String output1, output2, output3;
		filename1="Text1_1"; filename2="Text1_2"; filename3="Text1_3";
		output1=TextParser.parseFile(filename1);
		output2=TextParser.parseFile(filename2);
		output3=TextParser.parseFile(filename3);
		TextView text1_1=(TextView) getView().findViewById(R.id.text1_1);
		TextView text1_2=(TextView) getView().findViewById(R.id.text1_2);
		TextView text1_3=(TextView) getView().findViewById(R.id.text1_3);
		text1_1.setText(output1);
		text1_2.setText(output2);
		text1_3.setText(output3);
	}
}