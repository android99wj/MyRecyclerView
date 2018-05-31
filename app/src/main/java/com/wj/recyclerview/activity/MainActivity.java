package com.wj.recyclerview.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.wj.recyclerview.R;

public class MainActivity extends AppCompatActivity {

  @InjectView(R.id.main_simple_user1)
  Button mainSimpleUser1;
  @InjectView(R.id.main_simple_user2)
  Button mainSimpleUser2;
  @InjectView(R.id.main_simple_user3)
  Button mainSimpleUser3;
  @InjectView(R.id.main_swipe)
  Button mainSwipe;
  @InjectView(R.id.main_swipe2)
  Button mainSwipe2;

  private Context context;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.inject(this);
    initView();
  }

  private void initView() {
    context = this;
  }

  @OnClick({
      R.id.main_simple_user1, R.id.main_simple_user2, R.id.main_simple_user3, R.id.main_swipe,
      R.id.main_swipe2
  })
  public void onViewClicked(View view) {
    switch (view.getId()) {
      case R.id.main_simple_user1:
        //跳转到简单使用界面
        Intent intent = new Intent(context, SimpleUseOneActivity.class);
        startActivity(intent);
        break;
      case R.id.main_simple_user2:
        //跳转到简单使用界面
        Intent intent2 = new Intent(context, SimpleUseTwoActivity.class);
        startActivity(intent2);
        break;
      case R.id.main_simple_user3:
        //跳转到简单使用界面
        Intent intent3 = new Intent(context, SimpleUseThreeActivity.class);
        startActivity(intent3);
        break;
      case R.id.main_swipe:
        //跳转到简单使用界面
        Intent intent4 = new Intent(context, SwipeMenuListViewActivity.class);
        startActivity(intent4);
        break;
      case R.id.main_swipe2:
        //跳转到简单使用界面
        Intent intent5 = new Intent(context, SwipeMenuListView2Activity.class);
        startActivity(intent5);
        break;
    }
  }
}
