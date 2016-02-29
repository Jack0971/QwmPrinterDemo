package com.qwm.qwmprinterdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.qwm.qwmprinterdemo.utils.PrintTerUtils;

/**
 * @author qiwenming
 * @date 2016/2/29 0029 下午 4:32
 * @ClassName: MainActivity
 * @PackageName: com.qwm.qwmprinterdemo
 * @Description: 打印
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 打印订单
     * @param view
     */
    public void printOrder1(View view){
        PrintTerUtils.getPrintTerUtils(this).toPrintOrder();
    }

    /**
     * 打印回收单
     * @param view
     */
    public void printOrder2(View view){
        PrintTerUtils.getPrintTerUtils(this).toPrint2();
    }

    /**
     * 打印回收单
     * @param view
     */
    public void printOrder3(View view){
        PrintTerUtils.getPrintTerUtils(this).toPrint3();
    }
}
