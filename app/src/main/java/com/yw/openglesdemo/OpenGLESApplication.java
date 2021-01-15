package com.yw.openglesdemo;

import android.app.Application;

import com.yw.openglesdemo.utils.ContextUtils;


/**
 * @ProjectName: tony_ai
 * @Package: com.tony.ced
 * @ClassName: CvApplication
 * @Description: java类作用描述
 * @Author: wei.yang
 * @CreateDate: 2020/11/26 11:15
 * @UpdateUser: 更新者：wei.yang
 * @UpdateDate: 2020/11/26 11:15
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class OpenGLESApplication extends Application {
    private static OpenGLESApplication instance;

    public static OpenGLESApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        ContextUtils.init(this);
    }
}
