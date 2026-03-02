import android.app.KeyguardManager;
import android.security.keystore.KeyGenParameterSpec.Builder;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

final class alnp {
    private static final baun a;

    static {
        alnp.a = new baun("ProximityAuth", new String[]{"NotificationOptInChimeraActivity"});
    }

    static void a(xni xni0, Runnable runnable0) {
        alm alm0;
        if(((KeyguardManager)xni0.getSystemService("keyguard")).isDeviceSecure() && !alnp.b()) {
            if(hpzm.a.f().H()) {
                all all0 = new all();
                all0.d = "Chromebook";
                all0.b();
                all0.c = "Chromebook";
                all0.a = 0x7F080CFA;
                alm0 = all0.a();
            }
            else {
                all all1 = new all();
                all1.d = "Chromebook";
                all1.b();
                alm0 = all1.a();
            }
            fm fm0 = xni0.getSupportFragmentManager();
            du du0 = fm0.h("BiometricHostFragment");
            if(du0 == null) {
                du0 = new du();
                ca ca0 = new ca(fm0);
                ca0.v(du0, "BiometricHostFragment");
                ca0.f();
            }
            alno alno0 = new alno(runnable0);
            new alo(du0, gmap.a, alno0).c(alm0);
            return;
        }
        runnable0.run();
    }

    private static boolean b() {
        try {
            KeyStore.getInstance("AndroidKeyStore").load(null, null);
            KeyGenParameterSpec.Builder keyGenParameterSpec$Builder0 = new KeyGenParameterSpec.Builder("chromebook_phone_hub", 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(((int)hpzm.a.f().i()));
            KeyGenerator keyGenerator0 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator0.init(keyGenParameterSpec$Builder0.build());
            SecretKey secretKey0 = keyGenerator0.generateKey();
            Cipher.getInstance("AES/GCM/NoPadding").init(1, secretKey0);
            return true;
        }
        catch(InvalidKeyException | GeneralSecurityException exception0) {
            alnp.a.n("Exception determining if user has authenticated recently", exception0, new Object[0]);
        }
        catch(IOException unused_ex) {
        }
        return false;
    }
}

