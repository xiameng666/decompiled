import android.nfc.Tag;
import j..time.Duration;

final class ftqx extends ibsl implements ibtw {
    int a;
    final ftqz b;
    final Tag c;
    final Duration d;
    final ftra e;
    private Object f;

    public ftqx(ftqz ftqz0, Tag tag0, Duration duration0, ftra ftra0, ibrl ibrl0) {
        this.b = ftqz0;
        this.c = tag0;
        this.d = duration0;
        this.e = ftra0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ftqx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ftqx(this.b, this.c, this.d, this.e, ibrl0);
        ibrl1.f = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        ibrt ibrt0 = ((icck)this.f).c();
        ftqw ftqw0 = new ftqw(this.b, this.c, this.d, this.e, null);
        this.a = 1;
        Object object2 = icbd.a(ibrt0, ftqw0, this);
        return object2 == object1 ? object1 : object2;
    }
}

