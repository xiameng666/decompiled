import java.security.GeneralSecurityException;
import java.util.List;

public final class dgho implements dgij {
    private final dgfy b;
    private final gmnk c;
    private final gmnh d;

    public dgho(dgfy dgfy0, gmnk gmnk0) {
        this.b = dgfy0;
        this.c = gmnk0;
        if(dgfy0.b != dgfx.a) {
            throw new IllegalStateException("AsymmetricSenderQrCodeAuthenticator only support public key type");
        }
        byte[] arr_b = ibpo.aC(dgfy0.a);
        this.d = dgih.a.a(arr_b);
    }

    @Override  // dgih
    public final List a(List list0) {
        ibuq.f(list0, "rawAuthToken");
        byte[] arr_b = ibpo.aC(list0);
        byte[] arr_b1 = this.c.a(arr_b);
        ibuq.e(arr_b1, "sign(...)");
        return ibpg.J(arr_b1);
    }

    @Override  // dgih
    public final boolean b(List list0, List list1) {
        ibuq.f(list0, "rawAuthToken");
        try {
            byte[] arr_b = ibpo.aC(list1);
            byte[] arr_b1 = ibpo.aC(list0);
            this.d.a(arr_b, arr_b1);
            return true;
        }
        catch(GeneralSecurityException generalSecurityException0) {
            dcvz.a.e().f(generalSecurityException0).p("QR code handshake verification failed on sender side", new Object[0]);
            return false;
        }
    }

    @Override  // dgij
    public final dgfy c() {
        return this.b;
    }
}

