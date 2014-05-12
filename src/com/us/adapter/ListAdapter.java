package com.us.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.us.smartcontact.R;

public class ListAdapter extends BaseAdapter{
	
	private LayoutInflater inflater;
	
	public ListAdapter(Context context){
		inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		if(convertView == null){
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.list_contacts_item, null);
			holder.imageView1 = (ImageButton) convertView.findViewById(R.id.contact_image1);
			holder.textView1 = (TextView) convertView.findViewById(R.id.text_name1);
			holder.imageView2 = (ImageButton) convertView.findViewById(R.id.contact_image2);
			holder.textView2 = (TextView) convertView.findViewById(R.id.text_name2);
			holder.imageView3 = (ImageButton) convertView.findViewById(R.id.contact_image3);
			holder.textView3 = (TextView) convertView.findViewById(R.id.text_name3);
			convertView.setTag(holder);
		}else{
			holder = (ViewHolder) convertView.getTag();
		}
		holder.textView1.setText("ironman1");
		holder.textView2.setText("ironman2");
		holder.textView3.setText("ironman3");
		return convertView;
	}
	
	public final class ViewHolder{
		public ImageButton imageView1;
		public TextView textView1;
		public ImageButton imageView2;
		public TextView textView2;
		public ImageButton imageView3;
		public TextView textView3;
	}

}
