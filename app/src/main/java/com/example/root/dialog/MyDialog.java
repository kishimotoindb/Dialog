package com.example.root.dialog;

import android.app.Dialog;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.WindowManager;

import java.util.List;

/**
 * Created by haichen.cui on 17-1-20.
 */

public class MyDialog extends Dialog {
    public MyDialog(Context context) {
        super(context, R.style.MyDialogTheme);
        fillGravity();
        setContentView(R.layout.my_dialog);
    }

    protected void fillGravity() {
        WindowManager.LayoutParams lp = getWindow().getAttributes();
//        //1.通过以下方式,可以实现dialog大小的任意控制
//        lp.gravity = Gravity.CENTER;
//        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
//        int widthPixels = displayMetrics.widthPixels;
//        int heightPixels = displayMetrics.heightPixels;
//        float width = widthPixels * 0.5f;
//        float height = heightPixels * 0.5f;
//        lp.width = (int) width;
//        lp.height = (int) height;

        //3.通过设置window的属性,任意控制dialog的显示方式
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int widthPixels = displayMetrics.widthPixels;
        int heightPixels = displayMetrics.heightPixels;
        float width = widthPixels * 0.5f;
        float height = heightPixels * 0.5f;
        lp.width = (int) width;
        lp.height = (int) height;
        //这里可以实现dialog相对于屏幕位置的调整
        lp.gravity = Gravity.BOTTOM;
        lp.verticalMargin = 0.05f;  //据底部的距离是这里的百分比0.05*屏幕高度
                                    //这里之所以效果是marginBottom,见Gravity的apply方法的解释.

        onWindowAttributesChanged(lp);
    }
}
