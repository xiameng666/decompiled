import android.content.Context;
import j..time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class ahze {
    public final ahzo a;
    private static final baun b;
    private final Context c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    static {
        ahze.b = new baun("MissCallApiHistoryMgr", new String[0]);
    }

    public ahze(Context context0, int v, int v1, int v2, int v3, glxv glxv0) {
        ibuq.f(glxv0, "timeSource");
        super();
        this.c = context0;
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = v3;
        this.a = new ahzo(context0, v, v1);
    }

    public final Object a(String s, ibrl ibrl0) {
        long v3;
        long v1;
        ahyz ahyz0;
        if((ibrl0 instanceof ahyz)) {
            ahyz0 = (ahyz)ibrl0;
            int v = ahyz0.e;
            if((v & 0x80000000) == 0) {
                ahyz0 = new ahyz(this, ibrl0);
            }
            else {
                ahyz0.e = v - 0x80000000;
            }
        }
        else {
            ahyz0 = new ahyz(this, ibrl0);
        }
        Object object0 = ahyz0.c;
        Object object1 = ibrx.a;
        boolean z = true;
        switch(ahyz0.e) {
            case 0: {
                ibnx.b(object0);
                v1 = Instant.now().toEpochMilli();
                long v2 = v1 - TimeUnit.DAYS.toMillis(30L);
                ahyz0.f = s;
                ahyz0.a = v1;
                ahyz0.b = v2;
                ahyz0.e = 1;
                object0 = this.b(s, ahyz0);
                if(object0 != object1) {
                    v3 = v2;
                    break;
                }
                return object1;
            }
            case 1: {
                v3 = ahyz0.b;
                v1 = ahyz0.a;
                s = ahyz0.f;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        baun baun0 = ahze.b;
        baun0.h(a.L(((List)object0), s, "canCallApi - Call history for package ", ": "), new Object[0]);
        ArrayList arrayList0 = new ArrayList();
        for(Object object2: ((List)object0)) {
            long v4 = ((Number)object2).longValue();
            if(v3 <= v4 && v4 <= v1) {
                arrayList0.add(object2);
            }
        }
        baun0.h("canCallApi - Recent calls in the past 30 days: " + arrayList0.toString(), new Object[0]);
        int v5 = aics.a(this.c, s) ? this.e : this.d;
        if(arrayList0.size() >= v5) {
            z = false;
        }
        baun0.h("canCallApi - Can call API? " + z + " (Recent calls: " + arrayList0.size() + ", Max calls allowed: " + v5 + ")", new Object[0]);
        return Boolean.valueOf(z);
    }

    public final Object b(String s, ibrl ibrl0) {
        ahza ahza0;
        if((ibrl0 instanceof ahza)) {
            ahza0 = (ahza)ibrl0;
            int v = ahza0.c;
            if((v & 0x80000000) == 0) {
                ahza0 = new ahza(this, ibrl0);
            }
            else {
                ahza0.c = v - 0x80000000;
            }
        }
        else {
            ahza0 = new ahza(this, ibrl0);
        }
        Object object0 = ahza0.a;
        Object object1 = ibrx.a;
        switch(ahza0.c) {
            case 0: {
                ibnx.b(object0);
                ahza0.d = s;
                ahza0.c = 1;
                object0 = this.a.a(s, ahza0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                s = ahza0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ahze.b.h(a.L((((ahxg)object0) == null ? null : ((ahxg)object0).c), s, "getPackageCallHistory - Package: ", ", Timestamps: "), new Object[0]);
        if(((ahxg)object0) != null) {
            Object object2 = ((ahxg)object0).c;
            if(object2 != null) {
                return object2;
            }
        }
        return ibps.a;
    }

    public final Object c(String s, ibrl ibrl0) {
        long v2;
        String s1;
        ahzb ahzb0;
        if((ibrl0 instanceof ahzb)) {
            ahzb0 = (ahzb)ibrl0;
            int v = ahzb0.d;
            if((v & 0x80000000) == 0) {
                ahzb0 = new ahzb(this, ibrl0);
            }
            else {
                ahzb0.d = v - 0x80000000;
            }
        }
        else {
            ahzb0 = new ahzb(this, ibrl0);
        }
        Object object0 = ahzb0.b;
        Object object1 = ibrx.a;
        switch(ahzb0.d) {
            case 0: {
                ibnx.b(object0);
                long v1 = Instant.now().toEpochMilli();
                ahzb0.e = s;
                ahzb0.a = v1;
                ahzb0.d = 1;
                ahzk ahzk0 = new ahzk(new ahzj(this.a, s, v1));
                if(icpu.c(this.a.d.b(ahzk0, gmap.a), ahzb0) != object1) {
                    s1 = s;
                    v2 = v1;
                    break;
                }
                return object1;
            }
            case 1: {
                v2 = ahzb0.a;
                s1 = ahzb0.e;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ahze.b.h("recordApiCallTimestamp - Added new API call timestamp for package " + s1 + ": " + v2, new Object[0]);
        return ibom.a;
    }

    public final Object d(String s, ibrl ibrl0) {
        long v2;
        String s1;
        ahzc ahzc0;
        if((ibrl0 instanceof ahzc)) {
            ahzc0 = (ahzc)ibrl0;
            int v = ahzc0.d;
            if((v & 0x80000000) == 0) {
                ahzc0 = new ahzc(this, ibrl0);
            }
            else {
                ahzc0.d = v - 0x80000000;
            }
        }
        else {
            ahzc0 = new ahzc(this, ibrl0);
        }
        Object object0 = ahzc0.b;
        Object object1 = ibrx.a;
        switch(ahzc0.d) {
            case 0: {
                ibnx.b(object0);
                long v1 = Instant.now().toEpochMilli();
                ahzc0.e = s;
                ahzc0.a = v1;
                ahzc0.d = 1;
                ahzi ahzi0 = new ahzi(new ahzh(s, v1));
                if(icpu.c(this.a.d.b(ahzi0, gmap.a), ahzc0) != object1) {
                    s1 = s;
                    v2 = v1;
                    break;
                }
                return object1;
            }
            case 1: {
                v2 = ahzc0.a;
                s1 = ahzc0.e;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ahze.b.h("recordUserConsentTime - Added new consent granted time for package " + s1 + ": " + v2, new Object[0]);
        return ibom.a;
    }

    public final Object e(String s, ibrl ibrl0) {
        long v2;
        ahzd ahzd0;
        if((ibrl0 instanceof ahzd)) {
            ahzd0 = (ahzd)ibrl0;
            int v = ahzd0.d;
            if((v & 0x80000000) == 0) {
                ahzd0 = new ahzd(this, ibrl0);
            }
            else {
                ahzd0.d = v - 0x80000000;
            }
        }
        else {
            ahzd0 = new ahzd(this, ibrl0);
        }
        Object object0 = ahzd0.b;
        Object object1 = ibrx.a;
        boolean z = true;
        switch(ahzd0.d) {
            case 0: {
                ibnx.b(object0);
                long v1 = Instant.now().toEpochMilli();
                ahzd0.a = v1;
                ahzd0.d = 1;
                object0 = this.a.a(s, ahzd0);
                if(object0 != object1) {
                    v2 = v1;
                    break;
                }
                return object1;
            }
            case 1: {
                v2 = ahzd0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        long v3 = ((ahxg)object0) == null ? 0L : ((ahxg)object0).d;
        int v4 = ((ahxg)object0) == null ? 0 : ((ahxg)object0).e;
        if(v3 < v2 - TimeUnit.SECONDS.toMillis(((long)this.f)) || v4 >= this.g) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

