import android.content.SharedPreferences.Editor;
import j..util.Objects;

public final class absi {
    public final long a;
    final absj b;
    private final String c;

    public absi(absj absj0, long v) {
        Objects.requireNonNull(absj0);
        this.b = absj0;
        super();
        batl.q("monitoring");
        batl.b(v > 0L);
        this.c = "monitoring";
        this.a = v;
    }

    public final long a() {
        String s = this.e();
        return this.b.a.getLong(s, 0L);
    }

    public final String b() {
        return this.c + ":count";
    }

    protected final String c() {
        return this.c + ":value";
    }

    public final void d() {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.b.a.edit();
        sharedPreferences$Editor0.remove(this.b());
        sharedPreferences$Editor0.remove(this.c());
        sharedPreferences$Editor0.putLong(this.e(), System.currentTimeMillis());
        sharedPreferences$Editor0.commit();
    }

    private final String e() {
        return this.c + ":start";
    }
}

