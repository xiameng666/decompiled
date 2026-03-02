import java.util.Arrays;
import java.util.List;

public final class dgil implements dgij {
    private final gmnh b;
    private final dgfy c;

    public dgil(byte[] arr_b) {
        if(!hvqz.H() || arr_b.length <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.c = new dgfy(arr_b, dgfx.b);
        this.b = dgih.a.a(arr_b);
    }

    @Override  // dgih
    public final List a(List list0) {
        ibuq.f(list0, "rawAuthToken");
        byte[] arr_b = ibpg.k(ibpo.aC(list0), dgig.b);
        return ibpg.J(this.b.b(arr_b));
    }

    @Override  // dgih
    public final boolean b(List list0, List list1) {
        ibuq.f(list0, "rawAuthToken");
        byte[] arr_b = ibpo.aC(list1);
        byte[] arr_b1 = ibpg.k(ibpo.aC(list0), dgig.c);
        boolean z = Arrays.equals(arr_b, this.b.b(arr_b1));
        if(!z) {
            dcvz.a.e().p("QR code handshake verification using symmetric key failed on sender side", new Object[0]);
        }
        return z;
    }

    @Override  // dgij
    public final dgfy c() {
        return this.c;
    }
}

