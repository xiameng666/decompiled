import android.content.Context;

public final class byej {
    public static final boolean a(String s) {
        return ibuq.m(s, "android.credentials.TYPE_PASSWORD_CREDENTIAL") || ibuq.m(s, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL") || ibuq.m(s, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL");
    }

    public static final boolean b(String s, Context context0) {
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        return byes.a.contains(s) || new azql(context0).g(s);
    }

    public static final boolean c(String s, Context context0) {
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        return ibuq.m(s, "com.google.android.apps.restore") && new azql(context0).g(s);
    }
}

