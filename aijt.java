import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.authzen.legacy.internal.OtpSecret;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import com.google.android.gms.common.api.Status;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class aijt extends cjtm {
    private static final byte[] a;
    private static final byte[] b;
    private final String c;
    private static final baun d;
    private final aijr e;

    static {
        aijt.d = new baun(new String[]{"AuthZenSecretProviderOperation"});
        aijt.a = new byte[]{71, 0x6F, 0x6F, 103, 108, 101, 0x4F, 102, 102, 108, 105, 110, 101, 0x4F, 84, 80};
        aijt.b = new byte[]{84, 72, 0x4F, 84, 80};
    }

    public aijt(aijr aijr0, String s) {
        super(107, "AuthZenSecretProvider");
        batl.s(aijr0);
        this.e = aijr0;
        batl.s(s);
        this.c = s;
    }

    static SecretKeySpec b(SecretKey secretKey0) {
        try {
            MessageDigest messageDigest0 = bbms.g("SHA256");
            return messageDigest0 == null ? null : new SecretKeySpec(hhur.k(secretKey0, messageDigest0.digest(aijt.a), aijt.b), "");
        }
        catch(GeneralSecurityException generalSecurityException0) {
            aijt.d.g("Unexpected exception in key derivation.", generalSecurityException0, new Object[0]);
            return null;
        }
    }

    @Override  // cjtm
    public final void f(Context context0) {
        long v;
        SecretKeySpec secretKeySpec0;
        try {
            Account account0 = new Account(this.c, "com.google");
            ExportedSymmetricKey exportedSymmetricKey0 = (ExportedSymmetricKey)aihk.a(new ajes(context0).j(account0));
            secretKeySpec0 = new SecretKeySpec(exportedSymmetricKey0.b, "AES");
            v = exportedSymmetricKey0.c;
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            aijt.d.g("Failed to retrieve key", exception0, new Object[0]);
            this.e.a(Status.d, null);
            return;
        }
        SecretKeySpec secretKeySpec1 = aijt.b(secretKeySpec0);
        if(secretKeySpec1 == null) {
            aijt.d.f("Failed to derive secret for %s.", new Object[]{baun.q(this.c)});
            this.e.a(Status.d, null);
            return;
        }
        byte[] arr_b = secretKeySpec1.getEncoded();
        OtpSecret otpSecret0 = new OtpSecret(1, this.c, arr_b, v);
        this.e.a(Status.b, otpSecret0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.e.a(status0, null);
    }
}

