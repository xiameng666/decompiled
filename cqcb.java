import android.accounts.Account;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.MapFactory.Builder;
import dagger.internal.MapFactory;
import dagger.internal.Provider;

public final class cqcb {
    public final Account a;
    public final cqcf b;
    public final cqcb c;
    public final Provider d;
    public final Provider e;
    final Provider f;
    final Provider g;
    final Provider h;
    final Provider i;
    final Provider j;
    final Provider k;
    final Provider l;
    public final Provider m;
    final Provider n;
    public final Provider o;
    public final Provider p;

    public cqcb(cqcf cqcf0, Account account0) {
        this.c = this;
        this.b = cqcf0;
        this.a = account0;
        Factory factory0 = InstanceFactory.a(account0);
        this.d = factory0;
        Provider provider0 = DoubleCheck.b(new cqam(factory0, cqcf0.H, cqcf0.T, cqcf0.l));
        this.e = provider0;
        cqal cqal0 = new cqal(cqcf0.V, factory0, cqcf0.W);
        this.f = cqal0;
        cqak cqak0 = new cqak(factory0, cqcf0.e, cqcf0.C, cqcf0.W);
        this.g = cqak0;
        cqai cqai0 = new cqai(cqcf0.e, factory0, cqcf0.W);
        this.h = cqai0;
        Provider provider1 = DoubleCheck.b(new cqan(provider0, cqal0, cqak0, cqcf0.Y, cqai0, cqcf0.X, cqcf0.W));
        this.i = provider1;
        Provider provider2 = DoubleCheck.b(new cqaj(cqcf0.e));
        this.j = provider2;
        Provider provider3 = DoubleCheck.b(new cqaf(provider1, provider2));
        this.k = provider3;
        MapFactory.Builder mapFactory$Builder0 = new MapFactory.Builder(3);
        mapFactory$Builder0.c(cpzv.b, provider3);
        mapFactory$Builder0.c(cpzv.c, provider3);
        mapFactory$Builder0.c(cpzv.d, provider3);
        MapFactory mapFactory0 = mapFactory$Builder0.b();
        this.l = mapFactory0;
        this.m = DoubleCheck.b(new cqgs(mapFactory0));
        cqbj cqbj0 = new cqbj(provider1, cqcf0.G);
        this.n = cqbj0;
        this.o = DoubleCheck.b(cqbj0);
        this.p = DoubleCheck.b(new cqen(cqcf0.i, cqcf0.e));
    }
}

