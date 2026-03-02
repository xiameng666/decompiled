public final class bdvo implements Runnable {
    public final evqp a;
    public final String b;
    public final bdvs c;
    public final bdvp d;

    public bdvo(evqp evqp0, bdvp bdvp0, String s, bdvs bdvs0) {
        this.a = evqp0;
        this.d = bdvp0;
        this.b = s;
        this.c = bdvs0;
    }

    @Override
    public final void run() {
        gfsx gfsx0;
        bdvw bdvw0 = this.d.a;
        String s = this.b;
        clbo clbo0 = bdvw0.d.a(s);
        if(clbo0 == null) {
            gfsx0 = gfqx.a;
        }
        else {
            Object object0 = this.c.a(clbo0.a, clbo0.a.length);
            if(object0 == null) {
                gfsx0 = gfqx.a;
            }
            else {
                bdvw0.c.e(s, object0);
                gfsx0 = gfsx.m(new bdvt(object0, true));
            }
        }
        this.a.b(gfsx0);
    }
}

