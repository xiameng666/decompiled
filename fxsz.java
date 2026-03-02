import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.location.reporting.state.update.AccountConfig;

public final class fxsz {
    public final fxtr a;
    public final long b;
    public final bbng c;
    public final long d;
    private static fxsz e;

    private fxsz(fxtr fxtr0, bbng bbng0, long v) {
        this.a = fxtr0;
        this.c = bbng0;
        this.d = v;
        this.b = SystemClock.elapsedRealtime();
    }

    public static fxsz a(Context context0, fxtr fxtr0, bbng bbng0) {
        long v1;
        synchronized(fxsz.class) {
            if(fxsz.e == null) {
                SharedPreferences sharedPreferences0 = fxtu.a(context0).a;
                Long long0 = sharedPreferences0.contains("reportingAutoenableManagerInitTimeMillisKey") ? sharedPreferences0.getLong("reportingAutoenableManagerInitTimeMillisKey", 0L) : null;
                if(long0 == null) {
                    v1 = System.currentTimeMillis();
                    SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
                    sharedPreferences$Editor0.putLong("reportingAutoenableManagerInitTimeMillisKey", v1);
                    sharedPreferences$Editor0.apply();
                }
                else {
                    v1 = (long)long0;
                }
                fxsz.e = new fxsz(fxtr0, bbng0, v1);
            }
        }
        return fxsz.e;
    }

    public final void b(Account account0) {
        fxqw.c("GCoreUlr", "AutoEnableManager setIneligible for " + cnug.a(account0));
        String s = fxtw.e(account0);
        SharedPreferences.Editor sharedPreferences$Editor0 = this.a.c.b.edit();
        sharedPreferences$Editor0.putBoolean(s, false);
        sharedPreferences$Editor0.apply();
        this.a.i(account0, false);
        this.a.h(account0, false);
    }

    public final void c(Account account0) {
        boolean z = false;
        if(this.d(account0)) {
            if(this.d(account0) && this.f(account0) && this.e(account0) && this.a.c(account0).f()) {
                z = true;
            }
            this.d(account0);
            this.f(account0);
            this.e(account0);
            if(z) {
                fxqw.c("GCoreUlr", "AutoEnableManager setReportingEnabled for " + cnug.a(account0));
                fxtr fxtr0 = this.a;
                AccountConfig accountConfig0 = fxtr0.c(account0);
                if(accountConfig0.a() == 1) {
                    fxud fxud0 = new fxud(account0, "com.google.android.gms+autoenabled");
                    fxud0.b(accountConfig0.c);
                    fxud0.f = Boolean.valueOf(true);
                    fxud0.a(true);
                    fxtr0.l("ReportingAutoEnableManager.setReportingEnabled", new fxue(fxud0), "autoenable");
                    if(hzeq.d()) {
                        fxra.k("UlrAutoEnableEvents", 1);
                    }
                    this.b(account0);
                    if(hzeq.d()) {
                        fxra.k("UlrAutoEnableEvents", 7);
                    }
                }
                else {
                    this.b(account0);
                    if(hzeq.d()) {
                        fxra.k("UlrAutoEnableEvents", 6);
                    }
                }
            }
        }
    }

    public final boolean d(Account account0) {
        if(hzek.a.i().af()) {
            String s = fxtw.e(account0);
            return this.a.c.b.getBoolean(s, true);
        }
        return false;
    }

    final boolean e(Account account0) {
        String s = fxtw.f(account0);
        return this.a.c.b.getBoolean(s, false);
    }

    final boolean f(Account account0) {
        String s = fxtw.g(account0);
        return this.a.c.b.getBoolean(s, false);
    }
}

