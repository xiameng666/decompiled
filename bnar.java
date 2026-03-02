import android.util.Pair;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.KeyAgreement;

public class bnar {
    public final gfsx a;
    public final gfsx b;
    public final gfsx c;
    private static final byte[] d;
    private static final BigInteger e;
    private static final BigInteger f;

    static {
        bnar.d = new byte[]{0x30, 89, 0x30, 19, 6, 7, 42, (byte)0x86, 72, -50, 61, 2, 1, 6, 8, 42, (byte)0x86, 72, -50, 61, 3, 1, 7, 3, 66, 0};
        bnar.e = new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951");
        bnar.f = new BigInteger("41058363725152142129326129780047268409114441015993725554835256314039467401291");
    }

    public bnar(gfsx gfsx0, gfsx gfsx1, gfsx gfsx2) {
        gfuy.a(((boolean)(gfsx1.i() ^ gfsx2.i())));
        this.c = gfsx0;
        this.a = gfsx1;
        this.b = gfsx2;
    }

    public static Pair a() {
        try {
            KeyPairGenerator keyPairGenerator0 = KeyPairGenerator.getInstance("EC");
            keyPairGenerator0.initialize(new ECGenParameterSpec("secp256r1"));
            KeyPair keyPair0 = keyPairGenerator0.generateKeyPair();
            return Pair.create(((ECPublicKey)keyPair0.getPublic()), ((ECPrivateKey)keyPair0.getPrivate()));
        }
        catch(NoSuchAlgorithmException | InvalidAlgorithmParameterException exception0) {
            throw new AssertionError(exception0);
        }
    }

    public static ECPublicKey b(byte[] arr_b) {
        ECPublicKey eCPublicKey0;
        KeyFactory keyFactory0;
        if(arr_b.length != 65) {
            throw new InvalidAlgorithmParameterException("invalid X9.62 input");
        }
        try {
            keyFactory0 = KeyFactory.getInstance("EC");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new AssertionError(noSuchAlgorithmException0);
        }
        try {
            eCPublicKey0 = (ECPublicKey)keyFactory0.generatePublic(new X509EncodedKeySpec(glwl.d(new byte[][]{bnar.d, arr_b})));
        }
        catch(InvalidKeySpecException invalidKeySpecException0) {
            throw new InvalidAlgorithmParameterException(invalidKeySpecException0);
        }
        BigInteger bigInteger0 = BigInteger.valueOf(3L);
        if(eCPublicKey0.getW().getAffineY().modPow(BigInteger.valueOf(2L), bnar.e).equals(eCPublicKey0.getW().getAffineX().modPow(bigInteger0, bnar.e).subtract(eCPublicKey0.getW().getAffineX().multiply(bigInteger0)).add(bnar.f).mod(bnar.e))) {
            return eCPublicKey0;
        }
        throw new InvalidAlgorithmParameterException("off-curve point");
    }

    public static byte[] c(ECPrivateKey eCPrivateKey0, ECPublicKey eCPublicKey0) {
        try {
            KeyAgreement keyAgreement0 = KeyAgreement.getInstance("ECDH");
            keyAgreement0.init(eCPrivateKey0);
            keyAgreement0.doPhase(eCPublicKey0, true);
            return keyAgreement0.generateSecret();
        }
        catch(NoSuchAlgorithmException | InvalidKeyException exception0) {
            throw new AssertionError(exception0);
        }
    }
}

