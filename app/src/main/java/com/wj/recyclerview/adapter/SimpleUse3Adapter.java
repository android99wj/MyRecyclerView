package com.wj.recyclerview.adapter;

import android.content.Context;
import android.os.Environment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.bumptech.glide.Glide;
import com.wj.recyclerview.DataShowBean;
import com.wj.recyclerview.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hannah on 2018/5/30.
 */

public class SimpleUse3Adapter extends RecyclerView.Adapter<SimpleUse3Adapter.ViewHolder> {

  private Context context;
  private List<DataShowBean> listData = new ArrayList<>();
  private LayoutInflater mInflater;

  public SimpleUse3Adapter(Context context, List<DataShowBean> listData) {
    this.context = context;
    this.listData = listData;
    mInflater = LayoutInflater.from(context);
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = mInflater.inflate(R.layout.item_simple_use3, null);
    RecyclerView.LayoutParams lp =
        new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT);
    view.setLayoutParams(lp);
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(ViewHolder holder, int position) {
    holder.itemSimpleUseShow.setText(listData.get(position).getText());
    //Glide.with(context).load(url).error(R.drawable.empty_data).into(holder.itemSimpleUseIv);
    holder.itemSimpleUseIv.setImageResource(R.drawable.show);
  }

  @Override
  public int getItemCount() {
    return listData.size();
  }

  static class ViewHolder extends RecyclerView.ViewHolder {
    @InjectView(R.id.item_simple_use_show)
    TextView  itemSimpleUseShow;
    @InjectView(R.id.item_simple_use_iv)
    ImageView itemSimpleUseIv;

    ViewHolder(View view) {
      super(view);
      ButterKnife.inject(this, view);
    }
  }
}
