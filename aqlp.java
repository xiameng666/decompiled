import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

public final class aqlp {
    public static arax a(SecretKey secretKey0, SecretKey secretKey1) {
        Cipher cipher0 = aqlp.c();
        cipher0.init(3, secretKey0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arax.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(cipher0.wrap(secretKey1));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arax arax0 = (arax)hftp0.b_message;
        arax0.b |= 4;
        arax0.e = hfsf0;
        ByteString hfsf1 = ByteString.copyFrom(cipher0.getIV());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((arax)hftv0).b |= 2;
        ((arax)hftv0).d = hfsf1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((arax)hftp0.b_message).c = 1;
        ((arax)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)arau.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((arau)hftp1.b_message).c = 1;
        ((arau)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arax arax1 = (arax)hftp0.b_message;
        arau arau0 = (arau)hftp1.N_build();
        arau0.getClass();
        arax1.f = arau0;
        arax1.b |= 8;
        return (arax)hftp0.N_build();
    }

    public static SecretKey b(SecretKey secretKey0, arax arax0) {
        String s = "AES_256_GCM";
        if(araw.a(arax0.c) == 2) {
            if((arax0.b & 8) == 0) {
                throw new aqli("Metadata missing from wrapped tertiary key.");
            }
            if(arat.a((arax0.f == null ? arau.a : arax0.f).c) == 2) {
                Cipher cipher0 = aqlp.c();
                try {
                    cipher0.init(4, secretKey0, new GCMParameterSpec(0x80, arax0.d.toByteArray()));
                }
                catch(InvalidAlgorithmParameterException invalidAlgorithmParameterException0) {
                    throw new aqli("Bad GCMParameterSpec", invalidAlgorithmParameterException0);
                }
                try {
                    return (SecretKey)cipher0.unwrap(arax0.e.toByteArray(), "AES", 3);
                }
                catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
                    throw new aqli("Unable to unwrap tertiary key", noSuchAlgorithmException0);
                }
            }
            Locale locale0 = Locale.US;
            arau arau0 = arax0.f == null ? arau.a : arax0.f;
            if(arat.a(arau0.c) == 0 || arat.a(arau0.c) == 1) {
                s = "UNKNOWN";
            }
            throw new aqli(String.format(locale0, "Wrapped key was unexpected %s algorithm. Only support AES/GCM/NoPadding.", s));
        }
        Locale locale1 = Locale.US;
        if(araw.a(arax0.c) == 0 || araw.a(arax0.c) == 1) {
            s = "UNKNOWN";
        }
        throw new aqli(String.format(locale1, "Could not unwrap key wrapped with %s algorithm", s));
    }

    private static Cipher c() {
        try {
            return Cipher.getInstance("AES/GCM/NoPadding");
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException exception0) {
            throw new aqli("AES/GCM/NoPadding not supported for (un)wrap of tertiary keys.", exception0);
        }
    }
}

