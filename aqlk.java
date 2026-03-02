import android.content.Context;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.RecoveryController;
import javax.crypto.SecretKey;

public final class aqlk {
    public final String a;
    public final SecretKey b;
    private static final bboh c;
    private static final baun d;

    static {
        aqlk.c = bboh.b("FolsomSecondaryKey", bbcu.dF);
        aqlk.d = aqql.a("FolsomSecondaryKey");
    }

    public aqlk(String s, SecretKey secretKey0) {
        batl.s(s);
        this.a = s;
        batl.s(secretKey0);
        this.b = secretKey0;
    }

    public final int a(Context context0) {
        try {
            int v = RecoveryController.getInstance(context0).getRecoveryStatus(this.a);
            if(v == 3) {
                return 3;
            }
            if(v == 0) {
                return 2;
            }
            if(v == 1) {
                return 1;
            }
            throw new InternalRecoveryServiceException("Unexpected status from getRecoveryStatus: " + v);
        }
        catch(InternalRecoveryServiceException internalRecoveryServiceException0) {
            aqlk.d.p("Internal error getting recovery status", ((Throwable)internalRecoveryServiceException0), new Object[0]);
            long v1 = hqhn.c();
            aqqo.a(aqlk.c, ((Throwable)internalRecoveryServiceException0), v1);
            return 4;
        }
    }
}

