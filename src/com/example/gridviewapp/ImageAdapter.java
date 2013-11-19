package com.example.gridviewapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ImageAdapter extends BaseAdapter {

	Context context; 
	String [] OperatingSystems;

	public ImageAdapter(Context context, String[] OperatingSystems){
		this.context=context;
		this.OperatingSystems=OperatingSystems;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return OperatingSystems.length;
	}

	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View gridView;

		if(convertView==null)
		{

			gridView =new View(context);

			gridView = inflater.inflate(R.layout.image_and_text, null);

			TextView text = (TextView) gridView.findViewById(R.id.textView1);
			text.setText(OperatingSystems[position]);

			ImageView image = (ImageView) gridView.findViewById(R.id.imageView1);

			String imageValue = OperatingSystems[position];

			if(imageValue.equals("Android"))
				image.setImageResource(R.drawable.android);
			else if(imageValue.equals("BlackBerry"))
				image.setImageResource(R.drawable.blackberry);
			else if(imageValue.equals("Windows"))
				image.setImageResource(R.drawable.windows);
			else if(imageValue.equals("Apple"))
				image.setImageResource(R.drawable.apple);
			else
				image.setImageResource(R.drawable.symbian);

		}

		else 
			gridView = (View) convertView;

		return gridView;
	}

}
