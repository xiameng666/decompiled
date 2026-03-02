import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class ebkb implements AndroidInjector {
    private final domv a;

    public ebkb(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebjh ebjh0 = (ebjh)object0;
        ebjh0.a = dmgy.a();
        ebjh0.b = new dmkl(this.a.a());
        ebjh0.e = dolu.r();
        Context context0 = this.a.a();
        frii frii0 = this.a.n();
        Preconditions.e(frii0);
        ebjh0.c = new dxyu(context0, frii0);
        ebjh0.d = new ebst(this.a.h());
    }
}

