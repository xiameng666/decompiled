import android.os.Bundle;

public final class gazl extends gazo {
    public gazl(fbbj fbbj0, Bundle bundle0) {
        ibuq.f(fbbj0, "contextData");
        super(fbbj0, bundle0);
        ibuq.f(fbbj0, "<this>");
        gkyf gkyf0 = null;
        fbbi fbbi0 = fbbj0.b == 2 ? ((fbbi)fbbj0.c) : null;
        if(fbbi0 != null && (fbbi0.b & 1) != 0) {
            gkyf0 = fbbi0.c;
            if(gkyf0 == null) {
                gkyf0 = gkyf.a;
            }
        }
        if(gkyf0 != null) {
            return;
        }
        throw new IllegalArgumentException();
    }
}

