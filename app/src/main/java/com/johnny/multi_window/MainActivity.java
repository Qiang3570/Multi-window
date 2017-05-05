package com.johnny.multi_window;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends BaseLoggingActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 启动一个默认的Activity(Andriod N 默认是支持多窗口模式的)
     * @param view
     */
    public void onStartDefaultActivity(View view) {
        Log.d(mLogTag, "** starting BasicActivity");

        /*
         * 使用默认选项中的'singleTask'来启动该活动，详情请见 AndroidManifest.xml.
         */
        startActivity(new Intent(this, DefualtActivity.class));
    }

    /**
     * 启动一个不支持多窗口模式的Activity
     * @param view
     */
    public void onStartUnresizableClick(View view) {
        Log.d(mLogTag, "** starting UnresizableActivity");

        /*
         * 此活动在 AndroidManifest.xml 中被标记为'unresizable'.
         * 因此我们需要指定FLAG_ACTIVITY_NEW_TASK标志将其启动到一个新的任务栈中.
         * 否则活动的属性将被继承.（这里被标记为默认情况下可调整大小）
         */
        Intent intent = new Intent(this, UnresizableActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    /**
     * 在另一分屏处启动Activity
     * @param view
     */
    public void onStartAdjacentActivity(View view) {
        Log.d(mLogTag, "** starting AdjacentActivity");

        /*
         * 注意：在另一分屏启动界面需在新的任务栈中启动该活动.
         *  如果在相同的任务栈中启动的话，那么新活动将会在old其上方.
         *  也就是会在本界面所在的分屏下启动这个新的活动，并不会在另一分屏启动该活动.
         *  这就是需要FLAG_ACTIVITY_NEW_TASK的原因所在.
         */
        Intent intent = new Intent(this, AdjacentActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    /**
     * 启动一个处理所有配置更改的Activity
     * @param view
     */
    public void onStartCustomConfigurationActivity(View view) {
        Log.d(mLogTag, "** starting CustomConfigurationChangeActivity");

        /*
         * 启动一个处理所有配置更改的Activity
         */
        startActivity(new Intent(this, CustomConfigurationChangeActivity.class));

    }

    /**
     * 以最小尺寸启动一个Activity
     * @param view
     */
    public void onStartMinimumSizeActivity(View view) {
        Log.d(mLogTag, "** starting MinimumSizeActivity");

        /*
         * 以最小尺寸启动一个Activity(详见AndroidManifest.xml 'layout'配置)
         */
        startActivity(new Intent(this, MinimumSizeActivity.class));
    }

    /**
     * 自由模式下在制定区域内启动Activity
     * @param view
     */
    public void onStartLaunchBoundsActivity(View view) {
        Log.d(mLogTag, "** starting LaunchBoundsActivity");

        // 定义活动将启动的范围。
        Rect bounds = new Rect(500, 300, 100, 0);

        // 将边界设置为活动选项。
        ActivityOptions options = ActivityOptions.makeBasic();
        options.setLaunchBounds(bounds);

        // 使用指定的选项启动LaunchBoundsActivity
        Intent intent = new Intent(this, LaunchBoundsActivity.class);
        startActivity(intent, options.toBundle());
    }
}