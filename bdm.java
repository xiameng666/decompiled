import android.view.Surface;
import java.util.concurrent.Executor;

public final class bdm implements bkq {
    public final Object a;
    public int b;
    public boolean c;
    public final bkq d;
    public bav e;
    private final Surface f;
    private final bav g;

    public bdm(bkq bkq0) {
        this.a = new Object();
        this.b = 0;
        this.c = false;
        this.g = new bdl(this);
        this.d = bkq0;
        this.f = bkq0.e();
    }

    @Override  // bkq
    public final int a() {
        synchronized(this.a) {
        }
        return this.d.a();
    }

    @Override  // bkq
    public final int b() {
        synchronized(this.a) {
        }
        return this.d.b();
    }

    @Override  // bkq
    public final int c() {
        synchronized(this.a) {
        }
        return this.d.c();
    }

    @Override  // bkq
    public final int d() {
        synchronized(this.a) {
        }
        return this.d.d();
    }

    @Override  // bkq
    public final Surface e() {
        synchronized(this.a) {
        }
        return this.d.e();
    }

    @Override  // bkq
    public final bcn f() {
        synchronized(this.a) {
        }
        return this.l(this.d.f());
    }

    @Override  // bkq
    public final bcn g() {
        synchronized(this.a) {
        }
        return this.l(this.d.g());
    }

    @Override  // bkq
    public final void h() {
        synchronized(this.a) {
            this.d.h();
        }
    }

    @Override  // bkq
    public final void i() {
        synchronized(this.a) {
            Surface surface0 = this.f;
            if(surface0 != null) {
                surface0.release();
            }
            this.d.i();
        }
    }

    @Override  // bkq
    public final void j(bkp bkp0, Executor executor0) {
        synchronized(this.a) {
            bdk bdk0 = new bdk(this, bkp0);
            this.d.j(bdk0, executor0);
        }
    }

    public final void k() {
        synchronized(this.a) {
            this.c = true;
            this.d.h();
            if(this.b == 0) {
                this.i();
            }
        }
    }

    private final bcn l(bcn bcn0) {
        if(bcn0 != null) {
            ++this.b;
            bcn bcn1 = new bdp(bcn0);
            ((baw)bcn1).h(this.g);
            return bcn1;
        }
        return null;
    }
}

