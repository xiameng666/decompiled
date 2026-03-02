import android.content.Context;
import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.api.Status;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class atst extends azts implements atrm {
    private static final azta_api F;
    private Handler G;
    private final Object H;
    private static final azsy I;
    public static final aurs a;
    public final atss b;
    public boolean c;
    public boolean d;
    evqp e;
    evqp f;
    public final AtomicLong g;
    public final Object h;
    public ApplicationMetadata i;
    public String j;
    public double k;
    public boolean l;
    public int m;
    public int n;
    public EqualizerSettings o;
    public final CastDevice p;
    final Map q;
    public final Map r;
    public final atri s;
    public final List t;
    public int u;

    static {
        atst.a = new aurs("CastClient");
        atsk atsk0 = new atsk();
        atst.I = atsk0;
        atst.F = new azta_api("Cast.API_CXLESS", atsk0, aurr.e);
    }

    public atst(Context context0, atrh atrh0) {
        super(context0, atst.F, atrh0, aztr_settings.a);
        this.b = new atss(this);
        this.h = new Object();
        this.H = new Object();
        this.t = DesugarCollections.synchronizedList(new ArrayList());
        batl.t(context0, "context cannot be null");
        this.s = atrh0.b;
        this.p = atrh0.a;
        this.q = new HashMap();
        this.r = new HashMap();
        this.g = new AtomicLong(0L);
        this.u = 1;
    }

    @Override  // atrm
    public final void b(atrl atrl0) {
        batl.s(atrl0);
        this.t.add(atrl0);
    }

    @Override  // atrm
    public final boolean c() {
        this.f();
        return this.l;
    }

    public final Handler e() {
        if(this.G == null) {
            this.G = new clht(this.B);
        }
        return this.G;
    }

    public final void f() {
        batl.m(this.u == 3, "Not connected to device");
    }

    public final void g() {
        atst.a.c("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized(this.r) {
            this.r.clear();
        }
    }

    public final void h(int v) {
        synchronized(this.h) {
            evqp evqp0 = this.e;
            if(evqp0 != null) {
                evqp0.a(atst.o(v));
            }
            this.e = null;
        }
    }

    public final void i(long v, int v1) {
        evqp evqp0;
        synchronized(this.q) {
            Long long0 = v;
            evqp0 = (evqp)this.q.get(long0);
            this.q.remove(long0);
        }
        if(evqp0 != null) {
            if(v1 == 0) {
                evqp0.b(null);
                return;
            }
            evqp0.a(atst.o(v1));
        }
    }

    public final void j(evqp evqp0) {
        synchronized(this.H) {
            if(this.f != null) {
                evqp0.a(atst.o(2001));
                return;
            }
            this.f = evqp0;
        }
    }

    public final void k(int v) {
        synchronized(this.H) {
            evqp evqp0 = this.f;
            if(evqp0 == null) {
                return;
            }
            if(v == 0) {
                evqp0.b(new Status(0));
            }
            else {
                evqp0.a(atst.o(v));
            }
            this.f = null;
        }
    }

    public final void l() {
        batl.m(this.u != 1, "Not active connection");
    }

    final void m() {
        CastDevice castDevice0 = this.p;
        if(!castDevice0.i(0x800) && castDevice0.i(4) && !castDevice0.i(1)) {
            "Chromecast Audio".equals(castDevice0.e);
        }
    }

    public final void n(aurn aurn0) {
        azyd_linstner azyd0 = this.iD(aurn0, "castDeviceControllerListenerKey").listener_;
        batl.t(azyd0, "Key must not be null");
        this.jm(azyd0, 0x20DF);
    }

    private static aztb o(int v) {
        return baqb.a(new Status(v));
    }
}

