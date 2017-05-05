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

import android.os.Bundle;
import android.view.View;

/**
 * 在自由格式模式下，此活动将在屏幕上定义的界限内启动。
 * 此属性设置为启动此活动的Intent的一部分。
 *
 * @see com.johnny.multi_window.MainActivity#onStartLaunchBoundsActivity(View)
 */
public class LaunchBoundsActivity extends BaseLoggingActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging);

        // 设置背景颜色与描述信息
        setBackgroundColor(R.color.lime);
        setDescription(R.string.activity_bounds_description);
    }
}
