import java.math.BigInteger;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

public final class blrd {
    public final blzp a;
    public final blzn b;
    public final bmbs c;
    private final PublicKey d;

    public blrd(PublicKey publicKey0, blzp blzp0, blzn blzn0, bmbs bmbs0) {
        gftb.z(publicKey0, "Public key is null");
        this.d = publicKey0;
        this.a = blzp0;
        this.b = blzn0;
        this.c = bmbs0;
    }

    public final bmbv a() {
        gftb.q("EC".equals(this.d.getAlgorithm()));
        ECPoint eCPoint0 = ((ECPublicKey)this.d).getW();
        BigInteger bigInteger0 = eCPoint0.getAffineX();
        BigInteger bigInteger1 = eCPoint0.getAffineY();
        return new bmbx(bmhq.d, bmbw.a, bigInteger0, bigInteger1);
    }
}

