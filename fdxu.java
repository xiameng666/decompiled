import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.ConnectivityManager;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import j..util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import jeb.synthetic.FIN;

public final class fdxu implements fduo, fdwx, fdxo, fdxp, ffmj {
    public static final AtomicReference a;
    static final Uri b;
    public final AtomicReference c;
    public final Object d;
    public final Set e;
    public final Set f;
    public final fdyq g;
    public final Map h;
    public final ArrayList i;
    public final AtomicReference j;
    public final AtomicReference k;
    public final AtomicReference l;
    public final fdxt m;
    public final boolean n;
    private final Set o;
    private boolean p;
    private final ConnectivityManager q;

    static {
        fdxu.a = new AtomicReference();
        fdxu.b = new Uri.Builder().scheme("wear").path("/peers").build();
    }

    public fdxu(ConnectivityManager connectivityManager0, fdyq fdyq0, boolean z, Context context0) {
        this.c = new AtomicReference();
        this.d = new Object();
        this.e = new HashSet();
        this.f = ggog.l();
        this.o = new HashSet();
        this.h = new HashMap();
        this.p = false;
        this.i = new ArrayList();
        this.j = new AtomicReference();
        this.k = new AtomicReference();
        this.l = new AtomicReference();
        batl.s(connectivityManager0);
        this.q = connectivityManager0;
        this.g = fdyq0;
        this.n = z;
        HandlerThread handlerThread0 = new HandlerThread("NodeService", 9);
        handlerThread0.start();
        this.m = new fdxt(this, context0, handlerThread0.getLooper());
    }

    @Override  // fdxp
    public final fdxn a() {
        fdye fdye0 = (fdye)this.c.get();
        batl.s(fdye0);
        return fdye0.a();
    }

    @Override  // fdxp
    public final Set b() {
        synchronized(this.d) {
            this.r();
        }
        return this.g.c();
    }

    @Override  // fdxp
    public final void c(fduj fduj0) {
        synchronized(this.d) {
            batl.s(fduj0);
            this.e.add(fduj0);
        }
    }

    @Override  // fdxp
    public final void d(fduj fduj0) {
        synchronized(this.d) {
            batl.s(fduj0);
            this.e.remove(fduj0);
        }
    }

    @Override  // fdwx
    public final void f(String s, ffau ffau0, fdwt fdwt0) {
    }

    @Override  // fdwx
    public final void g(String s, fdww fdww0) {
    }

    @Override  // fdwx
    public final void h(fdwy fdwy0, fdww fdww0) {
        fdxn fdxn0 = fdwy0.b();
        String s = fdxn0.a;
        this.o.add(s);
        boolean z = Objects.equals(s, "cloud") && this.q.isActiveNetworkMetered();
        if(Log.isLoggable("NodeService", 3)) {
            Log.d("NodeService", "onMessageWriterAdded " + s + (z ? " (metered)" : ""));
        }
        if(Looper.getMainLooper().getThread() == Thread.currentThread()) {
            fdxr fdxr0 = new fdxr(this, fdxn0, z);
            this.m.post(fdxr0);
            return;
        }
        this.n(new fdxs(true, fdxn0, z, null));
    }

    @Override  // fdwx
    public final void i(String s) {
        if(Log.isLoggable("NodeService", 3)) {
            Log.d("NodeService", "onMessageWriterRemoved " + s);
        }
        if(!this.o.remove(s)) {
            return;
        }
        if(Looper.getMainLooper().getThread() == Thread.currentThread()) {
            fdxq fdxq0 = new fdxq(this, s);
            this.m.post(fdxq0);
            return;
        }
        this.n(fdxs.a(s));
    }

    @Override  // fdwx
    public final boolean j() {
        return false;
    }

    @Override  // fdxp
    public final boolean k(String s) {
        boolean z;
        Object object0 = this.d;
        __monitor_enter(object0);
        try {
            this.r();
            Object object1 = this.g.b;
            __monitor_enter(object1);
            int v1 = FIN.finallyOpen$NT();
            this.g.d();
            fdyo fdyo0 = (fdyo)this.g.a.get(s);
            z = false;
            if(fdyo0 == null) {
                FIN.finallyCodeBegin$NT(v1);
            }
            else {
                FIN.finallyExec$NT(v1);
                if(fdyo0.b < 0x7FFFFFFF) {
                    z = true;
                }
            }
        }
        finally {
            __monitor_exit(object0);
        }
        return z;
    }

    public static fdxu l() {
        fdxu fdxu0 = (fdxu)fdxu.a.get();
        batl.s(fdxu0);
        return fdxu0;
    }

    public final fdyo m(String s) {
        synchronized(this.d) {
            this.r();
        }
        return this.g.b(s);
    }

    // This method was un-flattened
    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        String s2;
        Integer integer0;
        String s1;
        bbpd0.b();
        bbpd0.println("New Debounce Intervals enabled: true");
        bbpd0.println(a.u(hzwb.c(), "Connection Events interval (ms): "));
        bbpd0.println("CloudNode Events interval (ms): " + hzwb.b());
        bbpd0.println();
        synchronized(this.d) {
            this.r();
            this.g.md(bbpd0, z, z1);
            bbpd0.println();
            bbpd0.println("Reachable Nodes:");
            bbpd0.b();
            TreeSet treeSet0 = new TreeSet(this.g.c());
            bbpd0.printf("%30s : %10s : %4s : %8s : %8s\n", new Object[]{"name", "id", "hops", "isNearby", "isWatch"});
            if(treeSet0.isEmpty()) {
                bbpd0.println("no reachable nodes");
            }
            else {
                for(Object object1: treeSet0) {
                    fdyo fdyo0 = (fdyo)object1;
                    String s = fdxu.w(this.n, z1, fdyo0) ? fdyo0.a.b : fdyo0.a.a;
                    if(fdyo0.b != 1 || fdsl.a.equals(fdyo0.a)) {
                        s1 = fdyo0.a.a;
                        integer0 = (int)fdyo0.b;
                        s2 = "false";
                    }
                    else {
                        s1 = fdyo0.a.a;
                        integer0 = (int)fdyo0.b;
                        s2 = "true";
                    }
                    bbpd0.printf("%30s : %10s : %4d : %8s : %8s\n", new Object[]{s, s1, integer0, s2, (fdyo0.f ? "true" : "false")});
                }
            }
            bbpd0.a();
        }
        bbpd0.a();
    }

    public final void n(fdxs fdxs0) {
        synchronized(this.d) {
            ArrayList arrayList0 = this.i;
            if(arrayList0.isEmpty()) {
                String s = fdxs0.a ? fdxs0.b.a : fdxs0.d;
                this.r();
                fdyo fdyo0 = this.g.b(s);
                if(fdxs0.a) {
                    if(fdyo0 != null && fdyo0.b == 1 && fdyo0.d == fdxs0.c) {
                        if(Log.isLoggable("NodeService", 3)) {
                            Log.d("NodeService", "Ignoring connect of already adjacent node: " + s);
                        }
                        return;
                    }
                }
                else if(fdyo0 == null || fdyo0.b != 1) {
                    if(Log.isLoggable("NodeService", 3)) {
                        Log.d("NodeService", "Ignoring disconnect of non-adjacent node: " + s);
                    }
                    return;
                }
            }
            arrayList0.add(fdxs0);
            if(fdxs0.a) {
                this.m.c();
            }
            else if(Objects.equals(fdxs0.d, "cloud")) {
                long v1 = hzwb.b();
                this.m.b(arrayList0.size(), v1);
            }
            else {
                long v2 = hzwb.c();
                this.m.b(arrayList0.size(), v2);
            }
        }
    }

    @Override  // fduo
    public final void o(ArrayList arrayList0) {
        ArrayList arrayList1;
        Set set1;
        Set set0;
        String s3;
        SQLiteDatabase sQLiteDatabase0;
        synchronized(this.d) {
            this.r();
            int v1 = 0;
            set0 = null;
            for(Object object1: arrayList0) {
                fduq fduq0 = (fduq)object1;
                if(ffgp.a.equals(fduq0.a)) {
                    String s = fduq0.b.b;
                    if(s.startsWith("/terminate_association/")) {
                        String s1 = fdxu.x(fcez.b(fduq0.b.c()).d("enrollmentId"));
                        if(Log.isLoggable("NodeService", 4)) {
                            Log.i("NodeService", "Received terminate_association DataItem, cloudEnrollmentId=" + s1);
                        }
                        String s2 = s.substring(s.lastIndexOf(0x2F) + 1);
                        fdvl fdvl0 = (fdvl)this.j.get();
                        try {
                            sQLiteDatabase0 = fdvl0.c.getReadableDatabase();
                        }
                        catch(SQLiteException sQLiteException0) {
                            Log.w("DataItems", "Couldn\'t get readable database in getEnrollmentId", sQLiteException0);
                            s3 = null;
                            goto label_31;
                        }
                        s3 = fdvl.k(sQLiteDatabase0, s2).b;
                    label_31:
                        if(s1.equals(fdxu.x(s3))) {
                            ((fdzv)this.l.get()).m(s2, true, "Data Item", null);
                        }
                        else {
                            if(!Log.isLoggable("NodeService", 3)) {
                                continue;
                            }
                            Log.d("NodeService", a.a(s1, "terminate_association enrollment IDs don\'t match: cloudEnrollmentId=", ", NodeEnrollmentId="));
                        }
                    }
                    else {
                        if(!Objects.equals(fduq0.b.b, "/peers") || fduq0.b.a.equals(this.a().a)) {
                            continue;
                        }
                        if(set0 == null) {
                            set0 = this.g.c();
                        }
                        fdxu.z(this.g, fduq0);
                        ++v1;
                    }
                }
            }
            if(v1 == 0) {
                return;
            }
            set1 = this.g.c();
            arrayList1 = new ArrayList(this.e);
        }
        fdxu.s(arrayList1, set0, set1);
    }

    public final void p(fdui fdui0) {
        this.f.add(fdui0);
    }

    @Override  // fdxo
    public final void q(String s) {
        ArrayList arrayList0;
        Set set1;
        Set set0;
        if(s.equals(this.a().a)) {
            Log.w("NodeService", "Ignoring the purge of localNodeId: " + s);
            return;
        }
        if(Log.isLoggable("NodeService", 3)) {
            Log.d("NodeService", "NodeId purged, removing from route map: " + s);
        }
        synchronized(this.d) {
            set0 = this.g.c();
            this.g.f(s);
            set1 = this.g.c();
            arrayList0 = new ArrayList(this.e);
        }
        fdxu.s(arrayList0, set0, set1);
    }

    public final void r() {
        synchronized(this.d) {
            if(!this.p) {
                this.p = true;
                fdyq fdyq0 = this.g;
                Cursor cursor0 = ((fdvl)this.j.get()).c(ffgp.a, fdxu.b);
                try {
                    cursor0.moveToFirst();
                    while(!cursor0.isAfterLast()) {
                        fduq fduq0 = fdur.f(cursor0);
                        if(!fduq0.b.a.equals(this.a().a)) {
                            fdxu.z(fdyq0, fduq0);
                        }
                    }
                }
                finally {
                    cursor0.close();
                }
                this.u();
            }
        }
    }

    public static void s(List list0, Set set0, Set set1) {
        if(!list0.isEmpty()) {
            if(Log.isLoggable("NodeService", 3)) {
                Log.d("NodeService", "notifyListeners: old reachable: " + set0);
                Log.d("NodeService", "notifyListeners: new reachable: " + set1.toString());
            }
            ggoe ggoe0 = ggog.d(set0, set1);
            ggoe ggoe1 = ggog.d(set1, set0);
            ggqj ggqj0 = ggoe0.c();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                fdyo fdyo0 = (fdyo)object0;
                if(Log.isLoggable("NodeService", 3)) {
                    Log.d("NodeService", "notifyListeners: onPeerDisconnected: " + fdyo0.a);
                }
                for(Object object1: list0) {
                    ((fduj)object1).s(fdyo0.a);
                }
            }
            ggqj ggqj1 = ggoe1.c();
            while(ggqj1.hasNext()) {
                Object object2 = ggqj1.next();
                fdyo fdyo1 = (fdyo)object2;
                if(Log.isLoggable("NodeService", 3)) {
                    Log.d("NodeService", "notifyListeners: onPeerConnected: " + fdyo1.a);
                }
                for(Object object3: list0) {
                    int v = fdyo1.b;
                    boolean z = fdxu.v(fdyo1.a, v);
                    ((fduj)object3).r(fdyo1.a, v, z);
                }
            }
            if(ggoe0.isEmpty() && ggoe1.isEmpty()) {
                Iterator iterator2 = new TreeSet(set0).iterator();
                Iterator iterator3 = new TreeSet(set1).iterator();
                while(iterator2.hasNext()) {
                    Object object4 = iterator2.next();
                    Object object5 = iterator3.next();
                    int v1 = ((fdyo)object4).b;
                    if(v1 == ((fdyo)object5).b && fdxu.v(((fdyo)object4).a, v1) == fdxu.v(((fdyo)object5).a, ((fdyo)object5).b) && ((fdyo)object4).d == ((fdyo)object5).d) {
                        continue;
                    }
                    goto label_44;
                }
                if(Log.isLoggable("NodeService", 3)) {
                    Log.d("NodeService", "notifyListeners: no connected nodes change, still: " + set1.toString());
                }
            }
            else {
            label_44:
                if(Log.isLoggable("NodeService", 3)) {
                    Log.d("NodeService", "notifyListeners: onConnectedNodes: " + set1.toString());
                }
                for(Object object6: list0) {
                    ((fduj)object6).p(set1);
                }
            }
        }
    }

    public final void t(fdui fdui0) {
        this.f.remove(fdui0);
    }

    public final void u() {
        if(Log.isLoggable("NodeService", 2)) {
            Log.v("NodeService", "updatePeerDataItem: " + this.c.get());
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList(1);
        int v = 0;
        for(Object object0: this.h.values()) {
            arrayList0.add(((fdyp)object0).a.a);
            arrayList1.add(((fdyp)object0).a.b);
            if(((fdyp)object0).b) {
                arrayList2.add(Integer.valueOf(v));
            }
            ++v;
        }
        fdun fdun0 = new fdun(this.a().a, "/peers");
        fcez fcez0 = new fcez();
        fcez0.s("name", this.a().b);
        fcez0.t("ids", arrayList0);
        fcez0.t("names", arrayList1);
        fcez0.q("meteredConnections", arrayList2);
        fcez0.j("isWatch", this.n);
        if(hzuz.l()) {
            fcez0.j("cloudSyncNotif", true);
        }
        fdun0.e = fcez0.y();
        ((fdvl)this.j.get()).o(ffgp.a, fdun0);
    }

    public static boolean v(fdxn fdxn0, int v) {
        return v == 1 && !fdxn0.equals(fdsl.a);
    }

    public static boolean w(boolean z, boolean z1, fdyo fdyo0) {
        if(z && !z1 && !Log.isLoggable("NodeServiceNames", 3)) {
            if(fdyo0 != null) {
                return fdyo0.f ? fdyo0.b == 0 : true;
            }
            return false;
        }
        return true;
    }

    private static String x(String s) {
        return s == null ? "" : s;
    }

    private static final void y(fduq fduq0) {
        if(Log.isLoggable("NodeService", 4)) {
            Log.i("NodeService", "Invalid peers data item (ids or names). Ignoring.");
            Log.i("NodeService", "Data item: " + fduq0);
            Log.i("NodeService", "Data (trimmed to 3000 bytes): " + Base64.encodeToString(fduq0.b.e, 0, Math.min(3000, fduq0.b.e.length), 0));
        }
    }

    private static final void z(fdyq fdyq0, fduq fduq0) {
        fcez fcez0;
        String s = fduq0.b.a;
        fdyo fdyo0 = fdyq0.b(s);
        if(!fduq0.c) {
            try {
                fcez0 = fcez.b(fduq0.b.e);
            }
            catch(IllegalArgumentException unused_ex) {
                Log.e("NodeService", "Bad peers data item.");
                fdxu.y(fduq0);
                return;
            }
            String s1 = fcez0.d("name");
            boolean z = fcez0.w("isWatch", false);
            ArrayList arrayList0 = fcez0.g("ids");
            ArrayList arrayList1 = fcez0.g("names");
            if(arrayList0 != null && arrayList1 != null && arrayList0.size() == arrayList1.size()) {
                Object object0 = fcez0.a.get("meteredConnections");
                ArrayList arrayList2 = null;
                if(object0 != null) {
                    try {
                        arrayList2 = (ArrayList)object0;
                    }
                    catch(ClassCastException classCastException0) {
                        fcez.B("meteredConnections", object0, "ArrayList<Integer>", classCastException0);
                    }
                }
                HashSet hashSet0 = new HashSet();
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    hashSet0.add(new fdyp(new fdxn(((String)arrayList0.get(v1)), ((String)arrayList1.get(v1))), arrayList2 != null && arrayList2.contains(Integer.valueOf(v1))));
                }
                fdyq0.g(new fdxn(s, s1), z, hashSet0);
                return;
            }
            fdxu.y(fduq0);
            return;
        }
        if(fdyo0 != null) {
            fdyq0.f(fdyo0.a.a);
        }
    }
}

