import com.google.android.gms.googlesettings.ui.GoogleSettingsChimeraActivity;

public final class bvbh extends ibsl implements ibtw {
    int a;
    final GoogleSettingsChimeraActivity b;

    public bvbh(GoogleSettingsChimeraActivity googleSettingsChimeraActivity0, ibrl ibrl0) {
        this.b = googleSettingsChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bvbh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bvbh(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            bvbg bvbg0 = new bvbg(this.b, null);
            this.a = 1;
            if(lqy.b(this.b, lpf.e, bvbg0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

