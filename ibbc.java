import j..util.Objects;
import java.util.Collection;
import java.util.HashSet;

final class ibbc {
    final Object a;
    Collection b;
    iapk c;
    final ibbd d;

    public ibbc(ibbd ibbd0) {
        Objects.requireNonNull(ibbd0);
        this.d = ibbd0;
        super();
        this.a = new Object();
        this.b = new HashSet();
    }

    final void a(iapk iapk0) {
        synchronized(this.a) {
            if(this.c != null) {
                return;
            }
            this.c = iapk0;
        }
        if(this.b.isEmpty()) {
            this.d.A.p(iapk0);
        }
    }
}

