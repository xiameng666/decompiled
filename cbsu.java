import android.app.Application;

final class cbsu extends ibsl implements ibtw {
    final cbte a;

    public cbsu(cbte cbte0, ibrl ibrl0) {
        this.a = cbte0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbsu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbsu(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        Application application0 = this.a.a();
        return cbaz.a().b(application0, "com.google.android.gms");
    }
}

