import android.content.Context;

public final class ejyn extends azts {
    private static final azta_api a;
    private static final azss b;
    private static final azsy c;

    static {
        azss azss0 = new azss();
        ejyn.b = azss0;
        ejyg ejyg0 = new ejyg();
        ejyn.c = ejyg0;
        ejyn.a = new azta_api("Romanesco.API", ejyg0, azss0);
    }

    public ejyn(Context context0) {
        super(context0, ejyn.a, null, aztr_settings.a);
    }

    public final evql e(String s, long v) {
        azzc azzc0 = new azzc();
        azzc0.a = new ejxz(this, s, v);
        azzc0.d = 20404;
        return this.iG(azzc0.a());
    }

    public final evql f(String s) {
        azzc azzc0 = new azzc();
        azzc0.d = 20403;
        azzc0.a = new ejya(this, s);
        return this.iG(azzc0.a());
    }
}

