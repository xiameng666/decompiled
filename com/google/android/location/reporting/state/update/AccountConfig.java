package com.google.android.location.reporting.state.update;

import a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import cnug;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.location.reporting.state.utils.InactiveReason;
import fxra;
import fxtx;
import fxty;
import fxux;
import hzeq;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class AccountConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Account a;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final String h;
    public final long i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final Conditions m;
    public final int n;
    public final String o;
    public final Long p;
    public final Long q;
    public final boolean r;
    public final int s;
    public final boolean t;
    public final boolean u;

    static {
        AccountConfig.CREATOR = new fxty();
    }

    public AccountConfig(Account account0, boolean z, long v, boolean z1, boolean z2, String s, boolean z3, String s1, long v1, int v2, boolean z4, boolean z5, Conditions conditions0, int v3, String s2, Long long0, Long long1, boolean z6, int v4, boolean z7, boolean z8) {
        this.a = account0;
        this.b = z;
        this.c = v;
        this.d = z1;
        this.e = z2;
        this.f = s;
        this.g = z3;
        this.h = s1;
        this.i = v1;
        this.j = v2;
        this.k = z4;
        this.l = z5;
        this.m = conditions0;
        this.n = v3;
        this.p = long0;
        this.o = s2;
        this.q = long1;
        this.r = z6;
        this.s = v4;
        this.t = z7;
        this.u = z8;
    }

    public AccountConfig(fxtx fxtx0) {
        batl.s(fxtx0.a);
        this.a = fxtx0.a;
        this.b = fxtx0.c.booleanValue();
        this.c = (long)fxtx0.b;
        this.d = fxtx0.d.booleanValue();
        this.e = fxtx0.i.booleanValue();
        this.f = fxtx0.j;
        this.g = fxtx0.k.booleanValue();
        this.h = fxtx0.l;
        this.i = (long)fxtx0.g;
        this.j = (int)fxtx0.h;
        this.k = fxtx0.f.booleanValue();
        this.l = fxtx0.e.booleanValue();
        Conditions conditions0 = fxtx0.m;
        batl.s(conditions0);
        this.m = conditions0;
        this.n = (int)fxtx0.n;
        this.p = fxtx0.p;
        this.o = fxtx0.o;
        this.q = fxtx0.q;
        this.r = fxtx0.r.booleanValue();
        this.s = (int)fxtx0.s;
        this.t = fxtx0.t.booleanValue();
        this.u = fxtx0.u.booleanValue();
    }

    public final int a() {
        return this.l(this.g);
    }

    public final int b() {
        return this.l(this.e);
    }

    public final ReportingState c(int v, int v1, boolean z, boolean z1) {
        int v2 = this.b();
        int v3 = this.a();
        boolean z2 = this.h();
        boolean z3 = this.j();
        Integer integer0 = z ? ((int)this.n) : null;
        return hzeq.h() ? new ReportingState(v2, v3, z2, z3, v, v1, integer0, z1, this.t) : new ReportingState(v2, v3, z2, z3, v, v1, integer0, z1, false);
    }

    public final List d() {
        InactiveReason inactiveReason0;
        List list0 = this.e();
        if(!list0.isEmpty()) {
            return list0;
        }
        if(!this.d) {
            list0.add(new InactiveReason(5, "NotGoogleAccountOnDevice"));
        }
        if(!this.k) {
            list0.add(new InactiveReason(10, "AuthError"));
        }
        if(!this.e) {
            list0.add(new InactiveReason(6, "ReportingNotEnabled"));
        }
        if(!this.g) {
            list0.add(new InactiveReason(14, "HistoryNotEnabled"));
        }
        switch(this.j) {
            case 0: {
                inactiveReason0 = null;
                break;
            }
            case 1: {
                inactiveReason0 = new InactiveReason(7, "AgeUnder13");
                break;
            }
            case 2: {
                inactiveReason0 = new InactiveReason(7, "AgeUnknown");
                break;
            }
            case 3: {
                inactiveReason0 = new InactiveReason(7, "DasherPolicy");
                break;
            }
            case 4: {
                inactiveReason0 = new InactiveReason(7, "LegalCountry");
                break;
            }
            case 5: {
                inactiveReason0 = new InactiveReason(7, "AccountDeleted");
                break;
            }
            case 6: {
                inactiveReason0 = new InactiveReason(7, "AccountPurged");
                break;
            }
            default: {
                inactiveReason0 = new InactiveReason(7, "UnknownRestriction");
            }
        }
        if(inactiveReason0 != null) {
            list0.add(inactiveReason0);
        }
        return DesugarCollections.unmodifiableList(list0);
    }

    public final List e() {
        return this.m.c();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof AccountConfig) ? this.a.equals(((AccountConfig)object0).a) && this.b == ((AccountConfig)object0).b && this.c == ((AccountConfig)object0).c && this.d == ((AccountConfig)object0).d && this.e == ((AccountConfig)object0).e && Objects.equals(this.f, ((AccountConfig)object0).f) && this.g == ((AccountConfig)object0).g && Objects.equals(this.h, ((AccountConfig)object0).h) && this.i == ((AccountConfig)object0).i && this.j == ((AccountConfig)object0).j && this.k == ((AccountConfig)object0).k && this.l == ((AccountConfig)object0).l && this.m.equals(((AccountConfig)object0).m) && this.n == ((AccountConfig)object0).n && this.r == ((AccountConfig)object0).r && this.s == ((AccountConfig)object0).s && Objects.equals(this.p, ((AccountConfig)object0).p) && Objects.equals(this.q, ((AccountConfig)object0).q) && Objects.equals(this.o, ((AccountConfig)object0).o) && this.t == ((AccountConfig)object0).t && this.u == ((AccountConfig)object0).u : false;
    }

    public final boolean f() {
        boolean z = this.g();
        if(z && !this.m.d) {
            fxra.g("OptInWithLocationOff");
            return true;
        }
        return z;
    }

    public final boolean g() {
        return this.h() && this.k;
    }

    public final boolean h() {
        return this.i() && this.d && !this.k();
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, Boolean.valueOf(this.b), ((long)this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g), this.h, ((long)this.i), ((int)this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), this.m, ((int)this.n), this.o, this.p, this.q, Boolean.valueOf(this.r), ((int)this.s), Boolean.valueOf(this.t), Boolean.valueOf(this.u)});
    }

    public final boolean i() {
        return this.m.d();
    }

    public final boolean j() {
        return this.d().isEmpty() && this.m.d;
    }

    public final boolean k() {
        return this.j != 0;
    }

    private final int l(boolean z) {
        if(this.b) {
            return z ? 1 : -1;
        }
        return 0;
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        fxux.b("account", cnug.a(this.a), arrayList0);
        fxux.b("isActive", Boolean.valueOf(this.j()), arrayList0);
        fxux.b("defined", Boolean.valueOf(this.b), arrayList0);
        fxux.b("updateNumber", Long.valueOf(this.c), arrayList0);
        fxux.b("validAccount", Boolean.valueOf(this.d), arrayList0);
        fxux.b("reportingEnabled", Boolean.valueOf(this.e), arrayList0);
        fxux.b("reportingPackage", this.f, arrayList0);
        fxux.b("historyEnabled", Boolean.valueOf(this.g), arrayList0);
        fxux.b("historyPackage", this.h, arrayList0);
        fxux.b("serverMillis", Long.valueOf(this.i), arrayList0);
        fxux.b("restriction", Integer.valueOf(this.j), arrayList0);
        fxux.b("authorized", Boolean.valueOf(this.k), arrayList0);
        fxux.b("dirty", Boolean.valueOf(this.l), arrayList0);
        fxux.b("conditions", this.m, arrayList0);
        fxux.b("deviceTag", cnug.d(Integer.valueOf(this.n)), arrayList0);
        fxux.b("devicePrettyName", (this.o == null ? "null" : a.a(this.o, "\"", "\"")), arrayList0);
        fxux.b("gcmIdUploadTime", this.p, arrayList0);
        fxux.b("lastUploadTimeMs", this.q, arrayList0);
        fxux.b("primaryDevice", Boolean.valueOf(this.r), arrayList0);
        fxux.b("accountType", Integer.valueOf(this.s), arrayList0);
        fxux.b("hasMigratedToOdlh", Boolean.valueOf(this.t), arrayList0);
        fxux.b("adsSubconsentEnabled", Boolean.valueOf(this.u), arrayList0);
        return fxux.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.e(parcel0, 3, this.b);
        baub.q(parcel0, 4, this.c);
        baub.e(parcel0, 5, this.d);
        baub.e(parcel0, 6, this.e);
        baub.v(parcel0, 7, this.f, false);
        baub.e(parcel0, 8, this.g);
        baub.v(parcel0, 9, this.h, false);
        baub.q(parcel0, 10, this.i);
        baub.o(parcel0, 11, this.j);
        baub.e(parcel0, 12, this.k);
        baub.e(parcel0, 13, this.l);
        baub.t(parcel0, 14, this.m, v, false);
        baub.o(parcel0, 15, this.n);
        baub.v(parcel0, 16, this.o, false);
        baub.I(parcel0, 17, this.p);
        baub.I(parcel0, 18, this.q);
        baub.e(parcel0, 19, this.r);
        baub.o(parcel0, 20, this.s);
        baub.e(parcel0, 22, this.t);
        baub.e(parcel0, 23, this.u);
        baub.c(parcel0, v1);
    }
}

