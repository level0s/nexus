package com.fucheuk.nexus;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by fucheuk on 16/5/31.
 */
    import android.content.Intent;
    import android.os.Bundle;
    import android.os.Handler;
    import android.view.Window;
    import android.view.WindowManager;
    import android.support.v7.app.AppCompatActivity;

    public class SplashActivity extends AppCompatActivity {
        private final int SPLASH_DISPLAY_LENGHT = 2000; // 延迟六秒

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_NO_TITLE);  //去掉标题
            getWindow().setFlags(WindowManager.LayoutParams.TYPE_STATUS_BAR, WindowManager.LayoutParams.TYPE_STATUS_BAR); //全屏
            setContentView(R.layout.splash);

            new Handler().postDelayed(new Runnable() {
                public void run() {
                    Intent mainIntent = new Intent(SplashActivity.this,
                            MainActivity.class);
                    SplashActivity.this.startActivity(mainIntent);
                    SplashActivity.this.finish();
                }

            }, SPLASH_DISPLAY_LENGHT);
        }

    }

