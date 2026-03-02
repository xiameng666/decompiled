import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class eqhi {
    private static final erqc a;
    private final int b;
    private final String c;
    private final SecretKey d;

    static {
        eqhi.a = new erqc(new String[]{"AesGcmConnectionAuthenticator"});
    }

    private eqhi(int v, String s, byte[] arr_b) {
        boolean z = true;
        if(v != 1) {
            v = 2;
        }
        if(v == 2) {
            if(arr_b == null) {
                z = false;
            }
            batl.c(z, "Key should not be null if role is ROLE_SOURCE");
        }
        this.b = v;
        this.c = s;
        if(arr_b == null) {
            this.d = eqhi.b();
            return;
        }
        this.d = new SecretKeySpec(arr_b, 0, arr_b.length, "AES");
    }

    public static eqhi a(int v, String s, byte[] arr_b) {
        if(arr_b != null) {
            batl.b(arr_b.length == 0x20);
        }
        try {
            Cipher.getInstance("AES/GCM/NoPadding");
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException exception0) {
            eqhi.a.g("AES/GCM/NoPadding not supported", exception0, new Object[0]);
            return null;
        }
        try {
            return new eqhi(v, s, arr_b);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            eqhi.a.g("AES key generator not supported", noSuchAlgorithmException0, new Object[0]);
            return null;
        }
    }

    public static SecretKey b() {
        KeyGenerator keyGenerator0 = KeyGenerator.getInstance("AES");
        keyGenerator0.init(0x100);
        return keyGenerator0.generateKey();
    }

    public final void c(byte[] arr_b) {
        byte[] arr_b1;
        eqhs eqhs0;
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)eqhs.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            eqhs0 = (eqhs)hftv0;
        }
        catch(hfur hfur0) {
            eqhi.a.g("Failed to deserialize AesGcmAuthenticationMessage", hfur0, new Object[0]);
            throw new GeneralSecurityException("Failed to deserialize AesGcmAuthenticationMessage", hfur0);
        }
        if(eqhr.a(eqhs0.c) != 2) {
            eqhi.a.f("Expecting V1 frame", new Object[0]);
            throw new GeneralSecurityException("Expecting V1 frame");
        }
        if((eqhs0.b & 2) != 0) {
            IvParameterSpec ivParameterSpec0 = new IvParameterSpec((eqhs0.d == null ? eqhu.a : eqhs0.d).c.toByteArray());
            try {
                Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
                cipher0.init(2, this.d, ivParameterSpec0);
                arr_b1 = cipher0.doFinal((eqhs0.d == null ? eqhu.a : eqhs0.d).d.toByteArray());
            }
            catch(GeneralSecurityException generalSecurityException0) {
                eqhi.a.g("Decryption error", generalSecurityException0, new Object[0]);
                throw generalSecurityException0;
            }
            try {
                hftc hftc1 = hftc.a();
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)eqht.a), arr_b1, 0, arr_b1.length, hftc1);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                if(this.b == ((eqht)hftv1).c) {
                    throw new GeneralSecurityException("Unexpected role in payload");
                }
                if(this.c.equals(((eqht)hftv1).d)) {
                    return;
                }
                throw new GeneralSecurityException("Authentication string mismatch");
            }
            catch(hfur hfur1) {
                eqhi.a.g("Invalid AuthenticationPayload proto", hfur1, new Object[0]);
                throw new GeneralSecurityException("Failed to deserialize AuthenticationPayload", hfur1);
            }
        }
        eqhi.a.f("Message missing V1 frame", new Object[0]);
        throw new GeneralSecurityException("Message missing V1 frame");
    }

    public final byte[] d() {
        byte[] arr_b = new byte[12];
        new SecureRandom().nextBytes(arr_b);
        IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b);
        try {
            Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
            cipher0.init(1, this.d, ivParameterSpec0);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqht.a).v_newBuilder();
            int v = this.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((eqht)hftv0).b |= 1;
            ((eqht)hftv0).c = v;
            String s = this.c;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            eqht eqht0 = (eqht)hftp0.b_message;
            s.getClass();
            eqht0.b |= 2;
            eqht0.d = s;
            byte[] arr_b1 = cipher0.doFinal(((eqht)hftp0.N_build()).toBytesArray());
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)eqhs.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((eqhs)hftp1.b_message).c = 1;
            ((eqhs)hftp1.b_message).b |= 1;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)eqhu.a).v_newBuilder();
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            eqhu eqhu0 = (eqhu)hftp2.b_message;
            eqhu0.b |= 1;
            eqhu0.c = hfsf0;
            ByteString hfsf1 = ByteString.copyFrom(arr_b1);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            eqhu eqhu1 = (eqhu)hftp2.b_message;
            eqhu1.b |= 2;
            eqhu1.d = hfsf1;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            eqhs eqhs0 = (eqhs)hftp1.b_message;
            eqhu eqhu2 = (eqhu)hftp2.N_build();
            eqhu2.getClass();
            eqhs0.d = eqhu2;
            eqhs0.b |= 2;
            return ((eqhs)hftp1.N_build()).toBytesArray();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            eqhi.a.g("Encryption error", generalSecurityException0, new Object[0]);
            throw generalSecurityException0;
        }
    }
}

