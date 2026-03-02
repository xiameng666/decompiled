import com.google.android.gms.googlesettings.session.lifecycle.service.SessionLifecycleRequest;

final class bvaj extends ibsl implements ibtw {
    int a;
    final SessionLifecycleRequest b;
    final bval c;
    final bvad d;

    public bvaj(SessionLifecycleRequest sessionLifecycleRequest0, bval bval0, bvad bvad0, ibrl ibrl0) {
        this.b = sessionLifecycleRequest0;
        this.c = bval0;
        this.d = bvad0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bvaj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bvaj(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(iccv.c(this.b.c, this) == object1) {
                return object1;
            }
        }
        this.c.a(this.b.a, this.d, true);
        return ibom.a;
    }
}

