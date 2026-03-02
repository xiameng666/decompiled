import com.google.android.gms.multidevice.service.SettingsOverrideIntentOperation;

public final class ctfg extends ibsl implements ibtw {
    int a;
    final SettingsOverrideIntentOperation b;

    public ctfg(SettingsOverrideIntentOperation settingsOverrideIntentOperation0, ibrl ibrl0) {
        this.b = settingsOverrideIntentOperation0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctfg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctfg(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            csyu csyu0 = (csyu)this.b.b().get();
            this.a = 1;
            if(csyu0.f(this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

