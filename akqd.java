public final class akqd implements qlb {
    public final akqh a;
    public final akqg b;

    public akqd(akqh akqh0, akqg akqg0) {
        this.a = akqh0;
        this.b = akqg0;
    }

    @Override  // qlb
    public final void a(Object object0) {
        lqi lqi0 = new lqi(((qkb)object0));
        akqh akqh0 = this.a;
        if(((lqd)akqh0.b.putIfAbsent(this.b, lqi0)) == null && akqh0.b.size() == akqh.a.size()) {
            akqh0.a(akqg.a, 1);
        }
    }
}

