import android.os.Bundle;

public class kiu {
    public final String a;
    public final Bundle b;

    public kiu() {
        this(new Bundle());
    }

    public kiu(Bundle bundle0) {
        this("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle0);
    }

    public kiu(String s, Bundle bundle0) {
        ibuq.f(s, "type");
        ibuq.f(bundle0, "data");
        super();
        this.a = s;
        this.b = bundle0;
    }

    public kiu(String s, Bundle bundle0, byte[] arr_b) {
        ibuq.f(s, "type");
        ibuq.f(bundle0, "data");
        this(s, bundle0);
        if(s.length() > 0) {
            return;
        }
        throw new IllegalArgumentException("type should not be empty");
    }
}

