import android.content.Context;

public final class aiip {
    public Context a;
    public aztw b;
    public fdjo c;
    public fdkg d;

    public aiip() {
    }

    public aiip(Context context0, aztw aztw0, fdjo fdjo0, fdkg fdkg0) {
        this.a = context0;
        this.b = aztw0;
        this.c = fdjo0;
        this.d = fdkg0;
    }

    public final aiiq a(String s) {
        return this.b(s, new byte[0]);
    }

    public final aiiq b(String s, byte[] arr_b) {
        gftb.check(this.b);
        gftb.check(this.c);
        gftb.check(this.d);
        return new aiiq(this.a, this.b, this.c, this.d, s, arr_b);
    }
}

