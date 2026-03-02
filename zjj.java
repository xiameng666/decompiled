public final class zjj implements evpz {
    public final zjk a;
    public final zjo b;

    public zjj(zjk zjk0, zjo zjo0) {
        this.a = zjk0;
        this.b = zjo0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        zjk zjk0 = this.a;
        zjo zjo0 = this.b;
        if(evql0.n()) {
            zjk0.b();
            zjk0.g(zjo0, 2);
        }
        else if(!zjk0.f(zjo0)) {
            zjk0.a.add(zjo0);
            zjk0.e(zjn.a(zjo0, 2));
            zjk0.g(zjo0, 3);
        }
        zjk0.d = null;
        zjk0.d();
        zjk0.c();
    }
}

