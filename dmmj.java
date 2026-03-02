import android.content.Context;
import com.google.android.gms.pay.factoryreset.wizard.FactoryResetWizardChimeraActivity;
import dagger.android.AndroidInjector;

public final class dmmj implements AndroidInjector {
    private final dlmk a;
    private final dmox b;

    public dmmj(dlmk dlmk0, dmox dmox0) {
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
        FactoryResetWizardChimeraActivity factoryResetWizardChimeraActivity0 = (FactoryResetWizardChimeraActivity)object0;
        xni xni0 = dlmm.a(this.a);
        dmmx dmmx0 = new dmmx(this.a(), this.b());
        dmou dmou0 = new dmou(this.a(), this.b(), new dmlf(new dmll(dmgy.a(), dond.a(), dlnj.a()), new dmlo(dmgy.a()), new dmlq(donc.a()), donc.a(), dlnj.a()));
        ibrt ibrt0 = dond.a();
        Context context0 = dlnj.a();
        ggeo ggeo0 = dmol.a();
        String s = dmoy.a(this.b);
        dlnj.a();
        factoryResetWizardChimeraActivity0.j = dmom.a(new lso(xni0, new dmpf(dmmx0, dmou0, ibrt0, context0, new dmnv(ggeo0, s, new dmgk(dmgy.a())))));
        ggek ggek0 = new ggek();
        dmod dmod0 = new dmod();
        ggek0.i(dmov.a, dmod0);
        dmoe dmoe0 = new dmoe();
        ggek0.i(dmov.b, dmoe0);
        dmof dmof0 = new dmof();
        ggek0.i(dmov.c, dmof0);
        dmog dmog0 = new dmog();
        ggek0.i(dmov.d, dmog0);
        dmoh dmoh0 = new dmoh();
        ggek0.i(dmov.f, dmoh0);
        dmoi dmoi0 = new dmoi();
        ggek0.i(dmov.e, dmoi0);
        dmoj dmoj0 = new dmoj();
        ggek0.i(dmov.g, dmoj0);
        dmok dmok0 = new dmok();
        ggek0.i(dmov.h, dmok0);
        factoryResetWizardChimeraActivity0.k = ggek0.b();
        factoryResetWizardChimeraActivity0.l = new dmmt(new aytt(dlnj.a(), "TAP_AND_PAY_APP").a());
    }
}

