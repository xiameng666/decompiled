import android.content.Context;

final class cahw extends ibsl implements ibtw {
    final fm a;
    final Context b;
    final bboh c;
    final caie d;

    public cahw(fm fm0, Context context0, bboh bboh0, caie caie0, ibrl ibrl0) {
        this.a = fm0;
        this.b = context0;
        this.c = bboh0;
        this.d = caie0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cahw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cahw(this.a, this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        fm fm0 = this.a;
        if(fm0 != null) {
            ibuq.d(this.b, "null cannot be cast to non-null type com.google.android.chimerax.fragment.app.FragmentActivity");
            cahv cahv0 = new cahv(this.d);
            fm0.af("rebootDialogDismissedKey", ((xob)this.b), cahv0);
        }
        return ibom.a;
    }
}

