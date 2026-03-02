public final class fwtm extends jye {
    private int a;

    public fwtm() {
        this.a = -1;
    }

    @Override  // jye
    public final void a(int v) {
    }

    @Override  // jye
    public final void b(jyf jyf0) {
        int v1 = 0;
        for(int v = 0; v < jyf0.g(); ++v) {
            if(jyf0.m(v)) {
                ++v1;
            }
        }
        synchronized(this) {
            this.a = v1;
        }
    }

    @Override  // jye
    public final void c() {
    }

    @Override  // jye
    public final void d() {
    }

    public final int e() {
        synchronized(this) {
        }
        return this.a;
    }
}

