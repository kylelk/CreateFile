package com.CreateFile;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.io.*;
import android.content.*;


public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	public void saveButton(View v) throws FileNotFoundException{
		EditText textbodyField = (EditText) findViewById(R.id.textbody_field);
		String textbody = textbodyField.getText().toString();
		EditText filePath = (EditText) findViewById(R.id.file_path);
		String FilePath = filePath.getText().toString();
		
		if(FilePath == null){
			Context context = getApplicationContext(); 
			CharSequence text = "Please enter file path";
			int duration = Toast.LENGTH_SHORT;
			Toast toast = Toast.makeText(context, text, duration); 
			toast.show();
		} 
		else
		{
			PrintWriter writer = new PrintWriter(FilePath); 
			writer.println(textbody);  
			writer.close();

			Context context = getApplicationContext(); 
			CharSequence text = FilePath;
			int duration = Toast.LENGTH_SHORT;
			Toast toast = Toast.makeText(context, text, duration); 
			toast.show();
		}
	}
}
