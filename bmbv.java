import java.io.IOException;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

public abstract class bmbv {
    protected final bmgm a;

    protected bmbv(bmgm bmgm0) {
        gftb.check(bmgm0);
        this.a = bmgm0;
    }

    public static int a(hhrv hhrv0) {
        switch(hhrv0.d().a) {
            case 0: 
            case 0x20: {
                return (int)hhrv0.a();
            }
            case 0x60: {
                return Integer.parseInt(hhrv0.e());
            }
            default: {
                throw new IOException("Item must either be a tstr or an integer");
            }
        }
    }

    public static bmbv b(PublicKey publicKey0) {
        if(!(publicKey0 instanceof ECPublicKey)) {
            throw new UnsupportedOperationException("Only supported for ECPublicKey.");
        }
        ECPoint eCPoint0 = ((ECPublicKey)publicKey0).getW();
        BigInteger bigInteger0 = eCPoint0.getAffineX();
        BigInteger bigInteger1 = eCPoint0.getAffineY();
        return new bmbx(bmhq.e, bmbw.a, bigInteger0, bigInteger1);
    }

    public abstract hhrp c();

    public final byte[] d() {
        return this.c().s();
    }
}

