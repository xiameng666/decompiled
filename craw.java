import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class craw extends cray {
    private final crkt a;
    private final crni b;

    public craw(crkt crkt0) {
        batl.s(crkt0);
        this.a = crkt0;
        this.b = crkt0.j();
    }

    @Override  // crnj
    public final long a() {
        return this.a.p().t();
    }

    @Override  // crnj
    public final String b() {
        this.b.m();
        return (String)this.b.b.get();
    }

    @Override  // crnj
    public final String c() {
        crns crns0 = this.b.y.m().r();
        return crns0 == null ? null : crns0.b;
    }

    @Override  // crnj
    public final String d() {
        crns crns0 = this.b.y.m().r();
        return crns0 == null ? null : crns0.a;
    }

    @Override  // crnj
    public final String e() {
        crni crni0;
        try {
            crni0 = this.b;
            return crnr.a(crni0.aj(), crni0.y.l);
        }
        catch(IllegalStateException illegalStateException0) {
            crni0.y.aJ().c.b("getGoogleAppId failed with exception", illegalStateException0);
            return null;
        }
    }

    @Override  // crnj
    public final List f(String s, String s1) {
        crni crni0 = this.b;
        crni0.m();
        if(crni0.aK().i()) {
            crni0.aJ().c.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if(crcn.b()) {
            crni0.aJ().c.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference0 = new AtomicReference();
        crni0.y.aK().j(atomicReference0, 5000L, "get conditional user properties", new crna(crni0, atomicReference0, s, s1));
        List list0 = (List)atomicReference0.get();
        if(list0 == null) {
            crni0.aJ().c.b("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        List list1 = new ArrayList(list0.size());
        for(Object object0: list0) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("app_id", ((ConditionalUserPropertyParcel)object0).a);
            bundle0.putString("origin", ((ConditionalUserPropertyParcel)object0).b);
            bundle0.putLong("creation_timestamp", ((ConditionalUserPropertyParcel)object0).d);
            bundle0.putString("name", ((ConditionalUserPropertyParcel)object0).c.b);
            Object object1 = ((ConditionalUserPropertyParcel)object0).c.a();
            batl.s(object1);
            crlx.b(bundle0, object1);
            bundle0.putBoolean("active", ((ConditionalUserPropertyParcel)object0).e);
            String s2 = ((ConditionalUserPropertyParcel)object0).f;
            if(s2 != null) {
                bundle0.putString("trigger_event_name", s2);
            }
            EventParcel eventParcel0 = ((ConditionalUserPropertyParcel)object0).g;
            if(eventParcel0 != null) {
                bundle0.putString("timed_out_event_name", eventParcel0.a);
                EventParams eventParams0 = eventParcel0.b;
                if(eventParams0 != null) {
                    bundle0.putBundle("timed_out_event_params", eventParams0.a());
                }
            }
            bundle0.putLong("trigger_timeout", ((ConditionalUserPropertyParcel)object0).h);
            EventParcel eventParcel1 = ((ConditionalUserPropertyParcel)object0).i;
            if(eventParcel1 != null) {
                bundle0.putString("triggered_event_name", eventParcel1.a);
                EventParams eventParams1 = eventParcel1.b;
                if(eventParams1 != null) {
                    bundle0.putBundle("triggered_event_params", eventParams1.a());
                }
            }
            bundle0.putLong("triggered_timestamp", ((ConditionalUserPropertyParcel)object0).c.c);
            bundle0.putLong("time_to_live", ((ConditionalUserPropertyParcel)object0).j);
            EventParcel eventParcel2 = ((ConditionalUserPropertyParcel)object0).k;
            if(eventParcel2 != null) {
                bundle0.putString("expired_event_name", eventParcel2.a);
                EventParams eventParams2 = eventParcel2.b;
                if(eventParams2 != null) {
                    bundle0.putBundle("expired_event_params", eventParams2.a());
                }
            }
            ((ArrayList)list1).add(bundle0);
        }
        return list1;
    }

    @Override  // crnj
    public final Map g(String s, String s1, boolean z) {
        crni crni0 = this.b;
        crni0.m();
        if(crni0.aK().i()) {
            crni0.aJ().c.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if(crcn.b()) {
            crni0.aJ().c.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference0 = new AtomicReference();
        crni0.y.aK().j(atomicReference0, 5000L, "get user properties", new crnb(crni0, atomicReference0, s, s1, z));
        List list0 = (List)atomicReference0.get();
        if(list0 == null) {
            crni0.aJ().c.b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.EMPTY_MAP;
        }
        Map map0 = new bxd(list0.size());
        for(Object object0: list0) {
            UserAttributeParcel userAttributeParcel0 = (UserAttributeParcel)object0;
            Object object1 = userAttributeParcel0.a();
            if(object1 != null) {
                map0.put(userAttributeParcel0.b, object1);
            }
        }
        return map0;
    }

    @Override  // crnj
    public final void h(String s) {
        crbw crbw0 = this.a.b();
        long v = SystemClock.elapsedRealtime();
        if(s != null && s.length() != 0) {
            crbw0.aK().f(new crbt(crbw0, s, v));
            return;
        }
        crbw0.aJ().c.a("Ad unit id must be a non-empty string");
    }

    @Override  // crnj
    public final void i(String s, String s1, Bundle bundle0) {
        crni crni0 = this.a.j();
        crni0.m();
        batl.q(s);
        Bundle bundle1 = new Bundle();
        bundle1.putString("name", s);
        bundle1.putLong("creation_timestamp", System.currentTimeMillis());
        if(s1 != null) {
            bundle1.putString("expired_event_name", s1);
            bundle1.putBundle("expired_event_params", bundle0);
        }
        crni0.aK().f(new crmz(crni0, bundle1));
    }

    @Override  // crnj
    public final void j(String s) {
        crbw crbw0 = this.a.b();
        long v = SystemClock.elapsedRealtime();
        if(s != null && s.length() != 0) {
            crbw0.aK().f(new crbu(crbw0, s, v));
            return;
        }
        crbw0.aJ().c.a("Ad unit id must be a non-empty string");
    }

    @Override  // crnj
    public final void k(String s, String s1, Bundle bundle0) {
        this.b.u(s, s1, bundle0);
    }

    @Override  // crnj
    public final void l(Bundle bundle0) {
        crni crni0 = this.b;
        long v = System.currentTimeMillis();
        crni0.m();
        Bundle bundle1 = new Bundle(bundle0);
        if(!TextUtils.isEmpty(bundle1.getString("app_id"))) {
            crni0.aJ().f.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle1.remove("app_id");
        crlx.a(bundle1, "app_id", String.class, null);
        crlx.a(bundle1, "origin", String.class, null);
        crlx.a(bundle1, "name", String.class, null);
        crlx.a(bundle1, "value", Object.class, null);
        crlx.a(bundle1, "trigger_event_name", String.class, null);
        Long long0 = (long)0L;
        crlx.a(bundle1, "trigger_timeout", Long.class, long0);
        crlx.a(bundle1, "timed_out_event_name", String.class, null);
        crlx.a(bundle1, "timed_out_event_params", Bundle.class, null);
        crlx.a(bundle1, "triggered_event_name", String.class, null);
        crlx.a(bundle1, "triggered_event_params", Bundle.class, null);
        crlx.a(bundle1, "time_to_live", Long.class, long0);
        crlx.a(bundle1, "expired_event_name", String.class, null);
        crlx.a(bundle1, "expired_event_params", Bundle.class, null);
        batl.q(bundle1.getString("name"));
        batl.q(bundle1.getString("origin"));
        batl.s(bundle1.get("value"));
        bundle1.putLong("creation_timestamp", v);
        String s = bundle1.getString("name");
        Object object0 = bundle1.get("value");
        if(crni0.aq().i(s) != 0) {
            crni0.aJ().c.b("Invalid conditional user property name", crni0.ao().e(s));
            return;
        }
        if(crni0.aq().b(s, object0) != 0) {
            crni0.aJ().c.c("Invalid conditional user property value", crni0.ao().e(s), object0);
            return;
        }
        Object object1 = crni0.aq().z(s, object0);
        if(object1 == null) {
            crni0.aJ().c.c("Unable to normalize conditional user property value", crni0.ao().e(s), object0);
            return;
        }
        crlx.b(bundle1, object1);
        long v1 = bundle1.getLong("trigger_timeout");
        if(!TextUtils.isEmpty(bundle1.getString("trigger_event_name")) && (v1 > 15552000000L || v1 < 1L)) {
            crni0.aJ().c.c("Invalid conditional user property timeout", crni0.ao().e(s), Long.valueOf(v1));
            return;
        }
        long v2 = bundle1.getLong("time_to_live");
        if(v2 <= 15552000000L && v2 >= 1L) {
            crni0.aK().f(new crmy(crni0, bundle1));
            return;
        }
        crni0.aJ().c.c("Invalid conditional user property time to live", crni0.ao().e(s), Long.valueOf(v2));
    }

    @Override  // crnj
    public final void m(String s) {
        batl.q(s);
    }
}

