import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.folsom.RecoveryRequest;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

public final class ajxq {
    public final Account a;
    public final ByteString b;
    public final ByteString c;
    public final CertPath d;
    public final ByteString e;
    public final int f;
    public final long g;
    public final ByteString h;
    private static final baun i;

    static {
        ajxq.i = akea.a("RecoveryDataHolder");
    }

    private ajxq(Account account0, ByteString hfsf0, ByteString hfsf1, CertPath certPath0, ByteString hfsf2, long v, int v1, ByteString hfsf3) {
        this.a = account0;
        this.b = hfsf0;
        this.c = hfsf1;
        this.d = certPath0;
        this.e = hfsf2;
        this.g = v;
        this.f = v1;
        this.h = hfsf3;
    }

    public static ajxq a(Bundle bundle0) {
        CertPath certPath0;
        Parcelable parcelable0 = bundle0.getParcelable("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT");
        if(parcelable0 == null) {
            throw new ajxr("Null com.google.android.gms.auth.folsom.EXTRA_ACCOUNT", 14);
        }
        Account account0 = (Account)(((Parcelable)Account.class.cast(parcelable0)));
        ByteString hfsf0 = ajxq.c(bundle0, "com.google.android.gms.auth.folsom.EXTRA_LSKF_HASH");
        ByteString hfsf1 = ajxq.c(bundle0, "com.google.android.gms.auth.folsom.EXTRA_CHALLENGE");
        ByteString hfsf2 = ajxq.c(bundle0, "com.google.android.gms.auth.folsom.EXTRA_VAULT_HANDLE");
        try {
            certPath0 = ajxq.e(bundle0);
            if(certPath0 == null) {
                ajxq.i.h("Received null CertPath for recovery", new Object[0]);
                throw new ajxr("Received null CertPath for recovery", 14);
            }
            ajxq.i.d("Received non-null CertPath for recovery.", new Object[0]);
        }
        catch(CertificateException certificateException0) {
            ajxq.i.h("Cannot decode the received CertPath", new Object[0]);
            throw new ajxr("Cannot decode the received CertPath", certificateException0, 14);
        }
        ByteString hfsf3 = ByteString.copyFrom(gqpc.f(((Certificate)certPath0.getCertificates().get(0)).getPublicKey()));
        ByteString hfsf4 = ajxq.c(bundle0, "com.google.android.gms.auth.folsom.EXTRA_COUNTER_ID");
        if(hfsf4.size() != 8) {
            throw new ajxr("Invalid number of bytes for CounterId", 14);
        }
        long v = ByteBuffer.wrap(hfsf4.toByteArray()).order(ByteOrder.LITTLE_ENDIAN).getLong();
        int v1 = bundle0.getInt("com.google.android.gms.auth.folsom.EXTRA_MAX_ATTEMPTS");
        if(v1 == 0) {
            v1 = 10;
        }
        return new ajxq(account0, hfsf0, hfsf1, certPath0, hfsf3, v, v1, hfsf2);
    }

    public static ajxq b(RecoveryRequest recoveryRequest0) {
        gmlt gmlt0;
        CertPath certPath0;
        aktv aktv0;
        String s = recoveryRequest0.a;
        ajxq.f(s, "accountName");
        Account account0 = new Account(s, (TextUtils.isEmpty(recoveryRequest0.b) ? "com.google" : recoveryRequest0.b));
        byte[] arr_b = recoveryRequest0.c;
        ajxq.f(arr_b, "secretHash");
        byte[] arr_b1 = recoveryRequest0.e;
        ajxq.f(arr_b1, "vaultChallenge");
        byte[] arr_b2 = recoveryRequest0.d;
        ajxq.f(arr_b2, "vaultParameters");
        byte[] arr_b3 = recoveryRequest0.f;
        ajxq.f(arr_b3, "vaultMetadata");
        try {
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aktv.a), arr_b3, 0, arr_b3.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            aktv0 = (aktv)hftv0;
        }
        catch(hfur hfur0) {
            throw new ajxr("Invalid VaultMetadata ", hfur0, 14);
        }
        try {
            certPath0 = ajxq.d(aktv0.i);
            if(certPath0 == null) {
                ajxq.i.h("Received null CertPath for recovery", new Object[0]);
                throw new ajxr("Received null CertPath for recovery", 14);
            }
            ajxq.i.d("Received non-null CertPath for recovery.", new Object[0]);
        }
        catch(CertificateException certificateException0) {
            ajxq.i.h("Cannot decode the received CertPath", new Object[0]);
            throw new ajxr("Cannot decode the received CertPath", certificateException0, 14);
        }
        ByteString hfsf0 = ByteString.copyFrom(gqpc.f(((Certificate)certPath0.getCertificates().get(0)).getPublicKey()));
        try {
            ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gmlt.a), arr_b2, 0, arr_b2.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv1);
            gmlt0 = (gmlt)hftv1;
        }
        catch(hfur hfur1) {
            throw new ajxr("Invalid VaultParameters ", hfur1, 14);
        }
        ByteString hfsf1 = gmlt0.c;
        if(hfsf1.size() != 8) {
            throw new ajxr("Invalid number of bytes for CounterId", 14);
        }
        long v = ByteBuffer.wrap(hfsf1.toByteArray()).order(ByteOrder.LITTLE_ENDIAN).getLong();
        int v1 = gmlt0.d == 0 ? 10 : gmlt0.d;
        ByteString hfsf2 = gmlt0.e;
        if(!hfsf2.isEmpty()) {
            return new ajxq(account0, ByteString.copyFrom(arr_b), ByteString.copyFrom(arr_b1), certPath0, hfsf0, v, v1, hfsf2);
        }
        throw new ajxr("Missing vaultHandle", 14);
    }

    private static ByteString c(Bundle bundle0, String s) {
        byte[] arr_b = bundle0.getByteArray(s);
        if(arr_b != null) {
            return ByteString.copyFrom(arr_b);
        }
        throw new ajxr("Null " + s, 14);
    }

    private static CertPath d(ByteString hfsf0) {
        if(hfsf0.isEmpty()) {
            return null;
        }
        try {
            return CertificateFactory.getInstance("X.509").generateCertPath(hfsf0.newInput(), "PkiPath");
        }
        catch(CertificateException certificateException0) {
            throw new RuntimeException(certificateException0);
        }
    }

    private static CertPath e(Bundle bundle0) {
        byte[] arr_b = bundle0.getByteArray("com.google.android.gms.auth.folsom.EXTRA_CERT_PATH");
        if(arr_b != null && arr_b.length != 0) {
            try {
                return CertificateFactory.getInstance("X.509").generateCertPath(new ByteArrayInputStream(arr_b), "PkiPath");
            }
            catch(CertificateException certificateException0) {
                throw new RuntimeException(certificateException0);
            }
        }
        return null;
    }

    private static void f(Object object0, String s) {
        if(object0 != null) {
            return;
        }
        throw new ajxr("Null " + s, 14);
    }
}

