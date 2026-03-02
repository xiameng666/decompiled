import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

final class dmml implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    private final dlmk f;
    private final dmox g;

    public dmml(dola dola0, dlmk dlmk0, dmox dmox0, domw domw0) {
        this.f = dlmk0;
        this.g = dmox0;
        dolc dolc0 = new dolc(dola0);
        this.a = dolc0;
        dmmk dmmk0 = new dmmk(domw0);
        this.b = dmmk0;
        dlny dlny0 = new dlny(dlni.a, dmmk0);
        this.c = dlny0;
        efmg efmg0 = new efmg(dlni.a);
        this.d = efmg0;
        this.e = DoubleCheck.b(new dspa(dlni.a, dolc0, dlny0, efmg0));
    }

    final cchj a() {
        return cchj.b(dlmm.a(this.f));
    }

    final azts b() {
        return new azts(dlmm.a(this.f));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dmnl dmnl0 = (dmnl)object0;
        xni xni0 = dlmm.a(this.f);
        dmmx dmmx0 = new dmmx(this.a(), this.b());
        dmou dmou0 = new dmou(this.a(), this.b(), new dmlf(new dmll(dmgy.a(), dond.a(), dlnj.a()), new dmlo(dmgy.a()), new dmlq(donc.a()), donc.a(), dlnj.a()));
        ibrt ibrt0 = dond.a();
        Context context0 = dlnj.a();
        ggeo ggeo0 = dmol.a();
        String s = dmoy.a(this.g);
        dlnj.a();
        dmnl0.a = dmom.a(new lso(xni0, new dmpf(dmmx0, dmou0, ibrt0, context0, new dmnv(ggeo0, s, new dmgk(dmgy.a())))));
        dmnl0.b = (dsoz)this.e.get();
    }
}

