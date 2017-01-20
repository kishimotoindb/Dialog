package com.example.root.dialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 问题列表:
 *
 * 1.测试Dialog主题的window前缀属性的设置
 * 结论:
 * 详见以下文件中的注释:
 * 1)my_dialog.xml布局文件
 * 2)styles.xml
 * 3)MyDialog.java
 *
 * 2.测试是否可以直接通过布局的layout_width和height控制dialog的大小
 * 结论:
 * 使用AlertDialog的情况下,布局文件根ViewGroup的宽高参数完全无效;里层的高度参数起作用,宽度参数不起作用.
 * 详见my_dialog.xml布局文件
 *
 * 3.通过设置window的属性,任意控制dialog的显示方式
 * 结论:
 * 详见以下文件中的注释:
 * 1)MyDialog.java
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.测试Dialog主题的window前缀属性的设置
        MyDialog myDialog = new MyDialog(this);
        myDialog.show();

        //测试是否可以直接通过布局的layout_width和height控制dialog的大小
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setView(R.layout.my_dialog).show();
    }
}
