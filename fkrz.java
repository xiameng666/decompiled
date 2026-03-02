import android.util.Pair;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

public final class fkrz implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;
    private final Provider d;
    private final Provider e;
    private final Provider f;
    private final Provider g;
    private final Provider h;
    private final Provider i;
    private final Provider j;
    private final Provider k;
    private final Provider l;

    public fkrz(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
        this.f = provider5;
        this.g = provider6;
        this.h = provider7;
        this.i = provider8;
        this.j = provider9;
        this.k = provider10;
        this.l = provider11;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        fkjj fkjj0 = (fkjj)this.a.get();
        fkkg fkkg0 = (fkkg)this.b.get();
        ggtl ggtl0 = (ggtl)this.c.get();
        hhps hhps0 = (hhps)this.d.get();
        fkrq fkrq0 = (fkrq)this.e.get();
        String s = hqep.i();
        boolean z = hqep.l() && hqal.o();
        Boolean.valueOf(z).getClass();
        boolean z1 = ((Boolean)((InstanceFactory)this.i).a).booleanValue();
        gfsx gfsx0 = (gfsx)this.j.get();
        gful_cronetEngineProvider gful0 = ((fkry)this.k).a();
        fgvt fgvt0 = (fgvt)this.l.get();
        boolean z2 = hhps0.d;
        gfur_Suppliers gfur0 = new gfur_Suppliers(Pair.create(Long.valueOf(fkrq0.b), fkrq0.c));
        fkkw fkkw0 = z2 ? new fkkw(fkrq0.a, fgvt0, ((gful_cronetEngineProvider)gfur0)) : new fkke(fkrq0.a, fgvt0, ((gful_cronetEngineProvider)gfur0));
        if(z1) {
            goie goie0 = (goie)this.g.get();
            icck icck0 = (icck)this.h.get();
            return new fksq(fkst.a(fkst.a(fkjj0, fkkg0, z2, ggtl0), fkkw0, z2, ggtl0), hhps0, goie0, icck0, s, gfsx0, gful0);
        }
        if(z) {
            fjcv fjcv0 = (fjcv)this.f.get();
            return new fkss(fkst.a(fkst.a(fkjj0, fkkg0, z2, ggtl0), fkkw0, z2, ggtl0), hhps0, fjcv0, s, gfsx0, gful0);
        }
        return new fkse(fkst.a(fkst.a(fkjj0, fkkg0, z2, ggtl0), fkkw0, z2, ggtl0), hhps0);
    }
}

