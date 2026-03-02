import android.app.KeyguardManager;
import android.content.Context;
import com.google.android.gms.chimera.modules.activeunlock.primary.AppContextProvider;

public final class eyvx extends lsb {
    public final exyg a;
    public final boolean b;
    public final lqd c;
    private final eyny d;
    private final boolean e;
    private final iccs f;

    public eyvx(exyg exyg0, eyny eyny0) {
        ibuq.f(eyny0, "deeplinkArguments");
        super();
        this.a = exyg0;
        this.d = eyny0;
        this.e = eyny0.b;
        this.b = eyny0.a != null;
        this.f = eyvx.c() ? icbb.a(lsc.a(this), null, null, new eyvr(this, null), 3) : icbb.a(lsc.a(this), null, null, new eyvs(this, null), 3);
        icbb.b(lsc.a(this), null, null, new eyvt(this, null), 3);
        this.c = lok.b(null, new eyvv(this, null), 3);
    }

    public final Object a(ibrl ibrl0) {
        eyvu eyvu0;
        if((ibrl0 instanceof eyvu)) {
            eyvu0 = (eyvu)ibrl0;
            int v = eyvu0.c;
            if((v & 0x80000000) == 0) {
                eyvu0 = new eyvu(this, ibrl0);
            }
            else {
                eyvu0.c = v - 0x80000000;
            }
        }
        else {
            eyvu0 = new eyvu(this, ibrl0);
        }
        Object object0 = eyvu0.a;
        Object object1 = ibrx.a;
        switch(eyvu0.c) {
            case 0: {
                ibnx.b(object0);
                boolean z = this.e;
                if(!z && eyvx.c()) {
                    return new Integer(0x7F0B0C14);  // id:authentication_fragment
                }
                if(!z && !eyvx.c()) {
                    return new Integer(0x7F0B1F2E);  // id:screen_lock_set_up_fragment
                }
                if(z) {
                    eyvu0.c = 1;
                    object0 = this.b(eyvu0);
                    if(object0 != object1) {
                        return ((Boolean)object0).booleanValue() ? new Integer(0x7F0B1359) : new Integer(0x7F0B1236);  // id:explanation_fragment
                    }
                    return object1;
                }
                return new Integer(0x7F0B1236);  // id:enrolled_device_list_fragment
            }
            case 1: {
                ibnx.b(object0);
                return ((Boolean)object0).booleanValue() ? new Integer(0x7F0B1359) : new Integer(0x7F0B1236);  // id:explanation_fragment
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(ibrl ibrl0) {
        eyvw eyvw0;
        if((ibrl0 instanceof eyvw)) {
            eyvw0 = (eyvw)ibrl0;
            int v = eyvw0.c;
            if((v & 0x80000000) == 0) {
                eyvw0 = new eyvw(this, ibrl0);
            }
            else {
                eyvw0.c = v - 0x80000000;
            }
        }
        else {
            eyvw0 = new eyvw(this, ibrl0);
        }
        Object object0 = eyvw0.a;
        Object object1 = ibrx.a;
        switch(eyvw0.c) {
            case 0: {
                ibnx.b(object0);
                Context context0 = AppContextProvider.a();
                ibuq.e(context0, "getApplicationContext(...)");
                if(eyee.a(context0).i) {
                    eyvw0.c = 1;
                    object0 = this.f.n(eyvw0);
                    if(object0 != object1) {
                        return ((Boolean)object0).booleanValue() ? Boolean.valueOf(false) : Boolean.valueOf(true);
                    }
                    return object1;
                }
                return Boolean.valueOf(false);
            }
            case 1: {
                ibnx.b(object0);
                return ((Boolean)object0).booleanValue() ? Boolean.valueOf(false) : Boolean.valueOf(true);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private static final boolean c() {
        KeyguardManager keyguardManager0 = (KeyguardManager)AppContextProvider.a().getSystemService(KeyguardManager.class);
        return keyguardManager0 != null && keyguardManager0.isDeviceSecure();
    }
}

