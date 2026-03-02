import android.content.Context;
import com.google.android.gms.pay.deeplink.DeepLinkChimeraActivity;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class dmjv implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    private final domv e;
    private final dlmk f;

    public dmjv(dlmk dlmk0, domv domv0) {
        this.e = domv0;
        this.f = dlmk0;
        dmju dmju0 = new dmju(domv0);
        this.a = dmju0;
        dmkm dmkm0 = new dmkm(dmju0);
        this.b = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.c = edrr0;
        this.d = DoubleCheck.b(new edrz(edrr0));
    }

    final dmgk a() {
        this.e.a();
        return new dmgk(dmgy.a());
    }

    final dmkc b() {
        xni xni0 = dlmm.a(this.f);
        dllw dllw0 = new dllw(this.e.a(), new etgl(dlmm.a(this.f)));
        Context context0 = this.e.a();
        ibrt ibrt0 = donc.a();
        Context context1 = this.e.a();
        frii frii0 = this.e.n();
        Preconditions.e(frii0);
        return new dmkc(xni0, dllw0, new dqfa(context0, new dqhb(ibrt0, new dxzw(context1, frii0), this.a(), dxei.b(this.e.a())), new dqgb(this.c()), this.c()));
    }

    final edse c() {
        return new edse(this.e.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        DeepLinkChimeraActivity deepLinkChimeraActivity0 = (DeepLinkChimeraActivity)object0;
        deepLinkChimeraActivity0.j = this.a();
        deepLinkChimeraActivity0.k = this.e.h();
        deepLinkChimeraActivity0.l = DoubleCheck.a(this.d);
        deepLinkChimeraActivity0.m = this.b();
        deepLinkChimeraActivity0.r = new dmka(dlmm.a(this.f), this.b(), new dmkf(ibpo.g(new dmke[]{new dmkg(), new dmkj(DoubleCheck.a(this.d)), new dmkh(this.e.a()), new dmki(this.e.a())})));
        deepLinkChimeraActivity0.n = dmgy.a();
        deepLinkChimeraActivity0.o = new fuok();
        deepLinkChimeraActivity0.p = new dvlb(this.e.a());
    }
}

