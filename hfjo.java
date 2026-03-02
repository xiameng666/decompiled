import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPoint;

public final class hfjo {
    public final ECPrivateKey a;
    public final igpl b;

    private hfjo(ECPrivateKey eCPrivateKey0, hfjp hfjp0) {
        this.a = eCPrivateKey0;
        String s = hfjp0.d;
        ignf ignf0 = igot.b(s);
        igow igow0 = null;
        if(ignf0 != null) {
            igox igox0 = (igox)igot.I.get(ignf0);
            if(igox0 != null) {
                igow0 = igox0.b();
            }
        }
        igot.b(s);
        igps igps0 = igow0.a;
        igoy igoy0 = igow0.b;
        if(igoy0.c == null) {
            igoy0.c = igoy0.b.p(igoy0.a.a).t();
        }
        this.b = new igpl(igps0, igoy0.c);
    }

    public static byte[] a(BigInteger bigInteger0) {
        byte[] arr_b = bigInteger0.toByteArray();
        int v;
        for(v = 0; arr_b[v] == 0; ++v) {
        }
        int v1 = arr_b.length - v;
        byte[] arr_b1 = new byte[v1];
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
        return arr_b1;
    }

    public final byte[] b(byte[] arr_b) {
        igpv igpv3;
        igpv igpv2;
        igpl igpl0 = this.b;
        igps igps0 = igpl0.a;
        igpv igpv0 = igps0.e;
        igpv igpv1 = igps0.f;
        BigInteger bigInteger0 = ((igpq)igps0).a;
        for(BigInteger bigInteger1 = hfjo.d(arr_b, bigInteger0); true; bigInteger1 = hfjo.d(hfjo.a(bigInteger1), bigInteger0)) {
            igpv2 = igps0.f(bigInteger1);
            igpv3 = igpv2.h(igpv2.m().d(igpv0)).d(igpv1).l();
            if(igpv3 != null) {
                break;
            }
        }
        ECPoint eCPoint0 = igpv3.c().testBit(0) ? new ECPoint(igpv2.c(), igpv3.k().c()) : new ECPoint(igpv2.c(), igpv3.c());
        BigInteger bigInteger2 = eCPoint0.getAffineX();
        BigInteger bigInteger3 = eCPoint0.getAffineY();
        return igpl0.a.o(bigInteger2, bigInteger3).s(this.a.getS()).z();
    }

    public static hfjo c(hfjp hfjp0) {
        try {
            KeyPairGenerator keyPairGenerator0 = KeyPairGenerator.getInstance("EC");
            SecureRandom secureRandom0 = new SecureRandom();
            keyPairGenerator0.initialize(hfjp0.c, secureRandom0);
            return new hfjo(((ECPrivateKey)keyPairGenerator0.generateKeyPair().getPrivate()), hfjp0);
        }
        catch(Exception exception0) {
            throw new AssertionError(exception0);
        }
    }

    public static BigInteger d(byte[] arr_b, BigInteger bigInteger0) {
        int v2;
        int v = bigInteger0.bitLength();
        BigInteger bigInteger1 = BigInteger.ZERO;
        BigInteger bigInteger2 = BigInteger.ONE;
        for(int v1 = 1; true; ++v1) {
            v2 = (v + 0x1FF) / 0x100;
            if(v1 >= v2 + 1) {
                break;
            }
            BigInteger bigInteger3 = bigInteger1.shiftLeft(0x100);
            byte[] arr_b1 = glwl.d(new byte[][]{hfjo.a(bigInteger2), arr_b});
            byte[] arr_b2 = ghgc.a.a(arr_b1).e();
            byte[] arr_b3 = new byte[arr_b2.length + 1];
            arr_b3[0] = 0;
            System.arraycopy(arr_b2, 0, arr_b3, 1, arr_b2.length);
            bigInteger1 = bigInteger3.add(new BigInteger(arr_b3));
            bigInteger2 = bigInteger2.add(BigInteger.ONE);
        }
        return bigInteger1.shiftRight(v2 * 0x100 - (v + 0x100)).mod(bigInteger0);
    }
}

