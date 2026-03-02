import android.content.Context;

final class byne extends ibsl implements ibtw {
    final byhi a;
    final Context b;
    final acp c;
    final acp d;

    public byne(byhi byhi0, Context context0, acp acp0, acp acp1, ibrl ibrl0) {
        this.a = byhi0;
        this.b = context0;
        this.c = acp0;
        this.d = acp1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((byne)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new byne(this.a, this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.c(this.b, this.c, this.d);
        return ibom.a;
    }
}

