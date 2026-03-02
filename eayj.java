import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class eayj implements AndroidInjector {
    private final domv a;

    public eayj(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ibrt ibrt0 = donc.a();
        Context context0 = this.a.a();
        frii frii0 = this.a.n();
        Preconditions.e(frii0);
        dxzw dxzw0 = new dxzw(context0, frii0);
        this.a.a();
        ((ebbt)object0).a = new dqhb(ibrt0, dxzw0, new dmgk(dmgy.a()), dxei.b(this.a.a()));
    }
}

