package com.example.xiaoheihei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FristActivity extends AppCompatActivity {

    private ListView mListView;
    private ArrayAdapter mAdapter;
    private Button mAddListBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);
        mListView = (ListView) findViewById(R.id.listview);
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, getData());
        mListView.setAdapter(mAdapter);

        mAddListBtn = (Button)findViewById(R.id.addlist);
        mAddListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAdapter.addAll(getData());
            }
        });
//         使用代码为listview的item添加统一的动画
//        Animation animation =  AnimationUtils.loadAnimation(this,R.anim.slide_in_left);
//        LayoutAnimationController controller = new LayoutAnimationController(animation);
//        controller.setOrder(LayoutAnimationController.ORDER_NORMAL);
//        controller.setDelay(0.3f);
//        mListView.setLayoutAnimation(controller);
//        mListView.startLayoutAnimation();
    }

    private List<String> getData() {
        List<String> data = new ArrayList<String>();
        data.add("测试数据1");
        data.add("测试数据2");
        data.add("测试数据3");
        data.add("测试数据4");

        return data;
    }
}

