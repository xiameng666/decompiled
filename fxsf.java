import android.accounts.Account;
import com.google.android.gms.location.reporting.Deletion;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class fxsf {
    public final Long a;
    public final Boolean b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final Boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final Boolean k;
    private final Boolean l;
    private final List m;

    public fxsf(fxse fxse0) {
        this.a = fxse0.a;
        this.b = fxse0.b;
        this.c = fxse0.c;
        this.d = fxse0.d;
        this.e = fxse0.e;
        this.f = fxse0.f;
        this.g = fxse0.g;
        this.h = fxse0.h;
        this.i = fxse0.i;
        this.m = fxse0.j;
        this.l = null;
        this.j = fxse0.k;
        this.k = fxse0.l;
    }

    public static int a(int v) {
        if(v != 0 && v != 1 && v != 2) {
            String s = "Unknown account type: " + v;
            fxqw.g(s, new Exception(s));
            return 0;
        }
        return v;
    }

    public static fxsf b(Account account0, gzvd gzvd0) {
        int v4;
        int v = gzva.a(gzvd0.h);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        if(v == 2) {
            fxqw.j(("Server reports: " + gzvd0 + " for " + cnug.a(account0)));
            v = 2;
        }
        int v2 = 3;
        int v3 = v == 3 ? -1 : 0;
        if((gzvd0.b & 0x40) == 0) {
            v4 = 0;
        }
        else {
            switch((gzvc.a(gzvd0.g) == 0 ? 1 : gzvc.a(gzvd0.g)) - 1) {
                case 1: {
                    v2 = 1;
                    break;
                }
                case 2: {
                    v2 = 2;
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    v2 = 4;
                    break;
                }
                case 5: {
                    v2 = 5;
                    break;
                }
                case 6: {
                    v2 = 6;
                    break;
                }
                case 10: {
                    if(hzek.s()) {
                        v2 = 0;
                        break;
                    }
                    else {
                        v2 = -1;
                    }
                    break;
                }
                case 11: {
                    v2 = hzek.u() ? 0 : -1;
                    break;
                }
                case 8: 
                case 9: 
                case 12: {
                    v2 = 0;
                    break;
                }
                default: {
                    v2 = -1;
                }
            }
            switch((gzvc.a(gzvd0.g) == 0 ? 1 : gzvc.a(gzvd0.g)) - 1) {
                case 8: {
                    v3 = v2;
                    v4 = 1;
                    break;
                }
                case 10: {
                    if(hzek.s()) {
                        v3 = v2;
                        v4 = 2;
                        break;
                    }
                    else {
                        v3 = v2;
                        v4 = 0;
                    }
                    break;
                }
                case 11: {
                    if(hzek.u()) {
                        v3 = v2;
                        v4 = 2;
                    }
                    else {
                        v3 = v2;
                        v4 = 0;
                    }
                    break;
                }
                case 9: 
                case 12: {
                    v3 = v2;
                    v4 = 2;
                    break;
                }
                default: {
                    v3 = v2;
                    v4 = 0;
                }
            }
        }
        fxse fxse0 = new fxse();
        if((gzvd0.b & 1) != 0) {
            fxse0.a = (long)gzvd0.c;
        }
        if((4 & gzvd0.b) != 0) {
            fxse0.b = Boolean.valueOf(gzvd0.e);
        }
        if((2 & gzvd0.b) != 0) {
            fxse0.d = Boolean.valueOf(gzvd0.d);
        }
        if(hzeq.h() && (gzvd0.b & 0x1000) != 0) {
            fxse0.l = Boolean.valueOf(gzvd0.l);
        }
        if(hzeq.c() && (gzvd0.b & 8) != 0) {
            fxse0.f = Boolean.valueOf((gzvd0.f == null ? gztt.a : gzvd0.f).c);
        }
        fxse0.g = v3;
        fxse0.h = v - 1;
        if((gzvd0.b & 0x200) == 0) {
            v1 = 0;
        }
        else {
            int v5 = gzuy.a(gzvd0.i);
            if(v5 != 0) {
                v1 = v5;
            }
        }
        fxse0.i = v1;
        hfuo hfuo0 = gzvd0.j;
        ArrayList arrayList0 = new ArrayList();
        if(hfuo0 != null) {
            for(Object object0: hfuo0) {
                arrayList0.add(new Deletion(account0, ((gzsy)object0).c, ((gzsy)object0).d, ((gzsy)object0).b));
            }
        }
        fxse0.j = new ArrayList(arrayList0);
        fxse0.k = v4;
        return new fxsf(fxse0);
    }

    public final List c() {
        return DesugarCollections.unmodifiableList(this.m);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fxsf) ? Objects.equals(this.a, ((fxsf)object0).a) && Objects.equals(this.b, ((fxsf)object0).b) && Objects.equals(this.c, ((fxsf)object0).c) && Objects.equals(this.d, ((fxsf)object0).d) && Objects.equals(this.e, ((fxsf)object0).e) && Objects.equals(this.f, ((fxsf)object0).f) && Objects.equals(this.m, ((fxsf)object0).m) && Objects.equals(null, null) && Objects.equals(this.k, ((fxsf)object0).k) && this.g == ((fxsf)object0).g && this.h == ((fxsf)object0).h && this.i == ((fxsf)object0).i && this.j == ((fxsf)object0).j : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.d, this.f, ((int)this.g), ((int)this.h), ((int)this.i), this.m, 0, ((int)this.j), this.k});
    }

    @Override
    public final String toString() {
        return hzeq.a.b().a() ? "GetSettingsResults{modMillis=" + this.a + ", reportingEnabled=" + this.b + ", reportingSource=" + this.c + ", historyEnabled=" + this.d + ", historySource=" + this.e + ", adsSubconsentEnabled=" + this.f + ", userRestriction=" + this.g + ", source=" + this.h + ", concurrencyType=" + this.i + ", deletions=" + this.m.size() + ", primaryDevice=null, accountType=" + this.j + ", hasMigratedToOdlh=" + this.k + "}" : "GetSettingsResults{mModMillis=" + this.a + ", mReportingEnabled=" + this.b + ", mReportingSource=" + this.c + ", mHistoryEnabled=" + this.d + ", mHistorySource=" + this.e + ", mAdsSubconsentEnabled=" + this.f + ", mUserRestriction=" + this.g + ", mSource=" + this.h + ", mConcurrencyType=" + this.i + ", mDeletions=" + this.m + ", mPrimaryDevice=null, mAccountType=" + this.j + "}";
    }
}

