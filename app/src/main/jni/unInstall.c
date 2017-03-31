
#include "com_w77996_uninstalldemo_UnInstallJni.h"

JNIEXPORT jstring JNICALL Java_com_w77996_uninstalldemo_UnInstallJni_getString(JNIEnv *env, jobject obj){
return (*env)->NewStringUTF(env,"This just a test for Android Studio NDK JNI developer!");
 }