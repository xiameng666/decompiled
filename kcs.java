import java.util.logging.Level;

public final class kcs implements Runnable {
    public final kct a;
    public final hjli b;
    public final djgk c;

    public kcs(kct kct0, hjli hjli0, djgk djgk0) {
        this.a = kct0;
        this.b = hjli0;
        this.c = djgk0;
    }

    @Override
    public final void run() {
        hjli hjli0 = this.b;
        byte[] arr_b = hjli0.a.toBytes();
        kcu kcu0 = this.a.a;
        if(kcu0.k.d) {
            arr_b = kbr.f(arr_b);
        }
        kdd kdd0 = kdd.a(arr_b);
        kcu0.i(kdd0);
        int v = hjli0.b == 1 ? 1 : 0;
        ((ggtj)djir.a.g(Level.INFO).ar(9031)).P("Peer %s disconnected for reason %s", kdd0, v);
        byte[] arr_b1 = kdd0.a.d();
        this.c.a.e(arr_b1, v);
    }
}

