import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.spatula.settings.SpatulaAvailability;

public final class errt extends cjtm {
    private static final bboh a;
    private final ersm b;
    private final erva c;

    static {
        errt.a = bboh.b("GetSpatulaAvailabilityOperation", bbcu.gt);
    }

    public errt(ersm ersm0, erva erva0) {
        ibuq.f(ersm0, "spatulaAvailabilityProvider");
        super(386, "GetSpatulaAvailability");
        this.b = ersm0;
        this.c = erva0;
    }

    public final Object b(Context context0, ibrl ibrl0) {
        errs errs0;
        if((ibrl0 instanceof errs)) {
            errs0 = (errs)ibrl0;
            int v = errs0.c;
            if((v & 0x80000000) == 0) {
                errs0 = new errs(this, ibrl0);
            }
            else {
                errs0.c = v - 0x80000000;
            }
        }
        else {
            errs0 = new errs(this, ibrl0);
        }
        Object object0 = errs0.a;
        Object object1 = ibrx.a;
        switch(errs0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    errs0.c = 1;
                    Object object2 = ersm.a(this.b, context0, errs0);
                    if(object2 == object1) {
                        return object1;
                    label_18:
                        ibnx.b(object0);
                        object2 = ((ibnw)object0).a;
                    }
                    if(ibnw.b(object2)) {
                        object2 = ((Boolean)object2).booleanValue() ? errm.f : errm.g;
                    }
                    ibnx.b(object2);
                    ibuq.e(object2, "getOrThrow(...)");
                    return object2;
                }
                catch(aztb aztb0) {
                    break;
                }
            }
            case 1: {
                goto label_18;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(errt.a.j(), "Failed to get Spatula availability", aztb0);
        return errm.g;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        SpatulaAvailability spatulaAvailability0 = (SpatulaAvailability)icbb.c(new errr(this, context0, null));
        ApiMetadata apiMetadata0 = cckf.d(bbdp.eR);
        this.c.a(Status.b, spatulaAvailability0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.c.a(status0, null, ApiMetadata.b);
    }
}

