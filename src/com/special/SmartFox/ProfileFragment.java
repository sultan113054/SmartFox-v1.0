package com.special.SmartFox;

import com.special.SmartFox.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.app.AlertDialog.Builder;
import android.database.Cursor;




public class ProfileFragment extends Fragment {
	TextView name,email,cellno,address;
	
	SQLiteDatabase db;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	 View InputFragmentView = inflater.inflate(R.layout.profile, container, false);

    		
     //    db=getActivity().openOrCreateDatabase("UserDB", Context.MODE_PRIVATE, null);
    //	 db.execSQL("CREATE TABLE IF NOT EXISTS user(name VARCHAR,email VARCHAR,cellno VARCHAR,address VARCHAR);");
    		
       //  db.execSQL("INSERT INTO student VALUES('Ashiq','ar@gmail.com','01680880171','Rajshahi');");

      //   Cursor c=db.rawQuery("SELECT * FROM user", null);
         
     //    Integer index0=c.getColumnIndex("name");
     //    Integer index1 = c.getColumnIndex("species");   
     //    Integer index2 = c.getColumnIndex("area");
     //    Integer index3 = c.getColumnIndex("sampler");

         
            	// firstCol=new TextView(getActivity());
                // firstCol.setText(c.getString(index0));
     //    name=(TextView) getView().findViewById(R.id.name);
     //    Cursor c=db.rawQuery("SELECT * FROM user", null);
     //    name.setText("");
         //move cursor to first position
     //    c.moveToFirst();
         //fetch all data one by one
     //    do
     //    {
          //we can use c.getString(0) here
          //or we can get data using column index
         // String name=c.getString(c.getColumnIndex("email"));
       //   String surname=c.getString(1);
          //display on text view
      //    name.append("Name:"+surname+"\n");
          //move next position until end of the data
      //   }while(c.moveToNext()); 
         
        return InputFragmentView;
    }
    
    }

   

