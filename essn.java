import j..util.Objects;
import java.nio.ByteBuffer;
import java.util.logging.Level;

final class essn implements essh {
    final esso a;

    public essn(esso esso0) {
        Objects.requireNonNull(esso0);
        this.a = esso0;
        super();
    }

    @Override  // essh
    public final int a() {
        return this.a.c;
    }

    @Override  // essh
    public final String b() {
        byte[] arr_b = new byte[estb.b.Y];
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.a.d.s);
        byteBuffer0.position(estb.b.X);
        byteBuffer0.get(arr_b, 0, estb.b.Y);
        return essz.a(arr_b);
    }

    @Override  // essh
    public final boolean d() {
        return true;
    }

    @Override  // essh
    public final byte[] e(byte[] arr_b) {
        esso.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayContactlessSession$1", "updateAccumulators", esso.b + "updateAccumulators in RupayContactlessSession");
        esso.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayContactlessSession", "getCachedData", esso.b + "getCachedData in RupayContactlessSession starts");
        essp essp0 = this.a.d;
        byte[] arr_b1 = esso.c(essp0.f());
        byte[] arr_b2 = esso.c(essp0.d());
        byte[] arr_b3 = esso.c(essp0.e());
        byte[] arr_b4 = essp0.aa();
        byte[] arr_b5 = essp0.Y();
        byte[] arr_b6 = essp0.Z();
        byte[] arr_b7 = essp0.X();
        byte[] arr_b8 = arr_b6 == null ? essy.d(essy.a(0x77, new esss[]{essy.c(0xDF10, essp0.s), essy.c(0xDF27, essp0.t), essy.c(0xDF11, arr_b1), essy.c(0xDF12, arr_b2), essy.c(0xDF14, arr_b3), essy.c(0xDF13, arr_b4), essy.c(0xDF17, arr_b5), essy.c(0xDF23, arr_b7), essy.c(0xDF25, essp0.G()), essy.b(0xDF26, essp0.r)})) : essy.d(essy.a(0x77, new esss[]{essy.c(0xDF10, essp0.s), essy.c(0xDF27, essp0.t), essy.c(0xDF11, arr_b1), essy.c(0xDF12, arr_b2), essy.c(0xDF14, arr_b3), essy.c(0xDF13, arr_b4), essy.c(0xDF17, arr_b5), essy.c(0xDF19, arr_b6), essy.c(0xDF23, arr_b7), essy.c(0xDF25, essp0.G()), essy.b(0xDF26, essp0.r)}));
        esso.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayContactlessSession", "getCachedData", esso.b + "getCachedData in RupayContactlessSession ends");
        return ByteBuffer.allocate(arr_b8.length).put(arr_b8).array();
    }
}

