import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Set;

public final class fxtw {
    public final Context a;
    public final SharedPreferences b;
    public final fxub c;
    public final fvrv d;

    public fxtw(Context context0, SharedPreferences sharedPreferences0, fxub fxub0, fvrv fvrv0) {
        this.a = context0;
        this.d = fvrv0;
        this.c = fxub0;
        this.b = sharedPreferences0;
    }

    public final long a(Account account0) {
        String s = fxtw.r(account0);
        return this.b.getLong(s, 0L);
    }

    public final AccountConfig b(Account account0) {
        fxtx fxtx0 = new fxtx(account0);
        this.y(account0, fxtx0);
        fxtx0.b(0);
        fxtx0.p = null;
        fxtx0.a(true);
        return new AccountConfig(fxtx0);
    }

    public static String c(Account account0) {
        return fxtv.a(account0).s;
    }

    public static String d(Account account0) {
        return fxtv.a(account0).u;
    }

    public static String e(Account account0) {
        return fxtv.a(account0).w;
    }

    public static String f(Account account0) {
        return fxtv.a(account0).y;
    }

    public static String g(Account account0) {
        return fxtv.a(account0).x;
    }

    public static String h(Account account0) {
        return fxtv.a(account0).i;
    }

    public static String i(Account account0) {
        return fxtv.a(account0).v;
    }

    public static String j(Account account0) {
        return fxtv.a(account0).t;
    }

    public static String k(Account account0) {
        return fxtv.a(account0).p;
    }

    public static String l(Account account0) {
        return fxtv.a(account0).q;
    }

    public static String m(Account account0) {
        return fxtv.a(account0).r;
    }

    public static String n(Account account0) {
        return fxtv.a(account0).n;
    }

    public static String o(Account account0) {
        return fxtv.a(account0).o;
    }

    public static String p(Account account0) {
        return fxtv.a(account0).m;
    }

    public static String q(Account account0) {
        return fxtv.a(account0).j;
    }

    public static String r(Account account0) {
        return fxtv.a(account0).k;
    }

    public final void s(SharedPreferences.Editor sharedPreferences$Editor0, boolean z, String s, String s1, boolean z1) {
        ReportingConfig reportingConfig0 = this.z();
        sharedPreferences$Editor0.apply();
        ReportingConfig reportingConfig1 = this.z();
        if(!z1 && !z) {
            bxe bxe0 = new bxe(((bxf)reportingConfig1.d()));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                AccountConfig accountConfig0 = reportingConfig1.a(((Account)object0));
                AccountConfig accountConfig1 = reportingConfig0.a(((Account)object0));
                if(accountConfig1 == null || !accountConfig0.i() || (accountConfig0.s == 1 || accountConfig0.s == 2) || !accountConfig0.j() || accountConfig1.j()) {
                    continue;
                }
                int v = gzwh.a(((int)hzen.b()));
                if(v == 0) {
                    throw null;
                }
                if(v - 1 != 1 && v - 1 != 2) {
                    switch(v - 1) {
                        case 3: {
                            fxra.g("UlrBetaShowNotification");
                            break;
                        }
                        case 4: {
                            fxra.g("UlrProdShowNotification");
                        }
                    }
                }
                else {
                    fxra.g("UlrDevShowNotification");
                }
                continue;
            }
        }
        Set set0 = reportingConfig0.d();
        set0.addAll(reportingConfig1.d());
        StringBuilder stringBuilder0 = new StringBuilder();
        bxe bxe1 = new bxe(((bxf)set0));
        while(bxe1.hasNext()) {
            Object object1 = bxe1.next();
            Account account0 = (Account)object1;
            AccountConfig accountConfig2 = reportingConfig0.a(account0);
            AccountConfig accountConfig3 = reportingConfig1.a(account0);
            fxuk fxuk0 = new fxuk(accountConfig2);
            fxuk fxuk1 = new fxuk(accountConfig3);
            if(!fxuk0.equals(fxuk1)) {
                stringBuilder0.append(cnug.a(account0));
                stringBuilder0.append(": ");
                String s2 = fxuk.b(fxuk0.a, fxuk1.a);
                String s3 = fxuk.b(fxuk0.b, fxuk1.b);
                stringBuilder0.append(a.ai((Objects.equals(fxuk0.c, fxuk1.c) ? fxuk1.a() : fxuk0.a() + " -> " + fxuk1.a()), s3, s2, "LR=", ", LH=", ", "));
                stringBuilder0.append("; ");
            }
        }
        String s4 = stringBuilder0.toString();
        if(!s4.isEmpty()) {
            fxqw.c("GCoreUlrLong", s + " at " + System.currentTimeMillis() + ": " + s4);
        }
        fxtk.e(this.a, s1);
    }

    public final boolean t(Account account0) {
        String s = fxtw.k(account0);
        return this.b.contains(s);
    }

    public final boolean u(Account account0) {
        String s = fxtw.n(account0);
        return this.b.contains(s);
    }

    final boolean v(Account account0) {
        return this.u(account0) || this.t(account0);
    }

    public final boolean w(Account account0) {
        String s = fxtw.k(account0);
        return this.b.getBoolean(s, false);
    }

    public final boolean x(Account account0) {
        String s = fxtw.n(account0);
        return this.b.getBoolean(s, false);
    }

    final void y(Account account0, fxtx fxtx0) {
        fxtx0.c = Boolean.valueOf(this.v(account0));
        fxtx0.b = this.a(account0);
        fxtx0.d = Boolean.valueOf(this.d.d(account0));
        fxtx0.i = Boolean.valueOf(this.x(account0));
        SharedPreferences sharedPreferences0 = this.b;
        fxtx0.j = sharedPreferences0.getString(fxtw.o(account0), null);
        fxtx0.k = Boolean.valueOf(this.w(account0));
        fxtx0.l = sharedPreferences0.getString(fxtw.l(account0), null);
        fxtx0.g = sharedPreferences0.getLong(fxtw.q(account0), 0x8000000000000000L);
        int v = sharedPreferences0.getInt(fxtw.p(account0), 0);
        switch(v) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                break;
            }
            default: {
                v = -1;
            }
        }
        fxtx0.h = v;
        fxtx0.e = Boolean.valueOf(sharedPreferences0.getBoolean(fxtw.h(account0), false));
        fxtx0.m = this.c.a();
        fxtx0.o = Build.MODEL;
        fxtx0.r = Boolean.valueOf(sharedPreferences0.getBoolean(fxtw.m(account0), true));
        fxtx0.s = fxsf.a(sharedPreferences0.getInt(fxtw.c(account0), 0));
        fxtx0.t = Boolean.valueOf(sharedPreferences0.getBoolean(fxtw.j(account0), false));
        fxtx0.u = Boolean.valueOf(sharedPreferences0.getBoolean(fxtw.d(account0), false));
    }

    @Deprecated
    private final ReportingConfig z() {
        ArrayList arrayList0 = new ArrayList();
        Account[] arr_account = this.d.b();
        for(int v = 0; v < arr_account.length; ++v) {
            arrayList0.add(this.b(arr_account[v]));
        }
        return new ReportingConfig(arrayList0, this.c.a());
    }
}

