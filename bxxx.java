import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.SigningInfo;
import android.os.Bundle;

public final class bxxx {
    public final String a;
    public final Context b;
    public final ComponentName c;
    public bydh d;
    public bydh e;
    public bydh f;
    public final bboh g;

    public bxxx(String s, Context context0, ComponentName componentName0) {
        ComponentName componentName1;
        if(componentName0 == null) {
            bych bych0 = (bych)ibpo.T(new byce(context0).a(bycd.c));
            componentName1 = bych0 == null ? null : bych0.d;
        }
        else {
            componentName1 = bycg.a(context0, componentName0, false).d;
        }
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        super();
        this.a = s;
        this.b = context0;
        this.c = componentName1;
        this.g = bboh.b("IdentityDeviceSetupManager", bbcu.fN);
    }

    public static Bundle a(bxxx bxxx0, String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_ORIGIN", null);
        bundle0.putString("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_PACKAGE_NAME", s);
        PackageManager packageManager0 = bxxx0.b.getPackageManager();
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
}

