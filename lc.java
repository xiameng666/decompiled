import j..util.DesugarCollections;
import java.util.List;

final class lc implements Runnable {
    final lo a;
    final ld b;

    public lc(ld ld0, lo lo0) {
        this.b = ld0;
        this.a = lo0;
        super();
    }

    @Override
    public final void run() {
        ld ld0 = this.b;
        lf lf0 = ld0.d;
        if(lf0.f == ld0.c) {
            List list0 = lf0.e;
            lf0.d = ld0.b;
            lf0.e = DesugarCollections.unmodifiableList(ld0.b);
            this.a.b(lf0.a);
            lf0.c(list0);
        }
    }
}

