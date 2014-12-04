package honr.creativeProj.codeofknighthood.activities;


import honr.creativeProj.codeofknighthood.activities.PagerAdapter; 
import honr.creativeProj.codeofknighthood.R;

import java.util.List;
import java.util.Vector;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

 
//http://thepseudocoder.wordpress.com/2011/10/05/android-page-swiping-using-viewpager/
 
public class ViewPagerFragmentActivity extends FragmentActivity{

    private PagerAdapter mPagerAdapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.viewpager_layout);
        //Initialize the pager
        this.initialisePaging();
    }
 
    private void initialisePaging() {
 
        List<Fragment> fragments = new Vector<Fragment>();
        fragments.add(Fragment.instantiate(this, Text1Activity.class.getName()));
        fragments.add(Fragment.instantiate(this, Text2Activity.class.getName()));
        fragments.add(Fragment.instantiate(this, Text3Activity.class.getName()));
        this.mPagerAdapter  = new PagerAdapter(super.getSupportFragmentManager(), fragments);
        //
        ViewPager pager = (ViewPager)super.findViewById(R.id.viewpager);
        pager.setAdapter(this.mPagerAdapter);
    }
}