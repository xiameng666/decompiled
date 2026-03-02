import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;

public final class kvr {
    public static final kvs a(Bundle bundle0) {
        try {
            if(bundle0.containsKey("androidx.credentials.provider.BUNDLE_HINT_ALLOWED_AUTHENTICATORS")) {
                return new kvs(bundle0.getInt("androidx.credentials.provider.BUNDLE_HINT_ALLOWED_AUTHENTICATORS"), true);
            }
            throw new IllegalArgumentException("Bundle lacks allowed authenticator key.");
        }
        catch(Exception exception0) {
            Log.i("BiometricPromptData", "fromSlice failed with: " + exception0.getMessage());
            return null;
        }
    }

    public static final Bundle b(kvs kvs0) {
        if(Build.VERSION.SDK_INT >= 35) {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("androidx.credentials.provider.BUNDLE_HINT_ALLOWED_AUTHENTICATORS", kvs0.a);
            return bundle0;
        }
        Bundle bundle1 = new Bundle();
        bundle1.putInt("androidx.credentials.provider.BUNDLE_HINT_ALLOWED_AUTHENTICATORS", kvs0.a);
        return bundle1;
    }
}

