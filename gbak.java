import android.os.Bundle;

public final class gbak extends gazo {
    public gbak(fbbj fbbj0, Bundle bundle0) {
        ibuq.f(fbbj0, "contextData");
        super(fbbj0, bundle0);
        fbbk fbbk0 = fbbj0.b == 1 ? ((fbbk)fbbj0.c) : fbbk.a;
        if(((fbbk0.c == null ? gkyr.a : fbbk0.c).b & 1) != 0 && (((fbbj0.b == 1 ? ((fbbk)fbbj0.c) : fbbk.a).b & 2) != 0 && ((fbbj0.b == 1 ? ((fbbk)fbbj0.c) : fbbk.a).b & 4) != 0)) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public final int a() {
        fbbk fbbk0 = this.a.b == 1 ? ((fbbk)this.a.c) : fbbk.a;
        return (fbbk0.c == null ? gkyr.a : fbbk0.c).c;
    }
}

