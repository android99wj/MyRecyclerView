package com.wj.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.wj.recyclerview.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hannah on 2018/5/31.
 */

public class SwipeAdapter extends BaseAdapter {

  private Context context;
  private List<String> data = new ArrayList<>();
  private LayoutInflater inflater;

  public SwipeAdapter(Context context, List<String> data) {
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
      convertView = inflater.inflate(R.layout.item_swipe, null);
      viewHolder = new ViewHolder(convertView);
      convertView.setTag(viewHolder);
    } else {
      viewHolder = (ViewHolder) convertView.getTag();
    }
    viewHolder.itemSwipeTv.setText(data.get(position));
    return convertView;
  }

  static class ViewHolder {
    @InjectView(R.id.item_swipe_tv)
    TextView itemSwipeTv;

    ViewHolder(View view) {
      ButterKnife.inject(this, view);
    }
  }
}
