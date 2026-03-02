import android.os.Bundle;

public final class kjx extends kjf {
    public final String c;

    public kjx(String s) {
        ibuq.f(s, "credentialJson");
        ibuq.f(s, "responseJson");
        Bundle bundle0 = new Bundle();
        bundle0.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", s);
        this(s, bundle0);
    }

    public kjx(String s, Bundle bundle0) {
        super("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", bundle0);
        this.c = s;
        if(kmq.a(s)) {
            return;
        }
        throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
    }
}

