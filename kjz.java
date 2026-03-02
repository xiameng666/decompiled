import android.os.Bundle;

public final class kjz {
    public static final Bundle a(kka kka0) {
        ibuq.f(kka0, "request");
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle0.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", kka0.c);
        bundle0.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        return bundle0;
    }
}

