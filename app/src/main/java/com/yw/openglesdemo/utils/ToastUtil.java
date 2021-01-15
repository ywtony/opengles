package com.yw.openglesdemo.utils;

import android.widget.Toast;

import com.yw.openglesdemo.OpenGLESApplication;


/**
 * @ProjectName: tony_ai
 * @Package: com.tony.ced.utils
 * @ClassName: ToastUtil
 * @Description: java类作用描述
 * @Author: wei.yang
 * @CreateDate: 2020/11/26 10:21
 * @UpdateUser: 更新者：wei.yang
 * @UpdateDate: 2020/11/26 10:21
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class ToastUtil {
    public static void show(String title){
        Toast.makeText(OpenGLESApplication.getInstance(),title,Toast.LENGTH_SHORT).show();
    }
}
