import com.google.android.gms.googlesettings.session.lifecycle.service.SessionLifecycleRequest;

final class buzy extends ibsl implements ibtw {
    int a;
    final bvaa b;
    final SessionLifecycleRequest c;
    final bvad d;

    public buzy(bvaa bvaa0, SessionLifecycleRequest sessionLifecycleRequest0, bvad bvad0, ibrl ibrl0) {
        this.b = bvaa0;
        this.c = sessionLifecycleRequest0;
        this.d = bvad0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((buzy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new buzy(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.a(this.c, this.d, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

