import android.security.keystore.KeyGenParameterSpec.Builder;
import j..util.Optional;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;

public final class dvjv {
    public static final bboh a;
    private final String b;

    static {
        dvjv.a = bboh.b("Pay", bbcu.cZ);
    }

    public dvjv(String s) {
        this.b = s;
    }

    final Optional a(String s) {
        try {
            PrivateKey privateKey0 = (PrivateKey)eaqq.b().getKey(this.c(s), null);
            if(privateKey0 != null) {
                return Optional.of(privateKey0);
            }
            ((ggtj)dvjv.a.j()).B("Private key is not present in Android Keystore for owner: %s", s);
            return Optional.empty();
        }
        catch(KeyStoreException | UnrecoverableKeyException | CertificateException | NoSuchAlgorithmException | IOException exception0) {
            a.e(dvjv.a.j(), "Error while fetching private key from Android Keystore for owner: %s", s, exception0);
            return Optional.empty();
        }
    }

    public final Optional b(String s, byte[] arr_b) {
        Optional optional0 = this.a(s);
        if(optional0.isEmpty()) {
            return Optional.empty();
        }
        Object object0 = optional0.get();
        try {
            Signature signature0 = Signature.getInstance("SHA256withECDSA");
            signature0.initSign(((PrivateKey)object0));
            signature0.update(arr_b);
            byte[] arr_b1 = signature0.sign();
            if(arr_b1 != null) {
                return Optional.of(arr_b1);
            }
            ((ggtj)dvjv.a.j()).x("Signaure bytes are null.");
            return Optional.empty();
        }
        catch(NoSuchAlgorithmException | InvalidKeyException | SignatureException exception0) {
            a.ae(dvjv.a.j(), "Error while signing the data with private key.", exception0);
            return Optional.empty();
        }
    }

    public final String c(String s) {
        return String.format("vdv_key_alias_prefix_%s_%s", this.b, s);
    }

    public static final Optional d(String s) {
        try {
            KeyStore keyStore0 = eaqq.b();
            if(keyStore0.containsAlias(s)) {
                Certificate certificate0 = keyStore0.getCertificate(s);
                if(certificate0 != null) {
                    return Optional.of(certificate0.getPublicKey());
                }
                ((ggtj)dvjv.a.j()).x("Alias exists in keystore but does not contain certificate");
                return Optional.empty();
            }
            return dvjv.e(s);
        }
        catch(KeyStoreException | CertificateException | NoSuchAlgorithmException | IOException exception0) {
            a.ae(dvjv.a.j(), "Failed to get key pair from Android Keystore", exception0);
            return Optional.empty();
        }
    }

    private static final Optional e(String s) {
        try {
            KeyPairGenerator keyPairGenerator0 = eaqq.a();
            keyPairGenerator0.initialize(new KeyGenParameterSpec.Builder(s, 4).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setDigests(new String[]{"SHA-256"}).setUserAuthenticationRequired(false).build());
            return Optional.of(keyPairGenerator0.generateKeyPair().getPublic());
        }
        catch(InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException exception0) {
            a.ae(dvjv.a.j(), "Failed to create new key pair", exception0);
            return Optional.empty();
        }
    }
}

