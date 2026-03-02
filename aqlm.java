import android.content.Context;
import android.content.Intent;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.RecoveryController;
import com.google.android.chimera.IntentOperation;
import java.security.SecureRandom;
import javax.crypto.SecretKey;

public final class aqlm {
    private final Context a;
    private final SecureRandom b;

    public aqlm(Context context0, SecureRandom secureRandom0) {
        gftb.check(context0);
        this.a = context0;
        this.b = secureRandom0;
    }

    public final aqlk a() {
        byte[] arr_b = new byte[16];
        this.b.nextBytes(arr_b);
        String s = "com.google.android.gms.backup/folsom/" + ghjc.f.o(arr_b);
        RecoveryController recoveryController0 = this.f();
        recoveryController0.generateKey(s);
        this.d();
        SecretKey secretKey0 = (SecretKey)recoveryController0.getKey(s);
        if(secretKey0 != null) {
            return new aqlk(s, secretKey0);
        }
        throw new InternalRecoveryServiceException(String.format("Generated key %s but then could not get it back immediately afterwards.", s));
    }

    public static aqlm b(Context context0) {
        return new aqlm(context0, new SecureRandom());
    }

    public final gfsx c(String s) {
        return gfsx.l(((SecretKey)this.f().getKey(s))).b(new aqll(s));
    }

    public final void d() {
        Context context0 = this.a;
        Intent intent0 = IntentOperation.getStartIntent(context0, "com.google.android.gms.auth.folsom.operation.RecoverableKeyGeneratedIntentOperation", "com.google.android.gms.auth.folsom.RECOVERABLE_KEY_GENERATED");
        if(intent0 != null) {
            context0.startService(intent0);
        }
    }

    public final void e(String s) {
        this.f().removeKey(s);
        this.d();
    }

    private final RecoveryController f() {
        return RecoveryController.getInstance(this.a);
    }
}

