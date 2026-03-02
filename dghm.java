import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.List;

public final class dghm implements dgii {
    private final dgfy b;
    private final gmnh c;

    public dghm(dgfy dgfy0) {
        this.b = dgfy0;
        byte[] arr_b = ibpo.aC(dgfy0.a);
        this.c = dgih.a.a(arr_b);
        if(dgfy0.b != dgfx.a) {
            throw new IllegalArgumentException("Using non-public key when creating AsymmetricReceiverQrCodeAuthenticator");
        }
        gnlw.a();
    }

    @Override  // dgih
    public final List a(List list0) {
        ibuq.f(list0, "rawAuthToken");
        byte[] arr_b = ibpo.aC(list0);
        return ibpg.J(this.c.b(arr_b));
    }

    @Override  // dgih
    public final boolean b(List list0, List list1) {
        ibuq.f(list0, "rawAuthToken");
        dgfy dgfy0 = this.b;
        if(dgfy0.b != dgfx.a) {
            return false;
        }
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(ibpo.aC(dgfy0.a));
        ibuq.e(byteBuffer0, "wrap(...)");
        byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        if(byteBuffer0.getShort() == 0) {
            byte[] arr_b = new byte[33];
            byteBuffer0.get(arr_b);
            try {
                ECPoint eCPoint0 = gnqs.i(gnqp.a, gnqr.b, arr_b);
                gnjn gnjn0 = gnjm.a(dgih.a.b(), eCPoint0, null);
                gmmx gmmx0 = new gmmx();
                gmmv gmmv0 = gmnb.b(gnjn0);
                gmmv0.a();
                gmmv0.b(0);
                gmmx0.c(gmmv0);
                ((gmnl)gmmx0.a().o(gnbr.a, gmnl.class)).a(ibpo.aC(list1), ibpo.aC(list0));
                return true;
            }
            catch(GeneralSecurityException generalSecurityException0) {
                dcvz.a.d().f(generalSecurityException0).p("QR code verification failed.", new Object[0]);
            }
        }
        return false;
    }
}

