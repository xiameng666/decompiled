import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class ebqw implements AndroidInjector {
    private final domv a;

    public ebqw(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebzr ebzr0 = (ebzr)object0;
        ebzr0.b = dmgy.a();
        ebzr0.i = dxei.b(this.a.a());
        Context context0 = this.a.a();
        frii frii0 = this.a.n();
        Preconditions.e(frii0);
        ebzr0.c = new dxyx(context0, frii0);
        ebzr0.d = easl.a();
        ebzr0.e = bbnk.a;
        ebzr0.f = new bblp(0x7FFFFFFF, 9);
        ebzr0.g = new ebst(this.a.h());
    }
}

