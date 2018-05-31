package com.wj.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.wj.recyclerview.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hannah on 2018/5/31.
 */

public class Swipe2Adapter extends BaseAdapter {

  private Context context;
  private List<String> data = new ArrayList<>();
  private LayoutInflater inflater;

  public Swipe2Adapter(Context context, List<String> data) {
    this.context = context;
    this.data = data;
    inflater = LayoutInflater.from(context);
  }

  @Override
  public int getCount() {
    return data.size();
  }

  @Override
  public Object getItem(int position) {
    return data.get(position);
  }

  @Override
  public long getItemId(int position) {
    return position;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    ViewHolder viewHolder;
    if (convertView == null) {
      convertView = inflater.inflate(R.layout.item_swipe2, null);
      viewHolder = new ViewHolder(convertView);
      convertView.setTag(viewHolder);
    } else {
      viewHolder = (ViewHolder) convertView.getTag();
    }
    viewHolder.itemSwipe2Tv.setText(data.get(position));
    viewHolder.swipeDeleteBtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(context, ((Button) v).getText().toString(), Toast.LENGTH_SHORT).show();
      }
    });
    return convertView;
  }

  static class ViewHolder {
    @InjectView(R.id.item_swipe2_tv)
    TextView itemSwipe2Tv;
    @InjectView(R.id.swipe_delete_btn)
    Button   swipeDeleteBtn;

    ViewHolder(View view) {
      ButterKnife.inject(this, view);
    }
  }
}
