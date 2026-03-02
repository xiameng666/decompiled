public final class ddks implements ddkm {
    public final oko a;
    public final okn b;
    private final omn c;

    public ddks(omn omn0) {
        this.c = omn0;
        this.a = new ddkq(this);
        this.b = new ddkr(this);
    }

    @Override  // ddkm
    public final ddkk a() {
        ddkn ddkn0 = new ddkn();
        return (ddkk)oqj.b(this.c, true, false, ddkn0);
    }

    @Override  // ddkm
    public final void b(ddkk ddkk0) {
        ddkp ddkp0 = new ddkp(this, ddkk0);
        oqj.b(this.c, false, true, ddkp0);
    }

    @Override  // ddkm
    public final void c(ddkk ddkk0) {
        ddko ddko0 = new ddko(this, ddkk0);
        oqj.b(this.c, false, true, ddko0);
    }
}

