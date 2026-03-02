import com.google.android.wallet.bender3.framework.storage.SessionEntity;

public final class gbgl extends ibsl implements ibtw {
    int a;
    final gbgr b;
    final String c;
    final int d;
    final String e;

    public gbgl(gbgr gbgr0, String s, int v, String s1, ibrl ibrl0) {
        this.b = gbgr0;
        this.c = s;
        this.d = v;
        this.e = s1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbgl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new gbgl(this.b, this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            gbgr gbgr0 = this.b;
            if(!gbgr0.c) {
                return null;
            }
            this.a = 1;
            object0 = gbgr0.d(this.c, this.d, this.e, this);
            if(object0 == object1) {
                return object1;
            }
        }
        return (SessionEntity)object0;
    }
}

