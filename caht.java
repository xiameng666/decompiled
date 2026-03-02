import android.content.Context;

final class caht extends ibsl implements ibtw {
    final fm a;
    final Context b;
    final bboh c;

    public caht(fm fm0, Context context0, bboh bboh0, ibrl ibrl0) {
        this.a = fm0;
        this.b = context0;
        this.c = bboh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((caht)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new caht(this.a, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        fm fm0 = this.a;
        if(fm0 != null) {
            ibuq.d(this.b, "null cannot be cast to non-null type com.google.android.chimerax.fragment.app.FragmentActivity");
            cahs cahs0 = new cahs(this.c, fm0);
            fm0.af("optInRequestKey", ((xob)this.b), cahs0);
        }
        return ibom.a;
    }
}

