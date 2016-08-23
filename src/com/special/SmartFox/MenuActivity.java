package com.special.SmartFox;

import com.special.SmartFox.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MenuActivity extends FragmentActivity implements View.OnClickListener{

    private ResideMenu resideMenu;
    private MenuActivity mContext;
    private ResideMenuItem itemHome;
    private ResideMenuItem itemProfile;
    private ResideMenuItem itemSchedule;
    private ResideMenuItem itemFinance;
    private ResideMenuItem itemSecurity;     
    private ResideMenuItem itemCalendar;
    private ResideMenuItem itemHelp;
    private ResideMenuItem itemSettings;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mContext = this;
        setUpMenu();
        if( savedInstanceState == null )
            changeFragment(new HomeFragment());
    }

    private void setUpMenu() {

        // attach to current activity;
        resideMenu = new ResideMenu(this);
        resideMenu.setUse3D(true);
        resideMenu.setBackground(R.drawable.menu_background);
        resideMenu.attachToActivity(this);
        resideMenu.setMenuListener(menuListener);
        //valid scale factor is between 0.0f and 1.0f. leftmenu'width is 150dip. 
        resideMenu.setScaleValue(0.6f);

        // create menu items;
        itemHome     = new ResideMenuItem(this, R.drawable.icon_home,     "Home");
        itemProfile  = new ResideMenuItem(this, R.drawable.icon_profile,  "Profile");
        itemSchedule  = new ResideMenuItem(this, R.drawable.icon_calendar,  "Schedule");
        itemFinance  = new ResideMenuItem(this, R.drawable.icon_finance,  "Finance");
        itemSecurity = new ResideMenuItem(this, R.drawable.icon_security, "Security");        
        itemCalendar = new ResideMenuItem(this, R.drawable.icon_calendar, "Calendar");
        itemHelp = new ResideMenuItem(this, R.drawable.icon_help, "Help");
        itemSettings = new ResideMenuItem(this, R.drawable.icon_settings, "Settings");

        itemHome.setOnClickListener(this);
        itemProfile.setOnClickListener(this);
        itemSchedule.setOnClickListener(this);
        itemFinance.setOnClickListener(this);        
        itemSecurity.setOnClickListener(this);
        itemCalendar.setOnClickListener(this);
        itemHelp.setOnClickListener(this);        
        itemSettings.setOnClickListener(this);

        resideMenu.addMenuItem(itemHome, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemProfile, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemFinance, ResideMenu.DIRECTION_LEFT); 
        resideMenu.addMenuItem(itemSchedule, ResideMenu.DIRECTION_LEFT);
               
        resideMenu.addMenuItem(itemSecurity, ResideMenu.DIRECTION_RIGHT);        
        resideMenu.addMenuItem(itemCalendar, ResideMenu.DIRECTION_RIGHT);
        resideMenu.addMenuItem(itemHelp, ResideMenu.DIRECTION_RIGHT);
        resideMenu.addMenuItem(itemSettings, ResideMenu.DIRECTION_RIGHT);

        // You can disable a direction by setting ->
        // resideMenu.setSwipeDirectionDisable(ResideMenu.DIRECTION_RIGHT);

        findViewById(R.id.title_bar_left_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resideMenu.openMenu(ResideMenu.DIRECTION_LEFT);
            }
        });
        findViewById(R.id.title_bar_right_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resideMenu.openMenu(ResideMenu.DIRECTION_RIGHT);
            }
        });


    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return resideMenu.dispatchTouchEvent(ev);
    }

    @Override
    public void onClick(View view) {

        if (view == itemHome){
            changeFragment(new HomeFragment());
        }else if (view == itemProfile){
            changeFragment(new ProfileFragment());
        }else if (view == itemSchedule){
            changeFragment(new ScheduleFragment());
        }else if (view == itemFinance){
        	changeFragment(new FinanceFragment());           
        }else if (view == itemSecurity){
        	changeFragment(new SecurityFragment());        
        }else if (view == itemCalendar){
            changeFragment(new CalendarFragment());
           //Intent i=new Intent(this,DBtest.class);
           //startActivity(i);
        }else if (view == itemHelp){
            //changeFragment(new HelpFragment());
        	Intent i=new Intent(this,HelpSlider.class);
            startActivity(i);
        }else if (view == itemSettings){
            changeFragment(new SettingsFragment());
        }

        resideMenu.closeMenu();
    }

    private ResideMenu.OnMenuListener menuListener = new ResideMenu.OnMenuListener() {
        @Override
        public void openMenu() {
            //Toast.makeText(mContext, "Menu is opened!", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void closeMenu() {
            //Toast.makeText(mContext, "Menu is closed!", Toast.LENGTH_SHORT).show();
        }
    };

    private void changeFragment(Fragment targetFragment){
        resideMenu.clearIgnoredViewList();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment, targetFragment, "fragment")
                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }

    // What good method is to access resideMenu？
    public ResideMenu getResideMenu(){
        return resideMenu;
    }
}
