import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import dagger.internal.SingleCheck;

final class eiho implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    final Provider h;

    public eiho() {
        Provider provider0 = DoubleCheck.b(eihx.a);
        this.a = provider0;
        Provider provider1 = SingleCheck.a(fgvv.a);
        this.b = provider1;
        this.c = eihp.a;
        Provider provider2 = DoubleCheck.b(new fqmf(eiht.a, fqgd.a, provider0, provider1, eihv.a, eihz.a, eihp.a));
        this.d = provider2;
        fqnf fqnf0 = new fqnf(eiht.a);
        this.e = fqnf0;
        Provider provider3 = DoubleCheck.b(new fqga(fqgd.a, provider2, provider0, fqnf0));
        this.f = provider3;
        this.g = eihp.a;
        this.h = DoubleCheck.b(new fqhs(provider3, provider1, provider0, fqgd.a, fqnf0, eihp.a));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        eiiq eiiq0 = (eiiq)object0;
        eiiq0.d = (fqhr)this.h.get();
        eiiq0.e = new fqel(new fqne(eihu.a()), ((gmch)this.a.get()));
    }
}

