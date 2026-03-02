import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public final class fvvq {
    private final Random a;
    private final String b;

    public fvvq(Random random0, String s) {
        this.a = random0;
        this.b = s;
    }

    public final byte[] a(byte[] arr_b) {
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gxew.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            byte[] arr_b1 = ((gxew)hftv0).b.toByteArray();
            byte[] arr_b2 = ((gxew)hftv0).c.toByteArray();
            return fvvq.c(2, this.b, arr_b1, arr_b2).doFinal(((gxew)hftv0).d.toByteArray());
        }
        catch(GeneralSecurityException | hfur | IllegalArgumentException exception0) {
            throw new fvvr(exception0);
        }
    }

    public final byte[] b(byte[] arr_b) {
        try {
            byte[] arr_b1 = new byte[16];
            byte[] arr_b2 = new byte[8];
            this.a.nextBytes(arr_b1);
            this.a.nextBytes(arr_b2);
            Cipher cipher0 = fvvq.c(1, this.b, arr_b1, arr_b2);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxew.a).v_newBuilder();
            ByteString hfsf0 = ByteString.copyFrom(arr_b1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gxew)hftp0.b_message).b = hfsf0;
            ByteString hfsf1 = ByteString.copyFrom(arr_b2);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gxew)hftp0.b_message).c = hfsf1;
            ByteString hfsf2 = ByteString.copyFrom(cipher0.doFinal(arr_b));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gxew)hftp0.b_message).d = hfsf2;
            return ((gxew)hftp0.N_build()).toBytesArray();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new fvvr(generalSecurityException0);
        }
    }

    private static Cipher c(int v, String s, byte[] arr_b, byte[] arr_b1) {
        Cipher cipher0 = bbmq.B("AES/CBC/PKCS5Padding");
        if(cipher0 == null) {
            throw new NoSuchAlgorithmException("No Such Algorithm");
        }
        IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b);
        cipher0.init(v, new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(s.toCharArray(), arr_b1, 2000, 0x80)).getEncoded(), "PBKDF2WithHmacSHA1"), ivParameterSpec0);
        return cipher0;
    }
}

