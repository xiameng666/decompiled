import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.spatula.settings.SpatulaSettingPreference;

public final class errw extends cjtm {
    public final String a;
    private static final bboh b;
    private final ersz c;
    private final ersw d;
    private final ersh e;
    private final ervb f;

    static {
        errw.b = bboh.b("GetSpatulaSettingsOperation", bbcu.gt);
    }

    public errw(ersz ersz0, ersw ersw0, ersh ersh0, ervb ervb0, String s) {
        ibuq.f(ersz0, "spatulaSettingPreferenceProvider");
        ibuq.f(ersw0, "spatulaSettingDefaultValueProvider");
        ibuq.f(ersh0, "deviceStateProvider");
        super(386, "GetSpatulaSettings");
        this.c = ersz0;
        this.d = ersw0;
        this.e = ersh0;
        this.f = ervb0;
        this.a = s;
    }

    public final Object b(String s, ibrl ibrl0) {
        boolean z1;
        Object object4;
        Object object1;
        Object object0;
        errv errv0;
        if((ibrl0 instanceof errv)) {
            errv0 = (errv)ibrl0;
            int v = errv0.d;
            if((v & 0x80000000) == 0) {
                errv0 = new errv(this, ibrl0);
            }
            else {
                errv0.d = v - 0x80000000;
            }
        }
        else {
            errv0 = new errv(this, ibrl0);
        }
        try {
            object0 = errv0.b;
            object1 = ibrx.a;
            switch(errv0.d) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_20;
                }
                case 2: {
                    goto label_34;
                }
                case 3: {
                    goto label_47;
                }
            }
        }
        catch(erux erux0) {
            a.ae(errw.b.j(), "Failed to get spatula settings", erux0);
            return errm.e;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        errv0.e = s;
        errv0.f = s;
        errv0.d = 1;
        Object object2 = this.e.b();
        if(object2 != object1) {
            goto label_23;
        label_20:
            s = errv0.f;
            ibnx.b(object0);
            object2 = ((ibnw)object0).a;
        label_23:
            ibnx.b(object2);
            if(((Boolean)object2).booleanValue()) {
                s = this.e.a();
            }
            if(ibzk.D(s)) {
                return errm.b;
            }
            try {
                errv0.e = s;
                errv0.f = null;
                errv0.d = 2;
                Object object3 = ersz.a(this.c, s, errv0);
                if(object3 != object1) {
                    goto label_37;
                label_34:
                    s = errv0.e;
                    ibnx.b(object0);
                    object3 = ((ibnw)object0).a;
                label_37:
                    ibnx.b(object3);
                    boolean z = ((Boolean)object3).booleanValue();
                    errv0.e = null;
                    errv0.a = z;
                    errv0.d = 3;
                    object4 = ersw.a(this.d, s, errv0);
                    if(object4 != object1) {
                        z1 = z;
                        goto label_50;
                    }
                }
                return object1;
            label_47:
                z1 = errv0.a;
                ibnx.b(object0);
                object4 = ((ibnw)object0).a;
            label_50:
                ibnx.b(object4);
                boolean z2 = ((Boolean)object4).booleanValue();
                if(z1 && z2) {
                    return errm.c;
                }
                if(z1) {
                    return errm.a;
                }
                return z2 ? errm.d : errm.b;
            }
            catch(erux erux0) {
                a.ae(errw.b.j(), "Failed to get spatula settings", erux0);
                return errm.e;
            }
        }
        return object1;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        SpatulaSettingPreference spatulaSettingPreference0 = (SpatulaSettingPreference)icbb.c(new erru(this, null));
        ApiMetadata apiMetadata0 = cckf.d(bbdp.eR);
        this.f.a(Status.b, spatulaSettingPreference0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.f.a(status0, null, ApiMetadata.b);
    }
}

