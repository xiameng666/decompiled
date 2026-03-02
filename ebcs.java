import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.Provider;
import j..util.Optional;

final class ebcs implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    private final domv d;
    private final dola e;

    public ebcs(dola dola0, domv domv0) {
        this.d = domv0;
        this.e = dola0;
        ebcr ebcr0 = new ebcr(domv0);
        this.a = ebcr0;
        this.b = new edoc(ebcr0);
        this.c = new edod(ebcr0);
    }

    final dmgi a() {
        this.d.a();
        return new dmgi(dolf.b(this.e), dmgy.a());
    }

    final dmhi b() {
        return dmhh.b(this.d.a(), dolf.b(this.e), dole.b(this.e), dmgy.a(), null, Optional.empty());
    }

    final edig c() {
        return new edig(this.a());
    }

    static final int d() {
        return edtl.a(dmgv.e(dmgy.a()));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebcl ebcl0 = (ebcl)object0;
        ebcl0.a = this.d.a();
        ebcl0.b = dmgy.a();
        ebcl0.c = new dxye();
        Context context0 = this.d.a();
        dqrj dqrj0 = new dqrj(this.d.a(), new etgl(this.d.a()));
        dqsa dqsa0 = new dqsa();
        ebcl0.d = new ebea(context0, bbnk.a, dqrj0, dqsa0);
        ebcl0.e = new ebdz(dole.b(this.e), dolf.b(this.e), this.d.a(), dmgy.a(), new dxye(), new edgp(new edfx(this.b(), this.c(), new edgi(this.d.a(), dole.b(this.e), dmgy.a()), new earj(new earo(this.d.a(), dole.b(this.e), dmgy.a(), new earr(this.d.a(), dole.b(this.e), dmgy.a())))), new edgk(this.b()), eass.a(), new edgz(new edtj(dolc.b(this.e), new fbio(this.d.a(), edtq.b(ebcs.d(), dolc.b(this.e))), edtn.a(), ebcs.d()), this.b(), this.c())));
        Context context1 = this.d.a();
        String s = dole.b(this.e);
        String s1 = dolf.b(this.e);
        ednx ednx0 = new ednx(edob.a(this.d.a()), this.b, this.c);
        fhwb fhwb0 = this.d.h();
        dyct dyct0 = new dyct();
        ebcl0.f = new dqrt(context1, s, s1, bbnk.a, ednx0, fhwb0, dyct0);
        ebcl0.g = new dqrr(this.d.a(), dole.b(this.e), this.a());
    }
}

