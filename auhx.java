import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j..util.DesugarCollections;
import j..util.Objects;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public final class auhx {
    public auhy A;
    private final auad B;
    public final Context a;
    public final gful_cronetEngineProvider b;
    public final avjh c;
    public final avij d;
    public final int e;
    public final String f;
    public final Set g;
    public final Set h;
    public final Set i;
    public final String j;
    public final ScheduledExecutorService k;
    public final auhs l;
    public final aual m;
    public final avaa n;
    public String o;
    public String p;
    public int q;
    public boolean r;
    public ScheduledFuture s;
    public CastDevice t;
    public aunj u;
    public gqft v;
    public String w;
    public boolean x;
    public ByteString y;
    public byte[] z;

    public auhx(Context context0, ScheduledExecutorService scheduledExecutorService0, int v, avaa avaa0, atxp atxp0, auhs auhs0) {
        this.b = gfus.a(((gful_cronetEngineProvider)new auhq()));
        this.g = DesugarCollections.synchronizedSet(new HashSet());
        this.h = new HashSet();
        this.i = new HashSet();
        this.q = 0;
        this.t = null;
        this.u = null;
        this.v = null;
        this.a = context0;
        this.j = "gms_cast_prober";
        this.e = v;
        this.k = scheduledExecutorService0;
        this.l = auhs0;
        this.d = avij.e();
        String s = String.format(Locale.ROOT, "%s-%d", "gms_cast_prober", v);
        this.f = s;
        this.c = new avjh("TcpProberController", s);
        this.n = avaa0;
        auhw auhw0 = new auhw(this);
        this.B = auhw0;
        this.m = auaj.a(context0, auhw0, scheduledExecutorService0, "gms_cast_prober", s, 0x4000, false, false, atxp0, null);
    }

    final auhy a(boolean z) {
        this.c.m("deactivate is called");
        auhy auhy0 = this.A;
        ScheduledFuture scheduledFuture0 = this.s;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
        }
        if(auhy0 != null) {
            aual aual0 = this.m;
            switch(aual0.c.a()) {
                case 0: {
                    this.A = null;
                    Objects.requireNonNull(this.l);
                    auhp auhp0 = new auhp(this.l);
                    this.k.execute(auhp0);
                    return auhy0;
                }
                case 1: 
                case 2: {
                    this.r = z;
                    aual0.b();
                    return auhy0;
                }
                default: {
                    return auhy0;
                }
            }
        }
        return null;
    }

    public final void b() {
        avjh avjh0 = this.c;
        avjh0.p("finishProbing() of device(%s) with %s", this.t, this.A);
        auhy auhy0 = this.a(true);
        if(auhy0 == null) {
            return;
        }
        HashSet hashSet0 = new HashSet(this.h);
        HashSet hashSet1 = new HashSet(this.i);
        if(this.t != null) {
            if(this.d.l()) {
                CastDevice castDevice0 = this.t;
                batl.s(castDevice0);
                if(castDevice0.h == 3) {
                    avjh0.n("Clearing supported and unsupported criteria for device(%s) because TOS is not accepted yet.", this.t);
                    hashSet0.clear();
                    hashSet1.clear();
                    if(this.o != null) {
                        avjh0.n("Clearing receiver status text for device(%s) because TOS is not accepted yet.", this.t);
                        this.o = null;
                    }
                    if(this.v != null) {
                        avjh0.n("Clearing relay access token for device(%s) because TOS is not accepted yet.", this.t);
                        this.v = null;
                    }
                }
            }
            String s = this.o;
            CastDevice castDevice1 = this.t;
            aunj aunj0 = this.u;
            String s1 = this.p;
            String s2 = this.w;
            gqft gqft0 = this.v;
            auia auia0 = this.l.a;
            String s3 = TextUtils.join(",", hashSet0);
            String s4 = TextUtils.join(",", hashSet1);
            auia0.a.s("[timestamp: %s] notifyProberSuccess Device(%s) supportedCriteria(%s) notSupportedCriteria(%s) statusText(%s)", s1, castDevice1, s3, s4, s);
            Set set0 = auhy0.b();
            boolean z = auhy0.d();
            auia0.j.X(castDevice1, set0, hashSet0, hashSet1, z);
            if(s2 != null) {
                new aulu(auhy0, auia0.k.a, auia0.k.b, castDevice1, s2, aunj0, hashSet0, hashSet1, s1, s, System.currentTimeMillis(), gqft0).b();
            }
            return;
        }
        this.l.a(auhy0, 0x7DF, "TCP_PROBER_FAIL_TO_VERIFY_DEVICE", this.w);
    }

    final boolean c(auhy auhy0) {
        boolean z;
        synchronized(this) {
            z = false;
            auhy auhy1 = this.A;
            if(auhy1 == null) {
                return false;
            }
            if(!auhy1.a.c(auhy0.a)) {
                return false;
            }
            auhy auhy2 = this.A;
            batl.s(auhy2);
            if(auhy2.d() || !auhy0.d()) {
                z = true;
            }
            if(z) {
                auhy auhy3 = this.A;
                batl.s(auhy3);
                auhy3.c(auhy0);
            }
        }
        return z;
    }

    public final boolean d(String s, Object object0) {
        gehl gehl0 = auav.a(s, this.f, object0);
        if(gehl0 == null) {
            this.c.g("Not sending an invalid message", new Object[0]);
            return false;
        }
        this.c.c("Sending message to %s: (ns=%s, dest=%s) %s", new Object[]{(this.A == null ? null : this.A.a), s, aurr.b, object0});
        try {
            this.m.c.j(gehl0);
            return true;
        }
        catch(IOException | IllegalStateException exception0) {
            avjh avjh0 = this.c;
            avjh0.d("Failed to send message.", new Object[]{exception0});
            auhy auhy0 = this.a(false);
            if(auhy0 == null) {
                avjh0.m("sendMessage. Controller is not active.");
                return false;
            }
            this.l.a(auhy0, 2, String.format(Locale.ROOT, "sendMessage failed: %s", exception0.toString()), this.w);
            return false;
        }
    }
}

