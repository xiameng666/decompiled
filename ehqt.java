import com.google.android.gms.permissions.ui.ViewConsumerServicesChimeraActivity;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.MapFactory.Builder;
import dagger.internal.MapFactory;
import dagger.internal.Provider;
import dagger.internal.SingleCheck;

final class ehqt implements ehkz {
    public final cmgu a;
    public final ehqt b;
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
    final Provider m;
    final Provider n;
    final Provider o;
    final Provider p;
    final Provider q;
    final Provider r;

    public ehqt(cmgu cmgu0, cmeo cmeo0) {
        this.b = this;
        this.a = cmgu0;
        cmeq cmeq0 = new cmeq(cmeo0);
        this.c = cmeq0;
        this.d = ehra.a;
        this.e = ehra.a;
        cmgv cmgv0 = new cmgv(cmgu0);
        this.f = cmgv0;
        ehqz ehqz0 = new ehqz(cmgv0);
        this.g = ehqz0;
        ehqr ehqr0 = new ehqr(this);
        this.h = ehqr0;
        cmgb cmgb0 = new cmgb(cmeq0, ehra.a, ehra.a, ehqz0, ehqr0);
        this.i = cmgb0;
        this.j = ehra.a;
        cmep cmep0 = new cmep();
        this.k = cmep0;
        cmhd cmhd0 = new cmhd(MapFactory.b);
        this.l = cmhd0;
        cmhc cmhc0 = new cmhc(MapFactory.b);
        this.m = cmhc0;
        Provider provider0 = SingleCheck.a(new cmgc(ehra.a, cmep0, cmhd0, cmhc0));
        this.n = provider0;
        this.o = ehra.a;
        MapFactory.Builder mapFactory$Builder0 = new MapFactory.Builder(1);
        mapFactory$Builder0.c(cmeg.a, ehkv.a);
        MapFactory mapFactory0 = mapFactory$Builder0.b();
        this.p = mapFactory0;
        this.q = SingleCheck.a(new cmgd(cmeq0, cmgb0, provider0, ehra.a, ehqr0, mapFactory0));
        this.r = new ehqs(this);
    }

    @Override  // ehkz
    public final xob a() {
        cmec cmec0 = (cmec)this.q.get();
        ggeo ggeo0 = ggeo.l("ehnb", this.r);
        return new ViewConsumerServicesChimeraActivity(cmec0, new DispatchingAndroidInjector(ggnf.a, ggeo0), new ehle());
    }
}

