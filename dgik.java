import java.util.Arrays;
import java.util.List;

public final class dgik implements dgii {
    private final gmnh b;

    public dgik(dgfy dgfy0) {
        byte[] arr_b = ibpo.aC(dgfy0.a);
        this.b = dgih.a.a(arr_b);
        if(dgfy0.b == dgfx.b && hvqz.H()) {
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override  // dgih
    public final List a(List list0) {
        ibuq.f(list0, "rawAuthToken");
        byte[] arr_b = ibpg.k(ibpo.aC(list0), dgig.c);
        return ibpg.J(this.b.b(arr_b));
    }

    @Override  // dgih
    public final boolean b(List list0, List list1) {
        ibuq.f(list0, "rawAuthToken");
        byte[] arr_b = ibpo.aC(list1);
        byte[] arr_b1 = ibpg.k(ibpo.aC(list0), dgig.b);
        boolean z = Arrays.equals(arr_b, this.b.b(arr_b1));
        if(!z) {
            dcvz.a.e().p("QR code handshake verification using symmetric key failed on receiver side", new Object[0]);
        }
        return z;
    }
}

