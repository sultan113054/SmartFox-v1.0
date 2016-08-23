package com.special.SmartFox;

import com.special.SmartFox.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class FinanceFragment extends Fragment {
	Fragment fr;
    FragmentManager fm;
    FragmentTransaction fragmentTransaction;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	 View InputFragmentView = inflater.inflate(R.layout.finance, container, false);

    	    final ImageButton translate_button1 = (ImageButton) InputFragmentView.findViewById(R.id.button1);
    	    final ImageButton translate_button2 = (ImageButton) InputFragmentView.findViewById(R.id.button2);
    	    final ImageButton translate_button3 = (ImageButton) InputFragmentView.findViewById(R.id.button3);
    	    final ImageButton translate_button4 = (ImageButton) InputFragmentView.findViewById(R.id.button4);
    	    final ImageButton translate_button5 = (ImageButton) InputFragmentView.findViewById(R.id.button5);
    	    final ImageButton translate_button6 = (ImageButton) InputFragmentView.findViewById(R.id.button6);
    	    final ImageButton translate_button7 = (ImageButton) InputFragmentView.findViewById(R.id.button7);
    	    final ImageButton translate_button8 = (ImageButton) InputFragmentView.findViewById(R.id.button8);
    	   translate_button1.setOnClickListener(new OnClickListener()
    	    {
    	        @Override
    	        public void onClick(View view)
    	        {
    	            

    	           Intent i= new Intent(getActivity(),Account.class);
    	           startActivity(i);
    	           

    	       }
    	    });
    
        translate_button2.setOnClickListener(new OnClickListener()
	    {
	        @Override
	        public void onClick(View view)
	        {
	            

	           Intent i= new Intent(getActivity(),Transfer.class);
	           startActivity(i);
	           

	       }
	    });
        
        translate_button3.setOnClickListener(new OnClickListener()
	    {
	        @Override
	        public void onClick(View view)
	        {
	            

	           Intent i= new Intent(getActivity(),Budget.class);
	           startActivity(i);
	           

	       }
	    });
        translate_button4.setOnClickListener(new OnClickListener()
	    {
	        @Override
	        public void onClick(View view)
	        {
	            

	           Intent i= new Intent(getActivity(),Income.class);
	           startActivity(i);
	           

	       }
	    });
        translate_button5.setOnClickListener(new OnClickListener()
	    {
	        @Override
	        public void onClick(View view)
	        {
	            

	           Intent i= new Intent(getActivity(),Expense.class);
	           startActivity(i);
	           

	       }
	    });
        translate_button6.setOnClickListener(new OnClickListener()
	    {
	        @Override
	        public void onClick(View view)
	        {
	            

	           Intent i= new Intent(getActivity(),Planning.class);
	           startActivity(i);
	           

	       }
	    });
        translate_button7.setOnClickListener(new OnClickListener()
	    {
	        @Override
	        public void onClick(View view)
	        {
	            

	           Intent i= new Intent(getActivity(),Chart.class);
	           startActivity(i);
	           

	       }
	    });
        translate_button8.setOnClickListener(new OnClickListener()
	    {
	        @Override
	        public void onClick(View view)
	        {
	            

	           Intent i= new Intent(getActivity(),Limit.class);
	           startActivity(i);
	           

	       }
	    });
    return InputFragmentView;
  
        
    }

   
}