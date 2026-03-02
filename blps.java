import android.content.Context;
import android.security.KeyChain;
import android.security.KeyChainException;
import java.security.PrivateKey;

public final class blps {
    private final Context a;

    public blps(Context context0) {
        gftb.check(context0);
        this.a = context0;
    }

    public final gfsx a(String s) {
        try {
            PrivateKey privateKey0 = KeyChain.getPrivateKey(this.a, s);
            return privateKey0 != null ? gfsx.m(privateKey0) : gfqx.a;
        }
        catch(InterruptedException | KeyChainException exception0) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.c = exception0;
            bxly0.b = "Unable to check if the key exist in the Android KeyChain";
            throw bxly0.a();
        }
    }
}

