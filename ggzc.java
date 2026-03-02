public final class ggzc {
    public ghae a;
    public ghae b;
    public ghae c;
    public int d;
    int e;
    private ghae f;
    private boolean g;
    private ghae h;
    private ghae i;

    public ggzc() {
    }

    public ggzc(ghae ghae0, ghae ghae1) {
        this.b(ghae0, ghae1);
    }

    public ggzc(ghae ghae0, ghae ghae1, ghae ghae2) {
        this(ghae0, ghae1);
        this.c(ghae2);
    }

    public final int a(ghae ghae0) {
        int v = ghat.a(this.f, ghae0);
        int v1 = -1;
        if(this.d == -v && v != 0) {
            this.c = ghae0;
            this.d = -v;
            return -1;
        }
        this.e = v;
        if(!this.g) {
            ghae ghae1 = ghae.q(ghbs.a(this.a, this.b));
            this.h = ghae.n(this.a, ghae1);
            this.i = ghae.n(ghae1, this.b);
            this.g = true;
        }
        double f = this.c.b(this.h);
        double f1 = (1.0 / Math.sqrt(3.0) + 1.5) * 2.220446E-16;
        if((f <= f1 || ghae0.b(this.h) <= f1) && (this.c.b(this.i) <= f1 || ghae0.b(this.i) <= f1)) {
            if(this.a.t(this.c) || this.a.t(ghae0) || this.b.t(this.c) || this.b.t(ghae0)) {
                v1 = 0;
            }
            else if(!this.a.t(this.b) && !this.c.t(ghae0)) {
                if(this.d == 0) {
                    this.d = -ghat.b(this.a, this.b, this.c);
                }
                int v2 = this.e;
                if(v2 == 0) {
                    v2 = ghat.b(this.a, this.b, ghae0);
                    this.e = v2;
                }
                if(v2 == this.d) {
                    ghae ghae2 = ghae.n(this.c, ghae0);
                    if(-ggzc.e(this.c, ghae0, this.b, ghae2) == this.d && ggzc.e(this.c, ghae0, this.a, ghae2) == this.d) {
                        v1 = 1;
                    }
                }
            }
        }
        this.c = ghae0;
        this.d = -this.e;
        return v1;
    }

    public final void b(ghae ghae0, ghae ghae1) {
        this.a = ghae0;
        this.b = ghae1;
        this.c = null;
        this.f = ghae.n(ghae0, ghae1);
        this.g = false;
    }

    public final void c(ghae ghae0) {
        this.c = ghae0;
        this.d = -ghat.a(this.f, ghae0);
    }

    public final boolean d(ghae ghae0) {
        ghae ghae1 = this.c;
        int v = this.a(ghae0);
        if(v < 0) {
            return false;
        }
        return v <= 0 ? ggze.e(this.a, this.b, ghae1, ghae0) : true;
    }

    private static int e(ghae ghae0, ghae ghae1, ghae ghae2, ghae ghae3) {
        int v = ghat.a(ghae3, ghae2);
        return v == 0 ? ghat.b(ghae0, ghae1, ghae2) : v;
    }
}

