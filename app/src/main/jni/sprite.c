//
// Created by xiangwu.zhu on 16/6/13.
//

#include "com_zxw_coco_Sprite.h"

JNIEXPORT jstring JNICALL Java_com_zxw_coco_Sprite_getResult(JNIEnv *env, jclass obj){
    return (*env)->NewStringUTF(env, "Hello from JNI !  Compiled with ABI.");
}