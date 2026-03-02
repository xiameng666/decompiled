import android.content.Context;

final class bydt extends ibsl implements ibtw {
    int a;
    final byea b;
    final bxxd c;
    final String d;
    final String e;
    final String f;
    final Context g;
    final String h;

    public bydt(byea byea0, bxxd bxxd0, String s, String s1, String s2, Context context0, String s3, ibrl ibrl0) {
        this.b = byea0;
        this.c = bxxd0;
        this.d = s;
        this.e = s1;
        this.f = s2;
        this.g = context0;
        this.h = s3;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bydt)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bydt(this.b, this.c, this.d, this.e, this.f, this.g, this.h, ibrl0);
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
        Object object2 = this.b.e(this.c, this.e, this.f, this.g, this.h, this);
        return object2 == object1 ? object1 : object2;
    }
}

