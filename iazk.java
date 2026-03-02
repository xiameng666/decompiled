import j..util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

final class iazk implements iamk {
    public final iazd a;
    public final ScheduledExecutorService b;
    public final iamg c;
    public final iakt d;
    public final boolean e;
    public final List f;
    public final iaps g;
    public final iaze h;
    public volatile List i;
    public final gfug j;
    public iapr k;
    public iapr l;
    public ibbs m;
    public final Collection n;
    public final iayo o;
    public iavn p;
    public volatile ibbs q;
    public volatile ialm r;
    public iapk s;
    public volatile iakk t;
    public iaxr u;
    private final iaml v;
    private final String w;
    private final String x;
    private final iavd y;
    private final iaun z;

    public iazk(iamu iamu0, String s, String s1, iavd iavd0, ScheduledExecutorService scheduledExecutorService0, iaps iaps0, iazd iazd0, iamg iamg0, iaun iaun0, iaml iaml0, iakt iakt0, List list0) {
        Object object0;
        this.n = new ArrayList();
        this.o = new iayr(this);
        this.r = ialm.a(iall.d);
        gftb.b(((boolean)(iamu0.a.isEmpty() ^ 1)), "addressGroups is empty");
        iazk.b(iamu0.a, "addressGroups contains null entry");
        List list1 = DesugarCollections.unmodifiableList(new ArrayList(iamu0.a));
        this.i = list1;
        this.h = new iaze(list1);
        this.w = s;
        this.x = s1;
        this.y = iavd0;
        this.b = scheduledExecutorService0;
        this.j = new gfug();
        this.g = iaps0;
        this.a = iazd0;
        this.c = iamg0;
        this.z = iaun0;
        this.v = iaml0;
        this.d = iakt0;
        this.f = list0;
        iamt iamt0 = ianf.c;
        for(int v = 0; true; ++v) {
            Object[][] arr2_object = iamu0.c;
            if(v >= arr2_object.length) {
                object0 = iamt0.a;
                break;
            }
            if(iamt0.equals(arr2_object[v][0])) {
                object0 = iamu0.c[v][1];
                break;
            }
        }
        this.e = ((Boolean)object0).booleanValue();
    }

    public final iavb a() {
        iavb iavb0 = this.q;
        if(iavb0 != null) {
            return iavb0;
        }
        iayt iayt0 = new iayt(this);
        this.g.execute(iayt0);
        return null;
    }

    public static void b(List list0, String s) {
        for(Object object0: list0) {
            gftb.z(object0, s);
        }
    }

    @Override  // iamq
    public final iaml c() {
        return this.v;
    }

    public final void d(iall iall0) {
        this.g.d();
        this.e(ialm.a(iall0));
    }

    public final void e(ialm ialm0) {
        this.g.d();
        iall iall0 = ialm0.a;
        if(this.r.a != iall0) {
            gftb.u(this.r.a != iall.e, "Cannot transition out of SHUTDOWN to %s", iall0);
            this.r = this.e && iall0 == iall.c ? ialm.a(iall.d) : ialm0;
            this.a.a.a(ialm0);
        }
    }

    public final void f() {
        iayx iayx0 = new iayx(this);
        this.g.execute(iayx0);
    }

    public final void g(iavn iavn0, boolean z) {
        iayy iayy0 = new iayy(this, iavn0, z);
        this.g.execute(iayy0);
    }

    public final void h(iapk iapk0) {
        iayw iayw0 = new iayw(this, iapk0);
        this.g.execute(iayw0);
    }

    public final void i() {
        iamc iamc0;
        iaps iaps0 = this.g;
        iaps0.d();
        gftb.r(this.k == null, "Should have no reconnectTask scheduled");
        iaze iaze0 = this.h;
        if(iaze0.b == 0 && iaze0.c == 0) {
            this.j.e();
            this.j.f();
        }
        SocketAddress socketAddress0 = iaze0.b();
        if((socketAddress0 instanceof iamc)) {
            iamc0 = (iamc)socketAddress0;
            socketAddress0 = ((iamc)socketAddress0).b;
        }
        else {
            iamc0 = null;
        }
        iakk iakk0 = iaze0.a();
        String s = (String)iakk0.a(ialw.a);
        iavc iavc0 = new iavc();
        if(s == null) {
            s = this.w;
        }
        gftb.z(s, "authority");
        iavc0.a = s;
        iavc0.b = iakk0;
        iavc0.c = this.x;
        iavc0.d = iamc0;
        iazj iazj0 = new iazj();
        iazj0.a = this.v;
        iazc iazc0 = new iazc(this.y.a(socketAddress0, iavc0, iazj0), this.z);
        iazj0.a = iazc0.c();
        iamg.a(this.c.e, iazc0);
        this.p = iazc0;
        this.n.add(iazc0);
        Runnable runnable0 = iazc0.d(new iazi(this, iazc0));
        if(runnable0 != null) {
            iaps0.c(runnable0);
        }
        this.d.b(2, "Started transport {0}", new Object[]{iazj0.a});
    }

    static void j(iazk iazk0) {
        iazk0.p = null;
    }

    public static final String k(iapk iapk0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(iapk0.t);
        String s = iapk0.u;
        if(s != null) {
            stringBuilder0.append("(");
            stringBuilder0.append(s);
            stringBuilder0.append(")");
        }
        Throwable throwable0 = iapk0.v;
        if(throwable0 != null) {
            stringBuilder0.append("[");
            stringBuilder0.append(throwable0);
            stringBuilder0.append("]");
        }
        return stringBuilder0.toString();
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.g("logId", this.v.a);
        gfsv0.add("addressGroups", this.i);
        return gfsv0.toString();
    }
}

