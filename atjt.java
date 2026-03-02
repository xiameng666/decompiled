import java.util.NoSuchElementException;

public abstract class atjt implements atkr {
    private gfsx a;
    private boolean b;

    protected atjt() {
        this.a = gfqx.a;
    }

    protected abstract gfsx a();

    @Override  // atkr
    public final Object b() {
        gftb.r(((boolean)(this.b ^ 1)), "already closed");
        if(!this.c()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.a.d();
        this.a = gfqx.a;
        return object0;
    }

    @Override  // atkr
    public final boolean c() {
        gftb.r(((boolean)(this.b ^ 1)), "already closed");
        if(!this.a.i()) {
            gfsx gfsx0 = this.a();
            if(!gfsx0.i()) {
                return false;
            }
            this.a = gfsx.m(gfsx0.d());
        }
        return this.a.i();
    }

    @Override
    public final void close() {
        if(this.b) {
            return;
        }
        this.b = true;
    }
}

