import android.content.Context;
import android.security.keystore.KeyExpiredException;
import android.security.keystore.KeyGenParameterSpec.Builder;
import android.security.keystore.KeyInfo;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.security.keystore.UserNotAuthenticatedException;
import android.security.keystore.UserPresenceUnavailableException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyStore.Entry;
import java.security.KeyStore.PrivateKeyEntry;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;

public final class bljz {
    public static final bboh a;
    public static final bxoq b;
    private static final bmbw c;
    private final Context d;

    static {
        bljz.a = bnaa.d("KeyStoreCryptoHelper");
        bljz.c = bmbw.a;
        bljz.b = new bxop(((gful_cronetEngineProvider)new bljy()));
    }

    public bljz(Context context0) {
        gftb.check(context0);
        this.d = context0;
    }

    public final KeyInfo a(String s) {
        try {
            PrivateKey privateKey0 = bljz.d(s);
            return (KeyInfo)KeyFactory.getInstance("EC", "AndroidKeyStore").getKeySpec(privateKey0, KeyInfo.class);
        }
        catch(NoSuchAlgorithmException | NoSuchProviderException | InvalidKeySpecException exception0) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.c = exception0;
            bxly0.b = "Failed to get the keyInfo.";
            throw bxly0.a();
        }
    }

    public final void b(String s, bmcs bmcs0) {
        KeyGenParameterSpec.Builder keyGenParameterSpec$Builder1;
        gftb.z(s, "keyStorageIdentifier cannot be null");
        gftb.b(((boolean)(s.trim().isEmpty() ^ 1)), "keyStorageIdentifier cannot be empty");
        gftb.b(bmcs0 == bmcs.a || bmcs0 == bmcs.c, "keyStorageType can only be KEYSTORE or STRONGBOX");
        bxjo bxjo0 = bljz.g();
        try {
            KeyGenParameterSpec.Builder keyGenParameterSpec$Builder0 = new KeyGenParameterSpec.Builder(s, 4).setDigests(new String[]{"SHA-256"}).setAlgorithmParameterSpec(new ECGenParameterSpec(gfqz.c(bljz.c.name())));
            switch(bmcs0.ordinal()) {
                case 0: {
                    keyGenParameterSpec$Builder1 = keyGenParameterSpec$Builder0.setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(((int)hsun.c()));
                    break;
                }
                case 2: {
                    gftb.b(this.d.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore"), "Strongbox feature is not supported");
                    keyGenParameterSpec$Builder1 = keyGenParameterSpec$Builder0.setIsStrongBoxBacked(true).setUserPresenceRequired(true);
                    break;
                }
                default: {
                    throw new IllegalStateException("Not supported key storage type");
                }
            }
            bxjo0.b(keyGenParameterSpec$Builder1.build());
        }
        catch(bxjp | InvalidAlgorithmParameterException exception0) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.c = exception0;
            bxly0.b = "Unable to generate Android Keystore key pair";
            throw bxly0.a();
        }
    }

    public static final void c(String s) {
        gftb.b(((boolean)(s.trim().isEmpty() ^ 1)), "keyStorageIdentifier cannot be empty");
        bxjq bxjq0 = bljz.h();
        try {
            bxjq0.b(s);
        }
        catch(KeyStoreException | bxjp exception0) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.c = exception0;
            bxly0.b = "Unable to delete the key from Android Keystore";
            throw bxly0.a();
        }
    }

    public static final PrivateKey d(String s) {
        gftb.check(s);
        try {
            KeyStore.Entry keyStore$Entry0 = bxjq.a().c(s);
            if(keyStore$Entry0 != null) {
                return ((KeyStore.PrivateKeyEntry)keyStore$Entry0).getPrivateKey();
            }
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.b = "Unable to get the private key from Android Keystore";
            throw bxly0.a();
        }
        catch(KeyStoreException | CertificateException | NoSuchAlgorithmException | IOException | bxjp | UnrecoverableEntryException | ClassCastException exception0) {
            bxly bxly1 = new bxly();
            bxly1.a = 8;
            bxly1.c = exception0;
            bxly1.b = "Unable to get the private key from Android Keystore";
            throw bxly1.a();
        }
    }

    public static final PublicKey e(String s) {
        gftb.z(s, "keyStorageIdentifier cannot be null");
        gftb.b(((boolean)(s.trim().isEmpty() ^ 1)), "keyStorageIdentifier cannot be empty");
        bxjq bxjq0 = bljz.h();
        try {
            KeyStore.Entry keyStore$Entry0 = bxjq0.c(s);
            return keyStore$Entry0 == null ? null : ((KeyStore.PrivateKeyEntry)keyStore$Entry0).getCertificate().getPublicKey();
        }
        catch(UnrecoverableEntryException | NoSuchAlgorithmException | KeyStoreException | bxjp exception0) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.c = exception0;
            bxly0.b = "Unable to get the public key from Android Keystore";
            throw bxly0.a();
        }
    }

    public static final boolean f(String s) {
        gftb.check(s);
        bxjq bxjq0 = bljz.h();
        try {
            KeyStore.Entry keyStore$Entry0 = bxjq0.c(s);
            if(keyStore$Entry0 == null) {
                return false;
            }
            Signature.getInstance("SHA256withECDSA").initSign(((KeyStore.PrivateKeyEntry)keyStore$Entry0).getPrivateKey());
            return true;
        }
        catch(KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | bxjp exception0) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.c = exception0;
            bxly0.b = "Error looking up Android KeyStore key";
            throw bxly0.a();
        }
        catch(InvalidKeyException invalidKeyException0) {
            return bljz.i(bxjq0, s, invalidKeyException0);
        }
    }

    private static bxjo g() {
        try {
            return bxjo.a();
        }
        catch(bxjp | NoSuchProviderException | NoSuchAlgorithmException exception0) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.c = exception0;
            bxly0.b = "Unable to access KeyPairGenerator";
            throw bxly0.a();
        }
    }

    private static bxjq h() {
        try {
            return bxjq.a();
        }
        catch(CertificateException | NoSuchAlgorithmException | KeyStoreException | IOException | bxjp exception0) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.c = exception0;
            bxly0.b = "Unable to access Android KeyStore";
            throw bxly0.a();
        }
    }

    private static boolean i(bxjq bxjq0, String s, InvalidKeyException invalidKeyException0) {
        if(!(invalidKeyException0 instanceof UserNotAuthenticatedException) && !(invalidKeyException0 instanceof UserPresenceUnavailableException)) {
            if(!(invalidKeyException0 instanceof KeyPermanentlyInvalidatedException) && !(invalidKeyException0 instanceof KeyExpiredException)) {
                bxly bxly0 = new bxly();
                bxly0.a = 8;
                bxly0.c = invalidKeyException0;
                bxly0.b = "Error looking up Android KeyStore key";
                throw bxly0.a();
            }
            try {
                bxjq0.b(s);
            }
            catch(KeyStoreException | bxjp unused_ex) {
            }
            return false;
        }
        return true;
    }
}

