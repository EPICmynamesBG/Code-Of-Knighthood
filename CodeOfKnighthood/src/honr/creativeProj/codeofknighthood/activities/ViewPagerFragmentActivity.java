package honr.creativeProj.codeofknighthood.activities;


import honr.creativeProj.codeofknighthood.activities.PagerAdapter; 
import honr.creativeProj.codeofknighthood.backend.TextParser;
import honr.creativeProj.codeofknighthood.R;

import java.util.List;
import java.util.Vector;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Window;
import android.view.WindowManager;

 
public class ViewPagerFragmentActivity extends FragmentActivity{

    private PagerAdapter mPagerAdapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFullScreen();
        super.setContentView(R.layout.viewpager_layout);
        TextParser.setAssets(getAssets());
        this.initialisePaging();
    }
    
    private void setFullScreen() {
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.main_activity);
	}
 
    private void initialisePaging() {
 
        List<Fragment> fragments = new Vector<Fragment>();
        fragments.add(Fragment.instantiate(this, Text1Activity.class.getName()));
        fragments.add(Fragment.instantiate(this, Text2Activity.class.getName()));
        fragments.add(Fragment.instantiate(this, Text3Activity.class.getName()));
        fragments.add(Fragment.instantiate(this, Text4Activity.class.getName()));
        fragments.add(Fragment.instantiate(this, ReferencesActivity.class.getName()));
        this.mPagerAdapter  = new PagerAdapter(super.getSupportFragmentManager(), fragments);
        //
        ViewPager pager = (ViewPager)super.findViewById(R.id.viewpager);
        pager.setAdapter(this.mPagerAdapter);
    }
}