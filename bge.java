import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;

public final class bge implements bkq {
    public bgt a;
    private final bkq b;

    public bge(bkq bkq0) {
        this.b = bkq0;
    }

    @Override  // bkq
    public final int a() {
        return this.b.a();
    }

    @Override  // bkq
    public final int b() {
        return this.b.b();
    }

    @Override  // bkq
    public final int c() {
        return this.b.c();
    }

    @Override  // bkq
    public final int d() {
        return this.b.d();
    }

    @Override  // bkq
    public final Surface e() {
        return this.b.e();
    }

    @Override  // bkq
    public final bcn f() {
        return this.k(this.b.f());
    }

    @Override  // bkq
    public final bcn g() {
        return this.k(this.b.g());
    }

    @Override  // bkq
    public final void h() {
        this.b.h();
    }

    @Override  // bkq
    public final void i() {
        this.b.i();
    }

    @Override  // bkq
    public final void j(bkp bkp0, Executor executor0) {
        bgd bgd0 = new bgd(this, bkp0);
        this.b.j(bgd0, executor0);
    }

    private final bcn k(bcn bcn0) {
        bms bms0;
        if(bcn0 == null) {
            return null;
        }
        bgt bgt0 = this.a;
        if(bgt0 == null) {
            bms0 = bms.a;
        }
        else {
            Object object0 = bgt0.i.get(0);
            Pair pair0 = new Pair(bgt0.h, object0);
            ArrayMap arrayMap0 = new ArrayMap();
            arrayMap0.put(((String)pair0.first), pair0.second);
            bms0 = new bms(arrayMap0);
        }
        this.a = null;
        return new bdo(bcn0, new Size(bcn0.c(), bcn0.b()), new bqd(new buj(null, bms0, bcn0.e().c())));
    }
}

