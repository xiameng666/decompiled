import java.util.concurrent.atomic.AtomicInteger;

public final class fovd implements glzm {
    public final fovh a;
    public final AtomicInteger b;
    public final int c;

    public fovd(fovh fovh0, AtomicInteger atomicInteger0, int v) {
        this.a = fovh0;
        this.b = atomicInteger0;
        this.c = v;
    }

    @Override  // glzm
    public final gmcd a() {
        if(this.b.getAndDecrement() <= 0) {
            return gmbx.a;
        }
        foup foup0 = (foup)this.a.b.get();
        return this.a.o(this.c, foup0);
    }
}

