package honr.creativeProj.codeofknighthood.activities;
 
import honr.creativeProj.codeofknighthood.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
 
public class Text1Activity extends Fragment {
    
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }
        return (ScrollView)inflater.inflate(R.layout.text1_activity, container, false);
    }
}