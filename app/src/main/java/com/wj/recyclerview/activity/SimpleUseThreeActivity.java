package com.wj.recyclerview.activity;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.wj.recyclerview.DataShowBean;
import com.wj.recyclerview.R;
import com.wj.recyclerview.adapter.SimpleUse3Adapter;
import com.wj.recyclerview.adapter.SimpleUseAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * 简单实用
 * 瀑布流
 * Created by hannah on 2018/5/30.
 */

public class SimpleUseThreeActivity extends AppCompatActivity {

  @InjectView(R.id.simple_use1_rlv)
  RecyclerView simpleUse1Rlv;
  private Context context;

  @Override
  protected void onCreate(
      @Nullable
          Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_simple_use1);
    ButterKnife.inject(this);
    initView();
  }

  private void initView() {
    context = this;
    List<DataShowBean> list = new ArrayList<>();
    for (int i = 'A'; i < 'a'; i++) {
      DataShowBean bean = new DataShowBean("", (char) i + "");
      list.add(bean);
    }
    //设置布局管理器  设置有列数
    simpleUse1Rlv.setLayoutManager(
        new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
    //设置分割线---系统自带
    simpleUse1Rlv.addItemDecoration(new SimpleDivider(16));
    //设置适配器
    simpleUse1Rlv.setAdapter(new SimpleUse3Adapter(context, list));
  }

  private class SimpleDivider extends RecyclerView.ItemDecoration {
    private int space;

    public SimpleDivider(int space) {
      this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
        RecyclerView.State state) {
      outRect.bottom = space;
      outRect.left = space;
      outRect.right = space;
      if (parent.getChildLayoutPosition(view) == 0) {
        outRect.top = space;
      }
    }
  }
}
