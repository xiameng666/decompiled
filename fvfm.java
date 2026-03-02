import java.util.concurrent.Executor;

public abstract class fvfm {
    public final Executor f;
    public fvew g;
    protected fvfn h;
    public int i;
    protected boolean j;
    public long k;
    public long l;

    protected fvfm(Executor executor0) {
        this.k = 0x8000000000000000L;
        this.l = 0x8000000000000000L;
        this.f = new gmct(executor0);
    }

    protected abstract long a();

    protected abstract ggzv d();

    protected abstract void e(fvfn arg1);

    protected abstract void g(long arg1);

    public final void h() {
        fvfn fvfn0 = this.h;
        if(!this.j && this.g != null && fvfn0 != null) {
            ggzv ggzv0 = this.d();
            long v = fvfn0.b.toMillis();
            if(this.i != 0) {
                long v1 = (long)(((double)v) * 0.1);
                for(int v2 = 1; v2 < this.i; ++v2) {
                    v1 += v1;
                    if(v1 + v1 > v) {
                        break;
                    }
                }
                v = v1;
            }
            long v3 = this.a();
            this.g((!fvfn0.a || ggzv0 == null ? Math.max(this.k + v, v3) : Math.max(this.l + v, v3)));
        }
    }
}

