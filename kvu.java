import android.content.pm.SigningInfo;
import android.os.Bundle;

public final class kvu {
    public static final kvx a(String s, SigningInfo signingInfo0, String s1) {
        ibuq.f(s, "packageName");
        ibuq.f(signingInfo0, "signingInfo");
        return new kvx(s, signingInfo0, s1);
    }

    public static final void b(Bundle bundle0, kvx kvx0) {
        ibuq.f(kvx0, "info");
        bundle0.putString("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_ORIGIN", kvx0.b);
        bundle0.putString("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_PACKAGE_NAME", kvx0.a);
        bundle0.putParcelable("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNING_INFO", kvx0.a());
    }

    public static final kvx c(Bundle bundle0) {
        ibuq.f(bundle0, "bundle");
        String s = bundle0.getString("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_ORIGIN");
        String s1 = bundle0.getString("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_PACKAGE_NAME");
        if(s1 != null) {
            SigningInfo signingInfo0 = (SigningInfo)bundle0.getParcelable("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNING_INFO");
            return signingInfo0 == null ? null : kvu.a(s1, signingInfo0, s);
        }
        return null;
    }
}

