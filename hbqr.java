public final class hbqr implements Runnable {
    public final hbqy a;
    public final hbko b;
    public final String c;
    public final hbrb d;

    public hbqr(hbqy hbqy0, hbrb hbrb0, hbko hbko0, String s) {
        this.a = hbqy0;
        this.d = hbrb0;
        this.b = hbko0;
        this.c = s;
    }

    @Override
    public final void run() {
        String s;
        hbrb hbrb0 = this.d;
        hbrb0.a.b = this.b;
        hbpp hbpp0 = new hbkq(hbrb0.a).a;
        if(hbpp0 == null) {
            s = "NA";
        }
        else {
            s = hbpp0.e;
            if(gfta.c(s)) {
                s = "NA";
            }
            else {
                batl.s(s);
            }
        }
        hbpo hbpo0 = new hbpo();
        hbpo0.a = this.a.a;
        hbpo0.b = this.a.b;
        hbpo0.e = hbqy.b();
        hbpo0.h = Boolean.valueOf(true);
        hbpo0.d = s;
        hbpo0.c = this.c;
        evql evql0 = this.a.e;
        hbpo0.f = evql0.n() ? ((String)evql0.j()) : this.a.d.b();
        Integer integer0 = (int)10;
        integer0.getClass();
        hbpo0.j = integer0;
        hbpo0.k = (int)this.a.g;
        hbrb0.b = hbpo0;
        this.a.c.a(hbrb0);
    }
}

