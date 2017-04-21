package com.zxw.coco;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.zxw.coco.inject.BaseActivity;
import com.zxw.coco.inject.ViewInject;

/**
 * Created by xiangwuzhu on 16/11/7.
 */
public class InjectActivity extends BaseActivity {

    @ViewInject(R.id.first_text)
    private TextView textView;

    @ViewInject(R.id.first_button)
    private Button button;


    @Override
    public int getLayoutId() {
        return R.layout.inject_layout;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        textView.setText("我在这里");
        button.setText("点啊");


    }
}
