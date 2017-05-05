package com.johnny.multi_window;

import android.os.Bundle;
import android.view.View;

/**
 * 这个活动是最基本简单的用例，是没有任何特殊标志或设置来启动的。
 *
 * @see com.johnny.multi_window.MainActivity#onStartDefaultActivity(View)
 */
public class DefualtActivity extends BaseLoggingActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging);

        // 设置背景颜色与描述信息
        setDescription(R.string.activity_description_basic);
        setBackgroundColor(R.color.gray);
    }
}
