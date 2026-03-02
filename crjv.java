import android.content.SharedPreferences.Editor;
import j..util.Objects;

public final class crjv {
    final String a;
    public final String b;
    public final String c;
    public final long d;
    final crjx e;

    public crjv(crjx crjx0, long v) {
        Objects.requireNonNull(crjx0);
        this.e = crjx0;
        super();
        batl.q("health_monitor");
        batl.b(v > 0L);
        this.a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.d = v;
    }

    public final long a() {
        return this.e.b().getLong(this.a, 0L);
    }

    public final void b() {
        this.e.n();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.e.b().edit();
        sharedPreferences$Editor0.remove(this.b);
        sharedPreferences$Editor0.remove(this.c);
        sharedPreferences$Editor0.putLong(this.a, System.currentTimeMillis());
        sharedPreferences$Editor0.apply();
    }
}

