import android.content.ComponentName;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;

public final class eksc {
    public final btac a;
    public final btae b;
    public final boolean c;
    public final long d;
    public long e;
    public boolean f;
    public long g;
    public long h;
    public int i;
    public int j;
    public bszb k;
    public boolean l;
    public volatile int m;
    public final bszn n;
    public final cllp o;
    public final int p;
    public final ekqa q;
    private final TimeRange r;
    private final Set s;
    private Set t;

    private eksc(cllp cllp0, int v, btac btac0, long v1, ekqa ekqa0) {
        btae btae0;
        this.h = 0L;
        this.j = -1;
        boolean z = false;
        this.l = false;
        this.s = new bxf();
        this.t = ggnj.a;
        this.o = cllp0;
        this.p = v;
        this.a = btac0;
        this.d = v1;
        this.m = 0;
        bszg bszg0 = (bszg)((ProtoLiteMessage)bszn.a).v_newBuilder();
        int v2 = ekum.j(cllp0.q);
        if(!bszg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bszg0).ensureMutable();
        }
        ((bszn)bszg0.b_message).d = v2 - 1;
        ((bszn)bszg0.b_message).b |= 8;
        int v3 = ekum.j(cllp0.r);
        if(!bszg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bszg0).ensureMutable();
        }
        ((bszn)bszg0.b_message).f = v3 - 1;
        ((bszn)bszg0.b_message).b |= 0x20;
        int v4 = ekum.h(cllp0.s);
        if(!bszg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bszg0).ensureMutable();
        }
        ((bszn)bszg0.b_message).e = v4 - 1;
        ((bszn)bszg0.b_message).b |= 16;
        int v5 = ekum.h(cllp0.t);
        if(!bszg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bszg0).ensureMutable();
        }
        ((bszn)bszg0.b_message).g = v5 - 1;
        ((bszn)bszg0.b_message).b |= 0x40;
        int v6 = ekum.i(cllp0.u);
        if(!bszg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bszg0).ensureMutable();
        }
        ((bszn)bszg0.b_message).h = v6 - 1;
        ((bszn)bszg0.b_message).b |= 0x80;
        int v7 = ekum.i(cllp0.v);
        if(!bszg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bszg0).ensureMutable();
        }
        ((bszn)bszg0.b_message).i = v7 - 1;
        ((bszn)bszg0.b_message).b |= 0x100;
        for(Object object0: cllp0.n) {
            bszg0.a(((Uri)object0).toString());
        }
        this.n = (bszn)((ProtoLiteBuilder)bszg0).N_build();
        switch(v) {
            case 0: {
                btae0 = ekum.c(((clko)cllp0).a, ((clko)cllp0).b);
                break;
            }
            case 1: {
                btae0 = ekum.c(((clkr)cllp0).a - ((clkr)cllp0).b, ((clkr)cllp0).a);
                break;
            }
            default: {
                if(v == 2) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bszp.a).v_newBuilder();
                    for(Object object1: ((cljb)cllp0).a) {
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)bszo.a).v_newBuilder();
                        String s = ((cliz)object1).a.toString();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        bszo bszo0 = (bszo)hftp2.b_message;
                        s.getClass();
                        bszo0.b |= 1;
                        bszo0.c = s;
                        boolean z1 = ((cliz)object1).a();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        bszo bszo1 = (bszo)hftp2.b_message;
                        bszo1.b |= 2;
                        bszo1.d = z1;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        bszp bszp0 = (bszp)hftp1.b_message;
                        bszo bszo2 = (bszo)hftp2.N_build();
                        bszo2.getClass();
                        bszp0.b();
                        bszp0.b.add(bszo2);
                    }
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)btae.a).v_newBuilder();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp3.b_message;
                    ((btae)hftv1).e = 3;
                    ((btae)hftv1).b |= 1;
                    if(!hftv1.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    btae btae1 = (btae)hftp3.b_message;
                    bszp bszp1 = (bszp)hftp1.N_build();
                    bszp1.getClass();
                    btae1.d = bszp1;
                    btae1.c = 3;
                    btae0 = (btae)hftp3.N_build();
                }
                else {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btae.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((btae)hftv0).e = 4;
                    ((btae)hftv0).b |= 1;
                    int v8 = ((clki)cllp0).a.g;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((btae)hftp0.b_message).c = 4;
                    ((btae)hftp0.b_message).d = v8;
                    btae0 = (btae)hftp0.N_build();
                }
            }
        }
        this.b = btae0;
        this.f = cllp0.m;
        this.e = -1L;
        this.k = bszb.a;
        this.q = ekqa0;
        this.r = ekse.b(cllp0, ekqa0);
        if(v == 0) {
            if(((clko)cllp0).b <= 1L) {
                z = true;
            }
            this.c = z;
            return;
        }
        this.c = false;
    }

    public eksc(eksc eksc0, long v) {
        this(eksc0.o, eksc0.p, eksc0.a, v, eksc0.q);
        this.i = eksc0.i;
        this.e = eksc0.e;
        this.f = eksc0.f;
        this.k = eksc0.k;
        this.j = eksc0.j;
        this.g = eksc0.g;
    }

    @Deprecated
    public final int a() {
        int v = bsza.a(this.k.c);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        if(v - 1 != 1) {
            v1 = 2;
            if(v - 1 != 2) {
                switch(v - 1) {
                    case 3: {
                        return 4;
                    }
                    case 4: {
                        return 8;
                    }
                    default: {
                        return v - 1 == 5 ? 16 : 0;
                    }
                }
            }
        }
        return v1;
    }

    public final int b() {
        try {
            return Integer.parseInt(this.k.d);
        }
        catch(NumberFormatException unused_ex) {
            return 0;
        }
    }

    public final long c() {
        return this.z(((Long)this.r.r()).longValue());
    }

    public final long d() {
        return this.z(((Long)this.r.q()).longValue());
    }

    final long e(long v) {
        return (this.d() - v) / 1000L;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof eksc) ? ((ProtoLiteMessage)this.a).equals(((eksc)object0).a) : false;
    }

    public final ComponentName f() {
        return new ComponentName(this.a.c, this.a.d);
    }

    public final clmp g() {
        clmo clmo0 = new clmo();
        clmo0.c = this.a.c;
        clmo0.d = this.j();
        clmo0.e = this.a.e;
        clmo0.b = this.a.f;
        clmo0.a = this.a();
        return new clmp(clmo0);
    }

    public static eksc h(cllp cllp0, ComponentName componentName0, long v, int v1, ekqa ekqa0) {
        int v2;
        if((cllp0 instanceof clko)) {
            v2 = 0;
        }
        else {
            if((cllp0 instanceof clkr)) {
                v2 = 1;
                goto label_11;
            }
            if((cllp0 instanceof cljb)) {
                v2 = 2;
                goto label_11;
            }
            if(!(cllp0 instanceof clki)) {
                throw new IllegalArgumentException("Unknown task instance.");
            }
            v2 = 3;
        }
    label_11:
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btac.a).v_newBuilder();
        String s = componentName0.getPackageName();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        btac btac0 = (btac)hftp0.b_message;
        s.getClass();
        btac0.b |= 1;
        btac0.c = s;
        String s1 = componentName0.getClassName();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s1.getClass();
        ((btac)hftv0).b |= 2;
        ((btac)hftv0).d = s1;
        String s2 = cllp0.j;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        s2.getClass();
        ((btac)hftv1).b |= 4;
        ((btac)hftv1).e = s2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        btac btac1 = (btac)hftp0.b_message;
        btac1.b |= 8;
        btac1.f = (long)v1;
        return new eksc(cllp0, v2, ((btac)hftp0.N_build()), v, ekqa0);
    }

    @Override
    public final int hashCode() {
        btac btac0 = this.a;
        if(((ProtoLiteMessage)btac0).isImmutable()) {
            return ((ProtoLiteMessage)btac0).s();
        }
        int v = btac0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)btac0).s();
            btac0.memoizedHashCode = v;
        }
        return v;
    }

    public final eksg i() {
        return new eksg(this.a.c, ((int)this.a.f));
    }

    public final String j() {
        return this.a.d;
    }

    public final String k() {
        return this.a.e;
    }

    public final Set l() {
        synchronized(this) {
        }
        return this.t;
    }

    public final Set m() {
        Set set0;
        synchronized(this) {
            set0 = DesugarCollections.unmodifiableSet(new bxf(this.s));
        }
        return set0;
    }

    public final void n(Uri uri0) {
        synchronized(this) {
            this.s.add(uri0);
        }
    }

    public final void o(Collection collection0) {
        synchronized(this) {
            this.s.addAll(collection0);
        }
    }

    public final void p() {
        this.l = true;
    }

    public final void q() {
        synchronized(this) {
            if(this.t.isEmpty()) {
                Set set0 = this.s;
                if(!set0.isEmpty()) {
                    this.t = DesugarCollections.unmodifiableSet(new bxf(set0));
                    set0.clear();
                }
            }
        }
    }

    public final void r(long v) {
        this.h = this.g;
        this.g = v;
    }

    public final boolean s() {
        return this.b.c == 3;
    }

    public final boolean t() {
        return bbmq.X(this.a.c);
    }

    @Override
    public final String toString() {
        String s4;
        long v = SystemClock.elapsedRealtime();
        long v1 = v - this.d;
        String s = "N/A";
        String s1 = Long.compare(this.g, 0L) == 0 ? "N/A" : -(System.currentTimeMillis() - this.g) / 1000L + "s";
        int v2 = this.j;
        if(v2 != -1) {
            s = Integer.toString(v2);
        }
        Locale locale0 = Locale.US;
        String s2 = this.f().flattenToShortString();
        Long long0 = (long)this.a.f;
        cllp cllp0 = this.o;
        String s3 = JSONObject.quote(cllp0.j);
        if(this.u()) {
            long v3 = this.e(v);
            long v4 = (this.c() - v) / 1000L;
            if((cllp0 instanceof clkr) && bsza.a(this.k.c) != 5) {
                s4 = String.format(Locale.US, "window{period=%ds,flex=%ds,earliest=%ds,latest=%ds}", ((long)(((double)(this.q.c > 0L ? this.q.c : ((clkr)cllp0).a)) * this.q.a)), ((long)(((double)(this.q.d > 0L ? this.q.d : ((clkr)cllp0).b)) * this.q.a)), v3, v4);
            }
            else {
                Locale locale1 = Locale.US;
                double f = (double)(((long)(((Long)this.r.q()))));
                Long long1 = (long)(((long)(((double)(((long)(((Long)this.r.r()))))) * this.q.a)) / 1000L);
                s4 = String.format(locale1, "window{start=%ds,end=%ds,earliest=%ds,latest=%ds}", ((long)(((long)(f * this.q.a)) / 1000L)), long1, v3, v4);
            }
        }
        else {
            int v5 = this.p;
            if(v5 == 2) {
                ArrayList arrayList0 = new ArrayList(((cljb)cllp0).a.size());
                for(Object object0: ((cljb)cllp0).a) {
                    arrayList0.add(((cliz)object0).b + "|<" + ((cliz)object0).a + ">");
                }
                Set set0 = this.m();
                ArrayList arrayList1 = new ArrayList(set0.size());
                for(Object object1: set0) {
                    arrayList1.add("<" + ((Uri)object1) + ">");
                }
                s4 = "uris{observed=[" + TextUtils.join(",", arrayList0) + "] triggered=[" + TextUtils.join(",", arrayList1) + "]}";
            }
            else {
                s4 = v5 == 3 ? "cadence{type=" + ((clki)cllp0).a.g + "}" : "unknown{}";
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int v6 = this.p;
        if(v6 == 3) {
            if(((clki)cllp0).c()) {
                arrayList2.add("NET_UNMETERED");
            }
            else if(((clki)cllp0).b) {
                arrayList2.add("NET_CONNECTED");
            }
            if(((clki)cllp0).a()) {
                arrayList2.add("CHARGING");
            }
            if((((clki)cllp0).c & 4) == 4) {
                arrayList2.add("DEVICE_IDLE");
            }
        }
        else {
            int v7 = cllp0.q;
            if(v7 == 0) {
                arrayList2.add("NET_CONNECTED");
            }
            else {
                switch(v7) {
                    case 1: {
                        arrayList2.add("NET_UNMETERED");
                        break;
                    }
                    case 3: {
                        arrayList2.add("NET_STRONG_SIGNAL");
                        break;
                    }
                    default: {
                        arrayList2.add("NET_ANY");
                    }
                }
            }
            if(cllp0.s == 1) {
                arrayList2.add("CHARGING");
            }
            int v8 = cllp0.r;
            if(v8 == 0) {
                arrayList2.add("PREFERRED_NET_CONNECTED");
            }
            else if(v8 == 1) {
                arrayList2.add("PREFERRED_NET_UNMETERED");
            }
            else if(v8 == 3) {
                arrayList2.add("NET_STRONG_SIGNAL");
            }
            if(cllp0.v == 1) {
                arrayList2.add("PREFERRED_DEVICE_IDLE");
            }
            if(this.y() == 3) {
                arrayList2.add("PREFERRED_CHARGING");
            }
            if(cllp0.u == 1) {
                arrayList2.add("DEVICE_IDLE");
            }
            Set set1 = cllp0.n;
            if(set1 != null && !set1.isEmpty()) {
                arrayList2.add("REACHABILITY_URIS:" + TextUtils.join("|", set1));
            }
        }
        String s5 = TextUtils.join(",", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        if(this.f) {
            arrayList3.add("PERSISTED");
        }
        if(v6 == 1) {
            arrayList3.add("RECURRING");
        }
        if(v6 == 3) {
            arrayList3.add("HOUSEKEEPING");
        }
        String s6 = TextUtils.join(",", arrayList3);
        Long long2 = (long)(-v1 / 1000L);
        Double double0 = (double)this.q.a;
        Object object2 = eksb.a.get(this.m);
        Integer integer0 = (int)this.i;
        bszb bszb0 = this.k;
        switch(bsza.a(bszb0.c)) {
            case 0: 
            case 1: {
                return String.format(locale0, "%s{u=%d tag=%s trigger=%s requirements=[%s] attributes=[%s] scheduled=%ds last_run=%s exec_window_multiplier=%.4f jid=%s status=%s retries=%d client_lib=%s-%s}", s2, long0, s3, s4, s5, s6, long2, s1, double0, s, object2, integer0, "SOURCE_UNKNOWN", bszb0.d);
            }
            case 2: {
                return String.format(locale0, "%s{u=%d tag=%s trigger=%s requirements=[%s] attributes=[%s] scheduled=%ds last_run=%s exec_window_multiplier=%.4f jid=%s status=%s retries=%d client_lib=%s-%s}", s2, long0, s3, s4, s5, s6, long2, s1, double0, s, object2, integer0, "DEBUG_JOB", bszb0.d);
            }
            case 3: {
                return String.format(locale0, "%s{u=%d tag=%s trigger=%s requirements=[%s] attributes=[%s] scheduled=%ds last_run=%s exec_window_multiplier=%.4f jid=%s status=%s retries=%d client_lib=%s-%s}", s2, long0, s3, s4, s5, s6, long2, s1, double0, s, object2, integer0, "LONGHORN_GCM", bszb0.d);
            }
            case 4: {
                return String.format(locale0, "%s{u=%d tag=%s trigger=%s requirements=[%s] attributes=[%s] scheduled=%ds last_run=%s exec_window_multiplier=%.4f jid=%s status=%s retries=%d client_lib=%s-%s}", s2, long0, s3, s4, s5, s6, long2, s1, double0, s, object2, integer0, "MANCHEGO_GCM", bszb0.d);
            }
            case 5: {
                return String.format(locale0, "%s{u=%d tag=%s trigger=%s requirements=[%s] attributes=[%s] scheduled=%ds last_run=%s exec_window_multiplier=%.4f jid=%s status=%s retries=%d client_lib=%s-%s}", s2, long0, s3, s4, s5, s6, long2, s1, double0, s, object2, integer0, "FIREBASE_JOB_DISPATCHER", bszb0.d);
            }
            default: {
                return String.format(locale0, "%s{u=%d tag=%s trigger=%s requirements=[%s] attributes=[%s] scheduled=%ds last_run=%s exec_window_multiplier=%.4f jid=%s status=%s retries=%d client_lib=%s-%s}", s2, long0, s3, s4, s5, s6, long2, s1, double0, s, object2, integer0, "GMS_TASK_SCHEDULER", bszb0.d);
            }
        }
    }

    public final boolean u() {
        return this.b.c == 2;
    }

    public final boolean v() {
        int v = this.n.e;
        return (bszi.a(v) == 0 ? 1 : bszi.a(v)) == (bszi.a(this.n.g) == 0 ? 1 : bszi.a(this.n.g)) && bszi.a(v) == 3;
    }

    public final boolean w() {
        bszb bszb0 = this.k;
        switch((bsza.a(bszb0.c) == 0 ? 1 : bsza.a(bszb0.c)) - 1) {
            case 1: {
                return true;
            }
            case 3: {
                return this.b() >= 10400000;
            }
            case 4: {
                return (bszb0.b & 2) != 0;
            }
            case 5: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public final void x() {
        this.f = false;
    }

    public final int y() {
        return bszi.a(this.n.g) == 3 || this.q.e == 3 ? 3 : 2;
    }

    private final long z(long v) {
        return ((long)(this.q.a * ((double)v))) + this.d;
    }
}

