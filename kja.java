import android.os.Bundle;

public final class kja extends kis {
    public final String i;
    public final byte[] j;
    public final boolean k;

    public kja(String s, byte[] arr_b, String s1, int v) {
        ibuq.f(s, "requestJson");
        kir kir0 = kiz.a(s);
        ibuq.f(s, "requestJson");
        Bundle bundle0 = new Bundle();
        bundle0.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
        bundle0.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", s);
        if((v & 2) != 0) {
            arr_b = null;
        }
        bundle0.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", arr_b);
        ibuq.f(s, "requestJson");
        Bundle bundle1 = new Bundle();
        bundle1.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
        bundle1.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", s);
        bundle1.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", arr_b);
        this(s, arr_b, false, (v & 4) == 0, kir0, ((v & 8) == 0 ? s1 : null), bundle0, bundle1, false);
    }

    public kja(String s, byte[] arr_b, boolean z, boolean z1, kir kir0, String s1, Bundle bundle0, Bundle bundle1, boolean z2) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle0, bundle1, false, z, kir0, s1, z1);
        this.i = s;
        this.j = arr_b;
        this.k = z2;
        if(!kmq.a(s)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
        if(z2) {
            bundle1.putBoolean("androidx.credentials.BUNDLE_KEY_IS_CONDITIONAL_REQUEST", true);
        }
    }
}

