import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dvqi implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    private final domv e;
    private final edor f;
    private final doly g;
    private final dxed h;
    private final dolg i;
    private final domw j;

    public dvqi(dolg dolg0, dxed dxed0, domw domw0, doly doly0, domv domv0, edor edor0) {
        this.e = domv0;
        this.f = edor0;
        this.g = doly0;
        this.h = dxed0;
        this.i = dolg0;
        this.j = domw0;
        dvqh dvqh0 = new dvqh(domv0);
        this.a = dvqh0;
        dmkm dmkm0 = new dmkm(dvqh0);
        this.b = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.c = edrr0;
        this.d = DoubleCheck.b(new edrz(edrr0));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvtf dvtf0 = (dvtf)object0;
        fhwk fhwk0 = this.e.i();
        Preconditions.e(fhwk0);
        dvtf0.b = fhwk0;
        dvtf0.c = this.e.g();
        this.e.a();
        dvtf0.d = new dvfw(new dmgk(dmgy.a()));
        dvtf0.ag = new dxda(this.f.a(), new dvfy(), new dmkl(this.e.a()));
        dvtf0.ah = new dsiu(this.g.c());
        dvtf0.ao = this.h.a();
        dvtf0.ai = new dxcz(this.i.a(), this.h.a(), this.j.a());
        dvtf0.aj = new dspv();
        dvtf0.ak = (edrp)this.d.get();
        dvtf0.al = new edqf(this.e.a());
    }
}

