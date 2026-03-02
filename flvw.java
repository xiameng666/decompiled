import android.util.Pair;
import java.util.ArrayDeque;

public final class flvw {
    public gmcd a;
    private final ArrayDeque b;

    public flvw() {
        this.b = new ArrayDeque();
        this.a = null;
    }

    public final gmcd a(glzm glzm0) {
        gmcd gmcd0;
        synchronized(this) {
            gmcd0 = new gmcu();
            Pair pair0 = new Pair(gmcd0, glzm0);
            this.b.add(pair0);
            if(this.a == null) {
                this.b();
            }
        }
        return gmcd0;
    }

    public final void b() {
        gmcd gmcd0;
        synchronized(this) {
            Pair pair0 = (Pair)this.b.poll();
            if(pair0 == null) {
                return;
            }
            try {
                gmcd0 = ((glzm)pair0.second).a();
                this.a = gmcd0;
            }
            catch(Throwable throwable0) {
                ((gmcu)pair0.first).r(throwable0);
                this.a = null;
                this.c(throwable0);
                return;
            }
            gmcd0.hB(new flvu(this, pair0), gmap.a);
        }
    }

    public final void c(Throwable throwable0) {
        synchronized(this) {
            Pair pair0;
            while((pair0 = (Pair)this.b.poll()) != null) {
                ((gmcu)pair0.first).r(new flvv(throwable0));
            }
        }
    }
}

