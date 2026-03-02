import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public final class fvji {
    private final String a;

    public fvji(String s) {
        this.a = s;
    }

    public final byte[] a(byte[] arr_b) {
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fvje.a), arr_b, 0, arr_b.length, hftc.a);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        if(((fvje)hftv0).b.isEmpty() || ((fvje)hftv0).c.isEmpty() || ((fvje)hftv0).d.isEmpty()) {
            throw new IOException("Invalid cached tile");
        }
        byte[] arr_b1 = ((fvje)hftv0).b.toByteArray();
        byte[] arr_b2 = ((fvje)hftv0).d.toByteArray();
        byte[] arr_b3 = ((fvje)hftv0).c.toByteArray();
        return fvji.c(2, arr_b1, this.a, arr_b2, arr_b3);
    }

    public final byte[] b(byte[] arr_b) {
        byte[] arr_b1 = new byte[8];
        byte[] arr_b2 = new byte[16];
        new SecureRandom().nextBytes(arr_b2);
        new SecureRandom().nextBytes(arr_b1);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fvje.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(fvji.c(1, arr_b, this.a, arr_b1, arr_b2));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fvje)hftp0.b_message).b = hfsf0;
        ByteString hfsf1 = ByteString.copyFrom(arr_b2);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fvje)hftp0.b_message).c = hfsf1;
        ByteString hfsf2 = ByteString.copyFrom(arr_b1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fvje)hftp0.b_message).d = hfsf2;
        return ((fvje)hftp0.N_build()).toBytesArray();
    }

    private static byte[] c(int v, byte[] arr_b, String s, byte[] arr_b1, byte[] arr_b2) {
        try {
            IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b2);
            Cipher cipher0 = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher0.init(v, new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(s.toCharArray(), arr_b1, 0x52C, 0x80)).getEncoded(), "AES"), ivParameterSpec0);
            return cipher0.doFinal(arr_b);
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeySpecException | InvalidKeyException | InvalidAlgorithmParameterException | BadPaddingException | IllegalBlockSizeException exception0) {
            throw new IOException(String.format("Failed to %s data", (v == 1 ? "encrypt" : "decrypt")), exception0);
        }
    }
}

