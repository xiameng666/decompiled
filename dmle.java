import android.accounts.Account;

final class dmle extends ibsl implements ibtw {
    int a;
    final dmlf b;
    final long c;
    final String d;
    final String e;
    final Account f;

    public dmle(dmlf dmlf0, long v, String s, String s1, Account account0, ibrl ibrl0) {
        this.b = dmlf0;
        this.c = v;
        this.d = s;
        this.e = s1;
        this.f = account0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dmle)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dmle(this.b, this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        Object object2 = dmll.c(this.b.a, this.c, this.d, this.e, this.f, this);
        return object2 == object1 ? object1 : object2;
    }
}

