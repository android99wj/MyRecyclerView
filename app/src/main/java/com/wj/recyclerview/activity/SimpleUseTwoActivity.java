package com.wj.recyclerview.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.ButterKnife;
import com.wj.recyclerview.R;
import com.wj.recyclerview.adapter.SimpleUseAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.InjectView;

/**
 * 简单实用
 * 类似于GridView
 * Created by hannah on 2018/5/30.
 */

public class SimpleUseTwoActivity extends AppCompatActivity {

    @InjectView(R.id.simple_use1_rlv)
    RecyclerView simpleUse1Rlv;
    private Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
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
        //设置布局管理器  设置有列数
        simpleUse1Rlv.setLayoutManager(new GridLayoutManager(context, 3));
        //设置分割线---系统自带
        simpleUse1Rlv.addItemDecoration(
                new DividerItemDecoration(context, DividerItemDecoration.VERTICAL));
        //设置适配器
        simpleUse1Rlv.setAdapter(new SimpleUseAdapter(context, list));
    }
}
