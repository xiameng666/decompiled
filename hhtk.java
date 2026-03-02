import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.InvalidKeySpecException;

public final class hhtk {
    public static KeyFactory a() {
        try {
            return KeyFactory.getInstance("EC");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new RuntimeException(noSuchAlgorithmException0);
        }
    }

    public static PublicKey b(byte[] arr_b) {
        try {
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhuz.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return hhus.e(((hhuz)hftv0));
        }
        catch(hfur hfur0) {
            throw new InvalidKeySpecException("Unable to parse GenericPublicKey", hfur0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new InvalidKeySpecException("Unable to parse GenericPublicKey", illegalArgumentException0);
        }
    }

    public static byte[] c(PublicKey publicKey0) {
        publicKey0.getClass();
        if(!(publicKey0 instanceof ECPublicKey)) {
            throw new IllegalArgumentException("Expected ECPublicKey PublicKey type");
        }
        ECPublicKey eCPublicKey0 = hhus.g(publicKey0);
        ByteString hfsf0 = ByteString.copyFrom(new byte[]{0});
        ByteString hfsf1 = hhus.a(eCPublicKey0);
        if(hfsf1.size() < 33) {
            hfsf1 = ByteString.u(ggia.d(new ByteString[]{hfsf0, hfsf1}));
        }
        ByteString hfsf2 = hhus.b(eCPublicKey0);
        if(hfsf2.size() < 33) {
            hfsf2 = ByteString.u(ggia.d(new ByteString[]{hfsf0, hfsf2}));
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhuw.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hfsf1.getClass();
        ((hhuw)hftv0).b |= 1;
        ((hhuw)hftv0).c = hfsf1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhuw hhuw0 = (hhuw)hftp0.b_message;
        hfsf2.getClass();
        hhuw0.b |= 2;
        hhuw0.d = hfsf2;
        hhuw hhuw1 = (hhuw)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhuz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((hhuz)hftv1).c = 1;
        ((hhuz)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        hhuz hhuz0 = (hhuz)hftp1.b_message;
        hhuw1.getClass();
        hhuz0.d = hhuw1;
        hhuz0.b |= 2;
        return ((hhuz)hftp1.N_build()).toBytesArray();
    }

    public static byte[] d(PublicKey publicKey0) {
        return hhus.c(publicKey0).toBytesArray();
    }

    public static byte[] e(PrivateKey privateKey0) {
        return privateKey0.getEncoded();
    }
}

