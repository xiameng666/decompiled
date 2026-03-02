import android.content.Context;
import dagger.android.AndroidInjector;

final class dmmm implements AndroidInjector {
    private final dlmk a;
    private final dmox b;

    public dmmm(dlmk dlmk0, dmox dmox0) {
        this.a = dlmk0;
        this.b = dmox0;
    }

    final cchj a() {
        return cchj.b(dlmm.a(this.a));
    }

    final azts b() {
        return new azts(dlmm.a(this.a));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dmno dmno0 = (dmno)object0;
        xni xni0 = dlmm.a(this.a);
        dmmx dmmx0 = new dmmx(this.a(), this.b());
        dmou dmou0 = new dmou(this.a(), this.b(), new dmlf(new dmll(dmgy.a(), dond.a(), dlnj.a()), new dmlo(dmgy.a()), new dmlq(donc.a()), donc.a(), dlnj.a()));
        ibrt ibrt0 = dond.a();
        Context context0 = dlnj.a();
        ggeo ggeo0 = dmol.a();
        String s = dmoy.a(this.b);
        dlnj.a();
        dmno0.a = dmom.a(new lso(xni0, new dmpf(dmmx0, dmou0, ibrt0, context0, new dmnv(ggeo0, s, new dmgk(dmgy.a())))));
        dmno0.b = new edon(dlnj.a());
    }
}

