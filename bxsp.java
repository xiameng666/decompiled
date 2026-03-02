public final class bxsp implements gfsi {
    public final bxsy a;
    public final bxmg b;

    public bxsp(bxsy bxsy0, bxmg bxmg0) {
        this.a = bxsy0;
        this.b = bxmg0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Throwable throwable0 = bxme.c(((Throwable)object0));
        bxmg bxmg0 = this.b;
        if(bxmg0.c(throwable0)) {
            bboh bboh0 = this.a.a.b;
            if(bboh0 != null) {
                a.ae(bboh0.j(), "Exception caught by CustomFluentFuture#catching().", throwable0);
            }
        }
        bxmf bxmf0 = bxmg0.a(throwable0);
        if(bxmf0.a) {
            return bxmf0.b;
        }
        throw new gmdd(throwable0);
    }
}

