import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.android.gms.cast.discovery.DiscoveryManager.DiscoveryManagerReceiver;
import j..util.Objects;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class auha implements cjpb {
    private boolean A;
    private boolean B;
    private atzl C;
    public final avjh a;
    public final gful_cronetEngineProvider b;
    public final gful_cronetEngineProvider c;
    public final Context d;
    public final cjpc e;
    public final ScheduledExecutorService f;
    public final augl g;
    public final avij h;
    public final auiz i;
    public final Map j;
    public final aund k;
    public Set l;
    public int m;
    public ScheduledFuture n;
    public ScheduledFuture o;
    boolean p;
    boolean q;
    public boolean r;
    public final aush s;
    public atzk t;
    public augy u;
    public final ausg v;
    private final gful_cronetEngineProvider w;
    private final atxp x;
    private final BroadcastReceiver y;
    private final List z;

    public auha(Context context0, ScheduledExecutorService scheduledExecutorService0, auiz auiz0, aulm aulm0, auhn auhn0, augl augl0, bbfe_BaseGrpcServer bbfe0, atxp atxp0, ausg ausg0) {
        ausg ausg1;
        avjh avjh0 = new avjh("DiscoveryManager");
        this.a = avjh0;
        this.w = gfus.a(((gful_cronetEngineProvider)new augo()));
        this.b = gfus.a(((gful_cronetEngineProvider)new augp()));
        this.c = gfus.a(((gful_cronetEngineProvider)new augq()));
        ArrayList arrayList0 = new ArrayList();
        this.z = arrayList0;
        this.A = false;
        this.d = context0;
        this.f = scheduledExecutorService0;
        this.i = auiz0;
        this.g = augl0;
        this.x = atxp0;
        this.v = ausg0;
        avij avij0 = avij.e();
        this.h = avij0;
        cjpc cjpc0 = avjn.e(context0);
        this.e = cjpc0;
        this.r = cjpd.i(cjpc0, "com.google.android.gms.cast.SETTINGS_KEY_KEEP_DISCOVERY_WHEN_SCREEN_OFF", false);
        cjpc0.g(this);
        if(avij0.k()) {
            arrayList0.add(new aufp(context0, augl0, scheduledExecutorService0, aulm0, auhn0, ausg0, atxp0));
        }
        if(hqsw.a.c().h()) {
            arrayList0.add(new auhh(context0, scheduledExecutorService0, aulm0, ausg0, atxp0));
        }
        if(avij0.n()) {
            ausg1 = ausg0;
            arrayList0.add(new auhj(context0, scheduledExecutorService0, aulm0, ausg1, atxp0));
        }
        else {
            ausg1 = ausg0;
        }
        if(arrayList0.isEmpty()) {
            avjh0.d("There aren\'t any device scanners registered.", new Object[0]);
        }
        this.y = new DiscoveryManager.DiscoveryManagerReceiver(this);
        this.j = new HashMap();
        this.p = ausg1.l();
        augx augx0 = new augx(this);
        this.s = augx0;
        ausg1.d(augx0);
        if(avij0.n()) {
            this.C = new atzl();
            this.u = new augy(this);
            atzk atzk0 = new atzk(this.C);
            this.t = atzk0;
            augy augy0 = this.u;
            atzl atzl0 = atzk0.b;
            if(atzl0 != null) {
                atzl0.a.add(augy0);
            }
            this.q = this.t.a;
        }
        aund aund0 = new aund(augl0, context0, scheduledExecutorService0, auiz0, bbfe0, atxp0);
        this.k = aund0;
        aund0.h = new aunc(aund0);
        aund0.f.a(aund0.h);
        auna auna0 = new auna(aund0);
        aund0.b.execute(auna0);
    }

    @Override  // cjpb
    public final void a(cjpc cjpc0, String s) {
        if(TextUtils.equals("com.google.android.gms.cast.SETTINGS_KEY_KEEP_DISCOVERY_WHEN_SCREEN_OFF", s)) {
            boolean z = cjpd.i(cjpc0, s, false);
            if(this.r != z) {
                this.a.n("Keep discovery when screen off debugging setting has changed to %s", (z ? "enabled" : "disabled"));
                this.r = z;
            }
            augr augr0 = () -> {
                gkex gkex0;
                boolean z2;
                Set set0 = this.l;
                boolean z1 = true;
                if(this.r) {
                    z2 = true;
                }
                else {
                    Object object0 = this.d.getSystemService("power");
                    gftb.check(object0);
                    z2 = ((PowerManager)object0).isInteractive();
                }
                boolean z3 = this.p || this.q && avij.e().n();
                augl augl0 = this.g;
                Set set1 = this.l;
                int v = this.m;
                avjh avjh0 = augl0.a;
                avjh0.q("updateDiscoveryState(). Criteria: %s. Screen on: %b. Has connectivity: %b.", String.valueOf(set1), Boolean.valueOf(z2), Boolean.valueOf(z3));
                augl0.p = z2;
                augl0.q = z3;
                augl0.k.clear();
                augl0.k.putAll(this.j);
                int v1 = augl0.o;
                augl0.o = v;
                augl0.n = set1 == null ? null : new HashSet(set1);
                List list0 = augl0.s;
                synchronized(list0) {
                    avjh0.m("notify filter criteria changed");
                    for(Object object1: list0) {
                        ((augk)object1).d();
                    }
                }
                if(augl0.n != null && augl0.p && augl0.q) {
                    augl0.b();
                    List list1 = augl0.s;
                    synchronized(list1) {
                        augl0.a.n("notify discovery started with scannerFlags = %d", Integer.valueOf(v));
                        for(Object object2: list1) {
                            ((augk)object2).a(v);
                        }
                    }
                }
                else {
                    augl0.b();
                }
                if(augl0.p) {
                    List list2 = augl0.s;
                    synchronized(list2) {
                        augl0.a.m("notify discovery state changed");
                        for(Object object3: list2) {
                            ((augk)object3).c();
                        }
                    }
                }
                if(v1 != v) {
                    List list3 = augl0.s;
                    synchronized(list3) {
                        augl0.a.m("notify scanner flags changed");
                        for(Object object4: list3) {
                            ((augk)object4).e();
                        }
                    }
                }
                if(set0 == null) {
                    z1 = false;
                }
                if(z1 && z2 && z3) {
                    if(!this.B) {
                        this.g();
                        this.i();
                        return;
                    }
                    if(false) {
                        this.h(gkex.b);
                        this.g();
                    }
                    this.i();
                    return;
                }
                if(this.B) {
                    if(z1) {
                        gkex0 = z2 ? gkex.c : gkex.d;
                    }
                    else {
                        gkex0 = gkex.b;
                    }
                    this.h(gkex0);
                    this.a.m("stop discovery");
                    this.B = false;
                    for(Object object5: this.z) {
                        ((augg)object5).b();
                        ((augg)object5).i = false;
                    }
                }
            };
            this.f.execute(augr0);
        }
    }

    public final void b(Set set0, Map map0, int v) {
        if(hqrx.a.b().k() && set0 != null && set0.isEmpty()) {
            set0 = null;
        }
        if(set0 == null) {
            if(this.A) {
                try {
                    this.d.unregisterReceiver(this.y);
                }
                catch(IllegalArgumentException unused_ex) {
                }
                this.A = false;
            }
            else {
                this.a.g("BroadcastReceiver not registered", new Object[0]);
            }
        }
        else if(this.A) {
            this.a.g("BroadcastReceiver is already registered", new Object[0]);
        }
        else {
            IntentFilter intentFilter0 = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter0.addAction("android.intent.action.SCREEN_OFF");
            jwe.b(this.d, this.y, intentFilter0, 2);
            this.A = true;
        }
        augt augt0 = new augt(this, set0, v, map0);
        this.f.execute(augt0);
    }

    public final void c() {
        ScheduledFuture scheduledFuture0 = this.o;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
        }
    }

    public final void d(String s, int v) {
        try {
            augu augu0 = new augu(this, auah.a(InetAddress.getByName(s), v, null).a());
            this.f.execute(augu0);
        }
        catch(IllegalArgumentException | SecurityException | UnknownHostException exception0) {
            this.a.h(exception0, "Failed to create InetSocketAddress", new Object[0]);
        }
    }

    // Detected as a lambda impl.
    public final void e(boolean z) {
        gkex gkex0;
        boolean z2;
        Set set0 = this.l;
        boolean z1 = true;
        if(this.r) {
            z2 = true;
        }
        else {
            Object object0 = this.d.getSystemService("power");
            gftb.check(object0);
            z2 = ((PowerManager)object0).isInteractive();
        }
        boolean z3 = this.p || this.q && avij.e().n();
        augl augl0 = this.g;
        Set set1 = this.l;
        int v = this.m;
        avjh avjh0 = augl0.a;
        avjh0.q("updateDiscoveryState(). Criteria: %s. Screen on: %b. Has connectivity: %b.", String.valueOf(set1), Boolean.valueOf(z2), Boolean.valueOf(z3));
        augl0.p = z2;
        augl0.q = z3;
        augl0.k.clear();
        augl0.k.putAll(this.j);
        int v1 = augl0.o;
        augl0.o = v;
        augl0.n = set1 == null ? null : new HashSet(set1);
        List list0 = augl0.s;
        synchronized(list0) {
            avjh0.m("notify filter criteria changed");
            for(Object object1: list0) {
                ((augk)object1).d();
            }
        }
        if(augl0.n != null && augl0.p && augl0.q) {
            augl0.b();
            List list1 = augl0.s;
            synchronized(list1) {
                augl0.a.n("notify discovery started with scannerFlags = %d", Integer.valueOf(v));
                for(Object object2: list1) {
                    ((augk)object2).a(v);
                }
            }
        }
        else {
            augl0.b();
        }
        if(augl0.p) {
            List list2 = augl0.s;
            synchronized(list2) {
                augl0.a.m("notify discovery state changed");
                for(Object object3: list2) {
                    ((augk)object3).c();
                }
            }
        }
        if(v1 != v) {
            List list3 = augl0.s;
            synchronized(list3) {
                augl0.a.m("notify scanner flags changed");
                for(Object object4: list3) {
                    ((augk)object4).e();
                }
            }
        }
        if(set0 == null) {
            z1 = false;
        }
        if(z1 && z2 && z3) {
            if(!this.B) {
                this.g();
                this.i();
                return;
            }
            if(z) {
                this.h(gkex.b);
                this.g();
            }
            this.i();
            return;
        }
        if(this.B) {
            if(z1) {
                gkex0 = z2 ? gkex.c : gkex.d;
            }
            else {
                gkex0 = gkex.b;
            }
            this.h(gkex0);
            this.a.m("stop discovery");
            this.B = false;
            for(Object object5: this.z) {
                ((augg)object5).b();
                ((augg)object5).i = false;
            }
        }
    }

    public static final Long f() {
        return System.currentTimeMillis();
    }

    private final void g() {
        this.x.l(this.l, this.m);
        Objects.requireNonNull(this.x);
        augv augv0 = new augv(this.x);
        long v = (long)(((Long)this.w.mr()));
        long v1 = (long)(((Long)this.w.mr()));
        this.n = this.f.scheduleWithFixedDelay(augv0, v, v1, TimeUnit.MILLISECONDS);
    }

    private final void h(gkex gkex0) {
        ScheduledFuture scheduledFuture0 = this.n;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
        }
        this.x.m(this.l, gkex0);
    }

    private final void i() {
        this.a.m("start discovery");
        this.B = true;
        Set set0 = this.l;
        if(set0 == null) {
            return;
        }
        for(Object object0: this.z) {
            augg augg0 = (augg)object0;
            int v = this.m;
            if(augg0.i) {
                augg0.a(set0, v);
            }
            else {
                augg0.i = augg0.d(set0, v);
            }
        }
        augm augm0 = new augm(this);
        this.f.execute(augm0);
    }
}

