package com.fusheng.whatsdagger2.di;

import com.fusheng.whatsdagger2.A;
import com.fusheng.whatsdagger2.B;
import com.fusheng.whatsdagger2.C;
import com.fusheng.whatsdagger2.D;

import java.security.PublicKey;

import dagger.Module;
import dagger.Provides;

/**
 * @author lixiaowei
 * @date:2020/5/7 17:43
 * Description:
 */
@Module
public class LetterModule {
    @Provides
    public D provideD() {
        return new D();
    }

    @Provides
    public C provideC() {
        return new C();
    }

    @Provides
    public B provideB(C c, D d) {
        return new B(c, d);
    }

    @Provides
    public A provideA(B b) {
        return new A(b);
    }
}
