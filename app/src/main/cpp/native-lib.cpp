#include <jni.h>
#include <string>
#include <EGL/egl.h>
#include <GLES2/gl2.h>
#include <GLES2/gl2ext.h>
#include <GLES2/gl2platform.h>
//extern "C" JNIEXPORT jstring JNICALL
//Java_com_yw_openglesdemo_MainActivity_stringFromJNI(
//        JNIEnv* env,
//        jobject /* this */) {
//    std::string hello = "Hello from C++";
//
//    return env->NewStringUTF(hello.c_str());
//}


extern "C" JNIEXPORT void JNICALL
Java_com_yw_openglesdemo_local_NativeColorRender_surfaceCreated(JNIEnv *env, jobject obj,
                                                                jint color) {
    //分离RGBA的百分比
    GLfloat redF = ((color >> 16) & 0xFF) * 1.0f / 255;
    GLfloat greenF = ((color >> 8) & 0xFF) * 1.0f / 255;
    GLfloat blueF = (color & 0xFF) * 1.0f / 255;
    GLfloat alphaF = ((color >> 24) & 0xFF) * 1.0f / 255;
    glClearColor(redF, greenF, blueF, alphaF);
}

extern "C" JNIEXPORT void JNICALL
Java_com_yw_openglesdemo_local_NativeColorRender_surfaceChanged(JNIEnv *env, jobject obj,
                                                                jint width, jint height) {
    glViewport(0, 0, width, height);
}

extern "C" JNIEXPORT void JNICALL
Java_com_yw_openglesdemo_local_NativeColorRender_onDrawFrame(JNIEnv *env, jobject obj) {
    //把颜色缓冲区设置为我们预设的颜色
    glClear(GL_COLOR_BUFFER_BIT);
}
