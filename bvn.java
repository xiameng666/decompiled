import java.util.Objects;

public final class bvn implements blc {
    public final bik a;
    public final bvy b;
    public gmcd c;
    public boolean d;
    private final lqi e;
    private bvx f;

    public bvn(bik bik0, lqi lqi0, bvy bvy0) {
        this.d = false;
        this.a = bik0;
        this.e = lqi0;
        this.b = bvy0;
        synchronized(this) {
            this.f = (bvx)lqi0.ij();
        }
    }

    public final void a() {
        gmcd gmcd0 = this.c;
        if(gmcd0 != null) {
            gmcd0.cancel(false);
            this.c = null;
        }
    }

    public final void b(bvx bvx0) {
        synchronized(this) {
            if(this.f.equals(bvx0)) {
                return;
            }
            this.f = bvx0;
        }
        Objects.toString(bvx0);
        bcs.h("StreamStateObserver");
        this.e.ii(bvx0);
    }
}

