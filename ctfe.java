import com.google.android.gms.multidevice.service.SettingsOverrideIntentOperation;

public final class ctfe extends ibsl implements ibtw {
    int a;
    final SettingsOverrideIntentOperation b;

    public ctfe(SettingsOverrideIntentOperation settingsOverrideIntentOperation0, ibrl ibrl0) {
        this.b = settingsOverrideIntentOperation0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctfe)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctfe(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ctbn ctbn0 = this.b.c;
            if(ctbn0 == null) {
                ibuq.j("apiChecker");
                ctbn0 = null;
            }
            this.a = 1;
            object0 = ctbn0.a(this);
            if(object0 == object1) {
                return object1;
            }
        }
        return Boolean.valueOf(((boolean)(((Boolean)object0).booleanValue() ^ 1)));
    }
}

