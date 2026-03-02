public final class hbxi implements hbqx {
    public final boolean a;
    public final hbkn b;

    public hbxi(boolean z, hbkn hbkn0) {
        this.a = z;
        this.b = hbkn0;
    }

    @Override  // hbqx
    public final hbrb a() {
        hbkp hbkp0 = new hbkp();
        hbkp0.c = this.a ? hbkm.c : hbkm.b;
        hbnv hbnv0 = new hbnv();
        hbnv0.a = this.b;
        hbkp0.e = new hbnw(hbnv0);
        return new hbrb(hbkp0, 0);
    }
}

