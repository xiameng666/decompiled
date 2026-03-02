import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.List;

public final class ersm {
    private static final List a;
    private final ibnf b;

    static {
        ersm.a = ibpo.b("com.google.android.apps.messaging");
        bboh.b("SpatulaAvailabilityProvider", bbcu.gt);
    }

    public ersm(ibnf ibnf0) {
        this.b = ibnf0;
    }

    public static Object a(ersm ersm0, Context context0, ibrl ibrl0) {
        ersl ersl0;
        if((ibrl0 instanceof ersl)) {
            ersl0 = (ersl)ibrl0;
            int v = ersl0.c;
            if((v & 0x80000000) == 0) {
                ersl0 = new ersl(ersm0, ibrl0);
            }
            else {
                ersl0.c = v - 0x80000000;
            }
        }
        else {
            ersl0 = new ersl(ersm0, ibrl0);
        }
        Object object0 = ersl0.a;
        Object object1 = ibrx.a;
        switch(ersl0.c) {
            case 0: {
                ibnx.b(object0);
                hykh.c();
                if(!hykh.c()) {
                    return Boolean.valueOf(false);
                }
                if(bbna.c(context0, "com.google.android.safetycore") != null) {
                    for(Object object2: ersm.a) {
                        PackageInfo packageInfo0 = bbna.c(context0, ((String)object2));
                        if(packageInfo0 == null || packageInfo0.getLongVersionCode() < (ibuq.m(((String)object2), "com.google.android.apps.messaging") ? hykh.a.b().a() : 0L)) {
                            return Boolean.valueOf(false);
                        }
                    }
                    ffun ffun0 = ((ffuo)ersm0.b).a();
                    ersl0.c = 1;
                    azzc azzc0 = new azzc();
                    azzc0.a = new ffuu();
                    azzd azzd0 = azzc0.a();
                    evql evql0 = ffun0.a.iG(azzd0);
                    icbk icbk0 = new icbk(ibsc.c(ersl0), 1);
                    icbk0.z();
                    evql0.z(new ffum(icbk0));
                    object0 = icbk0.k();
                    if(object0 == object1) {
                        ibsi.b(ersl0);
                    }
                    if(object0 != object1) {
                        return ((Boolean)object0).booleanValue() ? Boolean.valueOf(true) : Boolean.valueOf(false);
                    }
                    return object1;
                }
                return Boolean.valueOf(false);
            }
            case 1: {
                ibnx.b(object0);
                return ((Boolean)object0).booleanValue() ? Boolean.valueOf(true) : Boolean.valueOf(false);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

