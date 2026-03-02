import android.view.View.OnClickListener;

public final class dnfq {
    public final Integer a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final Boolean l;
    public final View.OnClickListener m;
    public final String n;
    public final String o;
    private final Integer p;
    private final Integer q;
    private final String r;
    private final String s;
    private final Boolean t;
    private final Boolean u;

    public dnfq(Integer integer0, String s, Integer integer1, Integer integer2, String s1, String s2, String s3, String s4, String s5, String s6, String s7, Boolean boolean0, View.OnClickListener view$OnClickListener0, String s8, String s9, int v) {
        ibuq.f(s1, "primaryText");
        super();
        String s10 = null;
        if(1 == (v & 1)) {
            integer0 = null;
        }
        this.a = integer0;
        if((v & 2) != 0) {
            s = null;
        }
        this.b = s;
        if((v & 4) != 0) {
            integer1 = null;
        }
        this.c = integer1;
        if((v & 8) != 0) {
            integer2 = null;
        }
        this.d = integer2;
        this.e = s1;
        if((v & 0x20) != 0) {
            s2 = null;
        }
        this.f = s2;
        if((v & 0x40) != 0) {
            s3 = null;
        }
        this.g = s3;
        if((v & 0x80) != 0) {
            s4 = null;
        }
        this.h = s4;
        if((v & 0x100) != 0) {
            s5 = null;
        }
        this.i = s5;
        if((v & 0x200) != 0) {
            s6 = null;
        }
        this.j = s6;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.k = (0x10000 & v) == 0 ? s7 : null;
        this.l = (0x20000 & v) == 0 ? boolean0 : null;
        this.m = (0x40000 & v) == 0 ? view$OnClickListener0 : null;
        this.n = (0x80000 & v) == 0 ? s8 : null;
        if((0x100000 & v) == 0) {
            s10 = s9;
        }
        this.o = s10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dnfq)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dnfq)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dnfq)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((dnfq)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((dnfq)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((dnfq)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((dnfq)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.g, ((dnfq)object0).g)) {
            return false;
        }
        if(!ibuq.m(this.h, ((dnfq)object0).h)) {
            return false;
        }
        if(!ibuq.m(this.i, ((dnfq)object0).i)) {
            return false;
        }
        if(!ibuq.m(this.j, ((dnfq)object0).j)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(this.k, ((dnfq)object0).k)) {
            return false;
        }
        if(!ibuq.m(this.l, ((dnfq)object0).l)) {
            return false;
        }
        if(!ibuq.m(this.m, ((dnfq)object0).m)) {
            return false;
        }
        return ibuq.m(this.n, ((dnfq)object0).n) ? ibuq.m(this.o, ((dnfq)object0).o) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((this.a == null ? 0 : this.a.hashCode()) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + this.e.hashCode()) * 0x1F;
        int v2 = this.f == null ? 0 : this.f.hashCode();
        int v3 = this.g == null ? 0 : this.g.hashCode();
        int v4 = this.h == null ? 0 : this.h.hashCode();
        int v5 = this.i == null ? 0 : this.i.hashCode();
        int v6 = this.j == null ? 0 : this.j.hashCode();
        int v7 = this.k == null ? 0 : this.k.hashCode();
        int v8 = this.l == null ? 0 : this.l.hashCode();
        int v9 = this.m == null ? 0 : this.m.hashCode();
        int v10 = this.n == null ? 0 : this.n.hashCode();
        String s = this.o;
        if(s != null) {
            v = s.hashCode();
        }
        return (((((((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x67E12CDF + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "FopDetailActionKt(iconResId=" + this.a + ", iconUrl=" + this.b + ", iconTintColor=" + this.c + ", iconSizePx=" + this.d + ", primaryText=" + this.e + ", secondaryText=" + this.f + ", secondaryTextContentDescription=" + this.g + ", tertiaryText=" + this.h + ", tertiaryTextContentDescription=" + this.i + ", bodyText=" + this.j + ", endIconResId=null, endIconTintColor=null, cobadgedToggleButtonPaymentNetworkPrimary=null, cobadgedToggleButtonPaymentNetworkAuxiliary=null, isDivider=null, isIssuerAppAction=null, actionButtonText=" + this.k + ", isChecked=" + this.l + ", onClickListener=" + this.m + ", actionText=" + this.n + ", disclaimerText=" + this.o + ")";
    }
}

