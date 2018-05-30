package com.wj.recyclerview.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.wj.recyclerview.R;

public class MainActivity extends AppCompatActivity {

  @InjectView(R.id.main_simple_user1)
  Button mainSimpleUser1;

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

  @OnClick(R.id.main_simple_user1)
  public void onViewClicked() {
    //跳转到简单使用界面
    Intent intent = new Intent(context, SimpleUseOneActivity.class);
    startActivity(intent);
  }
}
