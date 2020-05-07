package com.fusheng.whatsdagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.fusheng.whatsdagger2.di.DaggerMainActivityComponent;
import com.fusheng.whatsdagger2.di.MainActivityComponent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*C c = new C();
        D d = new D();
        B b = new B(c, d);
        A a = new A(b);*/

        DaggerMainActivityComponent.Builder builder = DaggerMainActivityComponent.builder();
        MainActivityComponent build = builder.build();
        A a = build.getA();
        B b = build.getB();
        a.printA();
        b.printB();
    }
}
