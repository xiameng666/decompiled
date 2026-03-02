import android.accounts.Account;
import j..util.Objects;

final class blpo implements gmbg {
    final boolean a;
    final blpq b;

    public blpo(blpq blpq0, boolean z) {
        this.a = z;
        Objects.requireNonNull(blpq0);
        this.b = blpq0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
    }

    @Override  // gmbg
    public final void b(Object object0) {
        byte[] arr_b = (byte[])object0;
        blpe blpe0 = (blpe)blpe.b.b();
        Object object1 = ((gftm)this.b.e()).a;
        gfsx gfsx0 = gfsx.m(this.b.c);
        glzd.g(gmbt.h(fhra.b(blpe0.a(gmap.a, ((Account)object1), gfqx.a, gfsx0))), new blpn(this.b, this.a), gmap.a);
    }
}

