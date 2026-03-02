import android.content.Intent;

public final class ehpq {
    public final hgiq a;
    public final String b;
    public final ehpr c;
    public final ibts d;
    public final boolean e;
    public final Intent f;
    public final String g;
    public final boolean h;
    private final ibts i;

    public ehpq(hgiq hgiq0, String s, ehpr ehpr0, ibts ibts0, boolean z, Intent intent0, String s1, boolean z1) {
        ibuq.f(hgiq0, "userServiceId");
        ibuq.f(s, "title");
        ibuq.f(s1, "learnMoreDescription");
        super();
        this.a = hgiq0;
        this.b = s;
        this.c = ehpr0;
        this.d = ibts0;
        this.e = z;
        this.f = intent0;
        this.i = null;
        this.g = s1;
        this.h = z1;
    }

    public static final void a(ibth ibth0) {
        ((cmeb)ibth0.a()).a(gltz.e);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ehpq)) {
            return false;
        }
        if(this.a != ((ehpq)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((ehpq)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((ehpq)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((ehpq)object0).d)) {
            return false;
        }
        if(this.e != ((ehpq)object0).e) {
            return false;
        }
        if(!ibuq.m(this.f, ((ehpq)object0).f)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        return ibuq.m(this.g, ((ehpq)object0).g) ? this.h == ((ehpq)object0).h : false;
    }

    @Override
    public final int hashCode() {
        int v = ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
        return this.f == null ? ((v * 0x1F + ehpo.a(this.e)) * 0x1F * 961 + this.g.hashCode()) * 0x1F + ehpo.a(this.h) : (((v * 0x1F + ehpo.a(this.e)) * 0x1F + this.f.hashCode()) * 961 + this.g.hashCode()) * 0x1F + ehpo.a(this.h);
    }

    @Override
    public final String toString() {
        return "ServiceUiState(userServiceId=" + this.a + ", title=" + this.b + ", summaryInfo=" + this.c + ", onLearnMoreClick=" + this.d + ", highlight=" + this.e + ", launchIntent=" + this.f + ", onPreferenceClick=null, learnMoreDescription=" + this.g + ", isSelectable=" + this.h + ")";
    }
}

