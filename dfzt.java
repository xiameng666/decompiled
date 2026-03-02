import android.util.ArraySet;
import com.google.android.gms.nearby.sharing.AppAttachment;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import j..util.Collection.-EL;
import j..util.Objects;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class dfzt implements dfvm {
    private boolean a;
    public final ShareTarget e;
    public final dcnp f;
    public final Map g;
    public final BigDecimal h;
    public BigDecimal i;
    public int j;
    public long k;
    public long l;
    final dfzz m;

    public dfzt(dfzz dfzz0, ShareTarget shareTarget0, dcnp dcnp0) {
        Objects.requireNonNull(dfzz0);
        this.m = dfzz0;
        super();
        this.g = new bxd();
        this.a = false;
        this.j = -1;
        this.k = -1L;
        this.l = -1L;
        this.e = shareTarget0;
        this.f = dcnp0;
        this.i = BigDecimal.ZERO;
        BigDecimal bigDecimal0 = BigDecimal.ZERO;
        for(Object object0: shareTarget0.e()) {
            Attachment attachment0 = (Attachment)object0;
            if(attachment0.i()) {
                List list0 = dfzz0.ar(((AppAttachment)attachment0));
                long[] arr_v = ((AppAttachment)attachment0).g;
                if(list0.isEmpty()) {
                    dcvz.a.e().h("Failed to retrieve payloads for: %s", attachment0);
                }
                else {
                    for(int v = 0; v < list0.size(); ++v) {
                        dcvz.a.b().h("Tracking payload %d", list0.get(v));
                        Long long0 = (Long)list0.get(v);
                        dfzs dfzs0 = new dfzs(this);
                        this.g.put(long0, dfzs0);
                        bigDecimal0 = bigDecimal0.add(new BigDecimal(Long.toString(arr_v[v])));
                    }
                }
            }
            else if(attachment0.k()) {
                long v1 = dfzz0.ab(attachment0).d;
                if(v1 == -1L) {
                    dcvz.a.e().h("Failed to retrieve stream payload for: %s", attachment0);
                }
                else {
                    Long long1 = v1;
                    dcvz.a.b().h("Tracking stream payload %d", long1);
                    dfzs dfzs1 = new dfzs(this);
                    this.g.put(long1, dfzs1);
                }
            }
            else {
                long v2 = dfzz0.O(attachment0);
                if(v2 == -1L) {
                    dcvz.a.e().h("Failed to retrieve payload for: %s", attachment0);
                }
                else {
                    Long long2 = v2;
                    dcvz.a.b().h("Tracking payload %d", long2);
                    dfzs dfzs2 = new dfzs(this);
                    if(attachment0.j()) {
                        dfzs2.d = attachment0.b();
                    }
                    this.g.put(long2, dfzs2);
                    bigDecimal0 = bigDecimal0.add(new BigDecimal(Long.toString(attachment0.c())));
                }
            }
        }
        this.h = bigDecimal0;
    }

    @Override  // dfvm
    public final void a(long v, long v1, dfvl dfvl0) {
        dfzr dfzr0 = new dfzr(this, v, v1, dfvl0);
        this.m.aU(dfzr0);
    }

    public void b() {
        ArraySet arraySet0 = new ArraySet();
        dfzz dfzz0 = this.m;
        dfzz0.ay(arraySet0);
        if(hvqz.L()) {
            dfzx dfzx0 = (dfzx)dfzz0.b.remove(this.e);
            if(dfzx0 != null) {
                dfzx0.a();
            }
        }
    }

    public void c() {
        ArraySet arraySet0 = new ArraySet();
        dfzz dfzz0 = this.m;
        dfzz0.ay(arraySet0);
        if(hvqz.L()) {
            dfzx dfzx0 = (dfzx)dfzz0.b.remove(this.e);
            if(dfzx0 != null) {
                dfzx0.a();
            }
        }
    }

    public boolean d() {
        return true;
    }

    public final float e(ShareTarget shareTarget0, int v) {
        float f = this.m.I(shareTarget0);
        BigDecimal bigDecimal0 = this.h.multiply(new BigDecimal(Integer.toString(v + 1)));
        if(bigDecimal0.signum() <= 0) {
            dcvz.a.e().h("Position %s, total size of attachment is 0.", Integer.valueOf(v));
            return f;
        }
        float f1 = f + this.i.divide(bigDecimal0, 2, 0).multiply(new BigDecimal(Float.toString(100.0f - f))).floatValue();
        return f1 < 0.0f ? 0.0f : Math.min(100.0f, f1);
    }

    public final long f() {
        if(((Attachment)this.e.e().get(0)).m()) {
            return 0L;
        }
        BigDecimal bigDecimal0 = (BigDecimal)Collection.-EL.stream(this.g.values()).map(new dfzp()).reduce(BigDecimal.ZERO, new dfzq());
        this.i = bigDecimal0;
        return this.h.subtract(bigDecimal0).longValue();
    }

    public final Long g() {
        for(Object object0: this.g.values()) {
            dfzs dfzs0 = (dfzs)object0;
            if(dfzs0.c == dfvl.b) {
                long v = dfzs0.d;
                if(v != -1L) {
                    return v;
                }
            }
        }
        return null;
    }

    public final List h() {
        List list0 = new ArrayList();
        for(Object object0: this.g.values()) {
            dfzs dfzs0 = (dfzs)object0;
            if(dfzs0.c == dfvl.c && dfzs0.d != -1L) {
                dcvz.a.b().h("Adding CompletedFileAttachmentIds: %d", Long.valueOf(dfzs0.d));
                list0.add(Long.valueOf(dfzs0.d));
            }
        }
        return list0;
    }

    public final void i(dfvl dfvl0) {
        dfzz dfzz0 = this.m;
        ShareTarget shareTarget0 = this.e;
        String s = dfzz0.ap(shareTarget0);
        if(s == null) {
            dcvz.a.e().h("Failed to disconnect. No endpointId found for ShareTarget %s", shareTarget0);
            return;
        }
        if(!dfvl.c.equals(dfvl0)) {
            if(dfvl.e.equals(dfvl0)) {
                boolean z = shareTarget0.f ? dfzz0.ad(shareTarget0).g : dfzz0.ae(shareTarget0).j;
                dfum dfum0 = dfzz0.aa(shareTarget0);
                if(z) {
                    dcvz.a.b().p("Transfer cancellation was initiated. Waiting for disconnection from the other side.", new Object[0]);
                    this.p(dfum0, s, "Cancellation initiator disconnection from " + s, hvqs.m());
                    return;
                }
            }
            dcvz.a.b().p("Files failed to transfer. No point in continuing, disconnect immediately", new Object[0]);
            dfzz0.l.k(s);
            return;
        }
        if(shareTarget0.f) {
            dfzz0.l.k(s);
            return;
        }
        this.p(dfzz0.aa(shareTarget0), s, "Outgoing disconnection to " + s, hvqs.ae());
    }

    public final void j(gyzg gyzg0) {
        if(this.a) {
            return;
        }
        dfzz.bN(new dfzo(this, gyzg0));
        this.a = true;
    }

    public final void k(long v) {
        Map map0 = this.g;
        Long long0 = v;
        if(map0.containsKey(long0)) {
            throw new IllegalArgumentException("Attempting to register already registered payload.");
        }
        map0.put(long0, new dfzs(this));
    }

    final void l(long v, long v1) {
        dfzs dfzs0 = (dfzs)this.g.get(Long.valueOf(v));
        if(dfzs0 == null) {
            throw new IllegalArgumentException("Payload does not exist.");
        }
        if(dfzs0.a != 0L) {
            throw new IllegalArgumentException("Existing file size can be set only once.");
        }
        dfzs0.a = v1;
    }

    public final boolean m() {
        if(this.n()) {
            return false;
        }
        if(this.m.bx(this.e)) {
            return true;
        }
        for(Object object0: this.g.values()) {
            if(dfvl.e.equals(((dfzs)object0).c)) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        for(Object object0: this.g.values()) {
            if(!dfvl.c.equals(((dfzs)object0).c)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(long v) {
        dfzs dfzs0 = (dfzs)this.g.get(Long.valueOf(v));
        return dfzs0 == null ? false : dfzs0.c == dfvl.b;
    }

    private final void p(dfum dfum0, String s, String s1, long v) {
        dfzm dfzm0 = new dfzm(this, s);
        cumn cumn0 = cumn.d(dcvz.a, dfzm0, v, this.m.g);
        if(dfum0 != null) {
            dfum0.b(new dfzn(this, cumn0));
        }
    }
}

