import android.content.ServiceConnection;

final class cszb extends ibsl implements ibtw {
    final bbic a;
    final cszf b;
    final ServiceConnection c;

    public cszb(bbic bbic0, cszf cszf0, ServiceConnection serviceConnection0, ibrl ibrl0) {
        this.a = bbic0;
        this.b = cszf0;
        this.c = serviceConnection0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cszb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cszb(this.a, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.b(this.b.b, this.c);
        return ibom.a;
    }
}

