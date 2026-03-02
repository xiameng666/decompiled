import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;

public final class ajfw {
    public final Object a;
    public final SharedPreferences b;
    public final baun c;
    private final int d;

    public ajfw(Context context0, Account account0) {
        this.c = new baun(new String[]{"ClientDirectiveStore"}, null);
        this.a = new Object();
        this.b = context0.getSharedPreferences("com.google.android.gms.auth.cryptauth.datastore.sharedpreferences.ClientDirective", 0);
        this.d = account0.name.hashCode();
    }

    public final long a() {
        String s = this.d("currentretryattempt");
        return this.b.getLong(s, 0L);
    }

    public final long b() {
        String s = this.d("retryperiod");
        long v = hpta.c();
        return this.b.getLong(s, v);
    }

    public final long c() {
        String s = this.d("retryattempts");
        long v = hpta.a.g().c();
        return this.b.getLong(s, v);
    }

    public final String d(String s) {
        return s + this.d;
    }

    public final void e() {
        synchronized(this.a) {
            this.b.edit().putLong(this.d("currentretryattempt"), 0L).commit();
        }
    }

    public final void f() {
        long v = this.a();
        synchronized(this.a) {
            this.b.edit().putLong(this.d("currentretryattempt"), v + 1L).commit();
        }
    }
}

