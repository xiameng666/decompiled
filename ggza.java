public final class ggza {
    public ggzu a;
    private final ggyz b;
    private ghde c;

    public ggza(ghde ghde0) {
        this(ghde0, ggyz.a);
    }

    public ggza(ghde ghde0, ggyz ggyz0) {
        this.b = ggyz0;
        this.c = ghde0;
        this.a = ghde0.a();
    }

    public final boolean a(ghae ghae0) {
        if(!ggzs.d(this.a, ghae0)) {
            return false;
        }
        ghcc ghcc0 = (ghcc)this.a.a();
        ghae ghae1 = ggzs.c(this.a);
        int v = ghcc0.a();
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.b(ghae1, ghcc0.b(v1), ghae0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(ghae ghae0, ghdb ghdb0, ghae ghae1) {
        int v = ghdb0.f();
        int v1 = ghdb0.d();
        if(v1 > 0) {
            ghbw ghbw0 = new ghbw();
            ghbx ghbx0 = (ghbx)this.c.c().get(ghdb0.e());
            ghbx0.B();
            ggzc ggzc0 = new ggzc(ghae0, ghae1);
            for(int v2 = 0; v2 < v1; ++v2) {
                ghbx0.p(ghdb0.c(v2), ghbw0);
                ghae ghae2 = ghbw0.a;
                ghae ghae3 = ghbw0.b;
                if(ggzc0.c != ghae2) {
                    ggzc0.c(ghae2);
                }
                switch(ggzc0.a(ghae3)) {
                    case -1: {
                        break;
                    }
                    case 1: {
                        v ^= 1;
                        break;
                    }
                    default: {
                        if(this.b.b != 2 && (ghbw0.a.t(ghae1) || ghbw0.b.t(ghae1))) {
                            return false;
                        }
                        v ^= ggze.e(ghae0, ghae1, ghbw0.a, ghbw0.b);
                    }
                }
            }
        }
        return v != 0;
    }
}

