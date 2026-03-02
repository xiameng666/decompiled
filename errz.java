import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.spatula.settings.SpatulaSettingPreference;

public final class errz extends cjtm {
    public final String a;
    public final SpatulaSettingPreference b;
    private final ertf c;
    private final azxs d;

    static {
        bboh.b("SetSpatulaSettingsOperation", bbcu.gt);
    }

    public errz(ertf ertf0, azxs azxs0, String s, SpatulaSettingPreference spatulaSettingPreference0) {
        ibuq.f(ertf0, "spatulaSettingsPreferenceSetter");
        super(386, "SetSpatulaSettings");
        this.c = ertf0;
        this.d = azxs0;
        this.a = s;
        this.b = spatulaSettingPreference0;
    }

    public final Object b(String s, SpatulaSettingPreference spatulaSettingPreference0, ibrl ibrl0) {
        Object object2;
        boolean z;
        erry erry0;
        if((ibrl0 instanceof erry)) {
            erry0 = (erry)ibrl0;
            int v = erry0.c;
            if((v & 0x80000000) == 0) {
                erry0 = new erry(this, ibrl0);
            }
            else {
                erry0.c = v - 0x80000000;
            }
        }
        else {
            erry0 = new erry(this, ibrl0);
        }
        Object object0 = erry0.a;
        Object object1 = ibrx.a;
        switch(erry0.c) {
            case 0: {
                ibnx.b(object0);
                if(ibzk.D(s)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if(ibuq.m(spatulaSettingPreference0, errm.a)) {
                    z = true;
                }
                else {
                    if(!ibuq.m(spatulaSettingPreference0, errm.b)) {
                        throw new IllegalArgumentException("preference should be ENABLED/DISABLED");
                    }
                    z = false;
                }
                erry0.c = 1;
                object2 = ertf.a(this.c, s, z, erry0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object2);
        return ibom.a;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        icbb.c(new errx(this, null));
        this.d.a(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.d.a(status0);
    }
}

