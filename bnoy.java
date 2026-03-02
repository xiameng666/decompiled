import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class bnoy implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;
    private final Provider d;

    public bnoy(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
    }

    public final frli a() {
        Context context0 = bopg.a();
        frii frii0 = (frii)this.a.get();
        frgt frgt0 = (frgt)this.b.get();
        bnqs bnqs0 = (bnqs)this.d.get();
        frce frce0 = new frce(context0);
        frce0.d("findmydevice");
        frce0.e("SpotCachedDeviceData.pb");
        frce0.f(frgo.a);
        frie frie0 = frif.a();
        frie0.f(frce0.a());
        frie0.e(((MessageLite)fqyf.a));
        frie0.d(bnqs0);
        frie0.h(new frjp(frgt0));
        frli frli0 = frii0.a(frie0.a());
        Preconditions.f(frli0);
        return frli0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

