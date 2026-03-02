import android.content.Context;

public final class dtve implements evqf {
    public final dtvv a;
    public final String b;
    public final String c;
    public final dtvu d;
    public final Context e;
    public final dtvs f;
    public final dtvt g;
    public final hkoy h;
    public final ProtoLiteBuilder i;

    public dtve(dtvv dtvv0, String s, String s1, dtvu dtvu0, Context context0, dtvs dtvs0, ProtoLiteBuilder hftp0, dtvt dtvt0, hkoy hkoy0) {
        this.a = dtvv0;
        this.b = s;
        this.c = s1;
        this.d = dtvu0;
        this.e = context0;
        this.f = dtvs0;
        this.i = hftp0;
        this.g = dtvt0;
        this.h = hkoy0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        evql evql0 = this.a.b.b(this.b, this.c);
        evql0.b(new dtvc(this.d, ((gtxg)object0), this.e, this.f, this.c, this.i, this.b, this.g, this.h));
        evql0.A(new dtvd());
    }
}

