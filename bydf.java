import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import java.util.Collection;
import java.util.List;

public final class bydf {
    public static final Bundle a(Context context0, String s, String s1) {
        ibuq.f(context0, "context");
        ibuq.f(s, "callingPackage");
        Bundle bundle0 = new Bundle();
        bundle0.putString("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_ORIGIN", s1);
        bundle0.putString("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_PACKAGE_NAME", s);
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            PackageInfo packageInfo0 = packageManager0.getPackageInfo(s, 0x8000000);
            if(packageInfo0 != null) {
                SigningInfo signingInfo0 = packageInfo0.signingInfo;
                if(signingInfo0 != null) {
                    bundle0.putParcelable("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNING_INFO", signingInfo0);
                }
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return bundle0;
    }

    public static final boolean b(bych bych0, List list0) {
        ibuq.f(bych0, "credentialProviderInfo");
        ibuq.f(list0, "supportedCredentialTypes");
        if(bych0.c == null) {
            return false;
        }
        if((list0 instanceof Collection) && list0.isEmpty()) {
            return true;
        }
        for(Object object0: list0) {
            if(!bych0.b.contains(((String)object0))) {
                return false;
            }
        }
        return true;
    }
}

