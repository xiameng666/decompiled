import android.content.SharedPreferences.Editor;
import j..util.Objects;

public final class crju {
    final crjx a;
    private final String b;
    private final long c;
    private boolean d;
    private long e;

    public crju(crjx crjx0, String s, long v) {
        Objects.requireNonNull(crjx0);
        this.a = crjx0;
        super();
        batl.q(s);
        this.b = s;
        this.c = v;
    }

    public final long a() {
        if(!this.d) {
            this.d = true;
            this.e = this.a.b().getLong(this.b, this.c);
        }
        return this.e;
    }

    public final void b(long v) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.a.b().edit();
        sharedPreferences$Editor0.putLong(this.b, v);
        sharedPreferences$Editor0.apply();
        this.e = v;
    }
}

