package com.special.SmartFox;

import com.special.SmartFox.R;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;


public class ScheduleFragment extends Fragment {

	Fragment fr;
    FragmentManager fm;
    FragmentTransaction fragmentTransaction;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	 View InputFragmentView = inflater.inflate(R.layout.schedule, container, false);

    	    final Button translate_button1 = (Button) InputFragmentView.findViewById(R.id.btn1);
    	    final Button translate_button2 = (Button) InputFragmentView.findViewById(R.id.btn2);
    	    final Button translate_button3 = (Button) InputFragmentView.findViewById(R.id.btn3);
    	    final Button translate_button4 = (Button) InputFragmentView.findViewById(R.id.btn4);
    	    final Button translate_button5 = (Button) InputFragmentView.findViewById(R.id.btn5);
    	    final Button translate_button6 = (Button) InputFragmentView.findViewById(R.id.btn6);
    	    final Button translate_button7 = (Button) InputFragmentView.findViewById(R.id.btn7);
    	    final Button translate_button8 = (Button) InputFragmentView.findViewById(R.id.btn8);
    	    final Button translate_button9 = (Button) InputFragmentView.findViewById(R.id.btn9);
    	    final Button translate_button10 = (Button) InputFragmentView.findViewById(R.id.btn10);
    	   translate_button1.setOnClickListener(new OnClickListener()
    	    {
    	        @Override
    	        public void onClick(View view)
    	        {
    	            

    	           Intent i= new Intent(getActivity(),lay1.class);
    	           startActivity(i);
    	           

    	       }
    	    });
    
        translate_button2.setOnClickListener(new OnClickListener()
	    {
	        @Override
	        public void onClick(View view)
	        {
	            

	           Intent i= new Intent(getActivity(),lay2.class);
	           startActivity(i);
	           

	       }
	    });
        
        translate_button3.setOnClickListener(new OnClickListener()
	    {
	        @Override
	        public void onClick(View view)
	        {
	            

	           Intent i= new Intent(getActivity(),lay3.class);
	           startActivity(i);
	           

	       }
	    });
        translate_button4.setOnClickListener(new OnClickListener()
	    {
	        @Override
	        public void onClick(View view)
	        {
	            

	           Intent i= new Intent(getActivity(),lay4.class);
	           startActivity(i);
	           

	       }
	    });
        translate_button5.setOnClickListener(new OnClickListener()
	    {
	        @Override
	        public void onClick(View view)
	        {
	            

	           Intent i= new Intent(getActivity(),lay5.class);
	           startActivity(i);
	           

	       }
	    });
        translate_button6.setOnClickListener(new OnClickListener()
	    {
	        @Override
	        public void onClick(View view)
	        {
	            

	           Intent i= new Intent(getActivity(),lay6.class);
	           startActivity(i);
	           

	       }
	    });
        translate_button7.setOnClickListener(new OnClickListener()
	    {
	        @Override
	        public void onClick(View view)
	        {
	            

	           Intent i= new Intent(getActivity(),lay7.class);
	           startActivity(i);
	           

	       }
	    });
        translate_button8.setOnClickListener(new OnClickListener()
	    {
	        @Override
	        public void onClick(View view)
	        {
	            

	           Intent i= new Intent(getActivity(),lay8.class);
	           startActivity(i);
	           

	       }
	    });
        
        translate_button9.setOnClickListener(new OnClickListener()
	    {
	        @Override
	        public void onClick(View view)
	        {
	            

	           Intent i= new Intent(getActivity(),lay9.class);
	           startActivity(i);
	           

	       }
	    });
        
        translate_button10.setOnClickListener(new OnClickListener()
	    {
	        @Override
	        public void onClick(View view)
	        {
	            

	           Intent i= new Intent(getActivity(),lay10.class);
	           startActivity(i);
	           

	       }
	    });
    return InputFragmentView;
  
        
    }

   
}
