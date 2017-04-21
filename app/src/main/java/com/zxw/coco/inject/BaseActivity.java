package com.zxw.coco.inject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.lang.reflect.Field;
import java.util.IllegalFormatException;

/**
 * Created by xiangwuzhu on 16/11/7.
 */
public abstract class BaseActivity extends AppCompatActivity {


    public abstract int getLayoutId();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        autoInjectView();
    }

    private void autoInjectView() {
        try {
            Class<?> cl = this.getClass();
            Field[] fields = cl.getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(ViewInject.class)) {
                    ViewInject inject = field.getAnnotation(ViewInject.class);
                    int id = inject.value();
                    if (id > 0) {
                        field.setAccessible(true);
                        field.set(this, this.findViewById(id));
                    }
                }
            }
        } catch (IllegalFormatException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }


}
