import j..util.Objects;
import java.util.LinkedHashSet;

final class ibav implements Runnable {
    final ibay a;
    final ibaz b;

    public ibav(ibaz ibaz0, ibay ibay0) {
        this.a = ibay0;
        Objects.requireNonNull(ibaz0);
        this.b = ibaz0;
        super();
    }

    @Override
    public final void run() {
        ibaz ibaz0 = this.b;
        if(ibaz0.a.get() == ibbd.f) {
            ibbd ibbd0 = ibaz0.c;
            if(ibbd0.y == null) {
                ibbd0.y = new LinkedHashSet();
                ibbd0.S.c(ibbd0.z, true);
            }
            ibbd0.y.add(this.a);
            return;
        }
        this.a.j();
    }
}

