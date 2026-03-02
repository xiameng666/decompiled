import j..util.Objects;

final class bcrz implements Runnable {
    final String a;
    final String b;
    final bcsa c;

    public bcrz(bcsa bcsa0, String s, String s1) {
        this.a = s;
        this.b = s1;
        Objects.requireNonNull(bcsa0);
        this.c = bcsa0;
        super();
    }

    @Override
    public final void run() {
        try {
            bcsa bcsa0 = this.c;
            hofs hofs0 = bcsa0.c;
            hobo hobo0 = bcsa.e(this.a, this.b);
            hofs hofs1 = bcsa0.d.j(bcsa0.e, hofs0, hobo0);
            bcrg.e();
            if(bcrg.c(hofs1)) {
                hoer hoer0 = hofs1.c == 4 ? ((hoer)hofs1.d) : hoer.a;
                hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
                String s = (hobj0.e == null ? hobk.a : hobj0.e).b;
                hoer hoer1 = hofs0.c == 4 ? ((hoer)hofs0.d) : hoer.a;
                hobj hobj1 = hoer1.c == null ? hobj.a : hoer1.c;
                if(s.equals((hobj1.e == null ? hobk.a : hobj1.e).b)) {
                    return;
                }
            }
            bcsa0.b.put(hofs1);
        }
        catch(bcrc bcrc0) {
            bcsa.a.g("calling rpc throws exception.", bcrc0, new Object[0]);
            this.c.f(gmfx.cl, "calling rpc throws exception.");
        }
        catch(InterruptedException interruptedException0) {
            bcsa.a.g("fails to put into blocking queue.", interruptedException0, new Object[0]);
            this.c.f(gmfx.cm, "fails to put into blocking queue.");
        }
    }
}

