import android.content.SharedPreferences.Editor;
import j..util.Objects;

public final class crjw {
    final crjx a;
    private final String b;
    private boolean c;
    private String d;

    public crjw(crjx crjx0, String s) {
        Objects.requireNonNull(crjx0);
        this.a = crjx0;
        super();
        batl.q(s);
        this.b = s;
    }

    public final String a() {
        if(!this.c) {
            this.c = true;
            this.d = this.a.b().getString(this.b, null);
        }
        return this.d;
    }

    public final void b(String s) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.a.b().edit();
        sharedPreferences$Editor0.putString(this.b, s);
        sharedPreferences$Editor0.apply();
        this.d = s;
    }
}

