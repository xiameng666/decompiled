import com.google.android.gms.personalsafety.spotbackend.FinderIdentificationIntentOperation;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import dagger.internal.SingleCheck;

public final class eihm implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    final Provider h;

    public eihm() {
        Provider provider0 = DoubleCheck.b(eihx.a);
        this.a = provider0;
        Provider provider1 = SingleCheck.a(fgvv.a);
        this.b = provider1;
        this.c = eihn.a;
        Provider provider2 = DoubleCheck.b(new fqmf(eiht.a, fqgd.a, provider0, provider1, eihv.a, eihz.a, eihn.a));
        this.d = provider2;
        fqnf fqnf0 = new fqnf(eiht.a);
        this.e = fqnf0;
        Provider provider3 = DoubleCheck.b(new fqga(fqgd.a, provider2, provider0, fqnf0));
        this.f = provider3;
        this.g = eihn.a;
        this.h = DoubleCheck.b(new fqhs(provider3, provider1, provider0, fqgd.a, fqnf0, eihn.a));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        FinderIdentificationIntentOperation finderIdentificationIntentOperation0 = (FinderIdentificationIntentOperation)object0;
        finderIdentificationIntentOperation0.b = (fqhr)this.h.get();
        finderIdentificationIntentOperation0.c = new fqel(new fqne(eihu.a()), ((gmch)this.a.get()));
    }
}

