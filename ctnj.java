import android.content.Context;

final class ctnj extends ibsl implements ibtw {
    final bbic a;
    final Context b;
    final ctni c;

    public ctnj(bbic bbic0, Context context0, ctni ctni0, ibrl ibrl0) {
        this.a = bbic0;
        this.b = context0;
        this.c = ctni0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctnj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctnj(this.a, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.b(this.b, this.c);
        return ibom.a;
    }
}

