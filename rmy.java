import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public final class rmy implements rmz {
    public static final ibvu a;
    private static final rmm b;
    private final icck c;
    private final lap d;
    private final String e;
    private final Context f;
    private long g;
    private final sej h;
    private final sel i;

    static {
        rmy.b = new rmm();
        rmy.a = lem.a("OnboardingDataStore", new lek(new rml()));
    }

    public rmy(Context context0, icck icck0, lap lap0) {
        sej sej0 = new sej(context0);
        sel sel0 = new sel(context0);
        ibuq.f(context0, "context");
        ibuq.f(lap0, "dataStore");
        super();
        this.h = sej0;
        this.i = sel0;
        this.c = icck0;
        this.d = lap0;
        this.e = "OnboardingTaskInfra";
        this.f = context0.getApplicationContext();
    }

    public final Object a(ibrl ibrl0) {
        long v4;
        long v3;
        long v2;
        long v1;
        Bundle bundle0;
        rmn rmn0;
        if((ibrl0 instanceof rmn)) {
            rmn0 = (rmn)ibrl0;
            int v = rmn0.e;
            if((v & 0x80000000) == 0) {
                rmn0 = new rmn(this, ibrl0);
            }
            else {
                rmn0.e = v - 0x80000000;
            }
        }
        else {
            rmn0 = new rmn(this, ibrl0);
        }
        Object object0 = rmn0.c;
        Object object1 = ibrx.a;
        switch(rmn0.e) {
            case 0: {
                ibnx.b(object0);
                try {
                    try {
                        bundle0 = this.h.a.getContentResolver().call(gaec.g(), "getSuwSessionId", null, null);
                    }
                    catch(IllegalArgumentException | SecurityException unused_ex) {
                        Log.w(gaec.a, "Failed to get SUW session ID; return 0.");
                        goto label_21;
                    }
                    if(bundle0 == null) {
                    label_21:
                        v1 = 0L;
                    }
                    else {
                        v1 = bundle0.getLong("suwSessionIdInt64", 0L);
                    }
                }
                catch(Exception unused_ex) {
                    v1 = 0L;
                    goto label_27;
                }
                try {
                    sct.d("SuwMetadataProvider", a.u(v1, "Got SUW session ID: "));
                    goto label_28;
                }
                catch(Exception unused_ex) {
                }
            label_27:
                sct.e("SuwMetadataProvider", "Failed to get SUW session id");
            label_28:
                if(v1 == 0L) {
                    sct.e("OnboardingDataStore", "Failed to get SUW session id. Returning DataStore as is.");
                    return this.d;
                }
                rmn0.a = v1;
                rmn0.b = v1;
                rmn0.e = 1;
                object0 = this.b(rmn0);
                if(object0 == object1) {
                    return object1;
                }
                v2 = v1;
                goto label_41;
            }
            case 1: {
                v1 = rmn0.b;
                v2 = rmn0.a;
                ibnx.b(object0);
            label_41:
                if(v1 != ((Number)object0).longValue()) {
                    ibuq.e(this.f, "context");
                    lap lap0 = rmy.b.a(this.f);
                    rmo rmo0 = new rmo(null);
                    rmn0.a = v2;
                    rmn0.e = 2;
                    if(lff.a(lap0, rmo0, rmn0) != object1) {
                        v3 = v2;
                        goto label_52;
                    }
                    return object1;
                }
                break;
            }
            case 2: {
                v3 = rmn0.a;
                ibnx.b(object0);
            label_52:
                rmp rmp0 = new rmp(null);
                rmn0.a = v3;
                rmn0.e = 3;
                if(lff.a(this.d, rmp0, rmn0) != object1) {
                    v4 = v3;
                    goto label_60;
                }
                return object1;
            }
            case 3: {
                v4 = rmn0.a;
                ibnx.b(object0);
            label_60:
                rmn0.a = v4;
                rmn0.e = 4;
                this.g = v4;
                ibuq.e(this.f, "context");
                Object object2 = lff.a(rmy.b.a(this.f), new rmr(v4, null), rmn0);
                if(object2 != object1) {
                    object2 = ibom.a;
                }
                if(object2 != object1) {
                    sct.c("OnboardingDataStore", a.u(v4, "Cleared DataStore for SUW session "));
                    return this.d;
                }
                return object1;
            }
            case 4: {
                long v5 = rmn0.a;
                ibnx.b(object0);
                sct.c("OnboardingDataStore", a.u(v5, "Cleared DataStore for SUW session "));
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return this.d;
    }

    public final Object b(ibrl ibrl0) {
        rmq rmq0;
        if((ibrl0 instanceof rmq)) {
            rmq0 = (rmq)ibrl0;
            int v = rmq0.c;
            if((v & 0x80000000) == 0) {
                rmq0 = new rmq(this, ibrl0);
            }
            else {
                rmq0.c = v - 0x80000000;
            }
        }
        else {
            rmq0 = new rmq(this, ibrl0);
        }
        Object object0 = rmq0.a;
        Object object1 = ibrx.a;
        switch(rmq0.c) {
            case 0: {
                ibnx.b(object0);
                long v1 = this.g;
                if(v1 != 0L) {
                    return new Long(v1);
                }
                ibuq.e(this.f, "context");
                icig icig0 = rmy.b.a(this.f).b();
                rmq0.c = 1;
                object0 = icll.a(icig0, rmq0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Long long0 = (Long)((lfa)object0).a(lfd.b("last_accessed_suw_session_id"));
        if(long0 != null) {
            this.g = long0.longValue();
        }
        return new Long(this.g);
    }

    @Override  // rmz
    public final Object c(String s, sdg sdg0, ibrl ibrl0) {
        if(!this.i.b(0x186E9F6FL)) {
            return null;
        }
        rms rms0 = new rms(this, s, sdg0, null);
        return icbd.a(((icqb)this.c).a, rms0, ibrl0);
    }

    public final Object d(String s, ibrl ibrl0) {
        String s2;
        rmt rmt0;
        if((ibrl0 instanceof rmt)) {
            rmt0 = (rmt)ibrl0;
            int v = rmt0.c;
            if((v & 0x80000000) == 0) {
                rmt0 = new rmt(this, ibrl0);
            }
            else {
                rmt0.c = v - 0x80000000;
            }
        }
        else {
            rmt0 = new rmt(this, ibrl0);
        }
        Object object0 = rmt0.a;
        Object object1 = ibrx.a;
        switch(rmt0.c) {
            case 0: {
                ibnx.b(object0);
                String s1 = this.g(s);
                rmt0.d = s1;
                rmt0.c = 1;
                object0 = this.a(rmt0);
                if(object0 == object1) {
                    return object1;
                }
                s2 = s1;
                goto label_23;
            }
            case 1: {
                s2 = rmt0.d;
                ibnx.b(object0);
            label_23:
                icig icig0 = ((lap)object0).b();
                rmt0.d = s2;
                rmt0.c = 2;
                object0 = icll.c(icig0, rmt0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                s2 = rmt0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((lfa)object0) != null) {
            byte[] arr_b = (byte[])((lfa)object0).a(lfd.a(s2));
            if(arr_b != null) {
                return scr.d(ibpo.b(arr_b));
            }
        }
        return null;
    }

    @Override  // rmz
    public final Object e(String s, Object object0, sdv sdv0, ibrl ibrl0) {
        if(this.i.b(0x186E9F6FL)) {
            rmu rmu0 = new rmu(this, s, sdv0, object0, null);
            Object object1 = icbd.a(((icqb)this.c).a, rmu0, ibrl0);
            if(object1 == ibrx.a) {
                return object1;
            }
        }
        return ibom.a;
    }

    public final Object f(String s, PersistableBundle persistableBundle0, ibrl ibrl0) {
        String s2;
        rmw rmw0;
        if((ibrl0 instanceof rmw)) {
            rmw0 = (rmw)ibrl0;
            int v = rmw0.c;
            if((v & 0x80000000) == 0) {
                rmw0 = new rmw(this, ibrl0);
            }
            else {
                rmw0.c = v - 0x80000000;
            }
        }
        else {
            rmw0 = new rmw(this, ibrl0);
        }
        Object object0 = rmw0.a;
        Object object1 = ibrx.a;
        switch(rmw0.c) {
            case 0: {
                ibnx.b(object0);
                String s1 = this.g(s);
                rmw0.d = persistableBundle0;
                rmw0.e = s1;
                rmw0.c = 1;
                object0 = this.a(rmw0);
                if(object0 != object1) {
                    s2 = s1;
                    goto label_25;
                }
                return object1;
            }
            case 1: {
                s2 = rmw0.e;
                persistableBundle0 = rmw0.d;
                ibnx.b(object0);
            label_25:
                rmx rmx0 = new rmx(s2, persistableBundle0, null);
                rmw0.d = null;
                rmw0.e = null;
                rmw0.c = 2;
                return lff.a(((lap)object0), rmx0, rmw0) != object1 ? ibom.a : object1;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private final String g(String s) {
        return ibzk.W(s, this.e) ? s : this.e + s;
    }
}

