import android.content.Intent;

final class dxvw extends ibsl implements ibtw {
    Object a;
    final dxwe b;

    public dxvw(dxwe dxwe0, ibrl ibrl0) {
        this.b = dxwe0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxvw)this.c(((Intent)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dxvw(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.b.d.b(((Intent)this.a));
        return ibom.a;
    }
}

