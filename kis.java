import android.os.Bundle;

public class kis {
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final boolean d;
    public final boolean e;
    public final kir f;
    public final String g;
    public final boolean h;

    public kis(String s, Bundle bundle0, Bundle bundle1, boolean z, boolean z1, kir kir0, String s1, boolean z2) {
        ibuq.f(s, "type");
        ibuq.f(bundle0, "credentialData");
        ibuq.f(bundle1, "candidateQueryData");
        super();
        this.a = s;
        this.b = bundle0;
        this.c = bundle1;
        this.d = z;
        this.e = z1;
        this.f = kir0;
        this.g = s1;
        this.h = z2;
        bundle0.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z1);
        bundle0.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z2);
        bundle1.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z1);
    }
}

