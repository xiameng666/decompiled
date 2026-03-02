import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class fljs implements gfsi {
    public final fljw a;
    public final int b;
    public final AccountContext c;

    public fljs(fljw fljw0, int v, AccountContext accountContext0) {
        this.a = fljw0;
        this.b = v;
        this.c = accountContext0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((flkt)object0).d == 2) {
            gfsx gfsx0 = ((flkt)object0).a;
            if(gfsx0.i()) {
                gfsx gfsx1 = ((flkt)object0).b;
                if(gfsx1.i()) {
                    Object object1 = gfsx0.d();
                    fmbl fmbl0 = (fmbl)gfsx1.d();
                    this.a.g(((AccountContext)object1), fmbl0);
                    fmai fmai0 = fmaj.a();
                    fmai0.g(13);
                    fmai0.f(this.b);
                    fmai0.n(this.c.c().f());
                    fmai0.o(this.c.d().toStringUtf8());
                    fmaj fmaj0 = fmai0.a();
                    this.a.a.b(fmaj0);
                }
            }
        }
        return null;
    }
}

