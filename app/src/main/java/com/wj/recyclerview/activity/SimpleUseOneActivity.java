package com.wj.recyclerview.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.wj.recyclerview.R;
import com.wj.recyclerview.adapter.SimpleUseAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hannah on 2018/5/30.
 */

public class SimpleUseOneActivity extends AppCompatActivity {

  @InjectView(R.id.simple_use1_rlv)
  RecyclerView simpleUse1Rlv;

  private Context context;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_simple_use1);
    ButterKnife.inject(this);
    initView();
  }

  private void initView() {
    context = this;
    List<String> list = new ArrayList<>();
    for (int i = 'A'; i < 'a'; i++) {
      list.add((char) i + "");
    }
    //设置布局管理器
    simpleUse1Rlv.setLayoutManager(new LinearLayoutManager(context));
    //设置分割线---系统自带
    //simpleUse1Rlv.addItemDecoration(
    //    new DividerItemDecoration(context, DividerItemDecoration.VERTICAL));
    //设置分割线---
    DividerItemDecoration itemDecoration =
        new DividerItemDecoration(context, DividerItemDecoration.VERTICAL);
    itemDecoration.setDrawable(
        ContextCompat.getDrawable(context, R.drawable.shape_item_divider));
    simpleUse1Rlv.addItemDecoration(itemDecoration);
    //设置适配器
    simpleUse1Rlv.setAdapter(new SimpleUseAdapter(context, list));
  }
}
