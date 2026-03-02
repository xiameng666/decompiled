import android.accounts.Account;
import j..util.Objects;

public final class fxue {
    public final Account a;
    public final Long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final String i;
    public final boolean j;
    public final Long k;
    public final Integer l;
    public final Boolean m;
    public final boolean n;
    public final Boolean o;
    public final Integer p;
    public final String q;
    public final boolean r;
    public final Boolean s;
    private final boolean t;

    public fxue(fxud fxud0) {
        batl.t(fxud0.a, "account");
        this.a = fxud0.a;
        this.b = fxud0.b;
        this.c = fxud0.c;
        this.d = fxud0.d;
        this.t = false;
        this.e = fxud0.e;
        this.f = fxud0.f;
        this.g = fxud0.g;
        this.h = fxud0.h;
        this.i = fxud0.i;
        this.j = fxud0.j;
        this.k = fxud0.k;
        this.l = fxud0.l;
        this.m = fxud0.m;
        this.o = fxud0.n;
        this.p = fxud0.p;
        this.n = fxud0.o;
        this.q = fxud0.q;
        this.r = fxud0.r;
        this.s = fxud0.s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fxue) ? this.a.equals(((fxue)object0).a) && Objects.equals(this.b, ((fxue)object0).b) && this.c == ((fxue)object0).c && this.d == ((fxue)object0).d && this.e == ((fxue)object0).e && Objects.equals(this.f, ((fxue)object0).f) && Objects.equals(this.g, ((fxue)object0).g) && Objects.equals(this.h, ((fxue)object0).h) && Objects.equals(this.i, ((fxue)object0).i) && this.j == ((fxue)object0).j && Objects.equals(this.k, ((fxue)object0).k) && Objects.equals(this.l, ((fxue)object0).l) && Objects.equals(this.m, ((fxue)object0).m) && Objects.equals(this.o, ((fxue)object0).o) && Objects.equals(this.p, ((fxue)object0).p) && this.n == ((fxue)object0).n && this.r == ((fxue)object0).r && Objects.equals(this.s, ((fxue)object0).s) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(false), Boolean.valueOf(this.e), this.f, this.g, this.h, this.i, Boolean.valueOf(this.j), this.k, this.l, this.m, this.o, this.p, Boolean.valueOf(this.n), Boolean.valueOf(this.r), this.s});
    }

    @Override
    public final String toString() {
        return "ConfigUpdate{account=" + cnug.a(this.a) + ", referenceUpdateNumber=" + this.b + ", unconditional=" + this.c + ", uiUpdate=" + this.d + ", ulrRelatedSettingUpdate=false, shouldNotSync=" + this.e + ", reportingEnabled=" + this.f + ", historyEnabled=" + this.g + ", adsSubconsentEnabled=" + this.h + ", causePackage=" + this.i + ", clearCausePackage=" + this.j + ", serverMillis=" + this.k + ", restriction=" + this.l + ", dirty=" + this.m + ", primaryDevice=" + this.o + ", accountType=" + this.p + ", auditToken=" + this.q + ", isAuditable=" + this.r + ", hasMigratedToOdlh=" + this.s + "}";
    }
}

