import android.os.Bundle;

public final class kve extends kva {
    public final String d;
    public final byte[] e;

    public kve(String s, kvx kvx0, Bundle bundle0, byte[] arr_b) {
        ibuq.f(s, "requestJson");
        ibuq.f(bundle0, "candidateQueryData");
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle0, kvx0);
        this.d = s;
        this.e = arr_b;
        if(!kyi.a(s)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
        bundle0.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", s);
    }
}

