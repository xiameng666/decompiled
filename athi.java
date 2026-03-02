import android.security.keystore.recovery.InternalRecoveryServiceException;
import java.security.InvalidKeyException;
import java.security.UnrecoverableKeyException;
import javax.crypto.SecretKey;

public final class athi {
    public static SecretKey a(atdn atdn0, aqys aqys0, String s, arax arax0, String s1) {
        gfsx gfsx0 = athi.b(atdn0, aqys0, s, s1);
        if(!gfsx0.i()) {
            if(hqjb.g()) {
                aqys0.v(14, 4, s1);
            }
            else {
                aqys0.y(14);
            }
            throw new atiu("No key:" + s);
        }
        try {
            return aqlp.b(((aqlk)gfsx0.d()).b, arax0);
        }
        catch(InvalidKeyException | aqli exception0) {
            if(hqjb.g()) {
                aqys0.v(25, 4, s1);
            }
            else {
                aqys0.y(25);
            }
            throw new atiy(exception0);
        }
    }

    private static gfsx b(atdn atdn0, aqys aqys0, String s, String s1) {
        try {
            return atdn0.a().c(s);
        }
        catch(InternalRecoveryServiceException | UnrecoverableKeyException exception0) {
            if(hqjb.g()) {
                aqys0.v(26, 4, s1);
            }
            else {
                aqys0.y(26);
            }
            throw new ativ("Could not retrieve key:" + s, exception0);
        }
    }
}

