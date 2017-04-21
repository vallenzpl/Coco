LOCAL_PATH          :=  $(call my-dir)
include             $(CLEAR_VARS)
LOCAL_MODULE        :=  sprite-jni
LOCAL_SRC_FILES     :=  sprite.c
include             $(BUILD_SHARED_LIBRARY)