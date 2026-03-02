import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

public final class voj {
    public static final byte[] a(PublicKey publicKey0) {
        ibuq.f(publicKey0, "<this>");
        ECPoint eCPoint0 = ((ECPublicKey)publicKey0).getW();
        return gnqs.p(gnqp.a, gnqr.a, eCPoint0);
    }

    public static final byte[] b(PublicKey publicKey0) {
        ibuq.f(publicKey0, "<this>");
        return ibpg.W(voj.a(publicKey0), ibwt.q(0, 65));
    }

    public static final byte[] c(PublicKey publicKey0) {
        ibuq.f(publicKey0, "<this>");
        return ibpg.W(voj.a(publicKey0), ibwt.q(1, 33));
    }
}

