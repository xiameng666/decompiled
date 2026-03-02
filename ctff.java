import com.google.android.gms.multidevice.service.SettingsOverrideIntentOperation;

public final class ctff extends ibsl implements ibtw {
    int a;
    final SettingsOverrideIntentOperation b;

    public ctff(SettingsOverrideIntentOperation settingsOverrideIntentOperation0, ibrl ibrl0) {
        this.b = settingsOverrideIntentOperation0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctff)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctff(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                csyu csyu0 = (csyu)this.b.b().get();
                this.a = 1;
                if(csyu0.b(this) != object1) {
                    goto label_8;
                }
                break;
            }
            case 1: {
            label_8:
                ibnf ibnf0 = this.b.b;
                if(ibnf0 == null) {
                    ibuq.j("cache");
                    ibnf0 = null;
                }
                csus csus0 = (csus)ibnf0.get();
                this.a = 2;
                if(csus0.f(this) != object1) {
                    return ibom.a;
                }
                break;
            }
            default: {
                return ibom.a;
            }
        }
        return object1;
    }
}

