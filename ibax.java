import j..util.Objects;
import java.util.Collection;

final class ibax implements Runnable {
    final ibay a;

    public ibax(ibay ibay0) {
        Objects.requireNonNull(ibay0);
        this.a = ibay0;
        super();
    }

    @Override
    public final void run() {
        ibay ibay0 = this.a;
        ibbd ibbd0 = ibay0.f.c;
        Collection collection0 = ibbd0.y;
        if(collection0 != null) {
            collection0.remove(ibay0);
            if(ibbd0.y.isEmpty()) {
                ibbd0.S.c(ibbd0.z, false);
                ibbd0.y = null;
                if(ibbd0.C.get()) {
                    ibbd0.B.a(ibbd.c);
                }
            }
        }
    }
}

