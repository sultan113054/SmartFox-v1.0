package com.special.SmartFox;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Budget extends Activity implements OnClickListener {

	EditText name, balance, currency, catagory, other;
	Button btnAdd, btnDelete, btnModify, btnViewAll;
	SQLiteDatabase db;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.budget);

		this.getWindow().setSoftInputMode(
				WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

		name = (EditText) findViewById(R.id.edt1);
		balance = (EditText) findViewById(R.id.edt2);
		currency = (EditText) findViewById(R.id.edt3);
		catagory = (EditText) findViewById(R.id.edt4);
		other = (EditText) findViewById(R.id.edt5);
		btnAdd = (Button) findViewById(R.id.btn1);
		btnDelete = (Button) findViewById(R.id.btn2);
		btnModify = (Button) findViewById(R.id.btn3);
		btnViewAll = (Button) findViewById(R.id.btn4);

		btnAdd.setOnClickListener(this);
		btnDelete.setOnClickListener(this);
		btnModify.setOnClickListener(this);
		btnViewAll.setOnClickListener(this);

		db = openOrCreateDatabase("UserDB", Context.MODE_PRIVATE, null);
		db.execSQL("CREATE TABLE IF NOT EXISTS user_bdgt(name VARCHAR,balance LONGINT,currency VARCHAR,catagory VARCHAR,other VARCHAR);");
	}

	public void onClick(View view) {
		if (view == btnAdd) {
			if (name.getText().toString().trim().length() == 0
					|| balance.getText().toString().trim().length() == 0
					|| currency.getText().toString().trim().length() == 0) {
				showMessage("Error", "Please Enter All Essential Values");
				return;
			}
			db.execSQL("INSERT INTO user_bdgt VALUES('" + name.getText() + "','"
					+ balance.getText() + "','" + currency.getText() + "','"
					+ catagory.getText() + "','" + other.getText() + "');");
			showMessage("Success", "Record added");
			clearText();
		}
		if (view == btnDelete) {
			if (name.getText().toString().trim().length() == 0) {
				showMessage("Error", "Please enter Name");
				return;
			}
			Cursor c = db.rawQuery(
					"SELECT * FROM user_bdgt WHERE name='" + name.getText()
							+ "'", null);
			if (c.moveToFirst()) {
				db.execSQL("DELETE FROM user_bdgt WHERE name='" + name.getText()
						+ "'");
				showMessage("Success", "Record Deleted");
			} else {
				showMessage("Error", "Invalid Name");
			}
			clearText();
		}
		if (view == btnModify) {
			if (name.getText().toString().trim().length() == 0) {
				showMessage("Error", "Please enter Name");
				return;
			}
			Cursor c = db.rawQuery(
					"SELECT * FROM user_bdgt WHERE Name='" + name.getText()
							+ "'", null);
			if (c.moveToFirst()) {
				db.execSQL("UPDATE user_bdgt SET balance='" + balance.getText()
						+ "',currency='" + currency.getText() + "',catagory='"
						+ catagory.getText() + "',other='"+other.getText()+
    					"' WHERE name='"
						+ name.getText() + "'");
				showMessage("Success", "Record Modified");
			} else {
				showMessage("Error", "Invalid Name");
			}
			clearText();
		}

		if (view == btnViewAll) {
			Cursor c = db.rawQuery("SELECT * FROM user_bdgt", null);
			if (c.getCount() == 0) {
				showMessage("Error", "No records found");
				return;
			}
			StringBuffer buffer = new StringBuffer();
			while (c.moveToNext()) {
				buffer.append("Name: " + c.getString(0) + "\n");
				buffer.append("Account: " + c.getString(1) + "\n");
				buffer.append("Amount: " + c.getString(2) + "\n");
				buffer.append("From Date: " + c.getString(3) + "\n");
				buffer.append("To Date: " + c.getString(4) + "\n\n");
			}
			showMessage("Budget Info", buffer.toString());
		}

	}

	public void showMessage(String title, String message) {
		AlertDialog.Builder builder = new AlertDialog.Builder(
				new ContextThemeWrapper(this, R.style.AlertDialogCustom));

		builder.setCancelable(true);
		builder.setTitle(title);
		builder.setMessage(message);
		builder.show();
	}

	public void clearText() {
		name.setText("");
		balance.setText("");
		currency.setText("");
		catagory.setText("");
		other.setText("");
		name.requestFocus();
	}
}