import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import com.google.android.gms.chimera.modules.auth.easyunlock.AppContextProvider;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import javax.crypto.SecretKey;

public final class ajla {
    public static final bboh a;
    private final ajes b;
    private final ExecutorService c;

    static {
        ajla.a = ajlr.a("ChallengeDecryptor");
    }

    public ajla(Context context0) {
        ajes ajes0 = new ajes(context0);
        bblp bblp0 = new bblp(1, 9);
        super();
        this.b = ajes0;
        this.c = bblp0;
    }

    public final gmcd a(byte[] arr_b, byte[] arr_b1) {
        ProtoLiteMessage hftv1;
        hfsl hfsl0;
        ProtoLiteMessage hftv0;
        hftc hftc0;
        try {
            hhvf hhvf0 = hhvf.a;
            hftc0 = hftc.a;
            hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhvf0), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            int v = ((hhvf)hftv0).b;
            if((v & 1) == 0) {
                throw new ajku("Missing header and body in encrypted message wrapper");
            }
            if((v & 2) == 0) {
                throw new ajku("Missing transport binding signature");
            }
            hfsl0 = ((hhvf)hftv0).c.k();
            hftv1 = ((ProtoLiteMessage)hhvf0).x_newMutableInstance();
        }
        catch(InvalidKeySpecException | hfur exception0) {
            throw new ajku("Error parsing the message.", exception0);
        }
        try {
            hfwc hfwc0 = hfvu.a.c(hftv1);
            hfwc0.l(hftv1, hfsm.p(hfsl0), hftc0);
            hfwc0.g(hftv1);
            goto label_34;
        }
        catch(hfur hfur0) {
        }
        catch(hfwr hfwr0) {
            goto label_21;
        }
        catch(IOException iOException0) {
            goto label_25;
        }
        catch(RuntimeException runtimeException0) {
            goto label_31;
        }
        catch(InvalidKeySpecException exception0) {
            throw new ajku("Error parsing the message.", exception0);
        }
        try {
            if(hfur0.b) {
                hfur0 = new hfur(hfur0);
            }
            hfur0.a = hftv1;
            throw hfur0;
        label_21:
            hfur hfur1 = hfwr0.a();
            hfur1.a = hftv1;
            throw hfur1;
        label_25:
            if((iOException0.getCause() instanceof hfur)) {
                throw (hfur)iOException0.getCause();
            }
            hfur hfur2 = new hfur(iOException0);
            hfur2.a = hftv1;
            throw hfur2;
        label_31:
            if((runtimeException0.getCause() instanceof hfur)) {
                throw (hfur)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
        catch(InvalidKeySpecException | hfur exception0) {
            throw new ajku("Error parsing the message.", exception0);
        }
        try {
        label_34:
            hfsl0.z(0);
            goto label_39;
        }
        catch(hfur hfur3) {
            try {
                hfur3.a = hftv1;
                throw hfur3;
            label_39:
                ProtoLiteMessage.P_makeImmutable(hftv1);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                hhva hhva0 = hhuu.a(((hhvf)hftv1));
                if((hhva0.b & 8) == 0) {
                    throw new ajku("Missing decryptionKeyId in encrypted message");
                }
                PublicKey publicKey0 = ajla.c(hhva0.f);
                gmcd gmcd0 = new gmcu();
                byte[] arr_b2 = hhtk.d(publicKey0);
                gmcu gmcu0 = new gmcu();
                List list0 = bbmn.h(AppContextProvider.a(), "com.google.android.gms");
                if(list0.isEmpty()) {
                    throw new ajku("No account found.");
                }
                Account account0 = (Account)list0.get(0);
                ClientPublicKey clientPublicKey0 = new ClientPublicKey(arr_b2);
                evql evql0 = this.b.h(account0, clientPublicKey0);
                ajkx ajkx0 = new ajkx(gmcu0);
                evql0.s(this.c, ajkx0);
                gmbu.t(gmcu0, new ajky(this, ((hhvf)hftv0), arr_b1, ((gmcu)gmcd0)), gmap.a);
                return gmcd0;
            }
            catch(InvalidKeySpecException | hfur exception0) {
                throw new ajku("Error parsing the message.", exception0);
            }
        }
        catch(InvalidKeySpecException exception0) {
            throw new ajku("Error parsing the message.", exception0);
        }
    }

    public static final byte[] b(hhvf hhvf0, SecretKey secretKey0, byte[] arr_b) {
        ProtoLiteMessage hftv1;
        hfsl hfsl1;
        ProtoLiteMessage hftv0;
        hfsl hfsl0;
        byte[] arr_b1;
        try {
            arr_b1 = hhvf0.d.toByteArray();
            hfsl0 = hhvf0.c.k();
            hftv0 = ((ProtoLiteMessage)hhvf.a).x_newMutableInstance();
        }
        catch(NoSuchAlgorithmException | InvalidKeyException | InvalidKeySpecException | SignatureException | hfur exception0) {
            throw new ajku("Error when decrypting the message.", exception0);
        }
        try {
            hfwc hfwc0 = hfvu.a.c(hftv0);
            hfwc0.l(hftv0, hfsm.p(hfsl0), hftc.a);
            hfwc0.g(hftv0);
            goto label_26;
        }
        catch(hfur hfur0) {
        }
        catch(hfwr hfwr0) {
            goto label_13;
        }
        catch(IOException iOException0) {
            goto label_17;
        }
        catch(RuntimeException runtimeException0) {
            goto label_23;
        }
        catch(NoSuchAlgorithmException | InvalidKeyException | InvalidKeySpecException | SignatureException exception0) {
            throw new ajku("Error when decrypting the message.", exception0);
        }
        try {
            if(hfur0.b) {
                hfur0 = new hfur(hfur0);
            }
            hfur0.a = hftv0;
            throw hfur0;
        label_13:
            hfur hfur1 = hfwr0.a();
            hfur1.a = hftv0;
            throw hfur1;
        label_17:
            if((iOException0.getCause() instanceof hfur)) {
                throw (hfur)iOException0.getCause();
            }
            hfur hfur2 = new hfur(iOException0);
            hfur2.a = hftv0;
            throw hfur2;
        label_23:
            if((runtimeException0.getCause() instanceof hfur)) {
                throw (hfur)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
        catch(NoSuchAlgorithmException | InvalidKeyException | InvalidKeySpecException | SignatureException | hfur exception0) {
            throw new ajku("Error when decrypting the message.", exception0);
        }
        try {
        label_26:
            hfsl0.z(0);
            goto label_31;
        }
        catch(hfur hfur3) {
            try {
                hfur3.a = hftv0;
                throw hfur3;
            label_31:
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                hhvb hhvb0 = hhuu.b(((hhvf)hftv0), secretKey0, hhuq.a, secretKey0, hhup.b);
                if((hhvb0.b & 2) == 0) {
                    throw new ajku("Missing body in encrypted message");
                }
                hfsl1 = hhvb0.d.k();
                hftv1 = ((ProtoLiteMessage)hhvb.a).x_newMutableInstance();
            }
            catch(NoSuchAlgorithmException | InvalidKeyException | InvalidKeySpecException | SignatureException | hfur exception0) {
                throw new ajku("Error when decrypting the message.", exception0);
            }
            try {
                hfwc hfwc1 = hfvu.a.c(hftv1);
                hfwc1.l(hftv1, hfsm.p(hfsl1), hftc.a);
                hfwc1.g(hftv1);
                goto label_61;
            }
            catch(hfur hfur4) {
            }
            catch(hfwr hfwr1) {
                goto label_48;
            }
            catch(IOException iOException1) {
                goto label_52;
            }
            catch(RuntimeException runtimeException1) {
                goto label_58;
            }
            catch(NoSuchAlgorithmException | InvalidKeyException | InvalidKeySpecException | SignatureException exception0) {
                throw new ajku("Error when decrypting the message.", exception0);
            }
            try {
                if(hfur4.b) {
                    hfur4 = new hfur(hfur4);
                }
                hfur4.a = hftv1;
                throw hfur4;
            label_48:
                hfur hfur5 = hfwr1.a();
                hfur5.a = hftv1;
                throw hfur5;
            label_52:
                if((iOException1.getCause() instanceof hfur)) {
                    throw (hfur)iOException1.getCause();
                }
                hfur hfur6 = new hfur(iOException1);
                hfur6.a = hftv1;
                throw hfur6;
            label_58:
                if((runtimeException1.getCause() instanceof hfur)) {
                    throw (hfur)runtimeException1.getCause();
                }
                throw runtimeException1;
            }
            catch(NoSuchAlgorithmException | InvalidKeyException | InvalidKeySpecException | SignatureException | hfur exception0) {
                throw new ajku("Error when decrypting the message.", exception0);
            }
            try {
            label_61:
                hfsl1.z(0);
                goto label_66;
            }
            catch(hfur hfur7) {
            }
            catch(NoSuchAlgorithmException | InvalidKeyException | InvalidKeySpecException | SignatureException exception0) {
                throw new ajku("Error when decrypting the message.", exception0);
            }
            try {
                hfur7.a = hftv1;
                throw hfur7;
            label_66:
                ProtoLiteMessage.P_makeImmutable(hftv1);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                int v = ((hhvb)hftv1).b;
                if((v & 1) == 0 || (v & 2) == 0) {
                    throw new ajku("Missing header or body in decrypted message");
                }
                hhva hhva0 = ((hhvb)hftv1).c;
                if(hhva0 == null) {
                    hhva0 = hhva.a;
                }
                if((hhva0.b & 4) == 0) {
                    throw new ajku("Missing verification key in decrypted message");
                }
                PublicKey publicKey0 = ajla.c(hhva0.e);
                ProtoLiteMessage hftv2 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhvf.a), arr_b1, 0, arr_b1.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv2);
                hhuu.d(((hhvf)hftv2), publicKey0, hhuq.c, arr_b);
                return ((hhvb)hftv1).d.toByteArray();
            }
            catch(NoSuchAlgorithmException | InvalidKeyException | InvalidKeySpecException | SignatureException | hfur exception0) {
                throw new ajku("Error when decrypting the message.", exception0);
            }
        }
        catch(NoSuchAlgorithmException | InvalidKeyException | InvalidKeySpecException | SignatureException exception0) {
            throw new ajku("Error when decrypting the message.", exception0);
        }
    }

    private static final PublicKey c(ByteString hfsf0) {
        hfsl hfsl0 = hfsf0.k();
        ProtoLiteMessage hftv0 = ((ProtoLiteMessage)hhuz.a).x_newMutableInstance();
        try {
            hfwc hfwc0 = hfvu.a.c(hftv0);
            hfwc0.l(hftv0, hfsm.p(hfsl0), hftc.a);
            hfwc0.g(hftv0);
        }
        catch(hfur hfur0) {
            if(hfur0.b) {
                hfur0 = new hfur(hfur0);
            }
            hfur0.a = hftv0;
            throw hfur0;
        }
        catch(hfwr hfwr0) {
            hfur hfur1 = hfwr0.a();
            hfur1.a = hftv0;
            throw hfur1;
        }
        catch(IOException iOException0) {
            if((iOException0.getCause() instanceof hfur)) {
                throw (hfur)iOException0.getCause();
            }
            hfur hfur2 = new hfur(iOException0);
            hfur2.a = hftv0;
            throw hfur2;
        }
        catch(RuntimeException runtimeException0) {
            if((runtimeException0.getCause() instanceof hfur)) {
                throw (hfur)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
        try {
            hfsl0.z(0);
        }
        catch(hfur hfur3) {
            hfur3.a = hftv0;
            throw hfur3;
        }
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        return hhus.e(((hhuz)hftv0));
    }
}

