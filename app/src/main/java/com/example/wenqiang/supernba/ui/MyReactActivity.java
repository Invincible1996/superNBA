package com.example.wenqiang.supernba.ui;

import android.view.DragAndDropPermissions;
import android.view.DragEvent;

import com.facebook.react.ReactActivity;

import javax.annotation.Nullable;

public class MyReactActivity extends ReactActivity {

    @Nullable
    @Override
    protected String getMainComponentName() {
        return "HelloWorld";
    }

    @Override
    public DragAndDropPermissions requestDragAndDropPermissions(DragEvent event) {
        return super.requestDragAndDropPermissions(event);
    }
}
