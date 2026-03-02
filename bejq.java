public class bejq extends lsb {
    public final String a;
    public final lqd b;
    private final String c;
    private final bejg d;
    private final bxox e;

    public bejq(String s, bejg bejg0) {
        ibuq.f(bejg0, "userMetricsRepository");
        super();
        this.c = s;
        this.d = bejg0;
        bxox bxox0 = new bxox();
        this.e = bxox0;
        if(bdim.a(s)) {
            s = null;
        }
        this.a = s;
        this.b = bxox0;
    }

    public final void a(String s) {
        ibuq.f(s, "pickedAccount");
        String s1 = this.c;
        if(!ibuq.m(s1, s)) {
            if(bdim.a(s1)) {
                this.d.e(gqtg.i);
            }
            else {
                this.d.e(gqtg.j);
            }
            this.e.l(s);
        }
    }
}

