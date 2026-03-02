public final class bxsq implements glzn {
    public final bxsy a;
    public final bxmg b;

    public bxsq(bxsy bxsy0, bxmg bxmg0) {
        this.a = bxsy0;
        this.b = bxmg0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Throwable throwable0 = bxme.c(((Throwable)object0));
        bxmg bxmg0 = this.b;
        if(bxmg0.c(throwable0)) {
            bboh bboh0 = this.a.a.b;
            if(bboh0 != null) {
                a.ae(bboh0.j(), "Exception caught by CustomFluentFuture#catchingAsync().", throwable0);
            }
        }
        bxmf bxmf0 = bxmg0.a(throwable0);
        return bxmf0.a ? ((gmcd)bxmf0.b) : gmbu.h(throwable0);
    }
}

