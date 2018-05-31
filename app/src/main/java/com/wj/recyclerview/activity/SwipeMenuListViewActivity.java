package com.wj.recyclerview.activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.Toast;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.wj.recyclerview.R;
import com.wj.recyclerview.adapter.SwipeAdapter;
import com.wj.recyclerview.utils.DisplayUtil;
import java.util.ArrayList;
import java.util.List;

/**
 * 侧滑删除
 * Created by Hannah on 2018/5/31.
 */

public class SwipeMenuListViewActivity extends AppCompatActivity {
  @InjectView(R.id.swipe_lv)
  SwipeMenuListView swipeLv;

  private Context context;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_swipe);
    ButterKnife.inject(this);
    context = this;
    initView();
  }

  private void initView() {
    //添加数据
    List<String> list = new ArrayList<>();
    for (int i = 'A'; i < 'a'; i++) {
      list.add((char) i + "");
    }
    //设置适配器
    SwipeAdapter adapter = new SwipeAdapter(context, list);
    swipeLv.setAdapter(adapter);
    //设置侧滑的方向
    swipeLv.setSwipeDirection(SwipeMenuListView.DIRECTION_LEFT);
    //swipeLv.setSwipeDirection(SwipeMenuListView.DIRECTION_RIGHT);

    //添加侧滑菜单按钮
    SwipeMenuCreator creator = new SwipeMenuCreator() {
      @Override
      public void create(SwipeMenu menu) {
        //创建删除按钮
        SwipeMenuItem itemDelete = new SwipeMenuItem(context);
        itemDelete.setBackground(R.color.colorPrimary);
        //itemDelete.setIcon(R.drawable.delete_left_icon);
        itemDelete.setTitle("删除");
        itemDelete.setTitleSize(DisplayUtil.dp2px(context, 5));
        itemDelete.setWidth(DisplayUtil.dp2px(context, 120));
        itemDelete.setTitleColor(R.color.colorAccent);
        menu.addMenuItem(itemDelete);
      }
    };
    swipeLv.setMenuCreator(creator);
    //设置点击事件
    swipeLv.setOnMenuItemClickListener(new SwipeMenuListView.OnMenuItemClickListener() {
      @Override
      public boolean onMenuItemClick(int position, SwipeMenu menu, int index) {
        switch (index) {
          case 0:
            Toast.makeText(context, menu.getMenuItem(index).getTitle(), Toast.LENGTH_SHORT).show();
            break;
        }
        return false;
      }
    });
  }
}
