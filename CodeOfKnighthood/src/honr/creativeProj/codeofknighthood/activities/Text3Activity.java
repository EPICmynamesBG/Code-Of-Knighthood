package honr.creativeProj.codeofknighthood.activities;
 
import honr.creativeProj.codeofknighthood.R;
import honr.creativeProj.codeofknighthood.viewManager.FragmentTextSetter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
 
public class Text3Activity extends Fragment {
    
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	View thisView = inflater.inflate(R.layout.text3_activity, container,false);
    	FragmentTextSetter.setText(thisView, "Text3");
        return (ScrollView) thisView;
    }
    
}