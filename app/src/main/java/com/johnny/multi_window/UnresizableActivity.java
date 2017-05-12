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
 * Author QQ：956595454.
 * Android Group：158423375.
 * Author email：Qiang3570@126.com.
 * Author gmail：zstrong911@gmail.com.
 * HomePage：(https://github.com/Qiang3570).
 * 此活动在 AndroidManifest 中定义为不支持多窗口模式.
 * 所以这个活动始终是以全屏模式显示，并且不会被系统调整大小.
 * @see com.johnny.multi_window.MainActivity#onStartUnresizableClick(View)
 */
public class UnresizableActivity extends BaseLoggingActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging);

        // 设置背景颜色与描述信息
        setBackgroundColor(R.color.purple);
        setDescription(R.string.activity_description_unresizable);
    }
}
