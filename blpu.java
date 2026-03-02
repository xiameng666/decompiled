import android.content.Context;
import android.security.keystore.KeyGenParameterSpec.Builder;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore.Entry;
import java.security.KeyStore.PrivateKeyEntry;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.util.Locale;

final class blpu implements blqr {
    private static final bmbw a;
    private final Context b;

    static {
        blpu.a = bmbw.a;
    }

    public blpu(Context context0) {
        gftb.check(context0);
        this.b = context0;
    }

    @Override  // blqr
    public final PublicKey a(blzl blzl0, byte[] arr_b) {
        return ((KeyStore.PrivateKeyEntry)blpu.g(blzl0)).getCertificate().getPublicKey();
    }

    @Override  // blqr
    public final Signature b(blzl blzl0, byte[] arr_b) {
        PrivateKey privateKey0 = ((KeyStore.PrivateKeyEntry)blpu.g(blzl0)).getPrivateKey();
        try {
            Signature signature0 = Signature.getInstance("SHA256withECDSA");
            signature0.initSign(privateKey0);
            return signature0;
        }
        catch(NoSuchAlgorithmException | InvalidKeyException exception0) {
            throw new bmby("Unable to initialize signature", exception0);
        }
    }

    @Override  // blqr
    public final void c(blzl blzl0) {
        gftb.check(blzl0);
        bxjq bxjq0 = blpu.f();
        try {
            bxjq0.b(blzl0.b());
        }
        catch(KeyStoreException | bxjp exception0) {
            throw new bmby("Error deleting Android KeyStore key", exception0);
        }
    }

    @Override  // blqr
    public final byte[] d(blzl blzl0, boolean z, boolean z1, byte[] arr_b) {
        gftb.b(!z1 || arr_b != null, "clientDataHash is required when requesting keystore attestation.");
        try {
            KeyPairGenerator keyPairGenerator0 = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            KeyGenParameterSpec.Builder keyGenParameterSpec$Builder0 = new KeyGenParameterSpec.Builder(blzl0.b(), 4).setDigests(new String[]{"SHA-256"}).setAlgorithmParameterSpec(new ECGenParameterSpec(blpu.a.name().toLowerCase(Locale.US)));
            if(((blzn)blzl0).a.equals(blzo.c)) {
                gftb.checkTrue(this.b.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore"));
                keyGenParameterSpec$Builder0 = keyGenParameterSpec$Builder0.setIsStrongBoxBacked(true).setUserPresenceRequired(true);
            }
            else if(!hsuk.a.b().a()) {
                keyGenParameterSpec$Builder0 = keyGenParameterSpec$Builder0.setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(((int)hsun.c()));
            }
            if(z1 && hswc.d()) {
                keyGenParameterSpec$Builder0 = keyGenParameterSpec$Builder0.setAttestationChallenge(arr_b);
            }
            keyPairGenerator0.initialize(keyGenParameterSpec$Builder0.build());
            keyPairGenerator0.generateKeyPair();
            if(z) {
                try {
                    return bmbs.b(new SecureRandom()).c().s();
                }
                catch(hhrm hhrm0) {
                    throw new bmby("Unable to encode Cable credential data", hhrm0);
                }
            }
        }
        catch(NoSuchAlgorithmException | NoSuchProviderException | InvalidAlgorithmParameterException exception0) {
            throw new bmby("Could not create Android KeyStore key pair", exception0);
        }
        return null;
    }

    @Override  // blqr
    public final bmbs e(byte[] arr_b) {
        if(arr_b != null) {
            try {
                return bmbs.a(hhrs.q(arr_b));
            }
            catch(hhrl hhrl0) {
                throw new bmby("Unable to decode Cable credential data", hhrl0);
            }
        }
        return null;
    }

    private static final bxjq f() {
        try {
            return bxjq.a();
        }
        catch(CertificateException | NoSuchAlgorithmException | KeyStoreException | IOException | bxjp exception0) {
            throw new bmby("Unable to access Android KeyStore.", exception0);
        }
    }

    private static final KeyStore.Entry g(blzl blzl0) {
        bxjq bxjq0 = blpu.f();
        try {
            KeyStore.Entry keyStore$Entry0 = bxjq0.c(blzl0.b());
            if(keyStore$Entry0 != null) {
                return keyStore$Entry0;
            }
            throw new bmby(a.ab(blzl0, "Key does not exist in Android KeyStore: "));
        }
        catch(NoSuchAlgorithmException | UnrecoverableEntryException | KeyStoreException | bxjp exception0) {
            throw new bmby("Error retrieving Android KeyStore entry", exception0);
        }
    }
}

