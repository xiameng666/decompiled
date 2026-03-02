import android.os.PersistableBundle;

final class rms extends ibsl implements ibtw {
    int a;
    final rmy b;
    final String c;
    final sdg d;

    public rms(rmy rmy0, String s, sdg sdg0, ibrl ibrl0) {
        this.b = rmy0;
        this.c = s;
        this.d = sdg0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rms)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rms(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.d(this.c, this);
            if(object0 == object1) {
                return object1;
            }
        }
        return ((PersistableBundle)object0) == null ? null : this.d.c(((PersistableBundle)object0));
    }
}

