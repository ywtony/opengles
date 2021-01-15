package com.yw.openglesdemo.ui;

import android.graphics.Color;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.yw.openglesdemo.BaseActivity;
import com.yw.openglesdemo.R;
import com.yw.openglesdemo.local.NativeColorRender;

/**
 * @ProjectName: OpenGLEsDemo
 * @Package: com.yw.openglesdemo.ui
 * @ClassName: SoldColorBackgroundActivity
 * @Description: 绘制纯色背景
 * @Author: wei.yang
 * @CreateDate: 2021/1/15 15:22
 * @UpdateUser: 更新者：wei.yang
 * @UpdateDate: 2021/1/15 15:22
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class SoldColorBackgroundActivity extends BaseActivity {
    private GLSurfaceView glSurfaceView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sold_color_background);
        setUpViews();
    }
    private void setUpViews(){
        glSurfaceView = new GLSurfaceView(this);
        setContentView(glSurfaceView);
        //设置版本
        glSurfaceView.setEGLContextClientVersion(3);
        GLSurfaceView.Renderer renderer = new NativeColorRender(Color.RED);
        glSurfaceView.setRenderer(renderer);
    }
}
