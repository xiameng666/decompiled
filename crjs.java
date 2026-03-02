import android.content.SharedPreferences.Editor;
import j..util.Objects;

public final class crjs {
    final crjx a;
    private final String b;
    private final boolean c;
    private boolean d;
    private boolean e;

    public crjs(crjx crjx0, String s, boolean z) {
        Objects.requireNonNull(crjx0);
        this.a = crjx0;
        super();
        batl.q(s);
        this.b = s;
        this.c = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.a.b().edit();
        sharedPreferences$Editor0.putBoolean(this.b, z);
        sharedPreferences$Editor0.apply();
        this.e = z;
    }

    public final boolean b() {
        if(!this.d) {
            this.d = true;
            this.e = this.a.b().getBoolean(this.b, this.c);
        }
        return this.e;
    }
}

