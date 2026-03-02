import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class ebog implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    private final domv d;

    public ebog(domv domv0) {
        this.d = domv0;
        ebof ebof0 = new ebof(domv0);
        this.a = ebof0;
        cjkz cjkz0 = new cjkz(ebof0);
        this.b = cjkz0;
        this.c = new cjlw(ebof0, cjkz0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebxe ebxe0 = (ebxe)object0;
        ebxe0.b = this.d.a();
        ebxe0.c = bbnk.a;
        ebxe0.d = dmgy.a();
        ebxe0.k = dxei.b(this.d.a());
        ebxe0.e = new ebwn(this.d.a(), new edse(this.d.a()), DoubleCheck.a(this.c));
        Context context0 = this.d.a();
        frii frii0 = this.d.n();
        Preconditions.e(frii0);
        ebxe0.f = new dxyx(context0, frii0);
        ebxe0.g = donc.a();
        ebxe0.h = new bblp(0x7FFFFFFF, 10);
        ebxe0.i = new ebst(this.d.h());
        ebxe0.j = eask.a();
    }
}

