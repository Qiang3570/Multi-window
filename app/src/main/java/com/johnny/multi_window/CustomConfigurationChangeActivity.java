/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.johnny.multi_window;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/**
 * 此活动本身处理配置更改. 配置更改的列表
 * 支持在AndroidManifest定义中定义. 每个配置更改触发调用{@link #onConfigurationChanged(Configuration)}
 * 登录到{@link BaseLoggingActivity}。
 *
 * @see com.johnny.multi_window.MainActivity#onStartCustomConfigurationActivity(View)
 */
public class CustomConfigurationChangeActivity extends BaseLoggingActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging);

        // 设置背景颜色与描述信息
        setBackgroundColor(R.color.cyan);
        setDescription(R.string.activity_custom_description);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        /*
         * 注意：在LoggingActivity中的实现记录输出o新的配置.
         *      每当配置更新时都会收到此回调，例如此活动的大小已更改。
         */
    }
}
