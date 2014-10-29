package com.example.cipher;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class CipherActivity extends Activity
{

	private ArrayList<String> letterList;
	private Button EncipherButton;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		String encodedMessage = new String("Message");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cipher);
		letterList = new ArrayList<String>();
		encode(ToSendTextBox);
		setupListeners();
	}

	private void filltheletterList()
	{
		letterList.add("a");
		letterList.add("b");
		letterList.add("c");
		letterList.add("d");
		letterList.add("e");
		letterList.add("f");
		letterList.add("g");
		letterList.add("h");
		letterList.add("i");
		letterList.add("j");
		letterList.add("k");
		letterList.add("l");
		letterList.add("m");
		letterList.add("n");
		letterList.add("p");
		letterList.add("q");
		letterList.add("r");
		letterList.add("s");
		letterList.add("t");
		letterList.add("u");
		letterList.add("v");
		letterList.add("w");
		letterList.add("x");
		letterList.add("y");
		letterList.add("z");
	}

	public String encode(String ToSendTextBox)
	{
		String encodedMessage = new String("Message");
		
		
		return encodedMes;
		
	}
	
	private void setupListeners()
	{
		EncipherButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				encode(null);
			}
		});
	}

}
