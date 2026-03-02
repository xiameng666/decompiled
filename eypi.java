import android.accounts.Account;
import com.google.android.gms.trustagent.activeunlock.primary.data.discovereddevice.scanner.DiscoveredDevice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class eypi extends eyvq {
    static final ibxd[] a;
    public final exur b;
    public final exyg c;
    public final exkw d;
    public final bboh e;
    public final expv f;
    public final ibvv g;
    public final ibvv h;
    public final ibvv i;
    public final icnj j;
    public static final int k;
    private final gfuv p;
    private final icck q;
    private final ibvv r;
    private final eydr s;
    private final expx t;
    private final icnl u;

    static {
        eypi.a = new ibxd[]{new ibut(eypi.class, "discoveredDevices", "getDiscoveredDevices()Ljava/util/List;", 0), new ibut(eypi.class, "enrolledDevices", "getEnrolledDevices()Ljava/util/List;", 0), new ibut(eypi.class, "enrollmentType", "getEnrollmentType()Lcom/google/android/gms/trustagent/activeunlock/primary/ui/discovereddevice/DiscoveredDeviceListUiState$EnrollmentType;", 0), new ibut(eypi.class, "selectedDevice", "getSelectedDevice()Lcom/google/android/gms/trustagent/activeunlock/primary/data/discovereddevice/scanner/DiscoveredDevice;", 0)};
    }

    public eypi(exur exur0, exyg exyg0, eydr eydr0, gfuv gfuv0, expx expx0, exkw exkw0, bboh bboh0) {
        ibuq.f(expx0, "restartableTimerFactory");
        eyov eyov0;
        super();
        this.b = exur0;
        this.c = exyg0;
        this.s = eydr0;
        this.p = gfuv0;
        this.t = expx0;
        this.d = exkw0;
        this.e = bboh0;
        this.q = lsc.a(this);
        this.f = expx0.a((honf.c() ? hfyo.c(honf.a.b().a()) : glyb.f(15)), new eyph(this));
        ibps ibps0 = ibps.a;
        this.g = new eypc(ibps0, this);
        this.h = new eypc(ibps0, this);
        if(honf.d() && honf.a.b().c()) {
            eyov0 = eyov.b;
        }
        else {
            eyov0 = honf.d() ? eyov.c : eyov.a;
        }
        this.i = new eypc(eyov0, this);
        this.r = new eypc(null, this);
        icnl icnl0 = icnm.a(this.x(ibps0, eyow.a));
        this.u = icnl0;
        this.j = icnl0;
        icbb.b(lsc.a(this), null, null, new eypb(this, null), 3);
    }

    @Override  // eyvq
    protected final exur a() {
        return this.b;
    }

    public final DiscoveredDevice b() {
        return (DiscoveredDevice)this.r.a(this, eypi.a[3]);
    }

    @Override  // eyvq
    protected final gfuv c() {
        return this.p;
    }

    @Override  // eyvq
    protected final icck e() {
        return this.q;
    }

    @Override  // eyvq
    protected final void f() {
        this.g();
    }

    public final void g() {
        ibxd[] arr_ibxd = eypi.a;
        List list0 = (List)this.g.a(this, arr_ibxd[0]);
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = list0.iterator();
    label_4:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            DiscoveredDevice discoveredDevice0 = (DiscoveredDevice)object0;
            List list1 = (List)this.h.a(this, arr_ibxd[1]);
            if(!(list1 instanceof Collection) || !list1.isEmpty()) {
                for(Object object1: list1) {
                    if(ibuq.m(((exwv)object1).d, discoveredDevice0.a)) {
                        continue label_4;
                    }
                }
            }
            arrayList0.add(object0);
        }
        ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
        for(Object object2: arrayList0) {
            boolean z = ibuq.m(this.b(), ((DiscoveredDevice)object2));
            eyoz eyoz0 = new eyoz(this, ((DiscoveredDevice)object2));
            arrayList1.add(new eyoy(((DiscoveredDevice)object2).b, z, eyoz0));
        }
        eyox eyox0 = this.x(arrayList1, (!honf.a.b().f() || this.w() != eyov.b || !arrayList0.isEmpty() || this.f.c() ? eyow.a : eyow.b));
        this.u.g(eyox0);
    }

    public final void h(Account account0) {
        expv expv0 = this.f;
        if(expv0.c()) {
            expv0.b();
            return;
        }
        if(honf.c() && honf.e()) {
            bboh bboh0 = this.e;
            ((ggtj)bboh0.h()).B("Triggering cloud enrollment for %s", (account0 == null ? null : account0.name));
            if(account0 == null) {
                ((ggtj)bboh0.j()).x("No matching accounts");
            }
            else {
                icbb.b(lsc.a(this), null, null, new eypd(this, account0, null), 3);
            }
        }
        iced iced0 = icbb.b(lsc.a(this), null, null, new eypg(this, null), 3);
        icbb.b(lsc.a(this), null, null, new eype(this, iced0, null), 3);
    }

    public final void i(DiscoveredDevice discoveredDevice0) {
        this.r.c(eypi.a[3], discoveredDevice0);
    }

    @Override  // eyvq
    protected final eydr j() {
        return this.s;
    }

    public static void k(eypi eypi0) {
        eypi0.h(null);
    }

    private final eyov w() {
        return (eyov)this.i.a(this, eypi.a[2]);
    }

    private final eyox x(List list0, eyow eyow0) {
        return this.l().a == eyuj.c ? new eyox(true, list0, this.f.c(), this.l(), this.w(), eyow0) : new eyox(false, list0, this.f.c(), this.l(), this.w(), eyow0);
    }
}

