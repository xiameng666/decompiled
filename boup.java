import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class boup implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;
    private final Provider d;

    public boup(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Context context0 = bopg.a();
        frii frii0 = (frii)this.a.get();
        frgt frgt0 = (frgt)this.b.get();
        boum boum0 = (boum)this.d.get();
        frce frce0 = new frce(context0);
        frce0.d("findmydevice");
        frce0.e("SpotClientData.pb");
        frce0.f(frgo.a);
        frie frie0 = frif.a();
        frie0.f(frce0.a());
        frie0.e(((MessageLite)fqzl.a));
        frie0.d(boum0);
        frie0.b(bouw.a);
        frie0.h(new frjp(frgt0));
        Object object0 = frii0.a(frie0.a());
        Preconditions.f(object0);
        return object0;
    }
}

