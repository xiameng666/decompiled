public final class bxth implements gfsi {
    public final bxtn a;

    public bxth(bxtn bxtn0) {
        this.a = bxtn0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Throwable throwable0 = bxme.c(((Throwable)object0));
        bxtn bxtn0 = this.a;
        bxmf bxmf0 = bxmg.b(throwable0, bxtn0.d);
        if(!bxmf0.a) {
            throw new gmdd(throwable0);
        }
        Object object1 = bxmf0.b;
        gged_interceptors gged0 = bxtn0.c;
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((bxsf)gged0.get(v1)).b(bxtn0.a, throwable0, object1);
        }
        return object1;
    }
}

