public final class bxtg implements gfsi {
    public final bxtn a;

    public bxtg(bxtn bxtn0) {
        this.a = bxtn0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        bxtn bxtn0 = this.a;
        gged_interceptors gged0 = bxtn0.c;
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((bxsf)gged0.get(v1)).d(bxtn0.a, object0);
        }
        return null;
    }
}

