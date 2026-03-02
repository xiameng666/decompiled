import android.os.Bundle;

public class kva {
    public final String a;
    public final Bundle b;
    public final kvx c;

    public kva(String s, Bundle bundle0, kvx kvx0) {
        ibuq.f(s, "type");
        ibuq.f(bundle0, "candidateQueryData");
        super();
        this.a = s;
        this.b = bundle0;
        this.c = kvx0;
    }

    public kva(String s, Bundle bundle0, kvx kvx0, byte[] arr_b) {
        ibuq.f(s, "type");
        ibuq.f(bundle0, "candidateQueryData");
        this(s, bundle0, kvx0);
        if(s.length() > 0) {
            return;
        }
        throw new IllegalArgumentException("type should not be empty");
    }
}

