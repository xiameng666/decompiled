import android.content.Context;

@ibnh
public final class dlts {
    public static final bboh a;
    public final Context b;
    private final clht c;

    static {
        dlts.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlts(Context context0, clht clht0) {
        this.b = context0;
        this.c = clht0;
    }

    public final void a() {
        this.c.removeCallbacksAndMessages(null);
        dltr dltr0 = new dltr(this);
        this.c.post(dltr0);
    }

    public final void b(long v) {
        ((ggtj)((ggtj)dlts.a.h()).ar(9116)).A("Hospitality: BleManager stops Ble service in %d ms.", v);
        this.c.removeCallbacksAndMessages(null);
        dltq dltq0 = new dltq(this);
        this.c.postDelayed(dltq0, v);
    }
}

