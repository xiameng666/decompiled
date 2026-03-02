import android.os.Build.VERSION;
import android.os.Build;

public final class rhd {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public final String m;
    public final String n;
    public final String o;

    public rhd() {
        throw null;
    }

    public rhd(int v, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, int v1, String s10, String s11, String s12) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = s4;
        this.g = s5;
        this.h = s6;
        this.i = s7;
        this.j = s8;
        this.k = s9;
        this.l = v1;
        this.m = s10;
        this.n = s11;
        this.o = s12;
    }

    public static rhc a() {
        rhc rhc0 = new rhc();
        rhc0.g(0);
        rhc0.h("2.0");
        rhc0.e("");
        rhc0.l("");
        rhc0.m("");
        rhc0.p(Build.MANUFACTURER);
        rhc0.n(Build.MODEL);
        rhc0.o(Build.VERSION.RELEASE);
        rhc0.c("");
        rhc0.d("");
        rhc0.k("");
        rhc0.j(2);
        rhc0.b("application/json, text/vnd.wap.connectivity-xml");
        rhc0.f("");
        rhc0.i("");
        return rhc0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof rhd) && this.a == ((rhd)object0).a && this.b.equals(((rhd)object0).b) && this.c.equals(((rhd)object0).c) && this.d.equals(((rhd)object0).d) && this.e.equals(((rhd)object0).e) && this.f.equals(((rhd)object0).f) && this.g.equals(((rhd)object0).g) && this.h.equals(((rhd)object0).h) && this.i.equals(((rhd)object0).i) && this.j.equals(((rhd)object0).j) && this.k.equals(((rhd)object0).k) && this.l == ((rhd)object0).l && this.m.equals(((rhd)object0).m) && this.n.equals(((rhd)object0).n) && this.o.equals(((rhd)object0).o);
    }

    @Override
    public final int hashCode() {
        return this.o.hashCode() ^ ((((((((((((((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode()) * 1000003 ^ this.j.hashCode()) * 1000003 ^ this.k.hashCode()) * 1000003 ^ this.l) * 1000003 ^ this.m.hashCode()) * 1000003 ^ this.n.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "ServiceEntitlementRequest{configurationVersion=" + this.a + ", entitlementVersion=" + this.b + ", authenticationToken=" + this.c + ", temporaryToken=" + this.d + ", terminalId=" + this.e + ", terminalVendor=" + this.f + ", terminalModel=" + this.g + ", terminalSoftwareVersion=" + this.h + ", appName=" + this.i + ", appVersion=" + this.j + ", notificationToken=" + this.k + ", notificationAction=" + this.l + ", acceptContentType=" + this.m + ", boostType=" + this.n + ", gid1=" + this.o + "}";
    }
}

