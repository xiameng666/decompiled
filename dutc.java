import java.util.List;

public final class dutc implements ibts {
    public final List a;
    public final duuz b;
    public final gtxf c;
    public final ibth d;

    public dutc(List list0, duuz duuz0, gtxf gtxf0, ibth ibth0) {
        this.a = list0;
        this.b = duuz0;
        this.c = gtxf0;
        this.d = ibth0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        dnr dnr0 = (dnr)object0;
        ibuq.f(dnr0, "$this$LazyColumn");
        dol.a(dnr0, new gze(0x50CBFAB1, true, new duuh(this.b)));
        dol.a(dnr0, dusc.h);
        duuj duuj0 = new duuj(this.a);
        gze gze0 = new gze(802480018, true, new duuk(this.a));
        dnr0.b(this.a.size(), null, duuj0, gze0);
        dol.a(dnr0, dusc.i);
        dol.a(dnr0, new gze(0x37A7142A, true, new duui(this.c, this.d)));
        return ibom.a;
    }
}

