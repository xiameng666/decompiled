import android.util.Pair;
import j..util.Objects;

final class crzp implements Runnable {
    final Pair a;
    final boolean b;
    final crzq c;

    public crzp(crzq crzq0, Pair pair0, boolean z) {
        this.a = pair0;
        this.b = z;
        Objects.requireNonNull(crzq0);
        this.c = crzq0;
        super();
    }

    @Override
    public final void run() {
        crzd crzd0 = new crzd();
        crzd0.a = this.c.c;
        crzd0.b = this.c.d.a;
        crzd0.c = (Long)this.a.first;
        crzd0.d = (String)this.a.second;
        crzd0.e = true;
        crzd0.h = this.b ? 3 : 6;
        crzd0.f = this.c.b.f;
        crzd0.a().c();
    }
}

