package com.yw.openglesdemo.local;

import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * @ProjectName: OpenGLEsDemo
 * @Package: com.yw.openglesdemo.local
 * @ClassName: NativeColorRender
 * @Description: 本地方法
 * @Author: wei.yang
 * @CreateDate: 2021/1/15 15:35
 * @UpdateUser: 更新者：wei.yang
 * @UpdateDate: 2021/1/15 15:35
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class NativeColorRender implements GLSurfaceView.Renderer {
    static {
        System.loadLibrary("native-lib");
    }

    private int color;

    public NativeColorRender(int color) {
        this.color = color;
    }

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        surfaceCreated(color);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        surfaceChanged(width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        onDrawFrame();
    }

    public native void surfaceCreated(int color);

    public native void surfaceChanged(int width, int height);

    public native void onDrawFrame();
}
