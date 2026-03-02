public class besy extends lsb {
    public final beis a;
    public final lqd b;
    public static final int c;

    static {
        bboh.b("PreferencesDataViewModel", bbcu.cX);
    }

    public besy(beis beis0) {
        ibuq.f(beis0, "repository");
        super();
        this.a = beis0;
        besv besv0 = new besv();
        this.b = lsa.b(beos.b(beis0.c, besv0), new besw());
    }

    public final void a(heqn heqn0) {
        ibuq.f(heqn0, "preference");
        lqi lqi0 = new lqi();
        lqi0.l(new bedv(bedu.b, null, null));
        evql evql0 = this.a.b.e(((MessageLite)heqn0));
        evql0.b(new beiq(this.a, lqi0));
        evql0.A(new beir(lqi0));
    }
}

