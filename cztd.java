public final class cztd implements Runnable {
    public final czte a;
    public final gelz b;
    public final String c;

    public cztd(czte czte0, gelz gelz0, String s) {
        this.a = czte0;
        this.b = gelz0;
        this.c = s;
    }

    @Override
    public final void run() {
        czte czte0 = this.a;
        gelz gelz0 = this.b;
        cztg cztg0 = czte0.b;
        if(cztg0.d.get()) {
            gelz0.b();
            return;
        }
        cztb cztb0 = new cztb(czte0, gelz0);
        cztc cztc0 = new cztc(czte0);
        String s = gelz0.f();
        czuc czuc0 = new czuc(this.c, s, gelz0, null, cztb0, cztc0);
        if(!czuc0.k(this.c)) {
            czkq.a.e().h("MultiplexBleSocketImpl failed to init on GATT for client %s.", gelz0.f());
            if(hvol.O()) {
                czuc0.e();
            }
            else {
                czuc0.c();
            }
            czuc0 = null;
        }
        if(czuc0 == null) {
            czkq.a.c().h("Failed to create an incoming MultiplexBleSocket from connection %s.", gelz0.f());
            return;
        }
        String s1 = gelz0.f();
        cztg0.b.put(s1, czuc0);
    }
}

