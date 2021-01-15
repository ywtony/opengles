package com.yw.openglesdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.yw.openglesdemo.adapter.MainAdapter;
import com.yw.openglesdemo.adapter.listener.OnListItemClickListener;
import com.yw.openglesdemo.bean.MainItem;
import com.yw.openglesdemo.ui.SoldColorBackgroundActivity;
import com.yw.openglesdemo.utils.ActivityUtils;
import com.yw.openglesdemo.weight.ScrollSpeedLinearLayoutManger;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    private RecyclerView recyclerView;
    private MainAdapter adapter = null;
    private List<MainItem> datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        initData();
        adapter = new MainAdapter(context, datas, (OnListItemClickListener<MainItem>) (data, position) -> {
            ActivityUtils.getInstance().startActivity(MainActivity.this, data.getClassName());
        });
        recyclerView = findViewById(R.id.recyclerView);
        initRecycleView();
        recyclerView.setAdapter(adapter);
    }

    /**
     * @description 初始化数据
     * @date: 2020/11/26 11:12
     * @author: wei.yang
     */
    private void initData() {
        datas.add(new MainItem("绘制纯色背景", SoldColorBackgroundActivity.class.getName()));
    }

    /**
     * @description 初始化RecycleView
     * @date: 2020/10/26 14:49
     * @author: wei.yang
     */
    private void initRecycleView() {
        recyclerView.setLayoutManager(new ScrollSpeedLinearLayoutManger(context));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(context, DividerItemDecoration.VERTICAL);
        dividerItemDecoration.setDrawable(getResources().getDrawable(R.drawable.bg_main_line));
        recyclerView.addItemDecoration(dividerItemDecoration);
    }


}
