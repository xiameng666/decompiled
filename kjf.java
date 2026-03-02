import android.os.Bundle;

public class kjf {
    public final String a;
    public final Bundle b;

    public kjf(String s, Bundle bundle0) {
        ibuq.f(s, "type");
        ibuq.f(bundle0, "data");
        super();
        this.a = s;
        this.b = bundle0;
    }

    public kjf(String s, Bundle bundle0, byte[] arr_b) {
        ibuq.f(s, "type");
        ibuq.f(bundle0, "data");
        this(s, bundle0);
        if(s.length() > 0) {
            return;
        }
        throw new IllegalArgumentException("type should not be empty");
    }
}

