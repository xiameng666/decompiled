import com.google.android.gms.multidevice.sync.appcast.service.AppCastChimeraService;

public final class ctll extends ibsl implements ibtw {
    int a;
    final AppCastChimeraService b;

    public ctll(AppCastChimeraService appCastChimeraService0, ibrl ibrl0) {
        this.b = appCastChimeraService0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctll)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctll(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ykm ykm0 = this.b.a();
            ctzf ctzf0 = this.b.c();
            this.a = 1;
            if(ykm0.b(ctzf0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

