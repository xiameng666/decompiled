import android.content.Intent;

public final class dmkc {
    public static final bboh a;
    public final xni b;
    public final dllw c;
    public final dqfa d;

    static {
        dmkc.a = bboh.b("Pay", bbcu.cZ);
    }

    public dmkc(xni xni0, dllw dllw0, dqfa dqfa0) {
        this.b = xni0;
        this.c = dllw0;
        this.d = dqfa0;
    }

    public final void a(Intent intent0) {
        ibuq.f(intent0, "intent");
        icbb.b(lpt.a(this.b), null, null, new dmkb(this, intent0, null), 3);
    }
}

