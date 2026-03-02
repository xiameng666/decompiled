public final class jed {
    public final jek a;
    public final ibts b;
    public final jdh c;
    private final jfh d;
    private final jdk e;

    public jed(jdh jdh0, jdk jdk0, jfh jfh0, jek jek0) {
        this.c = jdh0;
        this.e = jdk0;
        this.d = jfh0;
        this.a = jek0;
        this.b = new jeb(this);
    }

    public final gui a(jff jff0) {
        gui gui1;
        jec jec0 = new jec(this, jff0);
        jfh jfh0 = this.d;
        synchronized(jfh0.a) {
            byk byk0 = jfh0.b;
            gui gui0 = (jfk)byk0.d(jff0);
            if(gui0 != null) {
                if(((jfk)gui0).b()) {
                    return gui0;
                }
                jfk jfk0 = (jfk)byk0.f(jff0);
            }
        }
        try {
            gui1 = jec0.a(new jfg(jfh0, jff0));
        }
        catch(Exception exception0) {
            throw new IllegalStateException("Could not load font", exception0);
        }
        synchronized(jfh0.a) {
            byk byk1 = jfh0.b;
            if(byk1.d(jff0) == null && ((jfk)gui1).b()) {
                byk1.e(jff0, gui1);
            }
        }
        return gui1;
    }

    public final gui b(jdz jdz0, jeu jeu0, int v, int v1) {
        int v2 = this.e.a;
        if(v2 != 0 && v2 != 0x7FFFFFFF) {
            jeu0 = new jeu(ibwt.j(jeu0.l + v2, 1, 1000));
        }
        return this.a(new jff(jdz0, jeu0, v, v1));
    }
}

