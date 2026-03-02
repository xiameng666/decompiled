import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public final class iapk {
    public static final List a;
    public static final iapk b;
    public static final iapk c;
    public static final iapk d;
    public static final iapk e;
    public static final iapk f;
    public static final iapk g;
    public static final iapk h;
    public static final iapk i;
    public static final iapk j;
    public static final iapk k;
    public static final iapk l;
    public static final iapk m;
    public static final iapk n;
    public static final iapk o;
    public static final iapk p;
    public static final iapk q;
    static final iaoa r;
    static final iaoa s;
    public final iaph t;
    public final String u;
    public final Throwable v;
    private static final iaoe w;

    static {
        TreeMap treeMap0 = new TreeMap();
        iaph[] arr_iaph = iaph.values();
        int v = 0;
        while(v < arr_iaph.length) {
            iaph iaph0 = arr_iaph[v];
            iapk iapk0 = new iapk(iaph0, null, null);
            iapk iapk1 = (iapk)treeMap0.put(Integer.valueOf(iaph0.r), iapk0);
            if(iapk1 != null) {
                throw new IllegalStateException("Code value duplication between " + iapk1.t.name() + " & " + iaph0.name());
            }
            ++v;
            continue;
        }
        iapk.a = DesugarCollections.unmodifiableList(new ArrayList(treeMap0.values()));
        iapk.b = iaph.a.a();
        iapk.c = iaph.b.a();
        iapk.d = iaph.c.a();
        iapk.e = iaph.d.a();
        iapk.f = iaph.e.a();
        iapk.g = iaph.f.a();
        iapk.h = iaph.g.a();
        iapk.i = iaph.h.a();
        iapk.j = iaph.q.a();
        iapk.k = iaph.i.a();
        iapk.l = iaph.j.a();
        iapk.m = iaph.k.a();
        iapk.n = iaph.l.a();
        iapk.o = iaph.m.a();
        iapk.p = iaph.n.a();
        iapk.q = iaph.o.a();
        iaph.p.a();
        iapk.r = new iaod("grpc-status", false, new iapi());
        iapj iapj0 = new iapj();
        iapk.w = iapj0;
        iapk.s = new iaod("grpc-message", false, iapj0);
    }

    private iapk(iaph iaph0, String s, Throwable throwable0) {
        gftb.z(iaph0, "code");
        this.t = iaph0;
        this.u = s;
        this.v = throwable0;
    }

    public static iaof_metadata a(Throwable throwable0) {
        while(throwable0 != null) {
            if((throwable0 instanceof iapl)) {
                return ((iapl)throwable0).b;
            }
            if((throwable0 instanceof iapn)) {
                return ((iapn)throwable0).b;
            }
            throwable0 = throwable0.getCause();
        }
        return null;
    }

    public final iapk b(String s) {
        return this.u == null ? new iapk(this.t, s, this.v) : new iapk(this.t, a.r(s, this.u, "\n"), this.v);
    }

    public static iapk c(int v) {
        if(v >= 0) {
            return v >= iapk.a.size() ? iapk.d.f("Unknown code " + v) : ((iapk)iapk.a.get(v));
        }
        return iapk.d.f("Unknown code " + v);
    }

    public static iapk d(Throwable throwable0) {
        gftb.z(throwable0, "t");
        for(Throwable throwable1 = throwable0; throwable1 != null; throwable1 = throwable1.getCause()) {
            if((throwable1 instanceof iapl)) {
                return ((iapl)throwable1).a;
            }
            if((throwable1 instanceof iapn)) {
                return ((iapn)throwable1).a;
            }
        }
        return iapk.d.e(throwable0);
    }

    public final iapk e(Throwable throwable0) {
        return Objects.equals(this.v, throwable0) ? this : new iapk(this.t, this.u, throwable0);
    }

    public final iapk f(String s) {
        return Objects.equals(this.u, s) ? this : new iapk(this.t, s, this.v);
    }

    static String g(iapk iapk0) {
        return iapk0.u == null ? iapk0.t.toString() : iapk0.t.toString() + ": " + iapk0.u;
    }

    public final boolean h() {
        return iaph.a == this.t;
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("code", this.t.name());
        gfsv0.add("description", this.u);
        Throwable throwable0 = this.v;
        if(throwable0 != null) {
            throwable0 = gfut.a(throwable0);
        }
        gfsv0.add("cause", throwable0);
        return gfsv0.toString();
    }
}

