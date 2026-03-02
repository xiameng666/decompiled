import android.os.Bundle;

public final class kvq extends kvg {
    public final String d;
    public final byte[] e;

    public kvq(Bundle bundle0, String s, String s1, byte[] arr_b) {
        ibuq.f(bundle0, "candidateQueryData");
        ibuq.f(s, "id");
        ibuq.f(s1, "requestJson");
        super(s, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle0);
        this.d = s1;
        this.e = arr_b;
        if(kyi.a(s1)) {
            return;
        }
        throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
    }
}

