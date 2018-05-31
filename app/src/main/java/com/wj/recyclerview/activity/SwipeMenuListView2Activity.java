package com.wj.recyclerview.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.wj.recyclerview.R;
import com.wj.recyclerview.adapter.Swipe2Adapter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hannah on 2018/5/31.
 */

public class SwipeMenuListView2Activity extends AppCompatActivity {
  @InjectView(R.id.swipe_lv)
  ListView swipeLv;
  private Context context;

  @Override
  protected void onCreate(
      @Nullable
          Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_swipe2);
    ButterKnife.inject(this);
    context = this;
    initView();
  }

  private void initView() {
    List<String> list = new ArrayList<>();
    for (int i = 'A'; i < 'a'; i++) {
      list.add((char) i + "");
    }
    swipeLv.setAdapter(new Swipe2Adapter(context, list));
  }
}
