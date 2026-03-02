import com.google.android.gms.personalsafety.ringing.FinderRingingIntentOperation;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import dagger.internal.SingleCheck;

public final class eiee implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    final Provider h;
    final Provider i;
    final Provider j;
    final Provider k;
    final Provider l;

    public eiee() {
        Provider provider0 = DoubleCheck.b(eiem.a);
        this.a = provider0;
        Provider provider1 = SingleCheck.a(fgvv.a);
        this.b = provider1;
        this.c = eief.a;
        Provider provider2 = DoubleCheck.b(new fqmf(eiei.a, fqgd.a, provider0, provider1, eiek.a, eieo.a, eief.a));
        this.d = provider2;
        fqnf fqnf0 = new fqnf(eiei.a);
        this.e = fqnf0;
        Provider provider3 = DoubleCheck.b(new fqga(fqgd.a, provider2, provider0, fqnf0));
        this.f = provider3;
        this.g = eief.a;
        this.h = DoubleCheck.b(new fqhs(provider3, provider1, provider0, fqgd.a, fqnf0, eief.a));
        fqgx fqgx0 = new fqgx(provider1, provider0);
        this.i = fqgx0;
        fqju fqju0 = new fqju(provider0);
        this.j = fqju0;
        fqki fqki0 = new fqki(provider1, provider0, fqju0, fqnf0);
        this.k = fqki0;
        this.l = new fqoe(fqgx0, fqki0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((FinderRingingIntentOperation)object0).e = new fqnx(this.h, this.l, this.b, this.e, this.a);
    }
}

