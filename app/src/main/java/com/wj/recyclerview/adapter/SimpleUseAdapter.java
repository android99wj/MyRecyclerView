package com.wj.recyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.wj.recyclerview.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hannah on 2018/5/30.
 */

public class SimpleUseAdapter extends RecyclerView.Adapter<SimpleUseAdapter.ViewHolder> {

  private Context context;
  private List<String> listData = new ArrayList<>();
  private LayoutInflater mInflater;

  public SimpleUseAdapter(Context context, List<String> listData) {
    this.context = context;
    this.listData = listData;
    mInflater = LayoutInflater.from(context);
  }

  @Override
  public SimpleUseAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = mInflater.inflate(R.layout.item_simple_use, null);
    RecyclerView.LayoutParams lp =
        new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT);
    view.setLayoutParams(lp);
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(SimpleUseAdapter.ViewHolder holder, int position) {
    holder.itemSimpleUseShow.setText(listData.get(position));
  }

  @Override
  public int getItemCount() {
    return listData.size();
  }

  static class ViewHolder extends RecyclerView.ViewHolder {
    @InjectView(R.id.item_simple_use_show)
    TextView itemSimpleUseShow;

    ViewHolder(View view) {
      super(view);
      ButterKnife.inject(this, view);
    }
  }
}
