import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

public final class bvdz implements ibts {
    public final xni a;
    public final SelectedAccountDisc b;
    public final buyb c;

    public bvdz(buyb buyb0, xni xni0, SelectedAccountDisc selectedAccountDisc0) {
        this.c = buyb0;
        this.a = xni0;
        this.b = selectedAccountDisc0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gqb)object0), "$this$DisposableEffect");
        ibuq.f(this.a, "activity");
        ibuq.f(this.b, "selectedAccountDisc");
        fnqq fnqq0 = new fnqq(this.c.a.h);
        fnqq0.b(false);
        fnqr fnqr0 = fnqq0.a();
        fnkv fnkv0 = fnku.a(new buxu(this.c), this.c.a.d.b, this.c.a.d.c);
        fnld fnld0 = new fnld(this.c.a);
        fnld0.f = fnqr0;
        fnld0.b = fnkv0;
        fnle fnle0 = fnld0.a();
        this.c.e.c(this.c.i);
        fnma.b(this.a, fnle0, this.b);
        buxz buxz0 = new buxz(this.c, null);
        icbb.b(this.c.d, null, null, buxz0, 3);
        return new bveg(this.c);
    }
}

