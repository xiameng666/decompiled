import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.TriggerUriParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import j..util.Comparator.-CC;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class crni extends crbz {
    protected crnh a;
    public final AtomicReference b;
    public int c;
    public crdj d;
    public crdj e;
    public boolean f;
    final crcg g;
    protected boolean h;
    public crdj i;
    public SharedPreferences.OnSharedPreferenceChangeListener j;
    public crdj k;
    private final Set l;
    private boolean m;
    private final Object n;
    private boolean o;
    private PriorityQueue p;
    private crmb q;
    private final AtomicLong r;
    private long s;
    private final crqw t;

    public crni(crkt crkt0) {
        super(crkt0);
        this.l = new CopyOnWriteArraySet();
        this.n = new Object();
        this.o = false;
        this.c = 1;
        this.h = true;
        this.t = new crnc(this);
        this.b = new AtomicReference();
        this.q = crmb.a;
        this.s = -1L;
        this.r = new AtomicLong(0L);
        this.g = new crcg(crkt0);
    }

    final void A(String s) {
        this.b.set(s);
    }

    final void B(crdk crdk0, boolean z) {
        crnd crnd0 = new crnd(this, crdk0);
        if(z) {
            this.n();
            crnd0.run();
            return;
        }
        this.aK().f(crnd0);
    }

    final void C(crmb crmb0) {
        this.n();
        boolean z = crmb0.q() && crmb0.o() || this.k().D();
        crkt crkt0 = this.y;
        if(z != crkt0.w()) {
            crkt0.s();
            crkt0.s = z;
            crjx crjx0 = this.ap();
            crjx0.m();
            crjx0.n();
            Boolean boolean0 = crjx0.b().contains("measurement_enabled_from_api") ? Boolean.valueOf(crjx0.b().getBoolean("measurement_enabled_from_api", true)) : null;
            if(!z || boolean0 == null || boolean0.booleanValue()) {
                Boolean boolean1 = Boolean.valueOf(z);
                this.n();
                this.m();
                this.a();
                this.aJ().j.b("Setting app measurement enabled (FE)", boolean1);
                this.ap().i(boolean1);
                if(crkt0.w()) {
                label_20:
                    this.n();
                    String s = this.ap().l.a();
                    if(s != null) {
                        if("unset".equals(s)) {
                            this.F("app", "_npa", null, System.currentTimeMillis());
                        }
                        else {
                            this.F("app", "_npa", Long.valueOf(("true".equals(s) ? 1L : 0L)), System.currentTimeMillis());
                        }
                    }
                    if(crkt0.v() && this.h) {
                        this.aJ().j.a("Recording app launch after enabling measurement for the first time (FE)");
                        this.r();
                        this.l().c.a();
                        this.aK().f(new crmt(this));
                        return;
                    }
                    this.aJ().j.a("Updating Scion state (FE)");
                    croz croz0 = this.k();
                    croz0.n();
                    croz0.a();
                    croz0.x(new crol(croz0, croz0.q(true)));
                }
                else {
                    boolean1.getClass();
                    if(!z) {
                        goto label_20;
                    }
                }
            }
        }
    }

    public final void D(crmb crmb0, boolean z) {
        boolean z3;
        boolean z1;
        crmb crmb1 = crmb0;
        this.a();
        this.m();
        int v = crmb1.c;
        if(v != -10 && (crmb1.c() == crly.a && crmb1.d() == crly.a)) {
            this.aJ().h.a("Ignoring empty consent settings");
            return;
        }
        synchronized(this.n) {
            crmb crmb2 = this.q;
            int v2 = 0;
            if(crmb.r(v, crmb2.c)) {
                EnumMap enumMap0 = crmb1.b;
                crma[] arr_crma = (crma[])enumMap0.keySet().toArray(new crma[0]);
                for(int v3 = 0; true; ++v3) {
                    z1 = false;
                    if(v3 >= arr_crma.length) {
                        break;
                    }
                    crma crma0 = arr_crma[v3];
                    crly crly0 = (crly)enumMap0.get(crma0);
                    crly crly1 = (crly)crmb2.b.get(crma0);
                    if(crly0 == crly.c && crly1 != crly.c) {
                        z1 = true;
                        break;
                    }
                }
                boolean z2 = crmb1.q() && !this.q.q();
                crmb crmb3 = this.q;
                EnumMap enumMap1 = new EnumMap(crma.class);
                crma[] arr_crma1 = crlz.a.c;
                while(v2 < arr_crma1.length) {
                    crma crma1 = arr_crma1[v2];
                    crly crly2 = (crly)enumMap0.get(crma1);
                    if(crly2 == crly.a) {
                        crly2 = (crly)crmb3.b.get(crma1);
                    }
                    if(crly2 != null) {
                        enumMap1.put(crma1, crly2);
                    }
                    ++v2;
                }
                crmb crmb4 = new crmb(enumMap1, v);
                this.q = crmb4;
                z3 = z2;
                crmb1 = crmb4;
                v2 = 1;
            }
            else {
                z1 = false;
                z3 = false;
            }
        }
        if(v2 == 0) {
            this.aJ().i.b("Ignoring lower-priority consent settings, proposed settings", crmb1);
            return;
        }
        long v4 = this.r.getAndIncrement();
        if(z1) {
            this.A(null);
            crne crne0 = new crne(this, crmb1, v4, z3);
            if(z) {
                this.n();
                crne0.run();
                return;
            }
            this.aK().g(crne0);
            return;
        }
        crnf crnf0 = new crnf(this, crmb1, v4, z3);
        if(z) {
            this.n();
            crnf0.run();
            return;
        }
        if(v != -10 && v != 30) {
            this.aK().f(crnf0);
            return;
        }
        this.aK().g(crnf0);
    }

    public final void E(String s, String s1, Object object0, boolean z, long v) {
        int v1;
        if(z) {
            v1 = this.aq().i(s1);
        }
        else {
            crqx crqx0 = this.aq();
            if(!crqx0.W("user property", s1)) {
                v1 = 6;
            }
            else if(!crqx0.S("user property", crme.a, s1)) {
                v1 = 15;
            }
            else if(crqx0.R("user property", 24, s1)) {
                v1 = 0;
            }
            else {
                v1 = 6;
            }
        }
        if(v1 != 0) {
            String s2 = this.aq().B(s1, 24, true);
            this.y.p().av(this.t, v1, s2, s1.length());
            return;
        }
        if(object0 != null) {
            int v2 = this.aq().b(s1, object0);
            if(v2 != 0) {
                String s3 = this.aq().B(s1, 24, true);
                this.y.p().av(this.t, v2, s3, ((String)object0).length());
                return;
            }
            Object object1 = this.aq().z(s1, object0);
            if(object1 != null) {
                this.z(s, s1, v, object1);
            }
            return;
        }
        this.z(s, s1, v, null);
    }

    final void F(String s, String s1, Object object0, long v) {
        String s2 = "false";
        batl.q(s);
        batl.q(s1);
        this.n();
        this.m();
        this.a();
        if("allow_personalized_ads".equals(s1)) {
            if((object0 instanceof String) && !TextUtils.isEmpty(((String)object0))) {
                long v1 = "false".equals(((String)object0).toLowerCase(Locale.ENGLISH)) ? 1L : 0L;
                Long long0 = v1;
                crjw crjw0 = this.ap().l;
                long0.getClass();
                if(v1 == 1L) {
                    s2 = "true";
                }
                crjw0.b(s2);
                object0 = long0;
                s1 = "_npa";
            }
            else if(object0 == null) {
                this.ap().l.b("unset");
                s1 = "_npa";
            }
            this.aJ().k.c("Setting user property(FE)", "non_personalized_ads(_npa)", object0);
        }
        crkt crkt0 = this.y;
        if(!crkt0.v()) {
            this.aJ().k.a("User property not set since app measurement is disabled");
            return;
        }
        if(!crkt0.x()) {
            return;
        }
        UserAttributeParcel userAttributeParcel0 = new UserAttributeParcel(s1, v, object0, s);
        croz croz0 = this.k();
        croz0.n();
        croz0.a();
        boolean z = false;
        if(croz0.G()) {
            criq criq0 = croz0.g();
            Parcel parcel0 = Parcel.obtain();
            crqu.a(userAttributeParcel0, parcel0);
            byte[] arr_b = parcel0.marshall();
            parcel0.recycle();
            if(arr_b.length > 0x20000) {
                criq0.aJ().d.a("User property too long for local database. Sending directly to service");
            }
            else if(criq0.t(1, arr_b)) {
                z = true;
            }
        }
        croz0.x(new crod(croz0, croz0.q(true), z, userAttributeParcel0));
    }

    static void G(crni crni0) {
        crni0.o = false;
    }

    public final void H(Object object0) {
        this.E("auto", "_ldl", object0, true, System.currentTimeMillis());
    }

    protected final void I(String s, String s1, long v, long v1, Bundle bundle0, boolean z, String s2) {
        int v10;
        Bundle bundle4;
        Bundle[] arr_bundle;
        String s7;
        ArrayList arrayList1;
        boolean z3;
        boolean z2;
        String s3 = s;
        long v2 = v;
        batl.q(s3);
        batl.s(bundle0);
        this.n();
        this.a();
        crkt crkt0 = this.y;
        if(!crkt0.v()) {
            this.aJ().j.a("Event not sent since app measurement is disabled");
            return;
        }
        List list0 = this.f().b;
        if(list0 != null && !list0.contains(s1)) {
            this.aJ().j.c("Dropping non-safelisted event. event name, origin", s1, s3);
            return;
        }
        if(!this.m) {
            try {
                this.m = true;
                Class class0 = crkt0.b ? Class.forName("com.google.android.gms.tagmanager.TagManagerService") : Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.aj().getClassLoader());
                try {
                    class0.getDeclaredMethod("initialize", Context.class).invoke(null, this.aj());
                }
                catch(Exception exception0) {
                    this.aJ().f.b("Failed to invoke Tag Manager\'s initialize() method", exception0);
                }
            }
            catch(ClassNotFoundException unused_ex) {
                this.aJ().i.a("Tag Manager is not found and thus will not be used");
            }
        }
        if(!this.am().t(crif.aP) && "_cmp".equals(s1) && bundle0.containsKey("gclid") && !this.al().a) {
            this.F("auto", "_lgclid", bundle0.getString("gclid"), System.currentTimeMillis());
        }
        int v3 = 0;
        if(!this.al().a && z && !"_err".equals(s1)) {
            this.aq().I(bundle0, this.ap().x.a());
        }
        if(!this.al().a) {
            crns crns0 = this.j().s();
            if(crns0 != null && !bundle0.containsKey("_sc")) {
                crns0.d = true;
            }
            crqx.H(crns0, bundle0, false);
        }
        boolean z1 = "am".equals(s3);
        crqx.ac(s1);
        crkt crkt1 = this.y;
        if(crkt1.x()) {
            int v4 = this.aq().c(s1);
            if(v4 != 0) {
                this.aJ().e.b("Invalid event name. Event will not be logged (FE)", this.ao().c(s1));
                String s4 = this.aq().B(s1, 40, true);
                if(s1 != null) {
                    v3 = s1.length();
                }
                crkt1.p().K(this.t, s2, v4, "_ev", s4, v3);
                return;
            }
            List list1 = bbnh.a(new String[]{"_o", "_sn", "_sc", "_si"});
            Bundle bundle1 = this.aq().w(s2, s1, bundle0, list1, true);
            batl.s(bundle1);
            if(!this.al().a && this.j().s() != null && "_ae".equals(s1)) {
                crpo crpo0 = this.l().d;
                long v5 = SystemClock.elapsedRealtime();
                z2 = z1;
                long v6 = v5 - crpo0.b;
                crpo0.b = v5;
                if(v6 > 0L) {
                    this.aq().F(bundle1, v6);
                }
            }
            else {
                z2 = z1;
            }
            if(!"auto".equals(s3) && "_ssr".equals(s1)) {
                crqx crqx0 = this.aq();
                String s5 = bundle1.getString("_ffr");
                if(bbqr.d(s5)) {
                    s5 = null;
                }
                else if(s5 != null) {
                    s5 = s5.trim();
                }
                if(Objects.equals(s5, crqx0.ap().u.a())) {
                    crqx0.aJ().j.a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                crqx0.ap().u.b(s5);
            }
            else if("_ae".equals(s1)) {
                String s6 = this.aq().ap().u.a();
                if(!TextUtils.isEmpty(s6)) {
                    bundle1.putString("_ffr", s6);
                }
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(bundle1);
            if(this.am().t(crif.aH)) {
                crpq crpq0 = this.l();
                crpq0.n();
                z3 = crpq0.b;
            }
            else {
                z3 = this.ap().r.b();
            }
            if(this.ap().o.a() > 0L && this.ap().j(v2) && z3) {
                this.aJ().k.a("Current session is expired, remove the session number, ID, and engagement time");
                arrayList1 = arrayList0;
                s7 = s1;
                this.F("auto", "_sid", null, System.currentTimeMillis());
                this.F("auto", "_sno", null, System.currentTimeMillis());
                this.F("auto", "_se", null, System.currentTimeMillis());
                this.ap().p.b(0L);
            }
            else {
                arrayList1 = arrayList0;
                s7 = s1;
            }
            if(bundle1.getLong("extend_session", 0L) == 1L) {
                this.aJ().k.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                crkt1.o().c.c(v2, v1);
            }
            ArrayList arrayList2 = new ArrayList(bundle1.keySet());
            Collections.sort(arrayList2);
            int v7 = arrayList2.size();
            for(int v8 = 0; v8 < v7; ++v8) {
                String s8 = (String)arrayList2.get(v8);
                if(s8 != null) {
                    this.aq();
                    Object object0 = bundle1.get(s8);
                    if((object0 instanceof Bundle)) {
                        arr_bundle = new Bundle[]{((Bundle)object0)};
                    }
                    else if((object0 instanceof Parcelable[])) {
                        arr_bundle = (Bundle[])Arrays.copyOf(((Parcelable[])object0), ((Parcelable[])object0).length, Bundle[].class);
                    }
                    else {
                        arr_bundle = (object0 instanceof ArrayList) ? ((Bundle[])((ArrayList)object0).toArray(new Bundle[((ArrayList)object0).size()])) : null;
                    }
                    if(arr_bundle != null) {
                        bundle1.putParcelableArray(s8, arr_bundle);
                    }
                }
            }
            int v9 = 0;
            while(v9 < arrayList1.size()) {
                Bundle bundle2 = (Bundle)arrayList1.get(v9);
                bundle2.putString("_o", s3);
                Bundle bundle3 = this.aq().aw(bundle2);
                EventParcel eventParcel0 = new EventParcel((v9 == 0 ? s7 : "_ep"), new EventParams(bundle3), s3, v2, v1);
                croz croz0 = this.k();
                croz0.n();
                croz0.a();
                boolean z4 = croz0.G();
                if(z4) {
                    criq criq0 = croz0.g();
                    Parcel parcel0 = Parcel.obtain();
                    crdq.a(eventParcel0, parcel0, 0);
                    byte[] arr_b = parcel0.marshall();
                    parcel0.recycle();
                    if(arr_b.length > 0x20000) {
                        criq0.aJ().d.a("Event is too long for local database. Sending event directly to service");
                    }
                    else if(criq0.t(0, arr_b)) {
                        bundle4 = bundle3;
                        v10 = 1;
                        goto label_142;
                    }
                }
                v10 = 0;
                bundle4 = bundle3;
            label_142:
                croz0.x(new cron(croz0, z4, croz0.q(true), ((boolean)v10), eventParcel0, s2));
                if(!z2) {
                    for(Object object1: this.l) {
                        new Bundle(bundle4);
                        ((crmf)object1).a();
                    }
                }
                ++v9;
                s3 = s;
                v2 = v;
                arrayList1 = arrayList1;
            }
            if(!this.al().a && this.j().s() != null && "_ae".equals(s7)) {
                this.l().s(true, true, SystemClock.elapsedRealtime());
            }
        }
    }

    protected final void J(String s, String s1, long v, long v1, Bundle bundle0, boolean z, String s2) {
        Bundle bundle1 = new Bundle(bundle0);
        Iterator iterator0 = bundle1.keySet().iterator();
        while(iterator0.hasNext()) {
            int v2 = 0;
            Object object0 = iterator0.next();
            String s3 = (String)object0;
            Object object1 = bundle1.get(s3);
            if((object1 instanceof Bundle)) {
                bundle1.putBundle(s3, new Bundle(((Bundle)object1)));
            }
            else if((object1 instanceof Parcelable[])) {
                while(v2 < ((Parcelable[])object1).length) {
                    Parcelable parcelable0 = ((Parcelable[])object1)[v2];
                    if((parcelable0 instanceof Bundle)) {
                        ((Parcelable[])object1)[v2] = new Bundle(((Bundle)parcelable0));
                    }
                    ++v2;
                }
            }
            else {
                if(!(object1 instanceof List)) {
                    continue;
                }
                while(v2 < ((List)object1).size()) {
                    Object object2 = ((List)object1).get(v2);
                    if((object2 instanceof Bundle)) {
                        ((List)object1).set(v2, new Bundle(((Bundle)object2)));
                    }
                    ++v2;
                }
            }
        }
        this.aK().f(new crmv(this, s, s1, v, v1, bundle1, z, s2));
    }

    public final void K(crmb crmb0, long v, boolean z) {
        this.n();
        this.m();
        this.a();
        crmb crmb1 = this.ap().f();
        if(v <= this.s && crmb.r(crmb1.c, crmb0.c)) {
            this.aJ().i.b("Dropped out-of-date consent setting, proposed settings", crmb0);
            return;
        }
        crjx crjx0 = this.ap();
        crjx0.m();
        crjx0.n();
        int v1 = crmb0.c;
        if(crjx0.k(v1)) {
            SharedPreferences.Editor sharedPreferences$Editor0 = crjx0.b().edit();
            sharedPreferences$Editor0.putString("consent_settings", crmb0.n());
            sharedPreferences$Editor0.putInt("consent_source", v1);
            sharedPreferences$Editor0.apply();
            this.aJ().k.b("Setting storage consent(FE)", crmb0);
            this.s = v;
            if(this.k().E()) {
                croz croz0 = this.k();
                croz0.n();
                croz0.a();
                croz0.x(new croa(croz0));
            }
            else {
                this.k().H();
            }
            if(z) {
                this.k().u(new AtomicReference());
            }
            return;
        }
        this.aJ().i.b("Lower precedence consent source ignored, proposed source", Integer.valueOf(v1));
    }

    @Override  // crbz
    protected final boolean p() {
        return false;
    }

    final PriorityQueue q() {
        if(this.p == null) {
            this.p = new PriorityQueue(Comparator.-CC.comparing(new crmi(), new crmj()));
        }
        return this.p;
    }

    public final void r() {
        this.n();
        this.m();
        this.a();
        if(this.y.x()) {
            crcu crcu0 = this.am();
            if(!crcu0.al().a) {
                Boolean boolean0 = crcu0.o("google_analytics_deferred_deep_link_enabled");
                if(boolean0 != null && boolean0.booleanValue()) {
                    this.aJ().j.a("Deferred Deep Link feature enabled.");
                    this.aK().f(new crmm(this));
                }
            }
            croz croz0 = this.k();
            croz0.n();
            croz0.a();
            AppMetadata appMetadata0 = croz0.q(true);
            boolean z = croz0.G();
            if(!croz0.am().t(crif.aL) || z) {
                croz0.g().t(3, new byte[0]);
            }
            croz0.x(new crof(croz0, appMetadata0, z));
            this.h = false;
            crjx crjx0 = this.ap();
            crjx0.n();
            String s = crjx0.b().getString("previous_os_version", null);
            String s1 = crjx0.an().c();
            if(!TextUtils.isEmpty(s1) && !s1.equals(s)) {
                SharedPreferences.Editor sharedPreferences$Editor0 = crjx0.b().edit();
                sharedPreferences$Editor0.putString("previous_os_version", s1);
                sharedPreferences$Editor0.apply();
            }
            if(!TextUtils.isEmpty(s) && !s.equals(this.an().c())) {
                Bundle bundle0 = new Bundle();
                bundle0.putString("_po", s);
                this.w("auto", "_ou", bundle0);
            }
        }
    }

    final void s() {
        hvhs.c();
        if(!this.am().t(crif.aD)) {
            return;
        }
        if(this.aK().i()) {
            this.aJ().c.a("Cannot get trigger URIs from analytics worker thread");
            return;
        }
        if(crcn.b()) {
            this.aJ().c.a("Cannot get trigger URIs from main thread");
            return;
        }
        this.m();
        this.a();
        this.aJ().k.a("Getting trigger URIs (FE)");
        AtomicReference atomicReference0 = new AtomicReference();
        this.aK().j(atomicReference0, 10000L, "get trigger URIs", new crmk(this, atomicReference0));
        List list0 = (List)atomicReference0.get();
        if(list0 == null) {
            this.aJ().e.a("Timed out waiting for get trigger URIs");
            return;
        }
        this.aK().f(new crml(this, list0));
    }

    public final void t() {
        crni crni1;
        int v9;
        crni crni0;
        Object object1;
        crpr crpr0;
        ggeo ggeo2;
        boolean z2;
        ggoh ggoh1;
        gmjk gmjk0;
        this.m();
        this.n();
        this.aJ().j.a("Handle tcf update.");
        SharedPreferences sharedPreferences0 = this.ap().a();
        gmjj gmjj0 = gmjj.b;
        ggeo ggeo0 = ggeo.r(gmjj0, crps.a, gmjj.c, crps.d, gmjj.d, crps.a, gmjj.e, crps.a, gmjj.h, crps.d, gmjj.j, crps.d, gmjj.k, crps.d);
        gmjj gmjj1 = gmjj.d;
        gmjj gmjj2 = gmjj.e;
        gmjj gmjj3 = gmjj.h;
        ggoh ggoh0 = new ggoh("CH");
        char[] arr_c = new char[5];
        boolean z = sharedPreferences0.contains("IABTCF_TCString");
        int v = crpt.a(sharedPreferences0, "IABTCF_CmpSdkID");
        int v1 = crpt.a(sharedPreferences0, "IABTCF_PolicyVersion");
        int v2 = crpt.a(sharedPreferences0, "IABTCF_gdprApplies");
        int v3 = crpt.a(sharedPreferences0, "IABTCF_PurposeOneTreatment");
        int v4 = crpt.a(sharedPreferences0, "IABTCF_EnableAdvertiserConsentMode");
        String s = crpt.b(sharedPreferences0, "IABTCF_PublisherCC");
        ggek ggek0 = new ggek();
        ggqj ggqj0 = ggeo0.w().om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            String s1 = crpt.b(sharedPreferences0, "IABTCF_PublisherRestrictions" + ((gmjj)object0).a());
            if(!TextUtils.isEmpty(s1) && s1.length() >= 0x2F3) {
                int v5 = Character.digit(s1.charAt(0x2F2), 10);
                if(v5 >= 0 && v5 <= gmjk.values().length) {
                    switch(v5) {
                        case 0: {
                            break;
                        }
                        case 1: {
                            gmjk0 = gmjk.b;
                            goto label_36;
                        }
                        case 2: {
                            gmjk0 = gmjk.c;
                            goto label_36;
                        }
                        default: {
                            gmjk0 = gmjk.d;
                            goto label_36;
                        }
                    }
                }
                gmjk0 = gmjk.a;
            }
            else {
                gmjk0 = gmjk.d;
            }
        label_36:
            ggek0.i(((gmjj)object0), gmjk0);
            arr_c = arr_c;
            z = z;
            v = v;
        }
        ggeo ggeo1 = ggek0.b();
        String s2 = crpt.b(sharedPreferences0, "IABTCF_PurposeConsents");
        String s3 = crpt.b(sharedPreferences0, "IABTCF_VendorConsents");
        boolean z1 = !TextUtils.isEmpty(s3) && s3.length() >= 0x2F3 && s3.charAt(0x2F2) == 49;
        String s4 = crpt.b(sharedPreferences0, "IABTCF_PurposeLegitimateInterests");
        String s5 = crpt.b(sharedPreferences0, "IABTCF_VendorLegitimateInterests");
        if(TextUtils.isEmpty(s5)) {
            ggoh1 = ggoh0;
            z2 = false;
        }
        else {
            ggoh1 = ggoh0;
            z2 = s5.length() >= 0x2F3 && s5.charAt(0x2F2) == 49;
        }
        arr_c[0] = '2';
        if(z) {
            gmjk gmjk1 = (gmjk)ggeo1.get(gmjj0);
            gmjk gmjk2 = (gmjk)ggeo1.get(gmjj1);
            gmjk gmjk3 = (gmjk)ggeo1.get(gmjj2);
            gmjk gmjk4 = (gmjk)ggeo1.get(gmjj3);
            ggek ggek1 = new ggek();
            ggek1.i("Version", "2");
            ggek1.i("VendorConsent", (z1 ? "1" : "0"));
            ggek1.i("VendorLegitimateInterest", (z2 ? "1" : "0"));
            ggek1.i("gdprApplies", (v2 == 1 ? "1" : "0"));
            ggek1.i("EnableAdvertiserConsentMode", (v4 == 1 ? "1" : "0"));
            ggek1.i("PolicyVersion", String.valueOf(v1));
            ggek1.i("CmpSdkID", String.valueOf(v));
            ggek1.i("PurposeOneTreatment", (v3 == 1 ? "1" : "0"));
            ggek1.i("PublisherCC", s);
            ggek1.i("PublisherRestrictions1", String.valueOf((gmjk1 == null ? gmjk.d.a() : gmjk1.a())));
            ggek1.i("PublisherRestrictions3", String.valueOf((gmjk2 == null ? gmjk.d.a() : gmjk2.a())));
            ggek1.i("PublisherRestrictions4", String.valueOf((gmjk3 == null ? gmjk.d.a() : gmjk3.a())));
            ggek1.i("PublisherRestrictions7", String.valueOf((gmjk4 == null ? gmjk.d.a() : gmjk4.a())));
            ggek1.m(ggeo.o("Purpose1", crpt.c(gmjj0, s2, s4), "Purpose3", crpt.c(gmjj1, s2, s4), "Purpose4", crpt.c(gmjj2, s2, s4), "Purpose7", crpt.c(gmjj3, s2, s4)));
            ggek1.m(ggeo.p("AuthorizePurpose1", (crpt.d(gmjj0, ggeo0, ggeo1, ggoh1, arr_c, v4, v2, v3, s, s2, s4, z1, z2) ? "1" : "0"), "AuthorizePurpose3", (crpt.d(gmjj1, ggeo0, ggeo1, ggoh1, arr_c, v4, v2, v3, s, s2, s4, z1, z2) ? "1" : "0"), "AuthorizePurpose4", (crpt.d(gmjj2, ggeo0, ggeo1, ggoh1, arr_c, v4, v2, v3, s, s2, s4, z1, z2) ? "1" : "0"), "AuthorizePurpose7", (crpt.d(gmjj3, ggeo0, ggeo1, ggoh1, arr_c, v4, v2, v3, s, s2, s4, z1, z2) ? "1" : "0"), "PurposeDiagnostics", new String(arr_c)));
            ggeo2 = ggek1.b();
        }
        else {
            ggeo2 = ggnf.a;
        }
        super(ggeo2);
        this.aJ().k.b("Tcf preferences read", null);
        crjx crjx0 = this.ap();
        crjx0.n();
        String s6 = crjx0.b().getString("stored_tcf_param", "");
        HashMap hashMap0 = new HashMap();
        if(!TextUtils.isEmpty(s6)) {
            String[] arr_s = s6.split(";");
            for(int v6 = 0; v6 < arr_s.length; ++v6) {
                String[] arr_s1 = arr_s[v6].split("=");
                if(arr_s1.length >= 2 && crpt.a.contains(arr_s1[0])) {
                    hashMap0.put(arr_s1[0], arr_s1[1]);
                }
            }
        }
        crpr0 = new crpr(hashMap0);
        crjx crjx1 = this.ap();
        crjx1.n();
        String s7 = crjx1.b().getString("stored_tcf_param", "");
        String s8 = null.c();
        if(!s8.equals(s7)) {
            SharedPreferences.Editor sharedPreferences$Editor0 = crjx1.b().edit();
            sharedPreferences$Editor0.putString("stored_tcf_param", s8);
            sharedPreferences$Editor0.apply();
            Bundle bundle0 = null.b();
            this.aJ().k.b("Consent generated from Tcf", bundle0);
            if(bundle0 == Bundle.EMPTY) {
                v9 = 2;
                crni1 = this;
            }
            else {
                long v7 = System.currentTimeMillis();
                this.a();
                this.m();
                crma[] arr_crma = crlz.a.c;
                for(int v8 = 0; true; ++v8) {
                    object1 = null;
                    if(v8 >= arr_crma.length) {
                        break;
                    }
                    String s9 = arr_crma[v8].e;
                    if(bundle0.containsKey(s9)) {
                        String s10 = bundle0.getString(s9);
                        if(s10 != null) {
                            if(s10.equals("granted")) {
                                object1 = Boolean.valueOf(true);
                            }
                            else if(s10.equals("denied")) {
                                object1 = Boolean.valueOf(false);
                            }
                            if(object1 == null) {
                                object1 = s10;
                                break;
                            }
                        }
                    }
                }
                if(object1 != null) {
                    this.aJ().h.b("Ignoring invalid consent setting", object1);
                    this.aJ().h.a("Valid consent values are \'granted\', \'denied\'");
                }
                boolean z3 = this.aK().i();
                crmb crmb0 = crmb.g(bundle0, -30);
                for(Object object2: crmb0.b.values()) {
                    if(((crly)object2) == crly.a) {
                        continue;
                    }
                    crni0 = this;
                    crni0.D(crmb0, z3);
                    goto label_144;
                }
                crni0 = this;
            label_144:
                crdk crdk0 = crdk.a(bundle0, -30);
                for(Object object3: crdk0.f.values()) {
                    if(((crly)object3) == crly.a) {
                        continue;
                    }
                    else {
                        crni0.B(crdk0, z3);
                    }
                    break;
                }
                Boolean boolean0 = crdk.d(bundle0);
                if(boolean0 == null) {
                    v9 = 2;
                    crni1 = crni0;
                }
                else if(z3) {
                    v9 = 2;
                    crni0.F("tcf", "allow_personalized_ads", boolean0.toString(), v7);
                    crni1 = this;
                }
                else {
                    v9 = 2;
                    crni1 = this;
                    crni1.E("tcf", "allow_personalized_ads", boolean0.toString(), false, v7);
                }
            }
            Bundle bundle1 = new Bundle();
            Bundle bundle2 = null.b();
            Bundle bundle3 = crpr0.b();
            bundle1.putString("_tcfm", (crpr0.a.isEmpty() || ((String)crpr0.a.get("Version")) != null ? "0" : "1") + (bundle2.size() == bundle3.size() && Objects.equals(bundle2.getString("ad_storage"), bundle3.getString("ad_storage")) && Objects.equals(bundle2.getString("ad_personalization"), bundle3.getString("ad_personalization")) && Objects.equals(bundle2.getString("ad_user_data"), bundle3.getString("ad_user_data")) ? "0" : "1"));
            Map map0 = 0.a;
            String s11 = (String)map0.get("PurposeDiagnostics");
            if(TextUtils.isEmpty(s11)) {
                s11 = "200000";
            }
            bundle1.putString("_tcfd2", s11);
            StringBuilder stringBuilder0 = new StringBuilder("1");
            int v10 = -1;
            try {
                String s12 = (String)map0.get("CmpSdkID");
                if(!TextUtils.isEmpty(s12)) {
                    v10 = Integer.parseInt(s12);
                }
            }
            catch(NumberFormatException unused_ex) {
            }
            if(v10 < 0) {
                stringBuilder0.append("00");
            }
            else if(v10 <= 0xFFF) {
                stringBuilder0.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(v10 >> 6));
                stringBuilder0.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(v10 & 0x3F));
            }
            else {
                stringBuilder0.append("00");
            }
            int v11 = null.a();
            if(v11 >= 0 && v11 <= 0x3F) {
                stringBuilder0.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(v11));
            }
            else {
                stringBuilder0.append("0");
            }
            Map map1 = 0.a;
            if(!"1".equals(map1.get("gdprApplies"))) {
                v9 = 0;
            }
            stringBuilder0.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(("1".equals(map1.get("EnableAdvertiserConsentMode")) ? v9 | 12 : v9 | 4)));
            bundle1.putString("_tcfd", stringBuilder0.toString());
            crni1.w("auto", "_tcf", bundle1);
        }
    }

    public final void u(String s, String s1, Bundle bundle0) {
        String s3;
        String s2;
        long v = System.currentTimeMillis();
        crie crie0 = crif.aT;
        long v1 = 0L;
        long v2 = this.am().t(crie0) ? SystemClock.elapsedRealtime() : 0L;
        this.m();
        Bundle bundle1 = bundle0 == null ? new Bundle() : bundle0;
        if(Objects.equals(s1, "screen_view")) {
            crnz crnz0 = this.j();
            long v3 = this.am().t(crie0) ? v2 : 0L;
            synchronized(crnz0.j) {
                if(!crnz0.i) {
                    crnz0.aJ().h.a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                s2 = bundle1.getString("screen_name");
                if(s2 != null && (s2.length() <= 0 || s2.length() > crnz0.am().b(null, false))) {
                    crnz0.aJ().h.b("Invalid screen name length for screen view. Length", Integer.valueOf(s2.length()));
                    return;
                }
                s3 = bundle1.getString("screen_class");
                if(s3 != null && (s3.length() <= 0 || s3.length() > crnz0.am().b(null, false))) {
                    crnz0.aJ().h.b("Invalid screen class length for screen view. Length", Integer.valueOf(s3.length()));
                    return;
                }
                if(s3 == null) {
                    s3 = crnz0.e == null ? "Activity" : crnz0.x(crnz0.e.b);
                }
                crns crns0 = crnz0.a;
                if(crnz0.f && crns0 != null) {
                    crnz0.f = false;
                    if(Objects.equals(crns0.b, s3) && Objects.equals(crns0.a, s2)) {
                        crnz0.aJ().h.a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
            }
            crnz0.aJ().k.c("Logging screen view with name, class", (s2 == null ? "null" : s2), (s3 == null ? "null" : s3));
            crns crns1 = crnz0.a == null ? crnz0.b : crnz0.a;
            crns crns2 = new crns(s2, s3, crnz0.aq().t(), true, v, v3);
            crnz0.a = crns2;
            crnz0.b = crns1;
            crnz0.g = crns2;
            long v5 = SystemClock.elapsedRealtime();
            crnz0.aK().f(new crnt(crnz0, bundle1, crns2, crns1, v5));
            return;
        }
        if(this.am().t(crif.aT)) {
            v1 = v2;
        }
        this.J((s == null ? "app" : s), s1, v, v1, bundle1, true, null);
    }

    public final void v(String s, String s1, Bundle bundle0, String s2) {
        this.y.r();
        this.J(s, s1, System.currentTimeMillis(), (this.am().t(crif.aT) ? SystemClock.elapsedRealtime() : 0L), bundle0, false, s2);
    }

    final void w(String s, String s1, Bundle bundle0) {
        this.m();
        this.n();
        this.x(s, s1, System.currentTimeMillis(), (this.am().t(crif.aT) ? SystemClock.elapsedRealtime() : 0L), bundle0);
    }

    final void x(String s, String s1, long v, long v1, Bundle bundle0) {
        this.m();
        this.n();
        this.I(s, s1, v, v1, bundle0, true, null);
    }

    final void y() {
        this.n();
        this.f = false;
        if(!this.q().isEmpty() && !this.o) {
            TriggerUriParcel triggerUriParcel0 = (TriggerUriParcel)this.q().poll();
            if(triggerUriParcel0 != null) {
                ojj ojj0 = this.aq().x();
                if(ojj0 != null) {
                    this.o = true;
                    this.aJ().k.b("Registering trigger URI", triggerUriParcel0.a);
                    gmcd gmcd0 = ojj0.e(Uri.parse(triggerUriParcel0.a));
                    crmq crmq0 = new crmq(this);
                    gmbu.t(gmcd0, new crmr(this, triggerUriParcel0), crmq0);
                }
            }
        }
    }

    final void z(String s, String s1, long v, Object object0) {
        this.aK().f(new crmw(this, s, s1, object0, v));
    }
}

