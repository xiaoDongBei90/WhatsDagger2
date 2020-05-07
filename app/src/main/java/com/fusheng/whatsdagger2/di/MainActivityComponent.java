package com.fusheng.whatsdagger2.di;

import com.fusheng.whatsdagger2.A;
import com.fusheng.whatsdagger2.B;
import com.fusheng.whatsdagger2.MainActivity;

import dagger.Component;

/**
 * @author lixiaowei
 * @date:2020/5/7 17:42
 * Description:
 */
@Component(modules = LetterModule.class)
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);

    A getA();

    B getB();
}
