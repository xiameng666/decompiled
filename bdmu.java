import android.app.PendingIntent;
import com.google.android.gms.auth.folsom.SharedKey;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.NoSuchElementException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class bdmu {
    private static final bboh a;
    private static final byte[] b;
    private static final byte[] c;
    private static final byte[] d;
    private static final byte[] e;
    private final SecureRandom f;
    private final bdzr g;

    static {
        bdmu.a = bboh.b("PasskeyEncryption", bbcu.cX);
        byte[] arr_b = "WebauthnCredentialSpecifics.Encrypted".getBytes(ibyo.a);
        ibuq.e(arr_b, "getBytes(...)");
        bdmu.b = arr_b;
        bdmu.c = new byte[0];
        bdmu.d = new byte[0];
        byte[] arr_b1 = "KeychainApplicationKey:gmscore_module:com.google.android.gms.fido".getBytes(ibyo.b);
        ibuq.e(arr_b1, "getBytes(...)");
        bdmu.e = arr_b1;
    }

    public bdmu(bdzr bdzr0, SecureRandom secureRandom0) {
        this.g = bdzr0;
        this.f = secureRandom0;
    }

    static Object a(bdmu bdmu0, String s, ibrl ibrl0) {
        byte[] arr_b;
        List list0;
        bdmt bdmt0;
        if((ibrl0 instanceof bdmt)) {
            bdmt0 = (bdmt)ibrl0;
            int v = bdmt0.c;
            if((v & 0x80000000) == 0) {
                bdmt0 = new bdmt(bdmu0, ibrl0);
            }
            else {
                bdmt0.c = v - 0x80000000;
            }
        }
        else {
            bdmt0 = new bdmt(bdmu0, ibrl0);
        }
        Object object0 = bdmt0.a;
        Object object1 = ibrx.a;
        switch(bdmt0.c) {
            case 0: {
                ibnx.b(object0);
                azts azts0 = bdmu0.g.a("hw_protected", "pwm_passkey_encryption_key_provider");
                try {
                    evql evql0 = azts0.jx(s);
                    bdmt0.c = 1;
                    object0 = ictn.b(evql0, bdmt0);
                    if(object0 == object1) {
                        return object1;
                    label_20:
                        ibnx.b(object0);
                    }
                    list0 = (List)object0;
                    goto label_31;
                }
                catch(azuh azuh0) {
                    break;
                }
                catch(aztb aztb0) {
                    a.ae(bdmu.a.j(), "Error retrieving shared key material", aztb0);
                    return bdmp.a;
                }
            }
            case 1: {
                goto label_20;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(bdmu.a.j(), "Error retrieving shared key material, starting pending intent", azuh0);
        PendingIntent pendingIntent0 = azuh0.c();
        ibuq.e(pendingIntent0, "getResolution(...)");
        return new bdmq(pendingIntent0);
    label_31:
        ((ggtj)bdmu.a.h()).z("Retrieved %d shared keys", list0.size());
        try {
            ibuq.c(list0);
            arr_b = ((SharedKey)ibpo.W(list0)).b;
        }
        catch(NoSuchElementException noSuchElementException0) {
            a.ae(bdmu.a.j(), "No shared key material available", noSuchElementException0);
            return bdmp.a;
        }
        ibuq.c(arr_b);
        try {
            return new bdmr(hhur.k(new SecretKeySpec(arr_b, "AES"), bdmu.d, bdmu.e));
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            a.ae(bdmu.a.j(), "No such algorithm when deriving key", noSuchAlgorithmException0);
            return bdmp.a;
        }
        catch(InvalidKeyException invalidKeyException0) {
            a.ae(bdmu.a.j(), "Invalid key when deriving key", invalidKeyException0);
            return bdmp.a;
        }
    }

    static Object b(byte[] arr_b, byte[] arr_b1, boolean z) {
        try {
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b1, "AES");
            Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
            byte[] arr_b2 = ibpg.h(arr_b, 0, 12);
            byte[] arr_b3 = ibpg.h(arr_b, 12, arr_b.length);
            cipher0.init(2, secretKeySpec0, new GCMParameterSpec(0x80, arr_b2));
            cipher0.updateAAD((z ? bdmu.b : bdmu.c));
            return cipher0.doFinal(arr_b3);
        }
        catch(BadPaddingException badPaddingException0) {
            a.ae(bdmu.a.j(), "Decrypting passkey failed, bad padding", badPaddingException0);
            return null;
        }
        catch(NoSuchPaddingException noSuchPaddingException0) {
            a.ae(bdmu.a.j(), "Decrypting passkey failed, no such padding", noSuchPaddingException0);
            return null;
        }
        catch(InvalidAlgorithmParameterException invalidAlgorithmParameterException0) {
            a.ae(bdmu.a.j(), "Decrypting passkey failed, invalid algorithm", invalidAlgorithmParameterException0);
            return null;
        }
        catch(IllegalBlockSizeException illegalBlockSizeException0) {
            a.ae(bdmu.a.j(), "Decrypting passkey failed, illegal block size", illegalBlockSizeException0);
            return null;
        }
        catch(InvalidKeyException invalidKeyException0) {
            a.ae(bdmu.a.j(), "Decrypting passkey failed, invalid key", invalidKeyException0);
            return null;
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            a.ae(bdmu.a.j(), "Decrypting passkey failed, no such algorithm", noSuchAlgorithmException0);
            return null;
        }
    }

    static Object c(bdmu bdmu0, byte[] arr_b, byte[] arr_b1) {
        byte[] arr_b2 = new byte[12];
        bdmu0.f.nextBytes(arr_b2);
        GCMParameterSpec gCMParameterSpec0 = new GCMParameterSpec(0x80, arr_b2);
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b1, "AES");
        try {
            Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
            cipher0.init(1, secretKeySpec0, gCMParameterSpec0);
            cipher0.updateAAD(bdmu.b);
            byte[] arr_b3 = cipher0.doFinal(arr_b);
            ibuq.e(arr_b3, "doFinal(...)");
            return ibpg.k(arr_b2, arr_b3);
        }
        catch(InvalidAlgorithmParameterException invalidAlgorithmParameterException0) {
            a.ae(bdmu.a.j(), "Encrypting passkey failed, invalid algorithm", invalidAlgorithmParameterException0);
            return null;
        }
        catch(InvalidKeyException invalidKeyException0) {
            a.ae(bdmu.a.j(), "Encrypting passkey failed, invalid key", invalidKeyException0);
            return null;
        }
        catch(BadPaddingException badPaddingException0) {
            a.ae(bdmu.a.j(), "Encrypting passkey failed, bad padding", badPaddingException0);
            return null;
        }
        catch(IllegalBlockSizeException illegalBlockSizeException0) {
            a.ae(bdmu.a.j(), "Encrypting passkey failed, illegal block size", illegalBlockSizeException0);
            return null;
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            a.ae(bdmu.a.j(), "Encrypting passkey failed, no such algorithm", noSuchAlgorithmException0);
            return null;
        }
        catch(NoSuchPaddingException noSuchPaddingException0) {
            a.ae(bdmu.a.j(), "Encrypting passkey failed, no such padding", noSuchPaddingException0);
            return null;
        }
    }
}

