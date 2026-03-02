import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;

public final class blrr implements blqr {
    static {
        bnaa.a("SoftwareKeyCryptoHelper");
    }

    @Override  // blqr
    public final PublicKey a(blzl blzl0, byte[] arr_b) {
        return blrr.f(arr_b).a.getPublic();
    }

    @Override  // blqr
    public final Signature b(blzl blzl0, byte[] arr_b) {
        try {
            Signature signature0 = Signature.getInstance("SHA256withECDSA");
            signature0.initSign(blrr.f(arr_b).a.getPrivate());
            return signature0;
        }
        catch(NoSuchAlgorithmException | InvalidKeyException exception0) {
            throw new bmby("Provider error when creating signature object.", exception0);
        }
    }

    @Override  // blqr
    public final void c(blzl blzl0) {
    }

    @Override  // blqr
    public final byte[] d(blzl blzl0, boolean z, boolean z1, byte[] arr_b) {
        try {
            ECGenParameterSpec eCGenParameterSpec0 = new ECGenParameterSpec("secp256r1");
            KeyPairGenerator keyPairGenerator0 = KeyPairGenerator.getInstance("EC");
            keyPairGenerator0.initialize(eCGenParameterSpec0);
            KeyPair keyPair0 = keyPairGenerator0.generateKeyPair();
            bmbs bmbs0 = z ? bmbs.b(new SecureRandom()) : null;
            try {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(new hhro(new hhrn(1L), hhrs.k(keyPair0.getPrivate().getEncoded())));
                arrayList0.add(new hhro(new hhrn(2L), hhrs.k(keyPair0.getPublic().getEncoded())));
                if(bmbs0 != null) {
                    arrayList0.add(new hhro(new hhrn(3L), bmbs0.c()));
                }
                return hhrs.n(arrayList0).s();
            }
            catch(hhrh | hhrm exception1) {
                throw new bmby("Unable to encode key data", exception1);
            }
        }
        catch(NoSuchAlgorithmException | InvalidAlgorithmParameterException exception0) {
            throw new bmby("Could not generateKeyPair for software security key", exception0);
        }
    }

    @Override  // blqr
    public final bmbs e(byte[] arr_b) {
        return blrr.f(arr_b).b;
    }

    static blrq f(byte[] arr_b) {
        if(arr_b != null) {
            try {
                ggfz ggfz0 = hhrs.q(arr_b).m().a;
                hhrn hhrn0 = new hhrn(1L);
                hhrn hhrn1 = new hhrn(2L);
                if(!ggfz0.containsKey(hhrn0) || !ggfz0.containsKey(hhrn1)) {
                    throw new bmby("Missing required map values in decoding keys from storage.");
                }
                KeyFactory keyFactory0 = KeyFactory.getInstance("EC");
                PrivateKey privateKey0 = keyFactory0.generatePrivate(new PKCS8EncodedKeySpec(((hhrs)ggfz0.get(hhrn0)).j().a.toByteArray()));
                KeyPair keyPair0 = new KeyPair(keyFactory0.generatePublic(new X509EncodedKeySpec(((hhrs)ggfz0.get(hhrn1)).j().a.toByteArray())), privateKey0);
                hhrn hhrn2 = new hhrn(3L);
                return new blrq(keyPair0, (ggfz0.containsKey(hhrn2) ? bmbs.a(((hhrs)ggfz0.get(hhrn2))) : null));
            }
            catch(hhrl | InvalidKeySpecException | hhrr exception0) {
                throw new bmby("Unable to decode key data from storage.", exception0);
            }
            catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
                throw new bmby("Provider error in decoding key data.", noSuchAlgorithmException0);
            }
        }
        throw new bmby("Unable to decode key data (data was null).");
    }
}

