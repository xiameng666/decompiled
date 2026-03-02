import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import j..util.Collection.-EL;
import java.security.MessageDigest;
import java.util.Collection;

public final class fsha {
    public static final int a(Context context0, String s, long v, Collection collection0) {
        PackageInfo packageInfo0;
        ibuq.f(context0, "context");
        ibuq.f(collection0, "allowedCertificateSha256s");
        try {
            if(collection0.isEmpty()) {
                packageInfo0 = context0.getPackageManager().getPackageInfo(s, 0);
                ibuq.e(packageInfo0, "getPackageInfo(...)");
            }
            else {
                packageInfo0 = context0.getPackageManager().getPackageInfo(s, 0x8000000);
                ibuq.e(packageInfo0, "getPackageInfo(...)");
                SigningInfo signingInfo0 = packageInfo0.signingInfo;
                if(signingInfo0 == null || signingInfo0.getSigningCertificateHistory() == null) {
                    return 5;
                }
                MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-256");
                ibuq.e(messageDigest0, "getInstance(...)");
                Signature[] arr_signature = signingInfo0.getSigningCertificateHistory();
                ibuq.e(arr_signature, "getSigningCertificateHistory(...)");
                if(!Collection.-EL.stream(ibpg.N(arr_signature)).map(new fsgt(new fsgs())).map(new fsgv(new fsgu(messageDigest0))).map(new fsgx(new fsgw())).anyMatch(new fsgy(new fsgz(collection0)))) {
                    return 5;
                }
            }
            return packageInfo0.getLongVersionCode() >= v ? 2 : 4;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return 3;
        }
        return 2;
    }

    public static int b(Context context0, String s, long v) {
        return fsha.a(context0, s, v, ggna.a);
    }
}

